
# Get Three D Secure Response

3D-S payment authentication response

## Structure

`GetThreeDSecureResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Mpi` | `String` | Optional | MPI Vendor | String getMpi() | setMpi(String mpi) |
| `Eci` | `String` | Optional | Electronic Commerce Indicator (ECI) (Opcional) | String getEci() | setEci(String eci) |
| `Cavv` | `String` | Optional | Online payment cryptogram, definido pelo 3-D Secure. | String getCavv() | setCavv(String cavv) |
| `TransactionId` | `String` | Optional | Identificador da transação (XID) | String getTransactionId() | setTransactionId(String transactionId) |
| `SuccessUrl` | `String` | Optional | Url de redirecionamento de sucessso | String getSuccessUrl() | setSuccessUrl(String successUrl) |

## Example (as JSON)

```json
{
  "mpi": null,
  "eci": null,
  "cavv": null,
  "transaction_Id": null,
  "success_url": null
}
```

