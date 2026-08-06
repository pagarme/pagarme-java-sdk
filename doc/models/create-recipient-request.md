
# Create Recipient Request

Request for creating a recipient

## Structure

`CreateRecipientRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Recipient name. Required if the register_information field isn't populated. | String getName() | setName(String name) |
| `Email` | `String` | Optional | Recipient email. Required if the register_information field isn't populated. | String getEmail() | setEmail(String email) |
| `Description` | `String` | Optional | Recipient description | String getDescription() | setDescription(String description) |
| `Document` | `String` | Optional | Recipient document number. Required if the register_information field isn't populated. | String getDocument() | setDocument(String document) |
| `Type` | `String` | Optional | Recipient type. Required if the register_information field isn't populated. | String getType() | setType(String type) |
| `DefaultBankAccount` | [`CreateBankAccountRequest`](../../doc/models/create-bank-account-request.md) | Required | Bank account | CreateBankAccountRequest getDefaultBankAccount() | setDefaultBankAccount(CreateBankAccountRequest defaultBankAccount) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `TransferSettings` | [`CreateTransferSettingsRequest`](../../doc/models/create-transfer-settings-request.md) | Optional | Receiver Transfer Information | CreateTransferSettingsRequest getTransferSettings() | setTransferSettings(CreateTransferSettingsRequest transferSettings) |
| `Code` | `String` | Required | Recipient code | String getCode() | setCode(String code) |
| `PaymentMode` | `String` | Required | Payment mode<br><br>**Default**: `"bank_transfer"` | String getPaymentMode() | setPaymentMode(String paymentMode) |
| `RegisterInformation` | [`CreateRegisterInformationBaseRequest`](../../doc/models/create-register-information-base-request.md) | Optional | Register Information | CreateRegisterInformationBaseRequest getRegisterInformation() | setRegisterInformation(CreateRegisterInformationBaseRequest registerInformation) |

## Example

```java
import me.pagar.api.models.CreateRecipientRequest;

CreateRecipientRequest createRecipientRequest = new CreateRecipientRequest.Builder(
    null,
    null,
    null,
    "bank_transfer"
)
.name("name2")
.email("email4")
.description("description2")
.document("document4")
.type("type8")
.build();
```

