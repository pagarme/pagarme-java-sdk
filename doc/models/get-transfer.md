
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

## Example (as JSON)

```json
{
  "id": "id8",
  "gateway_id": "gateway_id8",
  "amount": 122,
  "status": "status0",
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "metadata": {
    "key0": "metadata5"
  },
  "fee": 80,
  "funding_date": "2016-03-13T12:52:32.123Z",
  "funding_estimated_date": "2016-03-13T12:52:32.123Z",
  "type": "type8",
  "source": {
    "source_id": "source_id8",
    "type": "type6"
  },
  "target": {
    "target_id": "target_id2",
    "type": "type8"
  }
}
```

