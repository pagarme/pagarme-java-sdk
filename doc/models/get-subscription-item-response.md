
# Get Subscription Item Response

## Structure

`GetSubscriptionItemResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `PricingScheme` | [`GetPricingSchemeResponse`](../../doc/models/get-pricing-scheme-response.md) | Optional | - | GetPricingSchemeResponse getPricingScheme() | setPricingScheme(GetPricingSchemeResponse pricingScheme) |
| `Discounts` | [`List<GetDiscountResponse>`](../../doc/models/get-discount-response.md) | Optional | - | List<GetDiscountResponse> getDiscounts() | setDiscounts(List<GetDiscountResponse> discounts) |
| `Increments` | [`List<GetIncrementResponse>`](../../doc/models/get-increment-response.md) | Optional | - | List<GetIncrementResponse> getIncrements() | setIncrements(List<GetIncrementResponse> increments) |
| `Subscription` | [`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md) | Optional | - | GetSubscriptionResponse getSubscription() | setSubscription(GetSubscriptionResponse subscription) |
| `Name` | `String` | Optional | Item name | String getName() | setName(String name) |
| `Quantity` | `Integer` | Optional | - | Integer getQuantity() | setQuantity(Integer quantity) |
| `Cycles` | `Integer` | Optional | - | Integer getCycles() | setCycles(Integer cycles) |
| `DeletedAt` | `LocalDateTime` | Optional | - | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |

## Example (as JSON)

```json
{
  "id": "id2",
  "description": "description8",
  "status": "status6",
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z"
}
```

