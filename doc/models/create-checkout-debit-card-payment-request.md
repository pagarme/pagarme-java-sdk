
# Create Checkout Debit Card Payment Request

Checkout credit card payment request

## Structure

`CreateCheckoutDebitCardPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatementDescriptor` | `String` | Optional | Card invoice text descriptor | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Authentication` | [`CreatePaymentAuthenticationRequest`](../../doc/models/create-payment-authentication-request.md) | Required | Creates payment authentication | CreatePaymentAuthenticationRequest getAuthentication() | setAuthentication(CreatePaymentAuthenticationRequest authentication) |

## Example

```java
import me.pagar.api.models.CreateCheckoutDebitCardPaymentRequest;

CreateCheckoutDebitCardPaymentRequest createCheckoutDebitCardPaymentRequest = new CreateCheckoutDebitCardPaymentRequest.Builder(
    null
)
.statementDescriptor("statement_descriptor8")
.build();
```

