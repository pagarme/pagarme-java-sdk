
# Get Movement Object Refund Response

Generic response object for getting a MovementObjectRefund.

## Structure

`GetMovementObjectRefundResponse`

## Inherits From

[`GetMovementObjectBaseResponse`](../../doc/models/get-movement-object-base-response.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FraudCoverageFee` | `String` | Optional | - | String getFraudCoverageFee() | setFraudCoverageFee(String fraudCoverageFee) |
| `ChargeFeeRecipientId` | `String` | Optional | - | String getChargeFeeRecipientId() | setChargeFeeRecipientId(String chargeFeeRecipientId) |
| `BankAccountId` | `String` | Optional | - | String getBankAccountId() | setBankAccountId(String bankAccountId) |
| `LocalTransactionId` | `String` | Optional | - | String getLocalTransactionId() | setLocalTransactionId(String localTransactionId) |
| `UpdatedAt` | `String` | Optional | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |

## Example (as JSON)

```json
{
  "object": "refund",
  "id": "id2",
  "status": "status4",
  "amount": "amount4",
  "created_at": "created_at0",
  "fraud_coverage_fee": "fraud_coverage_fee2",
  "charge_fee_recipient_id": "charge_fee_recipient_id4",
  "bank_account_id": "bank_account_id0",
  "local_transaction_id": "local_transaction_id6",
  "updated_at": "updated_at4"
}
```

