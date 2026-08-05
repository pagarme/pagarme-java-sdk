
# Create Card Payment Contactless Request

The card payment contactless request

## Structure

`CreateCardPaymentContactlessRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The authentication type | String getType() | setType(String type) |
| `ApplePay` | [`CreateApplePayRequest`](../../doc/models/create-apple-pay-request.md) | Optional | The ApplePay encrypted request | CreateApplePayRequest getApplePay() | setApplePay(CreateApplePayRequest applePay) |
| `GooglePay` | [`CreateGooglePayRequest`](../../doc/models/create-google-pay-request.md) | Optional | The GooglePay encrypted request | CreateGooglePayRequest getGooglePay() | setGooglePay(CreateGooglePayRequest googlePay) |
| `Emv` | [`CreateEmvDecryptRequest`](../../doc/models/create-emv-decrypt-request.md) | Optional | The Emv encrypted request | CreateEmvDecryptRequest getEmv() | setEmv(CreateEmvDecryptRequest emv) |

## Example

```java
import me.pagar.api.models.CreateCardPaymentContactlessRequest;

CreateCardPaymentContactlessRequest createCardPaymentContactlessRequest = new CreateCardPaymentContactlessRequest.Builder(
    "type2"
)
.applePay(null)
.googlePay(null)
.emv(null)
.build();
```

