
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
  "scheme_type": "scheme_type2",
  "price_brackets": [
    {
      "start_quantity": 144,
      "price": 174,
      "end_quantity": 152,
      "overage_price": 166
    },
    {
      "start_quantity": 144,
      "price": 174,
      "end_quantity": 152,
      "overage_price": 166
    }
  ],
  "price": 84,
  "minimum_price": 12,
  "percentage": 157.1
}
```

