
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

## Example

```java
import me.pagar.api.models.GetMovementObjectPayableResponse;

GetMovementObjectPayableResponse getMovementObjectPayableResponse = new GetMovementObjectPayableResponse.Builder(
    "anticipation_fee4",
    "fraud_coverage_fee2",
    "installment2",
    "split_id6",
    "bulk_anticipation_id0",
    "anticipation_id6",
    "recipient_id6",
    "originator_model0",
    "originator_model_id0",
    "payment_date6",
    "original_payment_date6",
    "payment_method4",
    "accrual_at6",
    "liquidation_arrangement_id8"
)
.fee("fee6")
.id("id2")
.status("status4")
.amount("amount4")
.createdAt("created_at0")
.build();
```

