
# Get Split Response

Split response

## Structure

`GetSplitResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | Type | String getType() | setType(String type) |
| `Amount` | `int` | Required | Amount | int getAmount() | setAmount(int amount) |
| `Recipient` | [`GetRecipientResponse`](../../doc/models/get-recipient-response.md) | Optional | Recipient | GetRecipientResponse getRecipient() | setRecipient(GetRecipientResponse recipient) |
| `GatewayId` | `String` | Required | The split rule gateway id | String getGatewayId() | setGatewayId(String gatewayId) |
| `Options` | [`GetSplitOptionsResponse`](../../doc/models/get-split-options-response.md) | Optional | - | GetSplitOptionsResponse getOptions() | setOptions(GetSplitOptionsResponse options) |
| `Id` | `String` | Required | - | String getId() | setId(String id) |

## Example (as JSON)

```json
{
  "type": "type0",
  "amount": 46,
  "recipient": null,
  "gateway_id": "gateway_id0",
  "options": null,
  "id": "id0"
}
```

