
# Create Three D Secure Request

Creates a 3D-S authentication payment

## Structure

`CreateThreeDSecureRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Mpi` | `String` | Required | The MPI Vendor (MerchantPlugin) | String getMpi() | setMpi(String mpi) |
| `Cavv` | `String` | Optional | The Cardholder Authentication Verification value | String getCavv() | setCavv(String cavv) |
| `Eci` | `String` | Optional | The Electronic Commerce Indicator value | String getEci() | setEci(String eci) |
| `TransactionId` | `String` | Optional | The TransactionId value (XID) | String getTransactionId() | setTransactionId(String transactionId) |
| `SuccessUrl` | `String` | Optional | The success URL after the authentication | String getSuccessUrl() | setSuccessUrl(String successUrl) |
| `DsTransactionId` | `String` | Optional | Directory Service Transaction Identifier | String getDsTransactionId() | setDsTransactionId(String dsTransactionId) |
| `Version` | `String` | Optional | ThreeDSecure Version | String getVersion() | setVersion(String version) |

## Example (as JSON)

```json
{
  "mpi": "mpi4",
  "cavv": "cavv2",
  "eci": "eci6",
  "transaction_id": "transaction_id4",
  "success_url": "success_url8",
  "ds_transaction_id": "ds_transaction_id4"
}
```

