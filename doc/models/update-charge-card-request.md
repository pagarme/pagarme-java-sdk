
# Update Charge Card Request

Request for updating card data

## Structure

`UpdateChargeCardRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UpdateSubscription` | `boolean` | Required | Indicates if the subscriptions using this card must also be updated | boolean getUpdateSubscription() | setUpdateSubscription(boolean updateSubscription) |
| `CardId` | `String` | Required | Card id | String getCardId() | setCardId(String cardId) |
| `Card` | [`CreateCardRequest`](../../doc/models/create-card-request.md) | Required | Card data | CreateCardRequest getCard() | setCard(CreateCardRequest card) |
| `Recurrence` | `boolean` | Required | Indicates a recurrence | boolean getRecurrence() | setRecurrence(boolean recurrence) |

## Example (as JSON)

```json
{
  "update_subscription": null,
  "card_id": null,
  "card": {
    "type": "credit"
  },
  "recurrence": null
}
```

