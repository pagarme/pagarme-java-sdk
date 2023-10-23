
# Create Subscription Split Request

## Structure

`CreateSubscriptionSplitRequest`

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
      "type": "type2",
      "amount": 118,
      "recipient_id": "recipient_id2",
      "options": {
        "liable": false,
        "charge_processing_fee": false,
        "charge_remainder_fee": false
      },
      "split_rule_id": "split_rule_id0"
    }
  ]
}
```

