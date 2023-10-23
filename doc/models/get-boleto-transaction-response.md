
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
  "gateway_id": "gateway_id8",
  "amount": 40,
  "status": "status6",
  "success": false,
  "created_at": "2016-03-13T12:52:32.123Z",
  "url": "url0",
  "barcode": "barcode4",
  "nosso_numero": "nosso_numero6",
  "bank": "bank4",
  "document_number": "document_number0"
}
```

