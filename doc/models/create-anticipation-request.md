
# Create Anticipation Request

Request for creating an anticipation

## Structure

`CreateAnticipationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | Amount requested for the anticipation | int getAmount() | setAmount(int amount) |
| `Timeframe` | `String` | Required | Timeframe | String getTimeframe() | setTimeframe(String timeframe) |
| `PaymentDate` | `LocalDateTime` | Required | Payment date | LocalDateTime getPaymentDate() | setPaymentDate(LocalDateTime paymentDate) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.CreateAnticipationRequest;

CreateAnticipationRequest createAnticipationRequest = new CreateAnticipationRequest.Builder(
    84,
    "timeframe2",
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();
```

