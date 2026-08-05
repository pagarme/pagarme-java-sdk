
# Get Discount Response

Response object for getting a discount

## Structure

`GetDiscountResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Value` | `Double` | Optional | - | Double getValue() | setValue(Double value) |
| `DiscountType` | `String` | Optional | - | String getDiscountType() | setDiscountType(String discountType) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Cycles` | `Integer` | Optional | - | Integer getCycles() | setCycles(Integer cycles) |
| `DeletedAt` | `LocalDateTime` | Optional | - | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Subscription` | [`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md) | Optional | - | GetSubscriptionResponse getSubscription() | setSubscription(GetSubscriptionResponse subscription) |
| `SubscriptionItem` | [`GetSubscriptionItemResponse`](../../doc/models/get-subscription-item-response.md) | Optional | The subscription item | GetSubscriptionItemResponse getSubscriptionItem() | setSubscriptionItem(GetSubscriptionItemResponse subscriptionItem) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetDiscountResponse;

GetDiscountResponse getDiscountResponse = new GetDiscountResponse.Builder()
    .id("id0")
    .value(135.12D)
    .discountType("discount_type8")
    .status("status2")
    .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

