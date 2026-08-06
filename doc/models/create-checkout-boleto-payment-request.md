
# Create Checkout Boleto Payment Request

## Structure

`CreateCheckoutBoletoPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Bank` | `String` | Required | Bank identifier | String getBank() | setBank(String bank) |
| `Instructions` | `String` | Required | Instructions | String getInstructions() | setInstructions(String instructions) |
| `DueAt` | `LocalDateTime` | Required | Due date | LocalDateTime getDueAt() | setDueAt(LocalDateTime dueAt) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.CreateCheckoutBoletoPaymentRequest;

CreateCheckoutBoletoPaymentRequest createCheckoutBoletoPaymentRequest = new CreateCheckoutBoletoPaymentRequest.Builder(
    "bank6",
    "instructions6",
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();
```

