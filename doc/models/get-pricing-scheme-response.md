
# Get Pricing Scheme Response

Response object for getting a pricing scheme

## Structure

`GetPricingSchemeResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Price` | `Integer` | Optional | - | Integer getPrice() | setPrice(Integer price) |
| `SchemeType` | `String` | Optional | - | String getSchemeType() | setSchemeType(String schemeType) |
| `PriceBrackets` | [`List<GetPriceBracketResponse>`](../../doc/models/get-price-bracket-response.md) | Optional | - | List<GetPriceBracketResponse> getPriceBrackets() | setPriceBrackets(List<GetPriceBracketResponse> priceBrackets) |
| `MinimumPrice` | `Integer` | Optional | - | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |
| `Percentage` | `Double` | Optional | percentual value used in pricing_scheme Percent | Double getPercentage() | setPercentage(Double percentage) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetPricingSchemeResponse;

GetPricingSchemeResponse getPricingSchemeResponse = new GetPricingSchemeResponse.Builder()
    .price(34)
    .schemeType("scheme_type2")
    .priceBrackets(Arrays.asList(
        null
    ))
    .minimumPrice(130)
    .percentage(35.4D)
    .build();
```

