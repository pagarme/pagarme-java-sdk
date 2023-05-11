
# Create Recipient Request

Request for creating a recipient

## Structure

`CreateRecipientRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Recipient name | String getName() | setName(String name) |
| `Email` | `String` | Required | Recipient email | String getEmail() | setEmail(String email) |
| `Description` | `String` | Required | Recipient description | String getDescription() | setDescription(String description) |
| `Document` | `String` | Required | Recipient document number | String getDocument() | setDocument(String document) |
| `Type` | `String` | Required | Recipient type | String getType() | setType(String type) |
| `DefaultBankAccount` | [`CreateBankAccountRequest`](../../doc/models/create-bank-account-request.md) | Required | Bank account | CreateBankAccountRequest getDefaultBankAccount() | setDefaultBankAccount(CreateBankAccountRequest defaultBankAccount) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `TransferSettings` | [`CreateTransferSettingsRequest`](../../doc/models/create-transfer-settings-request.md) | Optional | Receiver Transfer Information | CreateTransferSettingsRequest getTransferSettings() | setTransferSettings(CreateTransferSettingsRequest transferSettings) |
| `Code` | `String` | Required | Recipient code | String getCode() | setCode(String code) |
| `PaymentMode` | `String` | Required | Payment mode<br>**Default**: `"bank_transfer"` | String getPaymentMode() | setPaymentMode(String paymentMode) |

## Example (as JSON)

```json
{
  "name": "name0",
  "email": "email6",
  "description": "description0",
  "document": "document6",
  "type": "type0",
  "default_bank_account": {
    "holder_name": "holder_name4",
    "holder_type": "holder_type0",
    "holder_document": "holder_document2",
    "bank": "bank6",
    "branch_number": "branch_number4",
    "branch_check_digit": "branch_check_digit4",
    "account_number": "account_number8",
    "account_check_digit": "account_check_digit4",
    "type": "type2",
    "metadata": {
      "key0": "metadata5",
      "key1": "metadata4",
      "key2": "metadata3"
    },
    "pix_key": "pix_key8"
  },
  "metadata": {
    "key0": "metadata3",
    "key1": "metadata4",
    "key2": "metadata5"
  },
  "code": "code8",
  "payment_mode": "bank_transfer",
  "transfer_settings": {
    "transfer_enabled": false,
    "transfer_interval": "transfer_interval4",
    "transfer_day": 10
  }
}
```

