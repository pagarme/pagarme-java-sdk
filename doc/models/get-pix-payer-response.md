
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
  "name": "name0",
  "document": "document4",
  "document_type": "document_type8",
  "bank_account": {
    "bank_name": "bank_name0",
    "ispb": "ispb8",
    "branch_code": "branch_code2",
    "account_number": "account_number4"
  }
}
```

