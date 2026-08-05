
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
| `IndirectAcceptor` | `String` | Optional | Business model identifier | String getIndirectAcceptor() | setIndirectAcceptor(String indirectAcceptor) |

## Example

```java
import me.pagar.api.models.CreateCardRequest;
import me.pagar.api.models.UpdateSubscriptionPaymentMethodRequest;

UpdateSubscriptionPaymentMethodRequest updateSubscriptionPaymentMethodRequest = new UpdateSubscriptionPaymentMethodRequest.Builder(
    null,
    null,
    new CreateCardRequest.Builder()
        .number("number6")
        .holderName("holder_name2")
        .expMonth(228)
        .expYear(68)
        .cvv("cvv4")
        .type("credit")
        .build()
)
.cardToken("card_token2")
.boleto(null)
.indirectAcceptor("indirect_acceptor4")
.build();
```

