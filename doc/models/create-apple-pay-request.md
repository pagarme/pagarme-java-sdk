
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

## Example (as JSON)

```json
{
  "version": "version4",
  "data": "data0",
  "header": {
    "public_key_hash": "public_key_hash4",
    "ephemeral_public_key": "ephemeral_public_key6",
    "transaction_id": "transaction_id4"
  },
  "signature": "signature8",
  "merchant_identifier": "merchant_identifier4"
}
```

