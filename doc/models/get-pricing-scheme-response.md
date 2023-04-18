
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
  "price": 16,
  "scheme_type": "scheme_type0",
  "price_brackets": [
    {
      "start_quantity": 193,
      "price": 125,
      "end_quantity": 201,
      "overage_price": 215
    },
    {
      "start_quantity": 194,
      "price": 124,
      "end_quantity": 202,
      "overage_price": 216
    },
    {
      "start_quantity": 195,
      "price": 123,
      "end_quantity": 203,
      "overage_price": 217
    }
  ],
  "minimum_price": 176,
  "percentage": 4.18
}
```

