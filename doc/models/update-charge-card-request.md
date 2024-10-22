
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
| `InitiatedType` | `String` | Optional | - | String getInitiatedType() | setInitiatedType(String initiatedType) |
| `RecurrenceModel` | `String` | Optional | - | String getRecurrenceModel() | setRecurrenceModel(String recurrenceModel) |
| `PaymentOrigin` | [`CreatePaymentOriginRequest`](../../doc/models/create-payment-origin-request.md) | Optional | - | CreatePaymentOriginRequest getPaymentOrigin() | setPaymentOrigin(CreatePaymentOriginRequest paymentOrigin) |
| `IndirectAcceptor` | `String` | Optional | Business model identifier | String getIndirectAcceptor() | setIndirectAcceptor(String indirectAcceptor) |

## Example (as JSON)

```json
{
  "update_subscription": false,
  "card_id": "card_id2",
  "card": {
    "type": "credit",
    "number": "number6",
    "holder_name": "holder_name2",
    "exp_month": 228,
    "exp_year": 68,
    "cvv": "cvv4"
  },
  "recurrence": false,
  "initiated_type": "initiated_type8",
  "recurrence_model": "recurrence_model6",
  "payment_origin": {
    "brand_id": "brand_id8",
    "charge_id": "charge_id2"
  },
  "indirect_acceptor": "indirect_acceptor2"
}
```

