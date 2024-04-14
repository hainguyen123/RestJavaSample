package org.my.dayforce.RestSample;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

import javax.json.Json;

import org.apache.http.HttpStatus;
import org.joda.time.DateTime;
import org.my.dayforce.RestSample.DayforceApi.*;
import org.my.dayforce.model.*;

public class App 
{
	private static String EmployeeXRefCode;
	private static String Username;
	private static String Password;
	private static String ClientName;
	private static String CurrentVersion;
	private static String BaseUrl;
	private static DayforceApi client;
	private static String ReportXRefCode;
	
	    
	public static void main( String[] args ) throws UnirestException, IOException 
    {
		LoadProperties();
		client = new DayforceApi();
		client.setLogger(System.out);
		client.setUsername(Username);
		client.setPassword(Password);
		
		//GetClientMetadata();
		//GetEmployeeDocuments();
		//GetOneEmployee();
		//GetExpandedEmployee();
		
		//Hai add code
		GetEmployeesUpdatedWithinDateRange();
		
		//GetEmployeeAvailability();
        //GetEmployeeSchedules();
        //GetEmployeesTimeOff();
        //GetListReportMetadata();
        //GetReportMetadataForOneReport();
        //GetReportData();
        //GetEmployeePunches();

		//PatchEmployeeWithNewContact();
		//PatchEmployeeWithNullValue();
		//PatchEmployeeWithInvalidValueShowingValidationResults();
		
		//PostNewHire();
    }
	
	// read configuration information from the config.properties file
	private static void LoadProperties(){
		Properties prop = new Properties();
		InputStream input = null;

		try {
			input = App.class.getResourceAsStream("config.properties");
			prop.load(input);
						
	    } catch (IOException ex) {
	        ex.printStackTrace();
	    } finally {
	        if (input != null) {
	            try {
	                input.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
		
		EmployeeXRefCode = prop.getProperty("EmployeeXRefCode", EmployeeXRefCode);
		Username = prop.getProperty("Username", Username);
		Password = prop.getProperty("Password", Password);
		ClientName = prop.getProperty("ClientName", ClientName);
		CurrentVersion = prop.getProperty("CurrentVersion", CurrentVersion);
		BaseUrl = prop.getProperty("BaseUrl", BaseUrl);
		ReportXRefCode = prop.getProperty("ReportXRefCode", ReportXRefCode);
	}
	
	private static String GetUrl(String resourceName){
		return String.format("%1$s/%2$s/%3$s/%4$s/", BaseUrl,ClientName,CurrentVersion,resourceName); 
	}
	
	//Hardcode herer
	private static void GetEmployeesUpdatedWithinDateRange() throws UnirestException, IOException{
		
		//Hai add code csv file
		File file = new File("testing_Employee_file.csv"); 
		FileWriter outputfile = new FileWriter(file); 
		CSVWriter writer = new CSVWriter(outputfile); 
        // adding header to csv 
        String[] header = { "contactNumber", "workContractDate", "maindenName","firstName", "initials","lastName","xRefCode","employeeNumber", "email","Status"}; 
        writer.writeNext(header);
		
		
		System.out.println( "Getting Employees Updated Within Date Range" );
		HashMap<String, Object> queryString = new HashMap<String, Object>();		
		queryString.put(EmployeeFilterConstants.FILTER_UPDATED_START_DATE, LocalDate.of(2017,Month.JANUARY,1).toString());
		queryString.put(EmployeeFilterConstants.FILTER_UPDATED_END_DATE, LocalDate.of(2017, Month.JANUARY, 31).toString());
		//queryString.put(EmployeeFilterConstants.FILTER_TAFW_STATUS, "ACTIVE");
		
		Type type = new TypeToken<ApiResponse<ArrayList<Employee>>>(){}.getType();
		ApiResponse<List<Employee>> employeesResponse = client.Get(type, GetUrl(DayforceApi.EMPLOYEES), queryString);
		
		List<Employee> empList = employeesResponse.getData();
		//List<EmployeeInformationData> empDataLst = new ArrayList<EmployeeInformationData>();
		if(null != empList) {
			System.out.println("contactNumber \t workContractDate \t maindenName \t firstName \t initials \t lastName \t xRefCode \t employeeNumber \t email \t Status");
			for (Employee employee : empList) {
				
				Employee testEmp = GetExpandedEmployee(employee.getXrefCode());
				String statusStr = "";
				if(null != testEmp.getEmploymentStatuses().getItems()) {
					if(null != testEmp.getEmploymentStatuses().getItems().get(0)) {
						statusStr = testEmp.getEmploymentStatuses().getItems().get(0).getEmploymentStatus().getXrefCode();
						System.out.println(testEmp.getEmployeeNumber()+"===========>>>>>>>>"+statusStr);
					}
				}
				EmployeeInformationData empInfo = getEmployeeInformationData(testEmp);
				if(null != empInfo) {
					String[] EmpData = { empInfo.getContactNumber(), empInfo.getWorkContractDate(), empInfo.getMaindenName(),empInfo.getFirstName(),empInfo.getInitials(),empInfo.getLastName(),empInfo.getxRefCode(),empInfo.getEmployeeNumber(), empInfo.getEmail(),statusStr };
					writer.writeNext(EmpData);
				}
			}
		}
		
		writer.close(); 
		
		
		//DisplayResponse(employeesResponse);
		//System.out.println("Total employees returned: " + employeesResponse.getData().size());
		//System.out.println();
	}
	
	private static Employee GetOneEmployee(String empXRefCode) throws UnirestException{
		//System.out.println( "Getting One Employee" );
		Type type = new TypeToken<ApiResponse<Employee>>(){}.getType();
		//ApiResponse<Employee> employeeResponse = client.Get(type, GetUrl(DayforceApi.EMPLOYEES)+EmployeeXRefCode, null);
		ApiResponse<Employee> employeeResponse = client.Get(type, GetUrl(DayforceApi.EMPLOYEES)+empXRefCode, null);
		//DisplayResponse(employeeResponse);
		//showEmployeeInformation(employeeResponse.getData());
		return employeeResponse.getData();
	}
	
	//Hai add code
	private static EmployeeInformationData getEmployeeInformationData(Employee emp) {
		
		EmployeeInformationData empData = new EmployeeInformationData();
		
		//We do 2 option
		// 1- get direct all information from Employee  => return csv file
		// 2- get information by each relate object model => return csv file
		// 3- compare two results and choose the best
		
		//I - get information form Employee
		List<PersonContact> contactNumberLst = null;
		String contactNumber = null;
		List<EmployeeWorkContract> workContractLst = null;
		DateTime workContractDate = null;
		if(null != emp.getContacts()) {
			contactNumberLst = emp.getContacts().getItems();
			//hardCode
			if(contactNumberLst.size()>0) {
			contactNumber = contactNumberLst.get(0).getContactNumber();
			}
		}
		if(null != emp.getWorkContracts()) {
			workContractLst = emp.getWorkContracts().getItems();
			//hardCode
			if(workContractLst.size()>0) {
			workContractDate = workContractLst.get(0).getStartDate();
			}
		}
		String emailStr = ""; 
		if(null!=emp.getContacts()) {
			if(null!=emp.getContacts().getItems() && emp.getContacts().getItems().size()>0) {
				for(PersonContact p : emp.getContacts().getItems()) {
					if(null!=p.getElectronicAddress()) {
						emailStr = p.getElectronicAddress();
					}
				}
			}
		}
		
		String maindenName = emp.getMaidenName();
		String firstName = emp.getFirstName();
		String initials = emp.getInitials();
		String lastName = emp.getLastName();
		String xRefCode = emp.getXrefCode();
		String employeeNumber = emp.getEmployeeNumber();
		
		empData.setContactNumber(contactNumber!=null?contactNumber:"");
		empData.setWorkContractDate(workContractDate!=null?workContractDate.toString():"");	
		empData.setMaindenName(maindenName != null?maindenName:"");
		empData.setMaindenName(maindenName!=null?maindenName:"");
		empData.setFirstName(firstName!=null?firstName:"");
		empData.setInitials(initials!=null?initials:"");
		empData.setLastName(lastName!=null?lastName:"");
		empData.setxRefCode(xRefCode!=null?xRefCode:"");
		empData.setEmployeeNumber(employeeNumber!=null?employeeNumber:"");
		empData.setEmail(emailStr);
		
		System.out.println(contactNumber+"\t"+workContractDate+"\t"+maindenName+"\t"+firstName+"\t"+initials+"\t"+lastName+"\t"+xRefCode+"\t"+employeeNumber+"\t"+emailStr);
		
		return empData;
		
	}

	private static void GetEmployeeDocuments() throws UnirestException, IOException{
		System.out.println( "Getting List of Documents and then the Documents" );
		
		// First retrieve document metadata for an employee
		Type type = new TypeToken<ApiResponse<List<EmployeeFileMetaData>>>(){}.getType();
		HashMap<String, Object> queryString = new HashMap<String, Object>();
		queryString.put("EmployeeXRefCode",EmployeeXRefCode);
		ApiResponse<List<EmployeeFileMetaData>> metadataResponse = client.Get(type, GetUrl(DayforceApi.DOCUMENTS), queryString);
		DisplayResponse(metadataResponse);
		
		// Next retrieve all the documents associated with the employee
		List<EmployeeFileMetaData> documentMetadatas = metadataResponse.getData();
		if (documentMetadatas != null) {
			for (int i=0; i<documentMetadatas.size(); i++) {
				type = new TypeToken<ApiResponse<ArchiveDocument>>(){}.getType();
				UUID documentGuid = documentMetadatas.get(i).getDocumentGUID();
				ApiResponse<ArchiveDocument> docResponse = client.Get(type, GetUrl(DayforceApi.DOCUMENTS)+documentGuid, null);
				DisplayResponse(docResponse);
				ArchiveDocument archDoc = docResponse.getData();
				if (archDoc != null)
				{
					// Save the file to a the file system
					String directory = System.getProperty("user.dir") + "\\" + archDoc.getFileName();
					System.out.println("Saving to file: " + directory);
					FileOutputStream stream = new FileOutputStream(directory);		
					try {
					    stream.write(archDoc.getContents());
					} finally {
					    stream.close();
					}
				}
			}
		}
	}	
	
    /**
     * This method demonstrates how to retrieve additional information related to the employee.  The Expand property
     * on the request allows you to indicate which additional collection type properties to retrieve.  As more collection
     * properties are added to the Employee, additional Expand values will need to be provided to retrieve those properties.
     */
	//Hai add code
    private static Employee GetExpandedEmployee(String empXRefCode) throws UnirestException{
    	//System.out.println( "Getting One Fully Expanded Employee" );
    	HashMap<String, Object> queryString = new HashMap<String, Object>();
		queryString.put(EmployeeFilterConstants.CONTEXT_DATE, LocalDate.now().toString());
		queryString.put(DayforceApi.EXPAND, 
				EmployeeConstants.ADDRESSES
				+ "," + EmployeeConstants.CAN_FEDERAL_TAXES
				+ "," + EmployeeConstants.CAN_STATE_TAXES
				+ "," + EmployeeConstants.CAN_TAX_STATUSES
				+ "," + EmployeeConstants.CLOCK_DEVICE_GROUPS
				+ "," + EmployeeConstants.CONFIDENTIAL_IDENTIFICATION
				+ "," + EmployeeConstants.CONTACTS
				+ "," + EmployeeConstants.COURSES
				+ "," + EmployeeConstants.LABOR_DEFAULTS
				+ "," + EmployeeConstants.DIRECT_DEPOSITS
				+ "," + EmployeeConstants.DOCUMENT_MANAGEMENT_SECURITY_GROUPS
				+ "," + EmployeeConstants.EI_RATES
				+ "," + EmployeeConstants.EMERGENCY_CONTACTS
				+ "," + EmployeeConstants.EMPLOYEE_MANAGERS
				+ "," + EmployeeConstants.EMPLOYEE_PAY_ADJUST_CODE_GROUPS
				+ "," + EmployeeConstants.EMPLOYEE_PROPERTIES
				+ "," + EmployeeConstants.EMPLOYEE_WORK_ASSIGNMENT_MANAGERS
				+ "," + EmployeeConstants.EMPLOYMENT_STATUSES
				+ "," + EmployeeConstants.EMPLOYMENT_TYPES
				+ "," + EmployeeConstants.ETHNICITIES
				+ "," + EmployeeConstants.HEALTH_WELLNESS_DETAILS
				+ "," + EmployeeConstants.HIGHLY_COMPENSATED_EMPLOYEES
				+ "," + EmployeeConstants.HR_INCIDENTS
				+ "," + EmployeeConstants.LOCATIONS
				+ "," + EmployeeConstants.MANAGED_EMPLOYEES
				+ "," + EmployeeConstants.MARITAL_STATUSES
				+ "," + EmployeeConstants.ORG_UNIT_INFOS
				+ "," + EmployeeConstants.PAY_GRADE_RATES
				+ "," + EmployeeConstants.PERFORMANCE_RATINGS
				+ "," + EmployeeConstants.ROLES
				+ "," + EmployeeConstants.SKILLS
				+ "," + EmployeeConstants.SSO_ACCOUNTS
				+ "," + EmployeeConstants.TRAINING_PROGRAMS
				+ "," + EmployeeConstants.UNION_MEMBERSHIPS
				+ "," + EmployeeConstants.USER_PAY_ADJUST_CODE_GROUPS
				+ "," + EmployeeConstants.US_FEDERAL_TAXES
				+ "," + EmployeeConstants.US_STATE_TAXES
				+ "," + EmployeeConstants.US_TAX_STATUSES
				+ "," + EmployeeConstants.VETERAN_STATUSES
				+ "," + EmployeeConstants.WORK_ASSIGNMENTS
				+ "," + EmployeeConstants.WORK_CONTRACTS);
		
		Type type = new TypeToken<ApiResponse<Employee>>(){}.getType();
		//ApiResponse<Employee> employeeResponse = client.Get(type, GetUrl(DayforceApi.EMPLOYEES)+EmployeeXRefCode, queryString);
		ApiResponse<Employee> employeeResponse = client.Get(type, GetUrl(DayforceApi.EMPLOYEES)+empXRefCode, queryString);
		
		return employeeResponse.getData();
		//DisplayResponse(employeeResponse);
    }
	
    private static void GetClientMetadata() throws UnirestException{
		System.out.println( "Getting ClientMetadata" );
		Type type = new TypeToken<ClientMetadata>(){}.getType();
		ClientMetadata metadata = client.Get(type, GetUrl(DayforceApi.CLIENTMETADATA), null);
		ApiResponse<ClientMetadata> response = new ApiResponse<ClientMetadata>();
		response.setData(metadata);
		DisplayResponse(response);
    }
    
    private static void GetEmployeeAvailability() throws UnirestException {
        System.out.println("Getting Employee Availability");
        HashMap<String, Object> queryString = new HashMap<String, Object>();
        
        LocalDate today = LocalDate.now();
        queryString.put(EmployeeFilterConstants.FILTER_AVAILABILITY_START_DATE, LocalDate.of(2020,Month.JANUARY,1).toString());
		queryString.put(EmployeeFilterConstants.FILTER_AVAILABILITY_END_DATE, LocalDate.of(2024,Month.JANUARY,1).toString());
		
		Type type = new TypeToken<ApiResponse<ArrayList<EmployeeAvailability> > >() {}.getType();
		
		ApiResponse<List<EmployeeAvailability>> response = client.Get(type, 
				GetUrl(DayforceApi.EMPLOYEES) + EmployeeXRefCode + "/" + DayforceApi.EMPLOYEE_AVAILABILITY , queryString);		
		DisplayResponse(response);
	}
    
    private static void GetEmployeeSchedules() throws UnirestException {
		System.out.println("Getting Employee Schedules");
		HashMap<String, Object> queryString = new HashMap<String, Object>();
		
		LocalDate startDate = LocalDate.of(2018, Month.MAY, 19);
		queryString.put(EmployeeFilterConstants.FILTER_SCHEDULES_START_DATE, startDate.toString());
		queryString.put(EmployeeFilterConstants.FILTER_SCHEDULES_END_DATE, startDate.plus(7, ChronoUnit.DAYS).toString());
		queryString.put(EmployeeFilterConstants.FILTER_IS_POSTED, true);
		queryString.put(DayforceApi.EXPAND, 
				EmployeeConstants.SCHEDULE_ACTIVITIES
				+ "," + EmployeeConstants.SCHEDULE_BREAKS
				+ "," + EmployeeConstants.SCHEDULE_LABOR_METRICS
				+ "," + EmployeeConstants.SCHEDULE_SKILLS);
		
		
		Type type = new TypeToken<ApiResponse<ArrayList<EmployeeSchedule> > >() {}.getType();
		
		ApiResponse<List<EmployeeSchedule>> response = client.Get(type, 
				GetUrl(DayforceApi.EMPLOYEES) + EmployeeXRefCode + "/" + DayforceApi.EMPLOYEE_SCHEDULES , queryString);		
		DisplayResponse(response);
	}
    
    private static void GetEmployeesTimeOff() throws UnirestException {
    	System.out.println("Getting Employees Time Off");
    	HashMap<String, Object> queryString = new HashMap<String, Object>();
		
    	LocalDate startDate = LocalDate.of(2018, Month.MAY, 1);
    	queryString.put(EmployeeFilterConstants.FILTER_TAFW_START_DATE, startDate.toString());
    	queryString.put(EmployeeFilterConstants.FILTER_TAFW_END_DATE, startDate.plus(2, ChronoUnit.MONTHS).toString());
    	queryString.put(EmployeeFilterConstants.FILTER_TAFW_STATUS, EmployeeConstants.TIME_OFF_STATUS_PENDING);
		
		Type type = new TypeToken<ApiResponse<ArrayList<EmployeeTimeAwayFromWork> > >() {}.getType();
		
		ApiResponse<List<EmployeeTimeAwayFromWork>> response = client.Get(type, 
				GetUrl(DayforceApi.EMPLOYEES) + EmployeeXRefCode + "/" + DayforceApi.EMPLOYEE_TIME_OFF , queryString);		
		DisplayResponse(response);
	}
    
    private static void   GetListReportMetadata() throws UnirestException{
    	System.out.println("Getting List of Reports Metadata sample");
	
    	Type type = new TypeToken<ApiResponse<ArrayList<ReportMetadata> > >() {}.getType();
		
		ApiResponse<List<ReportMetadata>> response = client.Get(type, 
				GetUrl(DayforceApi.REPORTMETADATA), null);		
		DisplayResponse(response);
    }
    
    private static void   GetReportMetadataForOneReport( ) throws UnirestException{
    	System.out.println("Getting Report Metadata for one report sample");
  	
    	Type type = new TypeToken<ApiResponse<ArrayList<ReportMetadata> > >() {}.getType();
    	
		ApiResponse<List<ReportMetadata>> response = client.Get(type, 
				GetUrl(DayforceApi.REPORTMETADATA)+ ReportXRefCode , null);		
		DisplayResponse(response);
    }

	private static void   GetReportData( ) throws UnirestException{
		System.out.println("Getting Reports data sample");

		// First retrieve report metadata to learn what parameters need to be set
    	Type metaDataType = new TypeToken<ApiResponse<ArrayList<ReportMetadata> > >() {}.getType();
    	
		ApiResponse<List<ReportMetadata>> reportMetadata = client.Get(metaDataType, 
				GetUrl(DayforceApi.REPORTMETADATA)+ ReportXRefCode , null);	
		
		if (reportMetadata == null || reportMetadata.getData() == null) {
			DisplayResponse(reportMetadata);
			return;
		}

		// Generate a collection of parameter values to pass on the call to retrieve the report data
		Map<String, Object> reportParameters = new HashMap<String, Object>();
		
		for	(int i=0; i<reportMetadata.getData().get(0).getParameters().size(); i++) {
			ReportParameterMetadata parameter = reportMetadata.getData().get(0).getParameters().get(i);
			switch(parameter.getName()) {
			case "@EffectiveStart":
				reportParameters.put(parameter.getReportParameterMetadataId().toString(), "4/17/2018");
				break;
			case "@EffectiveEnd":
				reportParameters.put(parameter.getReportParameterMetadataId().toString(), "4/17/2019");
				break;
			default:
				break;
			}
		}
		
		Type type = new TypeToken<ApiResponse<Report > >() {}.getType();
		String nextPageUrl = null;
		
		// Iterate through loop for each page of data from the report
		do {
			ApiResponse<Report> response = null;
			if (nextPageUrl == null || nextPageUrl.isEmpty()) {
				// make initial request for first page of report data
				HashMap<String, Object> queryString = new HashMap<String, Object>();
				queryString.put(DayforceApi.PAGE_SIZE, 1000);
				response = client.Get(type, 
						GetUrl(DayforceApi.REPORT)+ ReportXRefCode , queryString);
			} else {
				// make a subsequent request for next page of report data
				response = client.Get(type, nextPageUrl , reportParameters);				
			}
			DisplayResponse(response);
			
			if (response.getPaging() != null) {
				nextPageUrl = response.getPaging().getNext();
			} else {
				nextPageUrl = null;
			}
				
		} while (nextPageUrl != null && !nextPageUrl.isEmpty());
	}
    
	private static void GetEmployeePunches() throws UnirestException{
		System.out.println("Getting Employee punch information sample");
		HashMap<String, Object> queryString = new HashMap<String, Object>();
		
    	LocalDate startDate = LocalDate.of(2019, Month.MARCH, 25);
    	LocalDate endDate = LocalDate.of(2019, Month.MARCH, 29);
    	queryString.put(EmployeeFilterConstants.FILTER_PUNCH_TRANSACTION_START_DATE, startDate.toString());
    	queryString.put(EmployeeFilterConstants.FILTER_PUNCH_TRANSACTION_END_DATE, endDate.toString());
    	
		Type type = new TypeToken<ApiResponse<ArrayList<EmployeePunch>> >() {}.getType();
		String nextPageUrl = GetUrl(DayforceApi.EMPLOYEE_PUNCH);
		List<EmployeePunch> employeePunches = new ArrayList<EmployeePunch>();
		
		do
		{
			ApiResponse<List<EmployeePunch>> response = client.Get(type, nextPageUrl, queryString);
			employeePunches.addAll(response.getData());
			nextPageUrl = response.getPaging().getNext();
			queryString = null;
		}
		while(!nextPageUrl.isEmpty());
		
		ApiResponse<List<EmployeePunch>> result = new ApiResponse<List<EmployeePunch>>();
		result.setData(employeePunches);
		result.setStatusCode(HttpStatus.SC_OK);
		
		DisplayResponse(result);
	}
	
	
	private static void PatchEmployeeWithNewContact() throws UnirestException{
		/* The following JSON will add a new contact to an existing employee
		 	{  
			   "Contacts":{  
			      "Items":[  
			         {  
			            "ContactInformationType":{  
			               "XRefCode":"HomePhone"
			            },
			            "ContactNumber":"555-222-3333",
			            "Country":{  
			               "XRefCode":"USA"
			            },
			            "EffectiveStart":"2017-03-06T10:03:56.36788-05:00",
			            "IsPreferredContactMethod":false,
			            "ShowRejectedWarning":true,
			            "NumberOfVerificationRequests":3
			         }
			      ]
			   }
			}
		 */
	
		Employee employee = new Employee()
				.contacts(new PersonContactCollection()
						.addItemsItem(new PersonContact()
							.contactInformationType(new ContactInformationType()
									.xrefCode("HomePhone"))
							.contactNumber("555-222-3333")
							.country(new Country()
									.xrefCode("USA"))
							.effectiveStart(DateTime.parse("2017-03-06T10:03:56.36788-05:00"))
							.isPreferredContactMethod(false)
							.showRejectedWarning(true)
							.numberOfVerificationRequests(3)
							)
						);

		String json = getGsonInstance().toJson(employee);
		
		System.out.println( "Patching Employee With New Contact" );
		HashMap<String, Object> queryString = new HashMap<String, Object>();
		queryString.put(DayforceApi.IS_VALIDATE_ONLY, true); // don't update, just validate
		
		Type type = new TypeToken<ApiResponse<Employee>>(){}.getType();
		ApiResponse<Employee> employeeResponse = client.Patch(type, GetUrl(DayforceApi.EMPLOYEES)+EmployeeXRefCode, queryString, json);
		DisplayResponse(employeeResponse);	
	}
	
	private static void PatchEmployeeWithNullValue() throws UnirestException{
		/* The following JSON will set MaidenName to null for an existing employee
		 	{
			   "MaidenName":null
			}
		 */
	
		javax.json.JsonObject json = Json.createObjectBuilder()
			.addNull("MaidenName")			
			.build();
		
		System.out.println( "Patching Employee With Null Value" );
		HashMap<String, Object> queryString = new HashMap<String, Object>();
		queryString.put(DayforceApi.IS_VALIDATE_ONLY, true);// don't update, just validate
		Type type = new TypeToken<ApiResponse<Employee>>(){}.getType();
		ApiResponse<Employee> employeeResponse = client.Patch(type, GetUrl(DayforceApi.EMPLOYEES)+EmployeeXRefCode, queryString, json.toString());
		DisplayResponse(employeeResponse);	
	}
		
	private static void PatchEmployeeWithInvalidValueShowingValidationResults() throws UnirestException{
		/* The following JSON will cause validation error as both ShoeSize and BirthDate have invalid values
		 	{
			   "ShoeSize":10,
			   "BirthDate":"2/30/2017"
			}
		 */
	
		javax.json.JsonObject json = Json.createObjectBuilder()
			.add("ShoeSize", 10)			
			.add("BirthDate", "2/30/2017")			
			.build();
		
		System.out.println( "Patching Employee With Invalid Values to Show Validation Results" );
		HashMap<String, Object> queryString = new HashMap<String, Object>();
		queryString.put(DayforceApi.IS_VALIDATE_ONLY, true);// don't update, just validate
		Type type = new TypeToken<ApiResponse<Employee>>(){}.getType();
		
		ApiResponse<Employee> employeeResponse = client.Patch(type, GetUrl(DayforceApi.EMPLOYEES)+EmployeeXRefCode, queryString, json.toString());
		DisplayResponse(employeeResponse);	
	
	}
	
	private static void PostNewHire() throws UnirestException {
		
        // SSN must be unique.

        // If Client Property - "Enable SSN Validation" is set to true, SocialSecurityNumber should be valid for the country. 
        // Country context is derived based on Country associated to employee's assigned Pay Group or Primary Residence address.  
        // If no country context can be derived based on employee's information, SSN validation will not pass.

        // If Client Property - "Allow Applied for SSN" is set to true:
        // - Submitting "000000000" as a temporary SocialSecurityNumber is considered valid for the USA
        // - Submitting "NONE" or "PENSIONER" as a temporary SocialSecurityNumber is considered valid for GBR and IRL.
        // - Temporary SSN not supported for Canada and
		String socialSecurityNumber = "412759839"; 
		
		DateTime hireDate = new DateTime(2018,1,1,0,0);
		
		// This request is incomplete and will not pass validation logic.
		// Creating a valid request would require knowing XRefCodes configured into
		// the database by the administrator.
		Employee newHire = new Employee()
				.xrefCode("Sample12345")
				.firstName("FSample")
				.lastName("LSample")
				.bioExempt(false)
				.birthDate(new DateTime(1970,1,1,0,0))
				.culture(new Culture().xrefCode("en-US"))
            .gender("M")
            .hireDate(hireDate)
            .photoExempt(false)
            .requiresExitInterview(false)
   			.socialSecurityNumber(socialSecurityNumber)
            .sendFirstTimeAccessEmail(false)
            .firstTimeAccessEmailSentCount(0)
            .firstTimeAccessVerificationAttempts(0)
            .addresses(new PersonAddressCollection()
            		.addItemsItem( new PersonAddress()
            				.address1("4110 Yonge St.")
            				.city("North York")
            				.postalCode("M2P 2B7")
            				.state(new State().xrefCode("ON"))
            				.country(new Country().xrefCode("CAN"))
            				.contactInformationType(new ContactInformationType().xrefCode("PrimaryResidence"))
            				.effectiveStart(hireDate)
            				)
            		)
            .contacts(new PersonContactCollection()
            		.addItemsItem( new PersonContact()
            				.contactInformationType(new ContactInformationType().xrefCode("HomePhone"))
            				.contactNumber("4169872987")
            				.country(new Country().xrefCode("CAN"))
            				.effectiveStart(hireDate)
            				.showRejectedWarning(true)
            				.isForSystemCommunications(false)
            				.isPreferredContactMethod(false)
            				.numberOfVerificationRequests(0)
            				)
            		)
            .employmentStatuses(new EmployeeEmploymentStatusCollection()
            		.addItemsItem( new EmployeeEmploymentStatus()
            				.effectiveStart(hireDate)
            				.employmentStatus(new EmploymentStatus().xrefCode("ACTIVE"))
            				.payType( new PayType().xrefCode("HourlyNon"))
            				.payClass( new PayClass().xrefCode("FT"))
            				.payGroup( new PayGroup().xrefCode("CAN"))
            				.createShiftRotationShift(true)
            				.baseRate(16.25)
            				.employmentStatusReason( new EmploymentStatusReason().xrefCode("NEWHIRE"))
            				)
            		)
            .roles( new EmployeeRoleCollection()
            		.addItemsItem( new EmployeeRole()
            				.role( new Role().xrefCode("CAssociate"))
            				.effectiveStart(hireDate)
            				)
            		)
            .workAssignments( new EmployeeWorkAssignmentCollection()
            		.addItemsItem( new EmployeeWorkAssignment()
            				.position( new Position()
            						.department( new Department().xrefCode("6"))
            						.job( new Job().xrefCode("7"))
            						)
            				.location( new Location().xrefCode("500Operations"))
            				.isPAPrimaryWorkSite(true)
            				.isPrimary(true)
            				.isVirtual(true)
            				.employmentStatusReason( new EmploymentStatusReason().xrefCode("NEW ASSIGNMENT") ) 
            				.effectiveStart(hireDate)
            				)
            		);
				
		System.out.println( "Posting a new hire" );
		HashMap<String, Object> queryString = new HashMap<String, Object>();
        // Validating only.  If this is set to false, the data will be persisted to the database and 
        // removal of the data is not possible.
		queryString.put(DayforceApi.IS_VALIDATE_ONLY, true);
		String json = getGsonInstance().toJson(newHire);
		Type type = new TypeToken<ApiResponse<Employee>>(){}.getType();
		
		ApiResponse<Employee> employeeResponse = client.Post(type, GetUrl(DayforceApi.EMPLOYEES), queryString, json);
		DisplayResponse(employeeResponse);	
	}

    // This method will display the response
	private static <T> void DisplayResponse(ApiResponse<T> response)
    {
		if (response != null) {
			if (response.getData() != null) {
				String json = getGsonInstance(true).toJson(response.getData());
				System.out.println(json);
			}
			if (response.getProcessResults() != null) {
				System.out.println("The following error happened: ");
				for (int i=0; i<response.getProcessResults().size(); i++ ) {
					System.out.println(response.getProcessResults().get(i).getCode() + ": " + response.getProcessResults().get(i).getMessage());
				}
			}
		}
		System.out.println();		
    }	

	private static Gson getGsonInstance() {
		return getGsonInstance(false);
	}
	
	private static Gson getGsonInstance(Boolean prettyPrint) {
		GsonBuilder gsonBuilder = new GsonBuilder().registerTypeAdapter(DateTime.class, new DateTimeTypeAdapter())
				.registerTypeAdapter(byte[].class, new ByteArrayToBase64TypeAdapter());
		
		if (prettyPrint) {
			gsonBuilder.setPrettyPrinting();
		}
		return gsonBuilder.create();
	}
}
