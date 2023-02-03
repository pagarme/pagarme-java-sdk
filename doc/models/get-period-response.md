
# Get Period Response

Response object for getting a period

## Structure

`GetPeriodResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartAt` | `LocalDateTime` | Optional | - | LocalDateTime getStartAt() | setStartAt(LocalDateTime startAt) |
| `EndAt` | `LocalDateTime` | Optional | - | LocalDateTime getEndAt() | setEndAt(LocalDateTime endAt) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `BillingAt` | `LocalDateTime` | Optional | - | LocalDateTime getBillingAt() | setBillingAt(LocalDateTime billingAt) |
| `Subscription` | [`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md) | Optional | - | GetSubscriptionResponse getSubscription() | setSubscription(GetSubscriptionResponse subscription) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `Duration` | `Integer` | Optional | - | Integer getDuration() | setDuration(Integer duration) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `UpdatedAt` | `String` | Optional | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `Cycle` | `Integer` | Optional | - | Integer getCycle() | setCycle(Integer cycle) |

## Example (as JSON)

```json
{
  "start_at": null,
  "end_at": null,
  "id": null,
  "billing_at": null,
  "subscription": null,
  "status": null,
  "duration": null,
  "created_at": null,
  "updated_at": null,
  "cycle": null
}
```

