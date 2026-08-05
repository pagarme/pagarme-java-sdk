
# Get Private Label Transaction Response

Response object for getting a private label transaction

## Structure

`GetPrivateLabelTransactionResponse`

## Inherits From

[`GetTransactionResponse`](../../doc/models/get-transaction-response.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatementDescriptor` | `String` | Optional | Text that will appear on the credit card's statement | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `AcquirerName` | `String` | Optional | Acquirer name | String getAcquirerName() | setAcquirerName(String acquirerName) |
| `AcquirerAffiliationCode` | `String` | Optional | Aquirer affiliation code | String getAcquirerAffiliationCode() | setAcquirerAffiliationCode(String acquirerAffiliationCode) |
| `AcquirerTid` | `String` | Optional | Acquirer TID | String getAcquirerTid() | setAcquirerTid(String acquirerTid) |
| `AcquirerNsu` | `String` | Optional | Acquirer NSU | String getAcquirerNsu() | setAcquirerNsu(String acquirerNsu) |
| `AcquirerAuthCode` | `String` | Optional | Acquirer authorization code | String getAcquirerAuthCode() | setAcquirerAuthCode(String acquirerAuthCode) |
| `OperationType` | `String` | Optional | Operation type | String getOperationType() | setOperationType(String operationType) |
| `Card` | [`GetCardResponse`](../../doc/models/get-card-response.md) | Optional | Card data | GetCardResponse getCard() | setCard(GetCardResponse card) |
| `AcquirerMessage` | `String` | Optional | Acquirer message | String getAcquirerMessage() | setAcquirerMessage(String acquirerMessage) |
| `AcquirerReturnCode` | `String` | Optional | Acquirer Return Code | String getAcquirerReturnCode() | setAcquirerReturnCode(String acquirerReturnCode) |
| `Installments` | `Integer` | Optional | Number of installments | Integer getInstallments() | setInstallments(Integer installments) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetPrivateLabelTransactionResponse;

GetPrivateLabelTransactionResponse getPrivateLabelTransactionResponse = new GetPrivateLabelTransactionResponse.Builder()
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

