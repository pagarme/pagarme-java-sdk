
# Update Plan Item Request

Request for updating a plan item

## Structure

`UpdatePlanItemRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Item name | String getName() | setName(String name) |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `Status` | `String` | Required | Item status | String getStatus() | setStatus(String status) |
| `PricingScheme` | [`UpdatePricingSchemeRequest`](../../doc/models/update-pricing-scheme-request.md) | Required | Pricing scheme | UpdatePricingSchemeRequest getPricingScheme() | setPricingScheme(UpdatePricingSchemeRequest pricingScheme) |
| `Quantity` | `Integer` | Optional | Quantity | Integer getQuantity() | setQuantity(Integer quantity) |
| `Cycles` | `Integer` | Optional | Number of cycles that the item will be charged | Integer getCycles() | setCycles(Integer cycles) |

## Example (as JSON)

```json
{
  "name": "name6",
  "description": "description6",
  "status": "status8",
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
  "quantity": 200,
  "cycles": 36
}
```

