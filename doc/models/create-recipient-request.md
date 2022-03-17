
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
  "name": null,
  "email": null,
  "description": null,
  "document": null,
  "type": null,
  "default_bank_account": null,
  "metadata": null,
  "code": null,
  "payment_mode": "bank_transfer"
}
```

