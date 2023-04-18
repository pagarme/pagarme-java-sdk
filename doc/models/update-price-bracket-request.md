
# Update Price Bracket Request

Request for updating a price bracket

## Structure

`UpdatePriceBracketRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartQuantity` | `int` | Required | Start quantity of the bracket | int getStartQuantity() | setStartQuantity(int startQuantity) |
| `Price` | `int` | Required | Price | int getPrice() | setPrice(int price) |
| `EndQuantity` | `Integer` | Optional | End quantity of the bracket | Integer getEndQuantity() | setEndQuantity(Integer endQuantity) |
| `OveragePrice` | `Integer` | Optional | Overage price | Integer getOveragePrice() | setOveragePrice(Integer overagePrice) |

## Example (as JSON)

```json
{
  "start_quantity": 46,
  "price": 16,
  "end_quantity": 54,
  "overage_price": 68
}
```

