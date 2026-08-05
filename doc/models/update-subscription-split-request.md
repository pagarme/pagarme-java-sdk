
# Update Subscription Split Request

## Structure

`UpdateSubscriptionSplitRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `boolean` | Required | Defines if the split is enabled | boolean getEnabled() | setEnabled(boolean enabled) |
| `Rules` | [`List<CreateSplitRequest>`](../../doc/models/create-split-request.md) | Required | Split | List<CreateSplitRequest> getRules() | setRules(List<CreateSplitRequest> rules) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.UpdateSubscriptionSplitRequest;

UpdateSubscriptionSplitRequest updateSubscriptionSplitRequest = new UpdateSubscriptionSplitRequest.Builder(
    false,
    Arrays.asList(
        null
    )
)
.build();
```

