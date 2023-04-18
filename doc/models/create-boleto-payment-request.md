
# Create Boleto Payment Request

Contains the settings for creating a boleto payment

## Structure

`CreateBoletoPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Retries` | `int` | Required | Number of retries | int getRetries() | setRetries(int retries) |
| `Bank` | `String` | Required | The bank code, containing three characters. The available codes are on the API specification | String getBank() | setBank(String bank) |
| `Instructions` | `String` | Required | The instructions field that will be printed on the boleto. | String getInstructions() | setInstructions(String instructions) |
| `DueAt` | `LocalDateTime` | Optional | Boleto due date | LocalDateTime getDueAt() | setDueAt(LocalDateTime dueAt) |
| `BillingAddress` | [`CreateAddressRequest`](../../doc/models/create-address-request.md) | Required | Card's billing address | CreateAddressRequest getBillingAddress() | setBillingAddress(CreateAddressRequest billingAddress) |
| `BillingAddressId` | `String` | Optional | The address id for the billing address | String getBillingAddressId() | setBillingAddressId(String billingAddressId) |
| `NossoNumero` | `String` | Optional | Customer identification number with the bank | String getNossoNumero() | setNossoNumero(String nossoNumero) |
| `DocumentNumber` | `String` | Required | Boleto identification | String getDocumentNumber() | setDocumentNumber(String documentNumber) |
| `StatementDescriptor` | `String` | Required | Soft Descriptor | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |
| `Interest` | [`CreateInterestRequest`](../../doc/models/create-interest-request.md) | Optional | - | CreateInterestRequest getInterest() | setInterest(CreateInterestRequest interest) |
| `Fine` | [`CreateFineRequest`](../../doc/models/create-fine-request.md) | Optional | - | CreateFineRequest getFine() | setFine(CreateFineRequest fine) |
| `MaxDaysToPayPastDue` | `Integer` | Optional | - | Integer getMaxDaysToPayPastDue() | setMaxDaysToPayPastDue(Integer maxDaysToPayPastDue) |

## Example (as JSON)

```json
{
  "retries": 230,
  "bank": "bank8",
  "instructions": "instructions2",
  "due_at": "2016-03-13T12:52:32.123Z",
  "billing_address": {
    "street": "street8",
    "number": "number4",
    "zip_code": "zip_code2",
    "neighborhood": "neighborhood4",
    "city": "city2",
    "state": "state6",
    "country": "country2",
    "complement": "complement6",
    "metadata": {
      "key0": "metadata5",
      "key1": "metadata6"
    },
    "line_1": "line_18",
    "line_2": "line_26"
  },
  "billing_address_id": "billing_address_id6",
  "nosso_numero": "nosso_numero0",
  "document_number": "document_number6",
  "statement_descriptor": "statement_descriptor0",
  "interest": {
    "days": 156,
    "type": "type0",
    "amount": 230
  },
  "fine": {
    "days": 138,
    "type": "type2",
    "amount": 212
  },
  "max_days_to_pay_past_due": 122
}
```

