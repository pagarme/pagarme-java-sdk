
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

## Example (as JSON)

```json
{
  "price": 182,
  "scheme_type": "scheme_type8",
  "price_brackets": [
    {
      "start_quantity": 144,
      "price": 174,
      "end_quantity": 152,
      "overage_price": 166
    }
  ],
  "minimum_price": 170,
  "percentage": 166.36
}
```

