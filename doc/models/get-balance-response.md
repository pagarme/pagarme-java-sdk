
# Get Balance Response

Balance

## Structure

`GetBalanceResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currency` | `String` | Optional | Currency | String getCurrency() | setCurrency(String currency) |
| `AvailableAmount` | `Long` | Optional | Amount available for transferring | Long getAvailableAmount() | setAvailableAmount(Long availableAmount) |
| `Recipient` | [`GetRecipientResponse`](../../doc/models/get-recipient-response.md) | Optional | Recipient | GetRecipientResponse getRecipient() | setRecipient(GetRecipientResponse recipient) |
| `TransferredAmount` | `Long` | Optional | - | Long getTransferredAmount() | setTransferredAmount(Long transferredAmount) |
| `WaitingFundsAmount` | `Long` | Optional | - | Long getWaitingFundsAmount() | setWaitingFundsAmount(Long waitingFundsAmount) |

## Example (as JSON)

```json
{
  "currency": null,
  "available_amount": null,
  "recipient": null,
  "transferred_amount": null,
  "waiting_funds_amount": null
}
```

