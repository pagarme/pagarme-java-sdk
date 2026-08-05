
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

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetBankTransferTransactionResponse;

GetBankTransferTransactionResponse getBankTransferTransactionResponse = new GetBankTransferTransactionResponse.Builder()
    .url("url6")
    .bankTid("bank_tid6")
    .bank("bank0")
    .paidAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .paidAmount(62)
    .gatewayId("gateway_id8")
    .amount(40)
    .status("status6")
    .success(false)
    .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

