
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

## Example

```java
import me.pagar.api.models.GetMovementObjectRefundResponse;

GetMovementObjectRefundResponse getMovementObjectRefundResponse = new GetMovementObjectRefundResponse.Builder()
    .fraudCoverageFee("fraud_coverage_fee2")
    .chargeFeeRecipientId("charge_fee_recipient_id0")
    .bankAccountId("bank_account_id4")
    .localTransactionId("local_transaction_id0")
    .updatedAt("updated_at0")
    .id("id2")
    .status("status4")
    .amount("amount4")
    .createdAt("created_at0")
    .build();
```

