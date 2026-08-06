
# Get Transfer

## Structure

`GetTransfer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `GatewayId` | `String` | Required | - | String getGatewayId() | setGatewayId(String gatewayId) |
| `Amount` | `int` | Required | - | int getAmount() | setAmount(int amount) |
| `Status` | `String` | Required | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Fee` | `Integer` | Optional | - | Integer getFee() | setFee(Integer fee) |
| `FundingDate` | `LocalDateTime` | Optional | - | LocalDateTime getFundingDate() | setFundingDate(LocalDateTime fundingDate) |
| `FundingEstimatedDate` | `LocalDateTime` | Optional | - | LocalDateTime getFundingEstimatedDate() | setFundingEstimatedDate(LocalDateTime fundingEstimatedDate) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `Source` | [`GetTransferSourceResponse`](../../doc/models/get-transfer-source-response.md) | Required | - | GetTransferSourceResponse getSource() | setSource(GetTransferSourceResponse source) |
| `Target` | [`GetTransferTargetResponse`](../../doc/models/get-transfer-target-response.md) | Required | - | GetTransferTargetResponse getTarget() | setTarget(GetTransferTargetResponse target) |

## Example

```java
import java.util.LinkedHashMap;
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetTransfer;

GetTransfer getTransfer = new GetTransfer.Builder(
    "id6",
    "gateway_id4",
    0,
    "status2",
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
    "type4",
    null,
    null
)
.metadata(new LinkedHashMap<String, String>() {{
        put("key0", "metadata7");
        put("key1", "metadata8");
        put("key2", "metadata9");
    }})
.fee(214)
.fundingDate(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
.fundingEstimatedDate(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
.build();
```

