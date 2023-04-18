
# Create Pricing Scheme Request

Request for creating a pricing scheme

## Structure

`CreatePricingSchemeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SchemeType` | `String` | Required | Scheme type | String getSchemeType() | setSchemeType(String schemeType) |
| `PriceBrackets` | [`List<CreatePriceBracketRequest>`](../../doc/models/create-price-bracket-request.md) | Optional | Price brackets | List<CreatePriceBracketRequest> getPriceBrackets() | setPriceBrackets(List<CreatePriceBracketRequest> priceBrackets) |
| `Price` | `Integer` | Optional | Price | Integer getPrice() | setPrice(Integer price) |
| `MinimumPrice` | `Integer` | Optional | Minimum price | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |
| `Percentage` | `Double` | Optional | percentual value used in pricing_scheme Percent | Double getPercentage() | setPercentage(Double percentage) |

## Example (as JSON)

```json
{
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
  "price": 16,
  "minimum_price": 176,
  "percentage": 4.18
}
```

