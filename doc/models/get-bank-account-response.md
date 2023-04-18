
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
  "recipient": {
    "id": "id8",
    "name": "name8",
    "email": "email8",
    "document": "document8",
    "description": "description2",
    "type": "type2",
    "status": "status0",
    "created_at": "2016-03-13T12:52:32.123Z",
    "updated_at": "2016-03-13T12:52:32.123Z",
    "deleted_at": "2016-03-13T12:52:32.123Z",
    "default_bank_account": {
      "id": "id6",
      "holder_name": "holder_name2",
      "holder_type": "holder_type8",
      "bank": "bank4",
      "branch_number": "branch_number2",
      "branch_check_digit": "branch_check_digit2",
      "account_number": "account_number6",
      "account_check_digit": "account_check_digit2",
      "type": "type4",
      "status": "status8",
      "created_at": "2016-03-13T12:52:32.123Z",
      "updated_at": "2016-03-13T12:52:32.123Z",
      "deleted_at": "2016-03-13T12:52:32.123Z",
      "recipient": {
        "id": "id8",
        "name": "name8",
        "email": "email8",
        "document": "document2",
        "description": "description8",
        "type": "type2",
        "status": "status0",
        "created_at": "2016-03-13T12:52:32.123Z",
        "updated_at": "2016-03-13T12:52:32.123Z",
        "deleted_at": "2016-03-13T12:52:32.123Z",
        "default_bank_account": {
          "id": "id6",
          "holder_name": "holder_name2",
          "holder_type": "holder_type8",
          "bank": "bank4",
          "branch_number": "branch_number2",
          "branch_check_digit": "branch_check_digit2",
          "account_number": "account_number6",
          "account_check_digit": "account_check_digit2",
          "type": "type6",
          "status": "status8",
          "created_at": "2016-03-13T12:52:32.123Z",
          "updated_at": "2016-03-13T12:52:32.123Z",
          "deleted_at": "2016-03-13T12:52:32.123Z",
          "recipient": {},
          "metadata": {
            "key0": "metadata3",
            "key1": "metadata2"
          },
          "pix_key": "pix_key0"
        },
        "gateway_recipients": [
          {
            "gateway": "gateway2",
            "status": "status4",
            "pgid": "pgid8",
            "created_at": "created_at0",
            "updated_at": "updated_at8"
          },
          {
            "gateway": "gateway3",
            "status": "status5",
            "pgid": "pgid9",
            "created_at": "created_at1",
            "updated_at": "updated_at9"
          }
        ],
        "metadata": {
          "key0": "metadata5",
          "key1": "metadata4",
          "key2": "metadata3"
        },
        "automatic_anticipation_settings": {
          "enabled": false,
          "type": "type8",
          "volume_percentage": 202,
          "delay": 88,
          "days": [
            64
          ]
        },
        "transfer_settings": {
          "transfer_enabled": false,
          "transfer_interval": "transfer_interval6",
          "transfer_day": 112
        },
        "code": "code6",
        "payment_mode": "payment_mode2"
      },
      "metadata": {
        "key0": "metadata3",
        "key1": "metadata2",
        "key2": "metadata1"
      },
      "pix_key": "pix_key0"
    },
    "gateway_recipients": [
      {},
      {}
    ],
    "metadata": {
      "key0": "metadata5",
      "key1": "metadata6",
      "key2": "metadata7"
    },
    "automatic_anticipation_settings": {
      "enabled": false,
      "type": "type8",
      "volume_percentage": 16,
      "delay": 18,
      "days": [
        250
      ]
    },
    "transfer_settings": {
      "transfer_enabled": false,
      "transfer_interval": "transfer_interval6",
      "transfer_day": 182
    },
    "code": "code6",
    "payment_mode": "payment_mode8"
  },
  "metadata": {
    "key0": "metadata3",
    "key1": "metadata4",
    "key2": "metadata5"
  },
  "pix_key": "pix_key6"
}
```

