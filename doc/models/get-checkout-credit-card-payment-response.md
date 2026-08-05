
# Get Checkout Credit Card Payment Response

## Structure

`GetCheckoutCreditCardPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatementDescriptor` | `String` | Optional | Descrição na fatura | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Installments` | [`List<GetCheckoutCardInstallmentOptionsResponse>`](../../doc/models/get-checkout-card-installment-options-response.md) | Optional | Parcelas | List<GetCheckoutCardInstallmentOptionsResponse> getInstallments() | setInstallments(List<GetCheckoutCardInstallmentOptionsResponse> installments) |
| `Authentication` | [`GetPaymentAuthenticationResponse`](../../doc/models/get-payment-authentication-response.md) | Optional | Payment Authentication response | GetPaymentAuthenticationResponse getAuthentication() | setAuthentication(GetPaymentAuthenticationResponse authentication) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetCheckoutCardInstallmentOptionsResponse;
import me.pagar.api.models.GetCheckoutCreditCardPaymentResponse;

GetCheckoutCreditCardPaymentResponse getCheckoutCreditCardPaymentResponse = new GetCheckoutCreditCardPaymentResponse.Builder()
    .statementDescriptor("statementDescriptor2")
    .installments(Arrays.asList(
        null,
        new GetCheckoutCardInstallmentOptionsResponse.Builder(
            null,
            null
        )
        .build(),
        new GetCheckoutCardInstallmentOptionsResponse.Builder(
            null,
            null
        )
        .build()
    ))
    .authentication(null)
    .build();
```

