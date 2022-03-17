
# Get Subscription Split Response

## Structure

`GetSubscriptionSplitResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `boolean` | Required | Defines if the split is enabled | boolean getEnabled() | setEnabled(boolean enabled) |
| `Rules` | [`List<GetSplitResponse>`](../../doc/models/get-split-response.md) | Required | Split | List<GetSplitResponse> getRules() | setRules(List<GetSplitResponse> rules) |

## Example (as JSON)

```json
{
  "enabled": false,
  "rules": [
    {
      "type": "type6",
      "amount": 210,
      "recipient": null,
      "gateway_id": "gateway_id6",
      "options": null,
      "id": "id4"
    }
  ]
}
```

