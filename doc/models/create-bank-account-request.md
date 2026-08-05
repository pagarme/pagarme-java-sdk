
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

## Example

```java
import java.util.LinkedHashMap;
import me.pagar.api.models.CreateBankAccountRequest;

CreateBankAccountRequest createBankAccountRequest = new CreateBankAccountRequest.Builder(
    "holder_name6",
    "holder_type2",
    "holder_document6",
    "bank8",
    "branch_number6",
    "account_number0",
    "account_check_digit6",
    "type0",
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
        put("key1", "metadata4");
    }}
)
.branchCheckDigit("branch_check_digit4")
.pixKey("pix_key6")
.build();
```

