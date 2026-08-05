
# Get Pix Bank Account Response

Payer's bank details.

## Structure

`GetPixBankAccountResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BankName` | `String` | Optional | - | String getBankName() | setBankName(String bankName) |
| `Ispb` | `String` | Optional | - | String getIspb() | setIspb(String ispb) |
| `BranchCode` | `String` | Optional | - | String getBranchCode() | setBranchCode(String branchCode) |
| `AccountNumber` | `String` | Optional | - | String getAccountNumber() | setAccountNumber(String accountNumber) |

## Example

```java
import me.pagar.api.models.GetPixBankAccountResponse;

GetPixBankAccountResponse getPixBankAccountResponse = new GetPixBankAccountResponse.Builder()
    .bankName("bank_name4")
    .ispb("ispb4")
    .branchCode("branch_code8")
    .accountNumber("account_number0")
    .build();
```

