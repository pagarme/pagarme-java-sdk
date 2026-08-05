
# Create Card Payload Request

## Structure

`CreateCardPayloadRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `GooglePay` | [`CreateGooglePayRequest`](../../doc/models/create-google-pay-request.md) | Optional | - | CreateGooglePayRequest getGooglePay() | setGooglePay(CreateGooglePayRequest googlePay) |

## Example

```java
import me.pagar.api.models.CreateCardPayloadRequest;

CreateCardPayloadRequest createCardPayloadRequest = new CreateCardPayloadRequest.Builder()
    .type("type2")
    .googlePay(null)
    .build();
```

