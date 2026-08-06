
# Get Credit Card Transaction Response

Response object for getting a credit card transaction

## Structure

`GetCreditCardTransactionResponse`

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
| `ThreedAuthenticationUrl` | `String` | Optional | 3D-S authentication Url | String getThreedAuthenticationUrl() | setThreedAuthenticationUrl(String threedAuthenticationUrl) |
| `FundingSource` | `String` | Optional | Identify when a card is prepaid, credit or debit. | String getFundingSource() | setFundingSource(String fundingSource) |
| `RetryInfo` | [`GetRetryTransactionInformationResponse`](../../doc/models/get-retry-transaction-information-response.md) | Optional | Retry transaction information | GetRetryTransactionInformationResponse getRetryInfo() | setRetryInfo(GetRetryTransactionInformationResponse retryInfo) |
| `BrandId` | `String` | Optional | - | String getBrandId() | setBrandId(String brandId) |
| `IndirectAcceptor` | `String` | Optional | Business model identifier | String getIndirectAcceptor() | setIndirectAcceptor(String indirectAcceptor) |

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.GetCreditCardTransactionResponse;

GetCreditCardTransactionResponse getCreditCardTransactionResponse = new GetCreditCardTransactionResponse.Builder()
    .statementDescriptor("statement_descriptor6")
    .acquirerName("acquirer_name0")
    .acquirerAffiliationCode("acquirer_affiliation_code2")
    .acquirerTid("acquirer_tid4")
    .acquirerNsu("acquirer_nsu4")
    .gatewayId("gateway_id8")
    .amount(40)
    .status("status6")
    .success(false)
    .createdAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
    .build();
```

