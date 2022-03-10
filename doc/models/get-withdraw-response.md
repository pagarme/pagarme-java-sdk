
# Get Withdraw Response

## Structure

`GetWithdrawResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `GatewayId` | `String` | Required | - | String getGatewayId() | setGatewayId(String gatewayId) |
| `Amount` | `int` | Required | - | int getAmount() | setAmount(int amount) |
| `Status` | `String` | Required | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Metadata` | `List<String>` | Optional | - | List<String> getMetadata() | setMetadata(List<String> metadata) |
| `Fee` | `Integer` | Optional | - | Integer getFee() | setFee(Integer fee) |
| `FundingDate` | `LocalDateTime` | Optional | - | LocalDateTime getFundingDate() | setFundingDate(LocalDateTime fundingDate) |
| `FundingEstimatedDate` | `LocalDateTime` | Optional | - | LocalDateTime getFundingEstimatedDate() | setFundingEstimatedDate(LocalDateTime fundingEstimatedDate) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `Source` | [`GetWithdrawSourceResponse`](../../doc/models/get-withdraw-source-response.md) | Required | - | GetWithdrawSourceResponse getSource() | setSource(GetWithdrawSourceResponse source) |
| `Target` | [`GetWithdrawTargetResponse`](../../doc/models/get-withdraw-target-response.md) | Required | - | GetWithdrawTargetResponse getTarget() | setTarget(GetWithdrawTargetResponse target) |

## Example (as JSON)

```json
{
  "id": "id0",
  "gateway_id": "gateway_id0",
  "amount": 46,
  "status": "status8",
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "metadata": null,
  "fee": null,
  "funding_date": null,
  "funding_estimated_date": null,
  "type": "type0",
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

