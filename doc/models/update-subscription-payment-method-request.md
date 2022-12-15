
# Update Subscription Payment Method Request

Request for updating a subscription's payment method

## Structure

`UpdateSubscriptionPaymentMethodRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentMethod` | `String` | Required | The new payment method | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `CardId` | `String` | Required | Card id | String getCardId() | setCardId(String cardId) |
| `Card` | [`CreateCardRequest`](../../doc/models/create-card-request.md) | Required | Card data | CreateCardRequest getCard() | setCard(CreateCardRequest card) |
| `CardToken` | `String` | Optional | The Card Token | String getCardToken() | setCardToken(String cardToken) |
| `Boleto` | [`CreateSubscriptionBoletoRequest`](../../doc/models/create-subscription-boleto-request.md) | Optional | Information about fines and interest on the "boleto" used from payment | CreateSubscriptionBoletoRequest getBoleto() | setBoleto(CreateSubscriptionBoletoRequest boleto) |

## Example (as JSON)

```json
{
  "payment_method": null,
  "card_id": null,
  "card": {
    "number": null,
    "holder_name": null,
    "exp_month": null,
    "exp_year": null,
    "cvv": null,
    "billing_address": null,
    "brand": null,
    "billing_address_id": null,
    "metadata": null,
    "type": "credit",
    "options": null,
    "private_label": null,
    "label": null
  }
}
```

