
# Create Bank Account Request

Request for creating a bank account

## Structure

`CreateBankAccountRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HolderName` | `String` | Required | Bank account holder name | String getHolderName() | setHolderName(String holderName) |
| `HolderType` | `String` | Required | Bank account holder type | String getHolderType() | setHolderType(String holderType) |
| `HolderDocument` | `String` | Required | Bank account holder document | String getHolderDocument() | setHolderDocument(String holderDocument) |
| `Bank` | `String` | Required | Bank | String getBank() | setBank(String bank) |
| `BranchNumber` | `String` | Required | Branch number | String getBranchNumber() | setBranchNumber(String branchNumber) |
| `BranchCheckDigit` | `String` | Optional | Branch check digit | String getBranchCheckDigit() | setBranchCheckDigit(String branchCheckDigit) |
| `AccountNumber` | `String` | Required | Account number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountCheckDigit` | `String` | Required | Account check digit | String getAccountCheckDigit() | setAccountCheckDigit(String accountCheckDigit) |
| `Type` | `String` | Required | Bank account type | String getType() | setType(String type) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `PixKey` | `String` | Optional | Pix key | String getPixKey() | setPixKey(String pixKey) |

## Example (as JSON)

```json
{
  "holder_name": "holder_name4",
  "holder_type": "holder_type0",
  "holder_document": "holder_document8",
  "bank": "bank6",
  "branch_number": "branch_number4",
  "branch_check_digit": "branch_check_digit4",
  "account_number": "account_number8",
  "account_check_digit": "account_check_digit4",
  "type": "type2",
  "metadata": {
    "key0": "metadata5",
    "key1": "metadata6",
    "key2": "metadata7"
  },
  "pix_key": "pix_key8"
}
```

