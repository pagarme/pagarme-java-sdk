
# Get Subscription Split Response

## Structure

`GetSubscriptionSplitResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Defines if the split is enabled | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Rules` | [`List<GetSplitResponse>`](../../doc/models/get-split-response.md) | Optional | Split | List<GetSplitResponse> getRules() | setRules(List<GetSplitResponse> rules) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetSplitResponse;
import me.pagar.api.models.GetSubscriptionSplitResponse;

GetSubscriptionSplitResponse getSubscriptionSplitResponse = new GetSubscriptionSplitResponse.Builder()
    .enabled(false)
    .rules(Arrays.asList(
        null,
        new GetSplitResponse.Builder()
            .build()
    ))
    .build();
```

