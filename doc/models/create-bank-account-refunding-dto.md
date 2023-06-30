
# Create Bank Account Refunding DTO

Bank Account

## Structure

`CreateBankAccountRefundingDTO`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HolderName` | `String` | Required | Nome/razão social do favorecido | String getHolderName() | setHolderName(String holderName) |
| `HolderType` | `String` | Required | Tipo de titular (pessoa física ou jurídica) | String getHolderType() | setHolderType(String holderType) |
| `HolderDocument` | `String` | Required | CPF ou CNPJ do favorecido | String getHolderDocument() | setHolderDocument(String holderDocument) |
| `Bank` | `String` | Required | Dígitos que identificam cada banco. | String getBank() | setBank(String bank) |
| `BranchNumber` | `String` | Required | Número da agência bancária | String getBranchNumber() | setBranchNumber(String branchNumber) |
| `BranchCheckDigit` | `String` | Required | Dígito da agência bancária | String getBranchCheckDigit() | setBranchCheckDigit(String branchCheckDigit) |
| `AccountNumber` | `String` | Required | Número da conta | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountCheckDigit` | `String` | Required | Dígito verificador da conta | String getAccountCheckDigit() | setAccountCheckDigit(String accountCheckDigit) |
| `Type` | `String` | Required | Tipo de conta | String getType() | setType(String type) |

## Example (as JSON)

```json
{
  "holder_name": "holder_name4",
  "holder_type": "holder_type2",
  "holder_document": "holder_document6",
  "bank": "bank8",
  "branch_number": "branch_number6",
  "branch_check_digit": "branch_check_digit4",
  "account_number": "account_number0",
  "account_check_digit": "account_check_digit6",
  "type": "type0"
}
```

