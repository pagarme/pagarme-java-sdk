
# Create Subscription Item Request

Request for creating a new subscription item

## Structure

`CreateSubscriptionItemRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Required | Item description | String getDescription() | setDescription(String description) |
| `PricingScheme` | [`CreatePricingSchemeRequest`](../../doc/models/create-pricing-scheme-request.md) | Required | Pricing scheme | CreatePricingSchemeRequest getPricingScheme() | setPricingScheme(CreatePricingSchemeRequest pricingScheme) |
| `Id` | `String` | Required | Item id | String getId() | setId(String id) |
| `PlanItemId` | `String` | Required | Plan item id | String getPlanItemId() | setPlanItemId(String planItemId) |
| `Discounts` | [`List<CreateDiscountRequest>`](../../doc/models/create-discount-request.md) | Required | Discounts for the item | List<CreateDiscountRequest> getDiscounts() | setDiscounts(List<CreateDiscountRequest> discounts) |
| `Name` | `String` | Required | Item name | String getName() | setName(String name) |
| `Cycles` | `Integer` | Optional | Number of cycles which the item will be charged | Integer getCycles() | setCycles(Integer cycles) |
| `Quantity` | `Integer` | Optional | Quantity of items | Integer getQuantity() | setQuantity(Integer quantity) |
| `MinimumPrice` | `Integer` | Optional | Minimum price | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.CreateSubscriptionItemRequest;

CreateSubscriptionItemRequest createSubscriptionItemRequest = new CreateSubscriptionItemRequest.Builder(
    null,
    null,
    null,
    null,
    Arrays.asList(
        null
    ),
    null
)
.cycles(250)
.quantity(242)
.minimumPrice(2)
.build();
```

