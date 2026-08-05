
# Get Split Options Response

## Structure

`GetSplitOptionsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Liable` | `Boolean` | Optional | - | Boolean getLiable() | setLiable(Boolean liable) |
| `ChargeProcessingFee` | `Boolean` | Optional | - | Boolean getChargeProcessingFee() | setChargeProcessingFee(Boolean chargeProcessingFee) |
| `ChargeRemainderFee` | `String` | Optional | - | String getChargeRemainderFee() | setChargeRemainderFee(String chargeRemainderFee) |

## Example

```java
import me.pagar.api.models.GetSplitOptionsResponse;

GetSplitOptionsResponse getSplitOptionsResponse = new GetSplitOptionsResponse.Builder()
    .liable(false)
    .chargeProcessingFee(false)
    .chargeRemainderFee("charge_remainder_fee6")
    .build();
```

