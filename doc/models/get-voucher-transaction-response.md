
# Get Voucher Transaction Response

Response for voucher transactions

## Structure

`GetVoucherTransactionResponse`

## Inherits From

[`GetTransactionResponse`](../../doc/models/get-transaction-response.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatementDescriptor` | `String` | Optional | Text that will appear on the voucher's statement | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `AcquirerName` | `String` | Optional | Acquirer name | String getAcquirerName() | setAcquirerName(String acquirerName) |
| `AcquirerAffiliationCode` | `String` | Optional | Acquirer affiliation code | String getAcquirerAffiliationCode() | setAcquirerAffiliationCode(String acquirerAffiliationCode) |
| `AcquirerTid` | `String` | Optional | Acquirer TID | String getAcquirerTid() | setAcquirerTid(String acquirerTid) |
| `AcquirerNsu` | `String` | Optional | Acquirer NSU | String getAcquirerNsu() | setAcquirerNsu(String acquirerNsu) |
| `AcquirerAuthCode` | `String` | Optional | Acquirer authorization code | String getAcquirerAuthCode() | setAcquirerAuthCode(String acquirerAuthCode) |
| `AcquirerMessage` | `String` | Optional | acquirer_message | String getAcquirerMessage() | setAcquirerMessage(String acquirerMessage) |
| `AcquirerReturnCode` | `String` | Optional | Acquirer return code | String getAcquirerReturnCode() | setAcquirerReturnCode(String acquirerReturnCode) |
| `OperationType` | `String` | Optional | Operation type | String getOperationType() | setOperationType(String operationType) |
| `Card` | [`GetCardResponse`](../../doc/models/get-card-response.md) | Optional | Card data | GetCardResponse getCard() | setCard(GetCardResponse card) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetVoucherTransactionResponse;

GetVoucherTransactionResponse getVoucherTransactionResponse = new GetVoucherTransactionResponse.Builder()
    .statementDescriptor("statement_descriptor4")
    .acquirerName("acquirer_name8")
    .acquirerAffiliationCode("acquirer_affiliation_code4")
    .acquirerTid("acquirer_tid6")
    .acquirerNsu("acquirer_nsu6")
    .gatewayId("gateway_id8")
    .amount(40)
    .status("status6")
    .success(false)
    .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

