
# Create Plan Item Request

Request for creating a plan item

## Structure

`CreatePlanItemRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Item name | String getName() | setName(String name) |
| `PricingScheme` | [`CreatePricingSchemeRequest`](../../doc/models/create-pricing-scheme-request.md) | Required | Item's pricing scheme | CreatePricingSchemeRequest getPricingScheme() | setPricingScheme(CreatePricingSchemeRequest pricingScheme) |
| `Id` | `String` | Required | Item's id | String getId() | setId(String id) |
| `Description` | `String` | Required | Item's description | String getDescription() | setDescription(String description) |
| `Cycles` | `Integer` | Optional | Number of cycles where the item will be charged | Integer getCycles() | setCycles(Integer cycles) |
| `Quantity` | `Integer` | Optional | Quantity | Integer getQuantity() | setQuantity(Integer quantity) |

## Example (as JSON)

```json
{
  "name": "name0",
  "pricing_scheme": {
    "scheme_type": "scheme_type8",
    "price_brackets": null,
    "price": null,
    "minimum_price": null,
    "percentage": null
  },
  "id": "id0",
  "description": "description0",
  "cycles": null,
  "quantity": null
}
```

