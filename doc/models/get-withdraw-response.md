
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
  "id": null,
  "gateway_id": null,
  "amount": null,
  "status": null,
  "created_at": null,
  "updated_at": null,
  "metadata": null,
  "fee": null,
  "funding_date": null,
  "funding_estimated_date": null,
  "type": null,
  "source": null,
  "target": null
}
```

