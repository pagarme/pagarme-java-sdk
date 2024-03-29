
# Get Movement Object Payable Response

## Structure

`GetMovementObjectPayableResponse`

## Inherits From

[`GetMovementObjectBaseResponse`](../../doc/models/get-movement-object-base-response.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Fee` | `String` | Optional | - | String getFee() | setFee(String fee) |
| `AnticipationFee` | `String` | Required | - | String getAnticipationFee() | setAnticipationFee(String anticipationFee) |
| `FraudCoverageFee` | `String` | Required | - | String getFraudCoverageFee() | setFraudCoverageFee(String fraudCoverageFee) |
| `Installment` | `String` | Required | - | String getInstallment() | setInstallment(String installment) |
| `SplitId` | `String` | Required | - | String getSplitId() | setSplitId(String splitId) |
| `BulkAnticipationId` | `String` | Required | - | String getBulkAnticipationId() | setBulkAnticipationId(String bulkAnticipationId) |
| `AnticipationId` | `String` | Required | - | String getAnticipationId() | setAnticipationId(String anticipationId) |
| `RecipientId` | `String` | Required | - | String getRecipientId() | setRecipientId(String recipientId) |
| `OriginatorModel` | `String` | Required | - | String getOriginatorModel() | setOriginatorModel(String originatorModel) |
| `OriginatorModelId` | `String` | Required | - | String getOriginatorModelId() | setOriginatorModelId(String originatorModelId) |
| `PaymentDate` | `String` | Required | - | String getPaymentDate() | setPaymentDate(String paymentDate) |
| `OriginalPaymentDate` | `String` | Required | - | String getOriginalPaymentDate() | setOriginalPaymentDate(String originalPaymentDate) |
| `PaymentMethod` | `String` | Required | - | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `AccrualAt` | `String` | Required | - | String getAccrualAt() | setAccrualAt(String accrualAt) |
| `LiquidationArrangementId` | `String` | Required | - | String getLiquidationArrangementId() | setLiquidationArrangementId(String liquidationArrangementId) |

## Example (as JSON)

```json
{
  "id": "id2",
  "status": "status4",
  "amount": "amount4",
  "created_at": "created_at0",
  "fee": "fee2",
  "anticipation_fee": "anticipation_fee2",
  "fraud_coverage_fee": "fraud_coverage_fee8",
  "installment": "installment8",
  "split_id": "split_id2",
  "bulk_anticipation_id": "bulk_anticipation_id6",
  "anticipation_id": "anticipation_id0",
  "recipient_id": "recipient_id0",
  "originator_model": "originator_model6",
  "originator_model_id": "originator_model_id6",
  "payment_date": "payment_date2",
  "original_payment_date": "original_payment_date2",
  "payment_method": "payment_method0",
  "accrual_at": "accrual_at2",
  "liquidation_arrangement_id": "liquidation_arrangement_id4"
}
```

