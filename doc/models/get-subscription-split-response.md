
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
      "type": "type2",
      "amount": 118,
      "recipient": {
        "id": "id8",
        "name": "name8",
        "email": "email8",
        "document": "document8",
        "description": "description2"
      },
      "gateway_id": "gateway_id2",
      "options": {
        "liable": false,
        "charge_processing_fee": false,
        "charge_remainder_fee": "charge_remainder_fee0"
      }
    },
    {
      "type": "type2",
      "amount": 118,
      "recipient": {
        "id": "id8",
        "name": "name8",
        "email": "email8",
        "document": "document8",
        "description": "description2"
      },
      "gateway_id": "gateway_id2",
      "options": {
        "liable": false,
        "charge_processing_fee": false,
        "charge_remainder_fee": "charge_remainder_fee0"
      }
    },
    {
      "type": "type2",
      "amount": 118,
      "recipient": {
        "id": "id8",
        "name": "name8",
        "email": "email8",
        "document": "document8",
        "description": "description2"
      },
      "gateway_id": "gateway_id2",
      "options": {
        "liable": false,
        "charge_processing_fee": false,
        "charge_remainder_fee": "charge_remainder_fee0"
      }
    }
  ]
}
```

