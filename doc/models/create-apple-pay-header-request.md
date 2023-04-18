
# Create Apple Pay Header Request

The ApplePay header request

## Structure

`CreateApplePayHeaderRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PublicKeyHash` | `String` | Optional | SHA–256 hash, Base64 string codified | String getPublicKeyHash() | setPublicKeyHash(String publicKeyHash) |
| `EphemeralPublicKey` | `String` | Required | X.509 encoded key bytes, Base64 encoded as a string | String getEphemeralPublicKey() | setEphemeralPublicKey(String ephemeralPublicKey) |
| `TransactionId` | `String` | Optional | Transaction identifier, generated on Device | String getTransactionId() | setTransactionId(String transactionId) |

## Example (as JSON)

```json
{
  "public_key_hash": "public_key_hash8",
  "ephemeral_public_key": "ephemeral_public_key0",
  "transaction_id": "transaction_id8"
}
```

