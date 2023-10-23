
# Get Withdraw Response

## Structure

`GetWithdrawResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `GatewayId` | `String` | Optional | - | String getGatewayId() | setGatewayId(String gatewayId) |
| `Amount` | `Integer` | Optional | - | Integer getAmount() | setAmount(Integer amount) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Metadata` | `List<String>` | Optional | - | List<String> getMetadata() | setMetadata(List<String> metadata) |
| `Fee` | `Integer` | Optional | - | Integer getFee() | setFee(Integer fee) |
| `FundingDate` | `LocalDateTime` | Optional | - | LocalDateTime getFundingDate() | setFundingDate(LocalDateTime fundingDate) |
| `FundingEstimatedDate` | `LocalDateTime` | Optional | - | LocalDateTime getFundingEstimatedDate() | setFundingEstimatedDate(LocalDateTime fundingEstimatedDate) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `Source` | [`GetWithdrawSourceResponse`](../../doc/models/get-withdraw-source-response.md) | Optional | - | GetWithdrawSourceResponse getSource() | setSource(GetWithdrawSourceResponse source) |
| `Target` | [`GetWithdrawTargetResponse`](../../doc/models/get-withdraw-target-response.md) | Optional | - | GetWithdrawTargetResponse getTarget() | setTarget(GetWithdrawTargetResponse target) |

## Example (as JSON)

```json
{
  "id": "id6",
  "gateway_id": "gateway_id4",
  "amount": 78,
  "status": "status8",
  "created_at": "2016-03-13T12:52:32.123Z"
}
```

