
# Get Bank Account Response

## Structure

`GetBankAccountResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Id | String getId() | setId(String id) |
| `HolderName` | `String` | Required | Holder name | String getHolderName() | setHolderName(String holderName) |
| `HolderType` | `String` | Required | Holder type | String getHolderType() | setHolderType(String holderType) |
| `Bank` | `String` | Required | Bank | String getBank() | setBank(String bank) |
| `BranchNumber` | `String` | Required | Branch number | String getBranchNumber() | setBranchNumber(String branchNumber) |
| `BranchCheckDigit` | `String` | Required | Branch check digit | String getBranchCheckDigit() | setBranchCheckDigit(String branchCheckDigit) |
| `AccountNumber` | `String` | Required | Account number | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountCheckDigit` | `String` | Required | Account check digit | String getAccountCheckDigit() | setAccountCheckDigit(String accountCheckDigit) |
| `Type` | `String` | Required | Bank account type | String getType() | setType(String type) |
| `Status` | `String` | Required | Bank account status | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Required | Creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | Last update date | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `DeletedAt` | `LocalDateTime` | Required | Deletion date | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |
| `Recipient` | [`GetRecipientResponse`](../../doc/models/get-recipient-response.md) | Optional | Recipient | GetRecipientResponse getRecipient() | setRecipient(GetRecipientResponse recipient) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `PixKey` | `String` | Required | Pix Key | String getPixKey() | setPixKey(String pixKey) |

## Example (as JSON)

```json
{
  "id": "id0",
  "holder_name": "holder_name4",
  "holder_type": "holder_type2",
  "bank": "bank8",
  "branch_number": "branch_number6",
  "branch_check_digit": "branch_check_digit4",
  "account_number": "account_number0",
  "account_check_digit": "account_check_digit6",
  "type": "type0",
  "status": "status8",
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "deleted_at": "2016-03-13T12:52:32.123Z",
  "recipient": null,
  "metadata": {
    "key0": "metadata3",
    "key1": "metadata4",
    "key2": "metadata5"
  },
  "pix_key": "pix_key6"
}
```

