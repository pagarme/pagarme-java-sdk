
# Get Payment Origin Response

## Structure

`GetPaymentOriginResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ChargeId` | `String` | Optional | - | String getChargeId() | setChargeId(String chargeId) |
| `BrandId` | `String` | Optional | - | String getBrandId() | setBrandId(String brandId) |

## Example

```java
import me.pagar.api.models.GetPaymentOriginResponse;

GetPaymentOriginResponse getPaymentOriginResponse = new GetPaymentOriginResponse.Builder()
    .chargeId("charge_id4")
    .brandId("brand_id0")
    .build();
```

