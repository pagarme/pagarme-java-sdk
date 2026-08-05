
# Create Plan Item Request

Request for creating a plan item

## Structure

`CreatePlanItemRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Item name | String getName() | setName(String name) |
| `PricingScheme` | [`CreatePricingSchemeRequest`](../../doc/models/create-pricing-scheme-request.md) | Required | Item's pricing scheme | CreatePricingSchemeRequest getPricingScheme() | setPricingScheme(CreatePricingSchemeRequest pricingScheme) |
| `Id` | `String` | Required | Item's id | String getId() | setId(String id) |
| `Description` | `String` | Required | Item's description | String getDescription() | setDescription(String description) |
| `Cycles` | `Integer` | Optional | Number of cycles where the item will be charged | Integer getCycles() | setCycles(Integer cycles) |
| `Quantity` | `Integer` | Optional | Quantity | Integer getQuantity() | setQuantity(Integer quantity) |

## Example

```java
import me.pagar.api.models.CreatePlanItemRequest;

CreatePlanItemRequest createPlanItemRequest = new CreatePlanItemRequest.Builder(
    "name8",
    null,
    "id8",
    "description8"
)
.cycles(78)
.quantity(158)
.build();
```

