
# Get Checkout Boleto Payment Response

## Structure

`GetCheckoutBoletoPaymentResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DueAt` | `LocalDateTime` | Optional | Data de vencimento do boleto | LocalDateTime getDueAt() | setDueAt(LocalDateTime dueAt) |
| `Instructions` | `String` | Optional | Instruções do boleto | String getInstructions() | setInstructions(String instructions) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetCheckoutBoletoPaymentResponse;

GetCheckoutBoletoPaymentResponse getCheckoutBoletoPaymentResponse = new GetCheckoutBoletoPaymentResponse.Builder()
    .dueAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .instructions("instructions6")
    .build();
```

