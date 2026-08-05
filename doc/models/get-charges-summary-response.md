
# Get Charges Summary Response

## Structure

`GetChargesSummaryResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Total` | `Integer` | Optional | - | Integer getTotal() | setTotal(Integer total) |

## Example

```java
import me.pagar.api.models.GetChargesSummaryResponse;

GetChargesSummaryResponse getChargesSummaryResponse = new GetChargesSummaryResponse.Builder()
    .total(134)
    .build();
```

