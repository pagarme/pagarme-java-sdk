
# Get Pix Payer Response

Pix payer data.

## Structure

`GetPixPayerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Document` | `String` | Optional | - | String getDocument() | setDocument(String document) |
| `DocumentType` | `String` | Optional | - | String getDocumentType() | setDocumentType(String documentType) |
| `BankAccount` | [`GetPixBankAccountResponse`](../../doc/models/get-pix-bank-account-response.md) | Optional | - | GetPixBankAccountResponse getBankAccount() | setBankAccount(GetPixBankAccountResponse bankAccount) |

## Example (as JSON)

```json
{
  "name": null,
  "document": null,
  "document_type": null,
  "bank_account": null
}
```

