
# Get Invoice Item Response

Response object for getting an invoice item

## Structure

`GetInvoiceItemResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `Integer` | Optional | - | Integer getAmount() | setAmount(Integer amount) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `PricingScheme` | [`GetPricingSchemeResponse`](../../doc/models/get-pricing-scheme-response.md) | Optional | - | GetPricingSchemeResponse getPricingScheme() | setPricingScheme(GetPricingSchemeResponse pricingScheme) |
| `PriceBracket` | [`GetPriceBracketResponse`](../../doc/models/get-price-bracket-response.md) | Optional | - | GetPriceBracketResponse getPriceBracket() | setPriceBracket(GetPriceBracketResponse priceBracket) |
| `Quantity` | `Integer` | Optional | - | Integer getQuantity() | setQuantity(Integer quantity) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `SubscriptionItemId` | `String` | Optional | Subscription Item Id | String getSubscriptionItemId() | setSubscriptionItemId(String subscriptionItemId) |

## Example (as JSON)

```json
{
  "amount": null,
  "description": null,
  "pricing_scheme": null,
  "price_bracket": null,
  "quantity": null,
  "name": null,
  "subscription_item_id": null
}
```

