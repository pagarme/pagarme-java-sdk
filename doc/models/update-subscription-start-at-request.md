
# Update Subscription Start at Request

Request for updating the start date from a subscription

## Structure

`UpdateSubscriptionStartAtRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartAt` | `LocalDateTime` | Required | The date when the subscription periods will start | LocalDateTime getStartAt() | setStartAt(LocalDateTime startAt) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.UpdateSubscriptionStartAtRequest;

UpdateSubscriptionStartAtRequest updateSubscriptionStartAtRequest = new UpdateSubscriptionStartAtRequest.Builder(
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();
```

