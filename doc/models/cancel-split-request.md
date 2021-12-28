
# Cancel Split Request

Split

## Structure

`CancelSplitRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | Split type | String getType() | setType(String type) |
| `Amount` | `int` | Required | Amount | int getAmount() | setAmount(int amount) |
| `RecipientId` | `String` | Required | Recipient id | String getRecipientId() | setRecipientId(String recipientId) |
| `Options` | [`CreateSplitOptionsRequest`](/doc/models/create-split-options-request.md) | Optional | The split options request | CreateSplitOptionsRequest getOptions() | setOptions(CreateSplitOptionsRequest options) |
| `SplitRuleID` | `String` | Optional | Rule id | String getSplitRuleID() | setSplitRuleID(String splitRuleID) |

## Example (as JSON)

```json
{
  "type": "type0",
  "amount": 46,
  "recipient_id": "recipient_id0",
  "options": null,
  "Split_Rule_ID": null
}
```

