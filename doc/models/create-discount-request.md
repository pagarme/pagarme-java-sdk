
# Create Discount Request

Request for creating a new discount

## Structure

`CreateDiscountRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Value` | `double` | Required | The discount value | double getValue() | setValue(double value) |
| `DiscountType` | `String` | Required | Discount type. Can be either flat or percentage. | String getDiscountType() | setDiscountType(String discountType) |
| `ItemId` | `String` | Required | The item where the discount will be applied | String getItemId() | setItemId(String itemId) |
| `Cycles` | `Integer` | Optional | Number of cycles that the discount will be applied | Integer getCycles() | setCycles(Integer cycles) |
| `Description` | `String` | Optional | Description | String getDescription() | setDescription(String description) |

## Example

```java
import me.pagar.api.models.CreateDiscountRequest;

CreateDiscountRequest createDiscountRequest = new CreateDiscountRequest.Builder(
    66.94D,
    "discount_type0",
    "item_id8"
)
.cycles(194)
.description("description8")
.build();
```

