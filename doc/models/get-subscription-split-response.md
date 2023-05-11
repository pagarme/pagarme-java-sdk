
# Get Subscription Split Response

## Structure

`GetSubscriptionSplitResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Defines if the split is enabled | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Rules` | [`List<GetSplitResponse>`](../../doc/models/get-split-response.md) | Optional | Split | List<GetSplitResponse> getRules() | setRules(List<GetSplitResponse> rules) |

## Example (as JSON)

```json
{
  "enabled": false,
  "rules": [
    {
      "type": "type6",
      "amount": 210,
      "recipient": {
        "id": "id4",
        "name": "name4",
        "email": "email2",
        "document": "document2",
        "description": "description6"
      },
      "gateway_id": "gateway_id6",
      "options": {
        "liable": false,
        "charge_processing_fee": false,
        "charge_remainder_fee": "charge_remainder_fee6"
      }
    }
  ]
}
```

