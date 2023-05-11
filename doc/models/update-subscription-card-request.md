
# Update Subscription Card Request

Request for updating the card from a subscription

## Structure

`UpdateSubscriptionCardRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`CreateCardRequest`](../../doc/models/create-card-request.md) | Required | Credit card data | CreateCardRequest getCard() | setCard(CreateCardRequest card) |
| `CardId` | `String` | Required | Credit card id | String getCardId() | setCardId(String cardId) |

## Example (as JSON)

```json
{
  "card": {
    "type": "credit",
    "number": "number6",
    "holder_name": "holder_name2",
    "exp_month": 228,
    "exp_year": 68,
    "cvv": "cvv4"
  },
  "card_id": "card_id4"
}
```

