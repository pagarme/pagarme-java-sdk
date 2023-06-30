
# Get Movement Object Transfer Response

## Structure

`GetMovementObjectTransferResponse`

## Inherits From

[`GetMovementObjectBaseResponse`](../../doc/models/get-movement-object-base-response.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SourceType` | `String` | Optional | - | String getSourceType() | setSourceType(String sourceType) |
| `SourceId` | `String` | Optional | - | String getSourceId() | setSourceId(String sourceId) |
| `TargetType` | `String` | Optional | - | String getTargetType() | setTargetType(String targetType) |
| `TargetId` | `String` | Optional | - | String getTargetId() | setTargetId(String targetId) |
| `Fee` | `String` | Optional | - | String getFee() | setFee(String fee) |
| `FundingDate` | `String` | Optional | - | String getFundingDate() | setFundingDate(String fundingDate) |
| `FundingEstimatedDate` | `String` | Optional | - | String getFundingEstimatedDate() | setFundingEstimatedDate(String fundingEstimatedDate) |
| `BankAccount` | `String` | Optional | - | String getBankAccount() | setBankAccount(String bankAccount) |

## Example (as JSON)

```json
{
  "object": "transfer",
  "id": "id6",
  "status": "status2",
  "amount": "amount8",
  "created_at": "created_at4",
  "source_type": "source_type0",
  "source_id": "source_id6",
  "target_type": "target_type2",
  "target_id": "target_id0",
  "fee": "fee2"
}
```

