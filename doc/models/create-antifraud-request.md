
# Create Antifraud Request

## Structure

`CreateAntifraudRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `Clearsale` | [`CreateClearSaleRequest`](../../doc/models/create-clear-sale-request.md) | Required | - | CreateClearSaleRequest getClearsale() | setClearsale(CreateClearSaleRequest clearsale) |

## Example (as JSON)

```json
{
  "type": "type0",
  "clearsale": {
    "custom_sla": 178
  }
}
```

