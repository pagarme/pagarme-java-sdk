
# Getting Started with PagarmeApiSDK

## Introduction

Pagarme API

## Installation

Supported Java version is **8+**.

### 1. Install the library

Clone this repository and install the library into your local Maven repository:

```
mvn install -Dmaven.test.skip=true
```

### 2. Add the dependency to your project

Use the version declared in this repository's `pom.xml`.

**Maven** (`pom.xml`):

```xml
<dependency>
  <groupId>PagarmeApiSDKLib</groupId>
  <artifactId>pagarme-api-sdklib</artifactId>
  <version>7.0.5-SNAPSHOT</version>
</dependency>
```

**Gradle** (`build.gradle`), with `mavenLocal()` among your repositories:

```groovy
repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation 'PagarmeApiSDKLib:pagarme-api-sdklib:7.0.5-SNAPSHOT'
}
```

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| serviceRefererName | `String` |  |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| basicAuthCredentials | [`BasicAuthCredentials`](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/auth/basic-authentication.md) | The Credentials Setter for Basic Authentication |

The API client can be initialized as follows:

```java
import me.pagar.api.PagarmeApiSDKClient;
import me.pagar.api.authentication.BasicAuthModel;
import me.pagar.api.exceptions.ApiException;

public class Program {
    public static void main(String[] args) {
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

    }
}
```

## Authorization

This API uses the following authentication schemes.

* [`httpBasic (Basic Authentication)`](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/auth/basic-authentication.md)

## API Errors

Here is the list of errors that the API might throw.

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Invalid request | [`ErrorException`](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/models/error-exception.md) |
| 401 | Invalid API key | [`ErrorException`](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/models/error-exception.md) |
| 404 | An informed resource was not found | [`ErrorException`](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/models/error-exception.md) |
| 412 | Business validation error | [`ErrorException`](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/models/error-exception.md) |
| 422 | Contract validation error | [`ErrorException`](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/models/error-exception.md) |
| 500 | Internal server error | [`ErrorException`](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/models/error-exception.md) |

## List of APIs

* [Charges](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/controllers/charges.md)
* [Customers](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/controllers/customers.md)
* [Invoices](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/controllers/invoices.md)
* [Orders](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/controllers/orders.md)
* [Payables](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/controllers/payables.md)
* [Plans](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/controllers/plans.md)
* [Recipients](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/controllers/recipients.md)
* [Subscriptions](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/controllers/subscriptions.md)
* [Tokens](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/controllers/tokens.md)
* [Transactions](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/controllers/transactions.md)
* [Transfers](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/controllers/transfers.md)

## SDK Infrastructure

### Configuration

* [Configuration Interface](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/http-client-configuration-builder.md)
* [HttpProxyConfiguration](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/http-proxy-configuration.md)
* [HttpProxyConfiguration.Builder](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/http-proxy-configuration-builder.md)

### HTTP

* [Headers](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/headers.md)
* [HttpCallback Interface](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/http-callback-interface.md)
* [HttpContext](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/http-body-request.md)
* [HttpRequest](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/http-request.md)
* [HttpResponse](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/http-string-response.md)

### Utilities

* [ApiException](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/api-exception.md)
* [ApiHelper](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/api-helper.md)
* [FileWrapper](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/file-wrapper.md)
* [DateTimeHelper](https://www.github.com/pagarme/pagarme-java-sdk/tree/7.0.2/doc/date-time-helper.md)

