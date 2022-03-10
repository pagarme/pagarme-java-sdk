
# Get Balance Response

Balance

## Structure

`GetBalanceResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currency` | `String` | Required | Currency | String getCurrency() | setCurrency(String currency) |
| `AvailableAmount` | `long` | Required | Amount available for transferring | long getAvailableAmount() | setAvailableAmount(long availableAmount) |
| `Recipient` | [`GetRecipientResponse`](../../doc/models/get-recipient-response.md) | Optional | Recipient | GetRecipientResponse getRecipient() | setRecipient(GetRecipientResponse recipient) |
| `TransferredAmount` | `long` | Required | - | long getTransferredAmount() | setTransferredAmount(long transferredAmount) |
| `WaitingFundsAmount` | `long` | Required | - | long getWaitingFundsAmount() | setWaitingFundsAmount(long waitingFundsAmount) |

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

