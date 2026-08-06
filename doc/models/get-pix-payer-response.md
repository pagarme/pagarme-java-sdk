
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

## Example

```java
import me.pagar.api.models.GetPixPayerResponse;

GetPixPayerResponse getPixPayerResponse = new GetPixPayerResponse.Builder()
    .name("name0")
    .document("document6")
    .documentType("document_type8")
    .bankAccount(null)
    .build();
```

