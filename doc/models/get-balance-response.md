
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
  "currency": "currency2",
  "available_amount": 96,
  "recipient": {
    "id": "id8",
    "name": "name8",
    "email": "email8",
    "document": "document8",
    "description": "description2"
  },
  "transferred_amount": 142,
  "waiting_funds_amount": 174
}
```

