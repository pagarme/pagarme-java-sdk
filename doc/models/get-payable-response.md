
# Get Payable Response

Response object for getting an payable

## Structure

`GetPayableResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Payable Identifier | String getId() | setId(String id) |
| `Status` | `String` | Required | Payable status | String getStatus() | setStatus(String status) |
| `Amount` | `int` | Required | Payable amount in cents | int getAmount() | setAmount(int amount) |
| `Fee` | `Integer` | Optional | Payable fee amount in cents | Integer getFee() | setFee(Integer fee) |
| `AnticipationFee` | `Integer` | Optional | Antecipation fee amount in cents | Integer getAnticipationFee() | setAnticipationFee(Integer anticipationFee) |
| `FraudCoverageFee` | `Integer` | Optional | Fraud coverage fee amount in cents | Integer getFraudCoverageFee() | setFraudCoverageFee(Integer fraudCoverageFee) |
| `Installment` | `Integer` | Optional | Number of installment | Integer getInstallment() | setInstallment(Integer installment) |
| `GatewayId` | `String` | Required | Payment gateway identifier<br><br>**Default**: `"null"` | String getGatewayId() | setGatewayId(String gatewayId) |
| `ChargeId` | `String` | Required | Charge identifier<br><br>**Default**: `"null"` | String getChargeId() | setChargeId(String chargeId) |
| `SplitId` | `String` | Required | **Default**: `"null"` | String getSplitId() | setSplitId(String splitId) |
| `BulkAnticipationId` | `String` | Required | **Default**: `"null"` | String getBulkAnticipationId() | setBulkAnticipationId(String bulkAnticipationId) |
| `AnticipationId` | `String` | Optional | - | String getAnticipationId() | setAnticipationId(String anticipationId) |
| `RecipientId` | `String` | Required | Recipient identifier | String getRecipientId() | setRecipientId(String recipientId) |
| `OriginatorModel` | `String` | Required | **Default**: `"null"` | String getOriginatorModel() | setOriginatorModel(String originatorModel) |
| `OriginatorModelId` | `String` | Required | Originator model identifier<br><br>**Default**: `"null"` | String getOriginatorModelId() | setOriginatorModelId(String originatorModelId) |
| `PaymentDate` | `LocalDateTime` | Optional | Payment Date | LocalDateTime getPaymentDate() | setPaymentDate(LocalDateTime paymentDate) |
| `OriginalPaymentDate` | `LocalDateTime` | Required | Original Payment Date | LocalDateTime getOriginalPaymentDate() | setOriginalPaymentDate(LocalDateTime originalPaymentDate) |
| `Type` | `String` | Optional | Type of payable | String getType() | setType(String type) |
| `PaymentMethod` | `String` | Required | Payment method of transaction<br><br>**Default**: `"null"` | String getPaymentMethod() | setPaymentMethod(String paymentMethod) |
| `AccrualAt` | `LocalDateTime` | Optional | Date issuer identify payment | LocalDateTime getAccrualAt() | setAccrualAt(LocalDateTime accrualAt) |
| `CreatedAt` | `LocalDateTime` | Required | Creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `LiquidationArrangementId` | `String` | Optional | **Default**: `"null"` | String getLiquidationArrangementId() | setLiquidationArrangementId(String liquidationArrangementId) |
| `SettlementId` | `String` | Required | Settlement identifier  (new in v7.x)<br><br>**Default**: `"null"` | String getSettlementId() | setSettlementId(String settlementId) |
| `PaymentProfileId` | `String` | Required | Operational identifier of merchant inside of payment platform (new in v7.x)<br><br>**Default**: `"null"` | String getPaymentProfileId() | setPaymentProfileId(String paymentProfileId) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetPayableResponse;

GetPayableResponse getPayableResponse = new GetPayableResponse.Builder(
    "5b71f2a8b472ef521b224b75fd13c14e09d37822fd100f2cd425ef5aea02f5bf",
    "paid",
    1100,
    null,
    "ch_123",
    null,
    null,
    "re_abcde123fghijk789",
    "ownership_assignment",
    null,
    DateTimeHelper.fromRfc8601DateTime("2025-08-21T03:00:00Z"),
    "credit_card",
    DateTimeHelper.fromRfc8601DateTime("2025-08-20T10:30:00Z"),
    "03002e00-edde-6d4c-dd9e-ffaaafac08de",
    "pp_abcde123fghijk789"
)
.fee(0)
.anticipationFee(0)
.fraudCoverageFee(0)
.installment(44)
.anticipationId("anticipation_id6")
.paymentDate(DateTimeHelper.fromRfc8601DateTime("2025-08-18T03:00:00Z"))
.type("credit")
.accrualAt(DateTimeHelper.fromRfc8601DateTime("2023-08-21T12:51:28Z"))
.liquidationArrangementId(null)
.build();
```

