
# Get Anticipation Response

Anticipation

## Structure

`GetAnticipationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Id | String getId() | setId(String id) |
| `RequestedAmount` | `Integer` | Optional | Requested amount | Integer getRequestedAmount() | setRequestedAmount(Integer requestedAmount) |
| `ApprovedAmount` | `Integer` | Optional | Approved amount | Integer getApprovedAmount() | setApprovedAmount(Integer approvedAmount) |
| `Recipient` | [`GetRecipientResponse`](../../doc/models/get-recipient-response.md) | Optional | Recipient | GetRecipientResponse getRecipient() | setRecipient(GetRecipientResponse recipient) |
| `Pgid` | `String` | Optional | Anticipation id on the gateway | String getPgid() | setPgid(String pgid) |
| `CreatedAt` | `LocalDateTime` | Optional | Creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | Last update date | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `PaymentDate` | `LocalDateTime` | Optional | Payment date | LocalDateTime getPaymentDate() | setPaymentDate(LocalDateTime paymentDate) |
| `Status` | `String` | Optional | Status | String getStatus() | setStatus(String status) |
| `Timeframe` | `String` | Optional | Timeframe | String getTimeframe() | setTimeframe(String timeframe) |

## Example

```java
import me.pagar.api.models.GetAnticipationResponse;

GetAnticipationResponse getAnticipationResponse = new GetAnticipationResponse.Builder()
    .id("id6")
    .requestedAmount(186)
    .approvedAmount(240)
    .recipient(null)
    .pgid("pgid2")
    .build();
```

