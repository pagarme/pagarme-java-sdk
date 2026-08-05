
# Update Pricing Scheme Request

Request for updating a pricing scheme

## Structure

`UpdatePricingSchemeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SchemeType` | `String` | Required | Scheme type | String getSchemeType() | setSchemeType(String schemeType) |
| `PriceBrackets` | [`List<UpdatePriceBracketRequest>`](../../doc/models/update-price-bracket-request.md) | Required | Price brackets | List<UpdatePriceBracketRequest> getPriceBrackets() | setPriceBrackets(List<UpdatePriceBracketRequest> priceBrackets) |
| `Price` | `Integer` | Optional | Price | Integer getPrice() | setPrice(Integer price) |
| `MinimumPrice` | `Integer` | Optional | Minimum price | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |
| `Percentage` | `Double` | Optional | percentual value used in pricing_scheme Percent | Double getPercentage() | setPercentage(Double percentage) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.UpdatePricingSchemeRequest;

UpdatePricingSchemeRequest updatePricingSchemeRequest = new UpdatePricingSchemeRequest.Builder(
    null,
    Arrays.asList(
        null
    )
)
.price(180)
.minimumPrice(84)
.percentage(238.06D)
.build();
```

