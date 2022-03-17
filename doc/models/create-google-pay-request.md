
# Create Google Pay Request

The GooglePay Token Payment Request

## Structure

`CreateGooglePayRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Version` | `String` | Required | The token version | String getVersion() | setVersion(String version) |
| `Data` | `String` | Required | The cryptography data | String getData() | setData(String data) |
| `Header` | [`CreateGooglePayHeaderRequest`](../../doc/models/create-google-pay-header-request.md) | Required | The GooglePay header request | CreateGooglePayHeaderRequest getHeader() | setHeader(CreateGooglePayHeaderRequest header) |
| `Signature` | `String` | Required | Detached PKCS #7 signature, Base64 encoded as string | String getSignature() | setSignature(String signature) |
| `MerchantIdentifier` | `String` | Required | GooglePay Merchant identifier | String getMerchantIdentifier() | setMerchantIdentifier(String merchantIdentifier) |

## Example (as JSON)

```json
{
  "version": "version4",
  "data": "data0",
  "header": {
    "ephemeral_public_key": "ephemeral_public_key6"
  },
  "signature": "signature8",
  "merchant_identifier": "merchant_identifier4"
}
```

