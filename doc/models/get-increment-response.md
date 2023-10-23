
# Get Increment Response

Response object for getting a increment

## Structure

`GetIncrementResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Value` | `Double` | Optional | - | Double getValue() | setValue(Double value) |
| `IncrementType` | `String` | Optional | - | String getIncrementType() | setIncrementType(String incrementType) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Cycles` | `Integer` | Optional | - | Integer getCycles() | setCycles(Integer cycles) |
| `DeletedAt` | `LocalDateTime` | Optional | - | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Subscription` | [`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md) | Optional | - | GetSubscriptionResponse getSubscription() | setSubscription(GetSubscriptionResponse subscription) |
| `SubscriptionItem` | [`GetSubscriptionItemResponse`](../../doc/models/get-subscription-item-response.md) | Optional | The Subscription Item | GetSubscriptionItemResponse getSubscriptionItem() | setSubscriptionItem(GetSubscriptionItemResponse subscriptionItem) |

## Example (as JSON)

```json
{
  "id": "id0",
  "value": 167.72,
  "increment_type": "increment_type2",
  "status": "status2",
  "created_at": "2016-03-13T12:52:32.123Z"
}
```

