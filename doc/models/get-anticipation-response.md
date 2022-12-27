
# Get Anticipation Response

Anticipation

## Structure

`GetAnticipationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Id | String getId() | setId(String id) |
| `RequestedAmount` | `Integer` | Required | Requested amount | Integer getRequestedAmount() | setRequestedAmount(Integer requestedAmount) |
| `ApprovedAmount` | `Integer` | Required | Approved amount | Integer getApprovedAmount() | setApprovedAmount(Integer approvedAmount) |
| `Recipient` | [`GetRecipientResponse`](../../doc/models/get-recipient-response.md) | Optional | Recipient | GetRecipientResponse getRecipient() | setRecipient(GetRecipientResponse recipient) |
| `Pgid` | `String` | Required | Anticipation id on the gateway | String getPgid() | setPgid(String pgid) |
| `CreatedAt` | `LocalDateTime` | Required | Creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | Last update date | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `PaymentDate` | `LocalDateTime` | Required | Payment date | LocalDateTime getPaymentDate() | setPaymentDate(LocalDateTime paymentDate) |
| `Status` | `String` | Required | Status | String getStatus() | setStatus(String status) |
| `Timeframe` | `String` | Required | Timeframe | String getTimeframe() | setTimeframe(String timeframe) |

## Example (as JSON)

```json
{
  "id": "id0",
  "requested_amount": 246,
  "approved_amount": 212,
  "recipient": null,
  "pgid": "pgid4",
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "payment_date": "2016-03-13T12:52:32.123Z",
  "status": "status8",
  "timeframe": "timeframe2"
}
```

