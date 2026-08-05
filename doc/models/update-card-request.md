
# Update Card Request

Request for updating a card

## Structure

`UpdateCardRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HolderName` | `String` | Required | Holder name | String getHolderName() | setHolderName(String holderName) |
| `ExpMonth` | `int` | Required | Expiration month | int getExpMonth() | setExpMonth(int expMonth) |
| `ExpYear` | `int` | Required | Expiration year | int getExpYear() | setExpYear(int expYear) |
| `BillingAddressId` | `String` | Optional | Id of the address to be used as billing address | String getBillingAddressId() | setBillingAddressId(String billingAddressId) |
| `BillingAddress` | [`CreateAddressRequest`](../../doc/models/create-address-request.md) | Required | Billing address | CreateAddressRequest getBillingAddress() | setBillingAddress(CreateAddressRequest billingAddress) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Label` | `String` | Required | - | String getLabel() | setLabel(String label) |

## Example

```java
import java.util.LinkedHashMap;
import me.pagar.api.models.UpdateCardRequest;

UpdateCardRequest updateCardRequest = new UpdateCardRequest.Builder(
    "holder_name8",
    80,
    216,
    null,
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata9");
        put("key1", "metadata8");
        put("key2", "metadata7");
    }},
    "label2"
)
.billingAddressId("billing_address_id8")
.build();
```

