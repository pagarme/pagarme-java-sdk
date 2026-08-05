
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

## Example

```java
import me.pagar.api.models.GetPriceBracketResponse;

GetPriceBracketResponse getPriceBracketResponse = new GetPriceBracketResponse.Builder()
    .startQuantity(80)
    .price(18)
    .endQuantity(88)
    .overagePrice(102)
    .build();
```

