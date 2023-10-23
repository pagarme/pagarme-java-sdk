
# Get Price Bracket Response

Response object for getting a price bracket

## Structure

`GetPriceBracketResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartQuantity` | `Integer` | Optional | - | Integer getStartQuantity() | setStartQuantity(Integer startQuantity) |
| `Price` | `Integer` | Optional | - | Integer getPrice() | setPrice(Integer price) |
| `EndQuantity` | `Integer` | Optional | - | Integer getEndQuantity() | setEndQuantity(Integer endQuantity) |
| `OveragePrice` | `Integer` | Optional | - | Integer getOveragePrice() | setOveragePrice(Integer overagePrice) |

## Example (as JSON)

```json
{
  "start_quantity": 186,
  "price": 124,
  "end_quantity": 194,
  "overage_price": 208
}
```

