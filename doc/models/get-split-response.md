
# Get Split Response

Split response

## Structure

`GetSplitResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | Type | String getType() | setType(String type) |
| `Amount` | `Integer` | Optional | Amount | Integer getAmount() | setAmount(Integer amount) |
| `Recipient` | [`GetRecipientResponse`](../../doc/models/get-recipient-response.md) | Optional | Recipient | GetRecipientResponse getRecipient() | setRecipient(GetRecipientResponse recipient) |
| `GatewayId` | `String` | Optional | The split rule gateway id | String getGatewayId() | setGatewayId(String gatewayId) |
| `Options` | [`GetSplitOptionsResponse`](../../doc/models/get-split-options-response.md) | Optional | - | GetSplitOptionsResponse getOptions() | setOptions(GetSplitOptionsResponse options) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |

## Example (as JSON)

```json
{
  "type": "type0",
  "amount": 46,
  "recipient": {
    "id": "id8",
    "name": "name8",
    "email": "email8",
    "document": "document8",
    "description": "description2"
  },
  "gateway_id": "gateway_id0",
  "options": {
    "liable": false,
    "charge_processing_fee": false,
    "charge_remainder_fee": "charge_remainder_fee0"
  }
}
```

