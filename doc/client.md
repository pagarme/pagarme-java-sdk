
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| serviceRefererName | `String` |  |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](../doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| basicAuthCredentials | [`BasicAuthCredentials`](auth/basic-authentication.md) | The Credentials Setter for Basic Authentication |

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

## PagarmeApiSDKClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getSubscriptionsController()` | Provides access to Subscriptions controller. | `SubscriptionsController` |
| `getOrdersController()` | Provides access to Orders controller. | `OrdersController` |
| `getPlansController()` | Provides access to Plans controller. | `PlansController` |
| `getInvoicesController()` | Provides access to Invoices controller. | `InvoicesController` |
| `getCustomersController()` | Provides access to Customers controller. | `CustomersController` |
| `getChargesController()` | Provides access to Charges controller. | `ChargesController` |
| `getRecipientsController()` | Provides access to Recipients controller. | `RecipientsController` |
| `getTokensController()` | Provides access to Tokens controller. | `TokensController` |
| `getTransactionsController()` | Provides access to Transactions controller. | `TransactionsController` |
| `getTransfersController()` | Provides access to Transfers controller. | `TransfersController` |
| `getPayablesController()` | Provides access to Payables controller. | `PayablesController` |
| `getBalanceOperationsController()` | Provides access to BalanceOperations controller. | `BalanceOperationsController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getServiceRefererName()` | . | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](../doc/http-client-configuration.md) |
| `getBasicAuthCredentials()` | The credentials to use with BasicAuth. | [`BasicAuthCredentials`](auth/basic-authentication.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

