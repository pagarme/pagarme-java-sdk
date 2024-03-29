
# Get Usage Response

Response object for getting a usage

## Structure

`GetUsageResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Id | String getId() | setId(String id) |
| `Quantity` | `Integer` | Optional | Quantity | Integer getQuantity() | setQuantity(Integer quantity) |
| `Description` | `String` | Optional | Description | String getDescription() | setDescription(String description) |
| `UsedAt` | `LocalDateTime` | Optional | Used at | LocalDateTime getUsedAt() | setUsedAt(LocalDateTime usedAt) |
| `CreatedAt` | `LocalDateTime` | Optional | Creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `Status` | `String` | Optional | Status | String getStatus() | setStatus(String status) |
| `DeletedAt` | `LocalDateTime` | Optional | - | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |
| `SubscriptionItem` | [`GetSubscriptionItemResponse`](../../doc/models/get-subscription-item-response.md) | Optional | Subscription item | GetSubscriptionItemResponse getSubscriptionItem() | setSubscriptionItem(GetSubscriptionItemResponse subscriptionItem) |
| `Code` | `String` | Optional | Identification code in the client system | String getCode() | setCode(String code) |
| `Group` | `String` | Optional | Identification group in the client system | String getGroup() | setGroup(String group) |
| `Amount` | `Integer` | Optional | Field used in item scheme type 'Percent' | Integer getAmount() | setAmount(Integer amount) |

## Example (as JSON)

```json
{
  "id": "id2",
  "quantity": 34,
  "description": "description2",
  "used_at": "2016-03-13T12:52:32.123Z",
  "created_at": "2016-03-13T12:52:32.123Z"
}
```

