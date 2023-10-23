
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

## Example (as JSON)

```json
{
  "scheme_type": "scheme_type0",
  "price_brackets": [
    {
      "start_quantity": 144,
      "price": 174,
      "end_quantity": 152,
      "overage_price": 166
    }
  ],
  "price": 162,
  "minimum_price": 2,
  "percentage": 62.28
}
```

