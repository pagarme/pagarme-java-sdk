
# Get Bank Transfer Transaction Response

Response object for getting a bank transfer transaction

## Structure

`GetBankTransferTransactionResponse`

## Inherits From

[`GetTransactionResponse`](../../doc/models/get-transaction-response.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Optional | Payment url | String getUrl() | setUrl(String url) |
| `BankTid` | `String` | Optional | Transaction identifier for the bank | String getBankTid() | setBankTid(String bankTid) |
| `Bank` | `String` | Optional | Bank | String getBank() | setBank(String bank) |
| `PaidAt` | `LocalDateTime` | Optional | Payment date | LocalDateTime getPaidAt() | setPaidAt(LocalDateTime paidAt) |
| `PaidAmount` | `Integer` | Optional | Paid amount | Integer getPaidAmount() | setPaidAmount(Integer paidAmount) |

## Example (as JSON)

```json
{
  "gateway_id": "gateway_id8",
  "amount": 40,
  "status": "status6",
  "success": false,
  "created_at": "2016-03-13T12:52:32.123Z",
  "url": "url2",
  "bank_tid": "bank_tid2",
  "bank": "bank6",
  "paid_at": "2016-03-13T12:52:32.123Z",
  "paid_amount": 176
}
```

