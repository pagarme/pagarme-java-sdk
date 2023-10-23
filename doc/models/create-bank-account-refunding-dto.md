
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
  "holder_name": "holder_name2",
  "holder_type": "holder_type8",
  "holder_document": "holder_document0",
  "bank": "bank4",
  "branch_number": "branch_number2",
  "branch_check_digit": "branch_check_digit2",
  "account_number": "account_number6",
  "account_check_digit": "account_check_digit2",
  "type": "type4"
}
```

