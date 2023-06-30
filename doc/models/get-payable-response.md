
# Get Payable Response

Response object for getting an payable

## Structure

`GetPayableResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Long` | Optional | - | Long getId() | setId(Long id) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `Amount` | `Integer` | Optional | - | Integer getAmount() | setAmount(Integer amount) |
| `Fee` | `Integer` | Optional | - | Integer getFee() | setFee(Integer fee) |
| `AnticipationFee` | `Integer` | Optional | - | Integer getAnticipationFee() | setAnticipationFee(Integer anticipationFee) |
| `FraudCoverageFee` | `Integer` | Optional | - | Integer getFraudCoverageFee() | setFraudCoverageFee(Integer fraudCoverageFee) |
| `Installment` | `Integer` | Optional | - | Integer getInstallment() | setInstallment(Integer installment) |
| `GatewayId` | `Integer` | Optional | - | Integer getGatewayId() | setGatewayId(Integer gatewayId) |
| `ChargeId` | `String` | Optional | - | String getChargeId() | setChargeId(String chargeId) |
| `SplitId` | `String` | Optional | - | String getSplitId() | setSplitId(String splitId) |
| `BulkAnticipationId` | `String` | Optional | - | String getBulkAnticipationId() | setBulkAnticipationId(String bulkAnticipationId) |
| `AnticipationId` | `String` | Optional | - | String getAnticipationId() | setAnticipationId(String anticipationId) |
| `RecipientId` | `String` | Optional | - | String getRecipientId() | setRecipientId(String recipientId) |
| `OriginatorModel` | `String` | Optional | - | String getOriginatorModel() | setOriginatorModel(String originatorModel) |
| `OriginatorModelId` | `String` | Optional | - | String getOriginatorModelId() | setOriginatorModelId(String originatorModelId) |
| `PaymentDate` | `LocalDateTime` | Optional | - | LocalDateTime getPaymentDate() | setPaymentDate(LocalDateTime paymentDate) |
| `OriginalPaymentDate` | `LocalDateTime` | Optional | - | LocalDateTime getOriginalPaymentDate() | setOriginalPaymentDate(LocalDateTime originalPaymentDate) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `PaymentMethod` | `String` | Optional | - | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `AccrualAt` | `LocalDateTime` | Optional | - | LocalDateTime getAccrualAt() | setAccrualAt(LocalDateTime accrualAt) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `LiquidationArrangementId` | `String` | Optional | - | String getLiquidationArrangementId() | setLiquidationArrangementId(String liquidationArrangementId) |

## Example (as JSON)

```json
{
  "id": 112,
  "status": "status8",
  "amount": 46,
  "fee": 168,
  "anticipation_fee": 140
}
```

