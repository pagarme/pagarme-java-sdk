
# Get Boleto Transaction Response

Response object for getting a boleto transaction

## Structure

`GetBoletoTransactionResponse`

## Inherits From

[`GetTransactionResponse`](../../doc/models/get-transaction-response.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `Barcode` | `String` | Optional | - | String getBarcode() | setBarcode(String barcode) |
| `NossoNumero` | `String` | Optional | - | String getNossoNumero() | setNossoNumero(String nossoNumero) |
| `Bank` | `String` | Optional | - | String getBank() | setBank(String bank) |
| `DocumentNumber` | `String` | Optional | - | String getDocumentNumber() | setDocumentNumber(String documentNumber) |
| `Instructions` | `String` | Optional | - | String getInstructions() | setInstructions(String instructions) |
| `BillingAddress` | [`GetBillingAddressResponse`](../../doc/models/get-billing-address-response.md) | Optional | - | GetBillingAddressResponse getBillingAddress() | setBillingAddress(GetBillingAddressResponse billingAddress) |
| `DueAt` | `LocalDateTime` | Optional | - | LocalDateTime getDueAt() | setDueAt(LocalDateTime dueAt) |
| `QrCode` | `String` | Optional | - | String getQrCode() | setQrCode(String qrCode) |
| `Line` | `String` | Optional | - | String getLine() | setLine(String line) |
| `PdfPassword` | `String` | Optional | - | String getPdfPassword() | setPdfPassword(String pdfPassword) |
| `Pdf` | `String` | Optional | - | String getPdf() | setPdf(String pdf) |
| `PaidAt` | `LocalDateTime` | Optional | - | LocalDateTime getPaidAt() | setPaidAt(LocalDateTime paidAt) |
| `PaidAmount` | `String` | Optional | - | String getPaidAmount() | setPaidAmount(String paidAmount) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `CreditAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreditAt() | setCreditAt(LocalDateTime creditAt) |
| `StatementDescriptor` | `String` | Optional | Soft Descriptor | String getStatementDescriptor() | setStatementDescriptor(String statementDescriptor) |

## Example (as JSON)

```json
{
  "gateway_id": null,
  "amount": null,
  "status": null,
  "success": null,
  "created_at": null,
  "updated_at": null,
  "attempt_count": null,
  "max_attempts": null,
  "splits": null,
  "next_attempt": null,
  "transaction_type": "boleto",
  "id": null,
  "gateway_response": null,
  "antifraud_response": null,
  "metadata": null,
  "split": null,
  "interest": null,
  "fine": null,
  "max_days_to_pay_past_due": null,
  "url": null,
  "barcode": null,
  "nosso_numero": null,
  "bank": null,
  "document_number": null,
  "instructions": null,
  "billing_address": null,
  "due_at": null,
  "qr_code": null,
  "line": null,
  "pdf_password": null,
  "pdf": null,
  "paid_at": null,
  "paid_amount": null,
  "type": null,
  "credit_at": null,
  "statement_descriptor": null
}
```

