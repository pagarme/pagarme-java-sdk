
# Update Subscription Item Request

Request for updating a subscription item

## Structure

`UpdateSubscriptionItemRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `Status` | `String` | Required | Status | String getStatus() | setStatus(String status) |
| `PricingScheme` | [`UpdatePricingSchemeRequest`](../../doc/models/update-pricing-scheme-request.md) | Required | Pricing scheme | UpdatePricingSchemeRequest getPricingScheme() | setPricingScheme(UpdatePricingSchemeRequest pricingScheme) |
| `Name` | `String` | Required | Item name | String getName() | setName(String name) |
| `Cycles` | `Integer` | Optional | Number of cycles that the item will be charged | Integer getCycles() | setCycles(Integer cycles) |
| `Quantity` | `Integer` | Optional | Quantity | Integer getQuantity() | setQuantity(Integer quantity) |
| `MinimumPrice` | `Integer` | Optional | Minimum price | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.UpdatePricingSchemeRequest;
import me.pagar.api.models.UpdateSubscriptionItemRequest;

UpdateSubscriptionItemRequest updateSubscriptionItemRequest = new UpdateSubscriptionItemRequest.Builder(
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
    .build(),
    null
)
.cycles(64)
.quantity(44)
.minimumPrice(56)
.build();
```

