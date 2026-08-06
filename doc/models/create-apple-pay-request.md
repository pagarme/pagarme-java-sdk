
# Create Apple Pay Request

The ApplePay Token Payment Request

## Structure

`CreateApplePayRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Version` | `String` | Required | The token version | String getVersion() | setVersion(String version) |
| `Data` | `String` | Required | The cryptography data | String getData() | setData(String data) |
| `Header` | [`CreateApplePayHeaderRequest`](../../doc/models/create-apple-pay-header-request.md) | Required | The ApplePay header request | CreateApplePayHeaderRequest getHeader() | setHeader(CreateApplePayHeaderRequest header) |
| `Signature` | `String` | Required | Detached PKCS #7 signature, Base64 encoded as string | String getSignature() | setSignature(String signature) |
| `MerchantIdentifier` | `String` | Required | ApplePay Merchant identifier | String getMerchantIdentifier() | setMerchantIdentifier(String merchantIdentifier) |

## Example

```java
import me.pagar.api.models.CreateApplePayRequest;

CreateApplePayRequest createApplePayRequest = new CreateApplePayRequest.Builder(
    "version2",
    "data6",
    null,
    "signature4",
    "merchant_identifier0"
)
.build();
```

