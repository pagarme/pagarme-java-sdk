
# Get Safety Pay Transaction Response

Response object for getting a safety pay transaction

## Structure

`GetSafetyPayTransactionResponse`

## Inherits From

[`GetTransactionResponse`](../../doc/models/get-transaction-response.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Optional | Payment url | String getUrl() | setUrl(String url) |
| `BankTid` | `String` | Optional | Transaction identifier on bank | String getBankTid() | setBankTid(String bankTid) |
| `PaidAt` | `LocalDateTime` | Optional | Payment date | LocalDateTime getPaidAt() | setPaidAt(LocalDateTime paidAt) |
| `PaidAmount` | `Integer` | Optional | Paid amount | Integer getPaidAmount() | setPaidAmount(Integer paidAmount) |

## Example (as JSON)

```json
{
  "gateway_id": "gateway_id6",
  "amount": 62,
  "status": "status6",
  "success": false,
  "created_at": "2016-03-13T12:52:32.123Z",
  "transaction_type": "safetypay",
  "url": "url4",
  "bank_tid": "bank_tid4",
  "paid_at": "2016-03-13T12:52:32.123Z",
  "paid_amount": 210
}
```

