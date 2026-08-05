
# Update Subscription Due Days Request

## Structure

`UpdateSubscriptionDueDaysRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BoletoDueDays` | `int` | Required | - | int getBoletoDueDays() | setBoletoDueDays(int boletoDueDays) |

## Example

```java
import me.pagar.api.models.UpdateSubscriptionDueDaysRequest;

UpdateSubscriptionDueDaysRequest updateSubscriptionDueDaysRequest = new UpdateSubscriptionDueDaysRequest.Builder(
    78
)
.build();
```

