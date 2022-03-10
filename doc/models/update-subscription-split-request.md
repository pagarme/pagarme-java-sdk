
# Update Subscription Split Request

## Structure

`UpdateSubscriptionSplitRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `boolean` | Required | Defines if the split is enabled | boolean getEnabled() | setEnabled(boolean enabled) |
| `Rules` | [`List<CreateSplitRequest>`](../../doc/models/create-split-request.md) | Required | Split | List<CreateSplitRequest> getRules() | setRules(List<CreateSplitRequest> rules) |

## Example (as JSON)

```json
{
  "enabled": false,
  "rules": [
    {
      "type": "type6",
      "amount": 210,
      "recipient_id": "recipient_id6",
      "options": null,
      "split_rule_id": null
    }
  ]
}
```

