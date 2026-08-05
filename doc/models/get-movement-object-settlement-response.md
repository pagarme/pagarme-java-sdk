
# Get Movement Object Settlement Response

Generic response object for getting a MovementObjectSettlement.

## Structure

`GetMovementObjectSettlementResponse`

## Inherits From

[`GetMovementObjectBaseResponse`](../../doc/models/get-movement-object-base-response.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Product` | `String` | Optional | - | String getProduct() | setProduct(String product) |
| `Brand` | `String` | Optional | - | String getBrand() | setBrand(String brand) |
| `PaymentDate` | `String` | Optional | - | String getPaymentDate() | setPaymentDate(String paymentDate) |
| `RecipientId` | `String` | Optional | - | String getRecipientId() | setRecipientId(String recipientId) |
| `DocumentType` | `String` | Optional | - | String getDocumentType() | setDocumentType(String documentType) |
| `Document` | `String` | Optional | - | String getDocument() | setDocument(String document) |
| `ContractObligationId` | `String` | Optional | - | String getContractObligationId() | setContractObligationId(String contractObligationId) |
| `LiquidationArrangementId` | `String` | Optional | - | String getLiquidationArrangementId() | setLiquidationArrangementId(String liquidationArrangementId) |
| `ExternalEnginePaymentId` | `String` | Optional | - | String getExternalEnginePaymentId() | setExternalEnginePaymentId(String externalEnginePaymentId) |

## Example

```java
import me.pagar.api.models.GetMovementObjectSettlementResponse;

GetMovementObjectSettlementResponse getMovementObjectSettlementResponse = new GetMovementObjectSettlementResponse.Builder()
    .product("product2")
    .brand("brand6")
    .paymentDate("payment_date4")
    .recipientId("recipient_id8")
    .documentType("document_type0")
    .id("id2")
    .status("status4")
    .amount("amount4")
    .createdAt("created_at0")
    .build();
```

