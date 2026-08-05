
# Update Plan Item Request

Request for updating a plan item

## Structure

`UpdatePlanItemRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Item name | String getName() | setName(String name) |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `Status` | `String` | Required | Item status | String getStatus() | setStatus(String status) |
| `PricingScheme` | [`UpdatePricingSchemeRequest`](../../doc/models/update-pricing-scheme-request.md) | Required | Pricing scheme | UpdatePricingSchemeRequest getPricingScheme() | setPricingScheme(UpdatePricingSchemeRequest pricingScheme) |
| `Quantity` | `Integer` | Optional | Quantity | Integer getQuantity() | setQuantity(Integer quantity) |
| `Cycles` | `Integer` | Optional | Number of cycles that the item will be charged | Integer getCycles() | setCycles(Integer cycles) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.UpdatePlanItemRequest;
import me.pagar.api.models.UpdatePricingSchemeRequest;

UpdatePlanItemRequest updatePlanItemRequest = new UpdatePlanItemRequest.Builder(
    null,
    null,
    null,
    new UpdatePricingSchemeRequest.Builder(
        null,
        Arrays.asList(
            null
        )
    )
    .price(166)
    .minimumPrice(6)
    .percentage(251.76D)
    .build()
)
.quantity(174)
.cycles(194)
.build();
```

