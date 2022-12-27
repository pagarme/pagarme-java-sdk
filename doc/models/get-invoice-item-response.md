
# Get Invoice Item Response

Response object for getting an invoice item

## Structure

`GetInvoiceItemResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `Integer` | Required | - | Integer getAmount() | setAmount(Integer amount) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `PricingScheme` | [`GetPricingSchemeResponse`](../../doc/models/get-pricing-scheme-response.md) | Required | - | GetPricingSchemeResponse getPricingScheme() | setPricingScheme(GetPricingSchemeResponse pricingScheme) |
| `PriceBracket` | [`GetPriceBracketResponse`](../../doc/models/get-price-bracket-response.md) | Required | - | GetPriceBracketResponse getPriceBracket() | setPriceBracket(GetPriceBracketResponse priceBracket) |
| `Quantity` | `Integer` | Optional | - | Integer getQuantity() | setQuantity(Integer quantity) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `SubscriptionItemId` | `String` | Required | Subscription Item Id | String getSubscriptionItemId() | setSubscriptionItemId(String subscriptionItemId) |

## Example (as JSON)

```json
{
  "amount": 46,
  "description": "description0",
  "pricing_scheme": {
    "price": 166,
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
    "minimum_price": null,
    "percentage": null
  },
  "price_bracket": {
    "start_quantity": 164,
    "price": 154,
    "end_quantity": null,
    "overage_price": null
  },
  "quantity": null,
  "name": null,
  "subscription_item_id": "subscription_item_id4"
}
```

