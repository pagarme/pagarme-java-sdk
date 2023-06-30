
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `serviceRefererName` | `String` |  |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |
| `basicAuthUserName` | `String` | The username to use with basic authentication |
| `basicAuthPassword` | `String` | The password to use with basic authentication |

The API client can be initialized as follows:

```java
PagarmeApiSDKClient client = new PagarmeApiSDKClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .serviceRefererName("ServiceRefererName")
    .basicAuthCredentials("BasicAuthUserName", "BasicAuthPassword")
    .build();
```

## PagarmeApiSDKClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getOrdersController()` | Provides access to Orders controller. | `OrdersController` |
| `getPlansController()` | Provides access to Plans controller. | `PlansController` |
| `getSubscriptionsController()` | Provides access to Subscriptions controller. | `SubscriptionsController` |
| `getInvoicesController()` | Provides access to Invoices controller. | `InvoicesController` |
| `getCustomersController()` | Provides access to Customers controller. | `CustomersController` |
| `getRecipientsController()` | Provides access to Recipients controller. | `RecipientsController` |
| `getChargesController()` | Provides access to Charges controller. | `ChargesController` |
| `getTokensController()` | Provides access to Tokens controller. | `TokensController` |
| `getTransfersController()` | Provides access to Transfers controller. | `TransfersController` |
| `getTransactionsController()` | Provides access to Transactions controller. | `TransactionsController` |
| `getPayablesController()` | Provides access to Payables controller. | `PayablesController` |
| `getBalanceOperationsController()` | Provides access to BalanceOperations controller. | `BalanceOperationsController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getServiceRefererName()` | . | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

