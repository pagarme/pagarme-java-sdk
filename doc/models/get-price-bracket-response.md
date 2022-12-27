
# Get Price Bracket Response

Response object for getting a price bracket

## Structure

`GetPriceBracketResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartQuantity` | `Integer` | Required | - | Integer getStartQuantity() | setStartQuantity(Integer startQuantity) |
| `Price` | `Integer` | Required | - | Integer getPrice() | setPrice(Integer price) |
| `EndQuantity` | `Integer` | Optional | - | Integer getEndQuantity() | setEndQuantity(Integer endQuantity) |
| `OveragePrice` | `Integer` | Optional | - | Integer getOveragePrice() | setOveragePrice(Integer overagePrice) |

## Example (as JSON)

```json
{
  "start_quantity": 46,
  "price": 16,
  "end_quantity": null,
  "overage_price": null
}
```

