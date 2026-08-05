
# Create Boleto Payment Request

Contains the settings for creating a boleto payment

## Structure

`CreateBoletoPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Retries` | `int` | Required | Number of retries | int getRetries() | setRetries(int retries) |
| `Bank` | `String` | Optional | The bank code, containing three characters. The available codes are on the API specification | String getBank() | setBank(String bank) |
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

## Example

```java
import me.pagar.api.DateTimeHelper;
import me.pagar.api.models.CreateBoletoPaymentRequest;

CreateBoletoPaymentRequest createBoletoPaymentRequest = new CreateBoletoPaymentRequest.Builder(
    192,
    "instructions6",
    null,
    "document_number2",
    "statement_descriptor8"
)
.bank("bank6")
.dueAt(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
.billingAddressId("billing_address_id4")
.nossoNumero("nosso_numero8")
.interest(null)
.build();
```

