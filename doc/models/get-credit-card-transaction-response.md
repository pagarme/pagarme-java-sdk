
# Get Credit Card Transaction Response

Response object for getting a credit card transaction

## Structure

`GetCreditCardTransactionResponse`

## Inherits From

[`GetTransactionResponse`](../../doc/models/get-transaction-response.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StatementDescriptor` | `String` | Required | Text that will appear on the credit card's statement | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `AcquirerName` | `String` | Required | Acquirer name | String getAcquirerName() | setAcquirerName(String acquirerName) |
| `AcquirerAffiliationCode` | `String` | Required | Aquirer affiliation code | String getAcquirerAffiliationCode() | setAcquirerAffiliationCode(String acquirerAffiliationCode) |
| `AcquirerTid` | `String` | Required | Acquirer TID | String getAcquirerTid() | setAcquirerTid(String acquirerTid) |
| `AcquirerNsu` | `String` | Required | Acquirer NSU | String getAcquirerNsu() | setAcquirerNsu(String acquirerNsu) |
| `AcquirerAuthCode` | `String` | Required | Acquirer authorization code | String getAcquirerAuthCode() | setAcquirerAuthCode(String acquirerAuthCode) |
| `OperationType` | `String` | Required | Operation type | String getOperationType() | setOperationType(String operationType) |
| `Card` | [`GetCardResponse`](../../doc/models/get-card-response.md) | Required | Card data | GetCardResponse getCard() | setCard(GetCardResponse card) |
| `AcquirerMessage` | `String` | Required | Acquirer message | String getAcquirerMessage() | setAcquirerMessage(String acquirerMessage) |
| `AcquirerReturnCode` | `String` | Required | Acquirer Return Code | String getAcquirerReturnCode() | setAcquirerReturnCode(String acquirerReturnCode) |
| `Installments` | `Integer` | Optional | Number of installments | Integer getInstallments() | setInstallments(Integer installments) |
| `ThreedAuthenticationUrl` | `String` | Required | 3D-S authentication Url | String getThreedAuthenticationUrl() | setThreedAuthenticationUrl(String threedAuthenticationUrl) |

## Example (as JSON)

```json
{
  "statement_descriptor": "statement_descriptor0",
  "acquirer_name": "acquirer_name4",
  "acquirer_affiliation_code": "acquirer_affiliation_code8",
  "acquirer_tid": "acquirer_tid0",
  "acquirer_nsu": "acquirer_nsu0",
  "acquirer_auth_code": "acquirer_auth_code8",
  "operation_type": "operation_type6",
  "card": {
    "id": "id6",
    "last_four_digits": "last_four_digits2",
    "brand": "brand0",
    "holder_name": "holder_name2",
    "exp_month": 228,
    "exp_year": 68,
    "status": "status2",
    "created_at": "2016-03-13T12:52:32.123Z",
    "updated_at": "2016-03-13T12:52:32.123Z",
    "billing_address": {
      "street": "street8",
      "number": "number4",
      "zip_code": "zip_code2",
      "neighborhood": "neighborhood4",
      "city": "city2",
      "state": "state6",
      "country": "country2",
      "complement": "complement6",
      "line_1": "line_18",
      "line_2": "line_26"
    },
    "customer": null,
    "metadata": {
      "key0": "metadata7"
    },
    "type": "type4",
    "holder_document": "holder_document0",
    "deleted_at": null,
    "first_six_digits": "first_six_digits6",
    "label": "label6"
  },
  "acquirer_message": "acquirer_message0",
  "acquirer_return_code": "acquirer_return_code8",
  "installments": null,
  "threed_authentication_url": "threed_authentication_url6",
  "transaction_type": "credit_card",
  "gateway_id": "gateway_id0",
  "amount": 46,
  "status": "status8",
  "success": false,
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "attempt_count": 70,
  "max_attempts": 174,
  "splits": [
    {
      "type": "type4",
      "amount": 62,
      "recipient": null,
      "gateway_id": "gateway_id4",
      "options": null,
      "id": "id6"
    },
    {
      "type": "type3",
      "amount": 63,
      "recipient": null,
      "gateway_id": "gateway_id3",
      "options": null,
      "id": "id7"
    }
  ],
  "next_attempt": null,
  "id": "id0",
  "gateway_response": {
    "code": "code6",
    "errors": [
      {
        "message": "message3"
      },
      {
        "message": "message4"
      },
      {
        "message": "message5"
      }
    ]
  },
  "antifraud_response": {
    "status": "status0",
    "return_code": "return_code8",
    "return_message": "return_message4",
    "provider_name": "provider_name4",
    "score": "score8"
  },
  "metadata": null,
  "split": [
    {
      "type": "type6",
      "amount": 28,
      "recipient": null,
      "gateway_id": "gateway_id6",
      "options": null,
      "id": "id4"
    },
    {
      "type": "type5",
      "amount": 27,
      "recipient": null,
      "gateway_id": "gateway_id5",
      "options": null,
      "id": "id5"
    },
    {
      "type": "type4",
      "amount": 26,
      "recipient": null,
      "gateway_id": "gateway_id4",
      "options": null,
      "id": "id6"
    }
  ],
  "interest": null,
  "fine": null,
  "max_days_to_pay_past_due": null
}
```

