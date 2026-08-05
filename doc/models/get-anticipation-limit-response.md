
# Get Anticipation Limit Response

Anticipation limit

## Structure

`GetAnticipationLimitResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `Integer` | Optional | Amount | Integer getAmount() | setAmount(Integer amount) |
| `AnticipationFee` | `Integer` | Optional | Anticipation fee | Integer getAnticipationFee() | setAnticipationFee(Integer anticipationFee) |

## Example

```java
import me.pagar.api.models.GetAnticipationLimitResponse;

GetAnticipationLimitResponse getAnticipationLimitResponse = new GetAnticipationLimitResponse.Builder()
    .amount(160)
    .anticipationFee(190)
    .build();
```

