
# Create Checkout Credit Card Payment Request

Checkout card payment request

## Structure

`CreateCheckoutCreditCardPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatementDescriptor` | `String` | Optional | Card invoice text descriptor | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Installments` | [`List<CreateCheckoutCardInstallmentOptionRequest>`](../../doc/models/create-checkout-card-installment-option-request.md) | Optional | Payment installment options | List<CreateCheckoutCardInstallmentOptionRequest> getInstallments() | setInstallments(List<CreateCheckoutCardInstallmentOptionRequest> installments) |
| `Authentication` | [`CreatePaymentAuthenticationRequest`](../../doc/models/create-payment-authentication-request.md) | Optional | Creates payment authentication | CreatePaymentAuthenticationRequest getAuthentication() | setAuthentication(CreatePaymentAuthenticationRequest authentication) |
| `Capture` | `Boolean` | Optional | Authorize and capture? | Boolean getCapture() | setCapture(Boolean capture) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.CreateCheckoutCardInstallmentOptionRequest;
import me.pagar.api.models.CreateCheckoutCreditCardPaymentRequest;

CreateCheckoutCreditCardPaymentRequest createCheckoutCreditCardPaymentRequest = new CreateCheckoutCreditCardPaymentRequest.Builder()
    .statementDescriptor("statement_descriptor8")
    .installments(Arrays.asList(
        null,
        new CreateCheckoutCardInstallmentOptionRequest.Builder(
            0,
            0
        )
        .build()
    ))
    .authentication(null)
    .capture(false)
    .build();
```

