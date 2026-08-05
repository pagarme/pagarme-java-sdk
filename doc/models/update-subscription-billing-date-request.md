
# Update Subscription Billing Date Request

Request for updating the due date from a subscription

## Structure

`UpdateSubscriptionBillingDateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NextBillingAt` | `LocalDateTime` | Required | The date when the next subscription billing must occur | LocalDateTime getNextBillingAt() | setNextBillingAt(LocalDateTime nextBillingAt) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.UpdateSubscriptionBillingDateRequest;

UpdateSubscriptionBillingDateRequest updateSubscriptionBillingDateRequest = new UpdateSubscriptionBillingDateRequest.Builder(
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();
```

