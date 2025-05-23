
# Getting Started with PagarmeApiSDK

## Introduction

Pagarme API

## Building

Supported Java version is **8+**.

The generated code uses a few Maven dependencies e.g., Jackson, OkHttp,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on `File -> Import`.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=import0)

* In the import dialog, select `Existing Java Project` and click `Next`.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=import1)

* Browse to locate the folder containing the source code. Select the detected location of the project and click `Finish`.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=import2)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=import3)

* After successfully building the project, the client library needs to be installed as a Maven package in your local cache. Right-click on the project, select `Show in Local Terminal -> Terminal` or use `Ctrl + Alt + T` to open Terminal.

![Importing SDK into Eclipse - Step 5](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=openTerminal)

* In the terminal dialog, run the following command to install client library.

```
mvn install -Dmaven.test.skip=true -Dmaven.javadoc.skip=true
```

![Importing SDK into Eclipse - Step 6](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=installCommand)

## Installation

The following section explains how to use the PagarmeApiSDKLib library in a new project.

### 1. Starting a new project

For starting a new project, click the menu command `File > New > Project`.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=createNewProject0)

Next, choose `Maven > Maven Project` and click `Next`.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=createNewProject1)

Here, make sure to use the current workspace by choosing `Use default Workspace location`, as shown in the picture below and click `Next`.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=createNewProject2)

Following this, select the *quick start* project type to create a simple project with an existing class and a `main` method. To do this, choose `maven-archetype-quickstart` item from the list and click `Next`.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=createNewProject3)

In the last step, provide a `Group Id` and `Artifact Id` as shown in the picture below and click `Finish`.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=createNewProject4)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its `pom.xml` file. In order to add a dependency on the *PagarmeApiSDKLib* client library, double click on the `pom.xml` file in the `Package Explorer`. Opening the `pom.xml` file will render a graphical view on the canvas. Here, switch to the `Dependencies` tab and click the `Add` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=testProject0)

Clicking the `Add` button will open a dialog where you need to specify PagarmeApiSDKLib in `Group Id`, pagarme-api-sdklib in `Artifact Id` and 6.8.17 in the `Version` fields. Once added click `OK`. Save the `pom.xml` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=testProject1)

![Adding sample code](https://apidocs.io/illustration/java?workspaceFolder=PagarmeApiSDK-Java&workspaceName=PagarmeApiSDK&projectName=PagarmeApiSDKLib&rootNamespace=me.pagar.api&groupId=PagarmeApiSDKLib&artifactId=pagarme-api-sdklib&version=6.8.17&step=testProject2)

### 3. Write sample code

Once the `SimpleConsoleApp` is created, a file named `App.java` will be visible in the *Package Explorer* with a `main` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| serviceRefererName | `String` |  |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| basicAuthCredentials | [`BasicAuthCredentials`](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/auth/basic-authentication.md) | The Credentials Setter for Basic Authentication |

The API client can be initialized as follows:

```java
PagarmeApiSDKClient client = new PagarmeApiSDKClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .serviceRefererName("ServiceRefererName")
    .basicAuthCredentials(new BasicAuthModel.Builder(
            "BasicAuthUserName",
            "BasicAuthPassword"
        )
        .build())
    .build();
```

## Authorization

This API uses the following authentication schemes.

* [`httpBasic (Basic Authentication)`](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/auth/basic-authentication.md)

## API Errors

Here is the list of errors that the API might throw.

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid request | [`ErrorException`](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/models/error-exception.md) |
| 401 | Invalid API key | [`ErrorException`](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/models/error-exception.md) |
| 404 | An informed resource was not found | [`ErrorException`](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/models/error-exception.md) |
| 412 | Business validation error | [`ErrorException`](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/models/error-exception.md) |
| 422 | Contract validation error | [`ErrorException`](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/models/error-exception.md) |
| 500 | Internal server error | [`ErrorException`](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/models/error-exception.md) |

## List of APIs

* [Subscriptions](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/controllers/subscriptions.md)
* [Orders](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/controllers/orders.md)
* [Plans](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/controllers/plans.md)
* [Invoices](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/controllers/invoices.md)
* [Customers](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/controllers/customers.md)
* [Charges](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/controllers/charges.md)
* [Recipients](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/controllers/recipients.md)
* [Tokens](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/controllers/tokens.md)
* [Transactions](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/controllers/transactions.md)
* [Transfers](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/controllers/transfers.md)
* [Payables](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/controllers/payables.md)
* [Balance Operations](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/controllers/balance-operations.md)

## SDK Infrastructure

### Configuration

* [Configuration Interface](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/http-client-configuration-builder.md)

### HTTP

* [Headers](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/headers.md)
* [HttpCallback Interface](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/http-callback-interface.md)
* [HttpContext](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/http-body-request.md)
* [HttpRequest](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/http-request.md)
* [HttpResponse](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/http-string-response.md)

### Utilities

* [ApiException](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/api-exception.md)
* [ApiHelper](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/api-helper.md)
* [FileWrapper](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/file-wrapper.md)
* [DateTimeHelper](https://www.github.com/pagarme/pagarme-java-sdk/tree/6.8.17/doc/date-time-helper.md)

