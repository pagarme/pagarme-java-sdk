
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

## Example

```java
import me.pagar.api.models.CreateCardRequest;
import me.pagar.api.models.UpdateChargeCardRequest;

UpdateChargeCardRequest updateChargeCardRequest = new UpdateChargeCardRequest.Builder(
    false,
    null,
    new CreateCardRequest.Builder()
        .number("number6")
        .holderName("holder_name2")
        .expMonth(228)
        .expYear(68)
        .cvv("cvv4")
        .type("credit")
        .build(),
    false
)
.initiatedType("initiated_type4")
.recurrenceModel("recurrence_model2")
.paymentOrigin(null)
.indirectAcceptor("indirect_acceptor8")
.build();
```

