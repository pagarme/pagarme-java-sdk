
# Create Register Information Base Request

Request object for RegisterInformation.

## Structure

`CreateRegisterInformationBaseRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Email` | `String` | Required | - | String getEmail() | setEmail(String email) |
| `Document` | `String` | Required | - | String getDocument() | setDocument(String document) |
| `Type` | `String` | Required | "individual" ou "corporation" | String getType() | setType(String type) |
| `SiteUrl` | `String` | Optional | - | String getSiteUrl() | setSiteUrl(String siteUrl) |
| `PhoneNumbers` | [`List<CreateRegisterInformationPhoneRequest>`](../../doc/models/create-register-information-phone-request.md) | Required | - | List<CreateRegisterInformationPhoneRequest> getPhoneNumbers() | setPhoneNumbers(List<CreateRegisterInformationPhoneRequest> phoneNumbers) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.CreateRegisterInformationBaseRequest;

CreateRegisterInformationBaseRequest createRegisterInformationBaseRequest = new CreateRegisterInformationBaseRequest.Builder(
    null,
    null,
    null,
    Arrays.asList(
        null
    )
)
.siteUrl("site_url6")
.build();
```

