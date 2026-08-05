
# Create Split Request

Split

## Structure

`CreateSplitRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | Split type | String getType() | setType(String type) |
| `Amount` | `int` | Required | Amount | int getAmount() | setAmount(int amount) |
| `RecipientId` | `String` | Required | Recipient id | String getRecipientId() | setRecipientId(String recipientId) |
| `Options` | [`CreateSplitOptionsRequest`](../../doc/models/create-split-options-request.md) | Optional | The split options request | CreateSplitOptionsRequest getOptions() | setOptions(CreateSplitOptionsRequest options) |
| `SplitRuleId` | `String` | Optional | Rule code used in cancellation. | String getSplitRuleId() | setSplitRuleId(String splitRuleId) |

## Example

```java
import me.pagar.api.models.CreateSplitRequest;

CreateSplitRequest createSplitRequest = new CreateSplitRequest.Builder(
    "type8",
    166,
    "recipient_id8"
)
.options(null)
.splitRuleId("split_rule_id4")
.build();
```

