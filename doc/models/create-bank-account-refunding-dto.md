
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

## Example

```java
import me.pagar.api.models.CreateBankAccountRefundingDTO;

CreateBankAccountRefundingDTO createBankAccountRefundingDTO = new CreateBankAccountRefundingDTO.Builder(
    "holder_name4",
    "holder_type0",
    "holder_document8",
    "bank6",
    "branch_number4",
    "branch_check_digit4",
    "account_number2",
    "account_check_digit4",
    "type2"
)
.build();
```

