
# Get Recipient Response

Recipient response

## Structure

`GetRecipientResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Id | String getId() | setId(String id) |
| `Name` | `String` | Optional | Name | String getName() | setName(String name) |
| `Email` | `String` | Optional | Email | String getEmail() | setEmail(String email) |
| `Document` | `String` | Optional | Document | String getDocument() | setDocument(String document) |
| `Description` | `String` | Optional | Description | String getDescription() | setDescription(String description) |
| `Type` | `String` | Optional | Type | String getType() | setType(String type) |
| `Status` | `String` | Optional | Status | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | Creation date | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | Last update date | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `DeletedAt` | `LocalDateTime` | Optional | Deletion date | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |
| `DefaultBankAccount` | [`GetBankAccountResponse`](../../doc/models/get-bank-account-response.md) | Optional | Default bank account | GetBankAccountResponse getDefaultBankAccount() | setDefaultBankAccount(GetBankAccountResponse defaultBankAccount) |
| `GatewayRecipients` | [`List<GetGatewayRecipientResponse>`](../../doc/models/get-gateway-recipient-response.md) | Optional | Info about the recipient on the gateway | List<GetGatewayRecipientResponse> getGatewayRecipients() | setGatewayRecipients(List<GetGatewayRecipientResponse> gatewayRecipients) |
| `Metadata` | `Map<String, String>` | Optional | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `AutomaticAnticipationSettings` | [`GetAutomaticAnticipationResponse`](../../doc/models/get-automatic-anticipation-response.md) | Optional | - | GetAutomaticAnticipationResponse getAutomaticAnticipationSettings() | setAutomaticAnticipationSettings(GetAutomaticAnticipationResponse automaticAnticipationSettings) |
| `TransferSettings` | [`GetTransferSettingsResponse`](../../doc/models/get-transfer-settings-response.md) | Optional | - | GetTransferSettingsResponse getTransferSettings() | setTransferSettings(GetTransferSettingsResponse transferSettings) |
| `Code` | `String` | Optional | Recipient code | String getCode() | setCode(String code) |
| `PaymentMode` | `String` | Optional | Payment mode<br>**Default**: `"bank_transfer"` | String getPaymentMode() | setPaymentMode(String paymentMode) |

## Example (as JSON)

```json
{
  "payment_mode": "bank_transfer",
  "id": "id0",
  "name": "name0",
  "email": "email6",
  "document": "document6",
  "description": "description0"
}
```

