
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

## Example

```java
import me.pagar.api.models.GetSplitResponse;

GetSplitResponse getSplitResponse = new GetSplitResponse.Builder()
    .type("type0")
    .amount(42)
    .recipient(null)
    .gatewayId("gateway_id0")
    .options(null)
    .build();
```

