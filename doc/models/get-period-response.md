
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
  "start_at": "2016-03-13T12:52:32.123Z",
  "end_at": "2016-03-13T12:52:32.123Z",
  "id": "id0",
  "billing_at": "2016-03-13T12:52:32.123Z",
  "subscription": {
    "id": "id4",
    "code": "code2",
    "start_at": "2016-03-13T12:52:32.123Z",
    "interval": "interval2",
    "interval_count": 234
  }
}
```

