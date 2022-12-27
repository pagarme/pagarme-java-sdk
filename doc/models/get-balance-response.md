
# Get Balance Response

Balance

## Structure

`GetBalanceResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currency` | `String` | Required | Currency | String getCurrency() | setCurrency(String currency) |
| `AvailableAmount` | `Long` | Required | Amount available for transferring | Long getAvailableAmount() | setAvailableAmount(Long availableAmount) |
| `Recipient` | [`GetRecipientResponse`](../../doc/models/get-recipient-response.md) | Optional | Recipient | GetRecipientResponse getRecipient() | setRecipient(GetRecipientResponse recipient) |
| `TransferredAmount` | `Long` | Required | - | Long getTransferredAmount() | setTransferredAmount(Long transferredAmount) |
| `WaitingFundsAmount` | `Long` | Required | - | Long getWaitingFundsAmount() | setWaitingFundsAmount(Long waitingFundsAmount) |

## Example (as JSON)

```json
{
  "currency": "currency0",
  "available_amount": 182,
  "recipient": null,
  "transferred_amount": 228,
  "waiting_funds_amount": 252
}
```

