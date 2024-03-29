
# Update Subscription Item Request

Request for updating a subscription item

## Structure

`UpdateSubscriptionItemRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `Status` | `String` | Required | Status | String getStatus() | setStatus(String status) |
| `PricingScheme` | [`UpdatePricingSchemeRequest`](../../doc/models/update-pricing-scheme-request.md) | Required | Pricing scheme | UpdatePricingSchemeRequest getPricingScheme() | setPricingScheme(UpdatePricingSchemeRequest pricingScheme) |
| `Name` | `String` | Required | Item name | String getName() | setName(String name) |
| `Cycles` | `Integer` | Optional | Number of cycles that the item will be charged | Integer getCycles() | setCycles(Integer cycles) |
| `Quantity` | `Integer` | Optional | Quantity | Integer getQuantity() | setQuantity(Integer quantity) |
| `MinimumPrice` | `Integer` | Optional | Minimum price | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |

## Example (as JSON)

```json
{
  "description": "description2",
  "status": "status4",
  "pricing_scheme": {
    "scheme_type": "scheme_type8",
    "price_brackets": [
      {
        "start_quantity": 144,
        "price": 174,
        "end_quantity": 152,
        "overage_price": 166
      }
    ],
    "price": 166,
    "minimum_price": 6,
    "percentage": 251.76
  },
  "name": "name2",
  "cycles": 108,
  "quantity": 128,
  "minimum_price": 140
}
```

