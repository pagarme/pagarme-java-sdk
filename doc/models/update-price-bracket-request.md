
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

## Example

```java
import me.pagar.api.models.UpdatePriceBracketRequest;

UpdatePriceBracketRequest updatePriceBracketRequest = new UpdatePriceBracketRequest.Builder(
    160,
    98
)
.endQuantity(168)
.overagePrice(182)
.build();
```

