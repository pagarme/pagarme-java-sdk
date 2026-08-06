
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

## Example

```java
import me.pagar.api.models.GetMovementObjectTransferResponse;

GetMovementObjectTransferResponse getMovementObjectTransferResponse = new GetMovementObjectTransferResponse.Builder()
    .sourceType("source_type6")
    .sourceId("source_id0")
    .targetType("target_type8")
    .targetId("target_id4")
    .fee("fee8")
    .id("id2")
    .status("status4")
    .amount("amount4")
    .createdAt("created_at0")
    .build();
```

