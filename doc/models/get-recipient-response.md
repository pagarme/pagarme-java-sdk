
# Get Recipient Response

Recipient response

## Structure

`GetRecipientResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Id | String getId() | setId(String id) |
| `Name` | `String` | Required | Name | String getName() | setName(String name) |
| `Email` | `String` | Required | Email | String getEmail() | setEmail(String email) |
| `Document` | `String` | Required | Document | String getDocument() | setDocument(String document) |
| `Description` | `String` | Required | Description | String getDescription() | setDescription(String description) |
| `Type` | `String` | Required | Type | String getType() | setType(String type) |
| `Status` | `String` | Required | Status | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Required | Creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | Last update date | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `DeletedAt` | `LocalDateTime` | Required | Deletion date | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |
| `DefaultBankAccount` | [`GetBankAccountResponse`](../../doc/models/get-bank-account-response.md) | Required | Default bank account | GetBankAccountResponse getDefaultBankAccount() | setDefaultBankAccount(GetBankAccountResponse defaultBankAccount) |
| `GatewayRecipients` | [`List<GetGatewayRecipientResponse>`](../../doc/models/get-gateway-recipient-response.md) | Required | Info about the recipient on the gateway | List<GetGatewayRecipientResponse> getGatewayRecipients() | setGatewayRecipients(List<GetGatewayRecipientResponse> gatewayRecipients) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `AutomaticAnticipationSettings` | [`GetAutomaticAnticipationResponse`](../../doc/models/get-automatic-anticipation-response.md) | Optional | - | GetAutomaticAnticipationResponse getAutomaticAnticipationSettings() | setAutomaticAnticipationSettings(GetAutomaticAnticipationResponse automaticAnticipationSettings) |
| `TransferSettings` | [`GetTransferSettingsResponse`](../../doc/models/get-transfer-settings-response.md) | Optional | - | GetTransferSettingsResponse getTransferSettings() | setTransferSettings(GetTransferSettingsResponse transferSettings) |
| `Code` | `String` | Required | Recipient code | String getCode() | setCode(String code) |
| `PaymentMode` | `String` | Required | Payment mode<br>**Default**: `"bank_transfer"` | String getPaymentMode() | setPaymentMode(String paymentMode) |

## Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "email": null,
  "document": null,
  "description": null,
  "type": null,
  "status": null,
  "created_at": null,
  "updated_at": null,
  "deleted_at": null,
  "default_bank_account": null,
  "gateway_recipients": null,
  "metadata": null,
  "code": null,
  "payment_mode": "bank_transfer"
}
```

