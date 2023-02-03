
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
  "type": null,
  "amount": null,
  "recipient": null,
  "gateway_id": null,
  "options": null,
  "id": null
}
```

