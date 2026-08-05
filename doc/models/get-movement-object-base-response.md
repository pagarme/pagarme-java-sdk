
# Get Movement Object Base Response

Generic response object for getting a MovementObjectBase.

## Structure

`GetMovementObjectBaseResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Object` | `String` | Optional | - | String getObject() | setObject(String object) |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `Amount` | `String` | Optional | - | String getAmount() | setAmount(String amount) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `ChargeId` | `String` | Optional | - | String getChargeId() | setChargeId(String chargeId) |
| `GatewayId` | `String` | Optional | - | String getGatewayId() | setGatewayId(String gatewayId) |

## Example

```java
import me.pagar.api.models.GetMovementObjectBaseResponse;
import me.pagar.api.models.GetMovementObjectSettlementResponse;

GetMovementObjectBaseResponse getMovementObjectBaseResponse = new GetMovementObjectSettlementResponse.Builder()
    .product("product2")
    .brand("brand6")
    .paymentDate("payment_date4")
    .recipientId("recipient_id2")
    .documentType("document_type0")
    .id("id2")
    .status("status4")
    .amount("amount4")
    .createdAt("created_at0")
    .build();
```

