RestJavaClient
--------------------------

The purpose of this application is to provide sample code to show how to make various requests of the Dayforce HCM RESTful Web Services.

This application is intentionally simple and lacking robust error handling and security logic to allow you to see the code needed
to make requests of the Dayforce HCM web services.  This is a console application which will run stand-alone in a console window, 
but it is expected that you would use the debugger and step through the logic to better understand it.

This sample application is coded to work when making requests of the Sales Demo environment using the client namespace of iwfmsales500b.
Many items in the application are client specific, such as the employee XRefCode contained in the configuration information, as well as
the Post and Patch requests which use client specific XRefCodes.  The Post example is formatted to specifically meet the business
validation rules enabled by the configuration of the iwfmsales500b client.
 

Prerequisites
---------------
* Eclipse Java EE IDE for Web Developers (version 4.4.2 or higher)
* Web Services feature enabled on your Dayforce HCM application.

Maven Dependencies
------------------
* Unirest 1.4.9 Lightweight HTTP Request Client Libraries
* Gson 2.6.2 JSON serialization library


Loading the Project
-------------------
To load the project in Eclipse, you need to import it.  Use the File->Import... menu option and choose General->Existing Projects into Workspace and then select
the directory where you have placed the project files.


Configuration
---------------
The following environment specific configuration items are located in the config.properties source file of the org.my.dayforce.RestSample package.
* BaseUrl - URL to the Dayforce HCM REST Web Services. 
* CurrentVersion - The version of REST services to call.  Currently only V1 is supported. 
* Client Name - This is your client name.
* Employee XRef Code - The samples use a specific employee XRefCode that will be unique for each environment
* User Name/Password - User name and password of a user that has the Web Services feature enabled in Dayforce HCM.


The logic
---------------
Like all console applications, there is a main method which is found in the App.java source file.  The main method makes calls
to various methods which exercise different functions of the web services.  The method names closely resemble the web service
methods that are exercised in the underlying methods.  The methods are not at all dependent on each other, you can comment out the ones
you are not interested in, and the remainder will compile and run without issue.

The DayforceApi.java class is a proxy class which abstracts away most of the interaction with the HTTP protocol and the REST service
calls.  This class is utilized from the main application to perform various actions on the REST service.

The Model package contains a representation of the entities which our REST service can act on.  These model classes can be used to construct
a properly formated JSON request or as target objects to deserialize the JSON response. 