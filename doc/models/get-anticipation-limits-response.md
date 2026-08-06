
# Get Anticipation Limits Response

Anticipation limits

## Structure

`GetAnticipationLimitsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Max` | [`GetAnticipationLimitResponse`](../../doc/models/get-anticipation-limit-response.md) | Optional | Max limit | GetAnticipationLimitResponse getMax() | setMax(GetAnticipationLimitResponse max) |
| `Min` | [`GetAnticipationLimitResponse`](../../doc/models/get-anticipation-limit-response.md) | Optional | Min limit | GetAnticipationLimitResponse getMin() | setMin(GetAnticipationLimitResponse min) |

## Example

```java
import me.pagar.api.models.GetAnticipationLimitsResponse;

GetAnticipationLimitsResponse getAnticipationLimitsResponse = new GetAnticipationLimitsResponse.Builder()
    .max(null)
    .min(null)
    .build();
```

