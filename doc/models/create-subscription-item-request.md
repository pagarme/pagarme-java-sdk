
# Create Subscription Item Request

Request for creating a new subscription item

## Structure

`CreateSubscriptionItemRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Required | Item description | String getDescription() | setDescription(String description) |
| `PricingScheme` | [`CreatePricingSchemeRequest`](../../doc/models/create-pricing-scheme-request.md) | Required | Pricing scheme | CreatePricingSchemeRequest getPricingScheme() | setPricingScheme(CreatePricingSchemeRequest pricingScheme) |
| `Id` | `String` | Required | Item id | String getId() | setId(String id) |
| `PlanItemId` | `String` | Required | Plan item id | String getPlanItemId() | setPlanItemId(String planItemId) |
| `Discounts` | [`List<CreateDiscountRequest>`](../../doc/models/create-discount-request.md) | Required | Discounts for the item | List<CreateDiscountRequest> getDiscounts() | setDiscounts(List<CreateDiscountRequest> discounts) |
| `Name` | `String` | Required | Item name | String getName() | setName(String name) |
| `Cycles` | `Integer` | Optional | Number of cycles which the item will be charged | Integer getCycles() | setCycles(Integer cycles) |
| `Quantity` | `Integer` | Optional | Quantity of items | Integer getQuantity() | setQuantity(Integer quantity) |
| `MinimumPrice` | `Integer` | Optional | Minimum price | Integer getMinimumPrice() | setMinimumPrice(Integer minimumPrice) |

## Example (as JSON)

```json
{
  "description": "description0",
  "pricing_scheme": {
    "scheme_type": "scheme_type8",
    "price_brackets": [
      {
        "start_quantity": 119,
        "price": 57,
        "end_quantity": null,
        "overage_price": null
      },
      {
        "start_quantity": 120,
        "price": 58,
        "end_quantity": null,
        "overage_price": null
      },
      {
        "start_quantity": 121,
        "price": 59,
        "end_quantity": null,
        "overage_price": null
      }
    ],
    "price": null,
    "minimum_price": null,
    "percentage": null
  },
  "id": "id0",
  "plan_item_id": "plan_item_id0",
  "discounts": [
    {
      "value": 10.23,
      "discount_type": "discount_type9",
      "item_id": "item_id1",
      "cycles": null,
      "description": null
    },
    {
      "value": 10.24,
      "discount_type": "discount_type0",
      "item_id": "item_id2",
      "cycles": null,
      "description": null
    },
    {
      "value": 10.25,
      "discount_type": "discount_type1",
      "item_id": "item_id3",
      "cycles": null,
      "description": null
    }
  ],
  "name": "name0",
  "cycles": null,
  "quantity": null,
  "minimum_price": null
}
```

