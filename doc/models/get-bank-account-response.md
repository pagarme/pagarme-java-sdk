
# Get Bank Account Response

## Structure

`GetBankAccountResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Id | String getId() | setId(String id) |
| `HolderName` | `String` | Optional | Holder name | String getHolderName() | setHolderName(String holderName) |
| `HolderType` | `String` | Optional | Holder type | String getHolderType() | setHolderType(String holderType) |
| `Bank` | `String` | Optional | Bank | String getBank() | setBank(String bank) |
| `BranchNumber` | `String` | Optional | Branch number | String getBranchNumber() | setBranchNumber(String branchNumber) |
| `BranchCheckDigit` | `String` | Optional | Branch check digit | String getBranchCheckDigit() | setBranchCheckDigit(String branchCheckDigit) |
| `AccountNumber` | `String` | Optional | Account number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountCheckDigit` | `String` | Optional | Account check digit | String getAccountCheckDigit() | setAccountCheckDigit(String accountCheckDigit) |
| `Type` | `String` | Optional | Bank account type | String getType() | setType(String type) |
| `Status` | `String` | Optional | Bank account status | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | Creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | Last update date | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `DeletedAt` | `LocalDateTime` | Optional | Deletion date | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |
| `Recipient` | [`GetRecipientResponse`](../../doc/models/get-recipient-response.md) | Optional | Recipient | GetRecipientResponse getRecipient() | setRecipient(GetRecipientResponse recipient) |
| `Metadata` | `Map<String, String>` | Optional | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `PixKey` | `String` | Optional | Pix Key | String getPixKey() | setPixKey(String pixKey) |

## Example (as JSON)

```json
{
  "id": "id6",
  "holder_name": "holder_name2",
  "holder_type": "holder_type8",
  "bank": "bank4",
  "branch_number": "branch_number2"
}
```

