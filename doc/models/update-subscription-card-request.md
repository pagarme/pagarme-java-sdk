
# Update Subscription Card Request

Request for updating the card from a subscription

## Structure

`UpdateSubscriptionCardRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`CreateCardRequest`](../../doc/models/create-card-request.md) | Required | Credit card data | CreateCardRequest getCard() | setCard(CreateCardRequest card) |
| `CardId` | `String` | Required | Credit card id | String getCardId() | setCardId(String cardId) |
| `IndirectAcceptor` | `String` | Optional | Business model identifier | String getIndirectAcceptor() | setIndirectAcceptor(String indirectAcceptor) |

## Example

```java
import me.pagar.api.models.CreateCardRequest;
import me.pagar.api.models.UpdateSubscriptionCardRequest;

UpdateSubscriptionCardRequest updateSubscriptionCardRequest = new UpdateSubscriptionCardRequest.Builder(
    new CreateCardRequest.Builder()
        .number("number6")
        .holderName("holder_name2")
        .expMonth(228)
        .expYear(68)
        .cvv("cvv4")
        .type("credit")
        .build(),
    null
)
.indirectAcceptor("indirect_acceptor6")
.build();
```

