
# Create Payment Origin Request

Request object for PaymentOrigin

## Structure

`CreatePaymentOriginRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BrandId` | `String` | Optional | - | String getBrandId() | setBrandId(String brandId) |
| `ChargeId` | `String` | Optional | - | String getChargeId() | setChargeId(String chargeId) |

## Example

```java
import me.pagar.api.models.CreatePaymentOriginRequest;

CreatePaymentOriginRequest createPaymentOriginRequest = new CreatePaymentOriginRequest.Builder()
    .brandId("brand_id8")
    .chargeId("charge_id2")
    .build();
```

