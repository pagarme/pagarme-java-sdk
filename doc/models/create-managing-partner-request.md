
# Create Managing Partner Request

Managing Partner Request

## Structure

`CreateManagingPartnerRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Email` | `String` | Required | - | String getEmail() | setEmail(String email) |
| `Document` | `String` | Required | - | String getDocument() | setDocument(String document) |
| `MotherName` | `String` | Optional | - | String getMotherName() | setMotherName(String motherName) |
| `Birthdate` | `String` | Required | - | String getBirthdate() | setBirthdate(String birthdate) |
| `MonthlyIncome` | `long` | Required | - | long getMonthlyIncome() | setMonthlyIncome(long monthlyIncome) |
| `ProfessionalOccupation` | `String` | Required | - | String getProfessionalOccupation() | setProfessionalOccupation(String professionalOccupation) |
| `SelfDeclaredLegalRepresentative` | `boolean` | Required | - | boolean getSelfDeclaredLegalRepresentative() | setSelfDeclaredLegalRepresentative(boolean selfDeclaredLegalRepresentative) |
| `Address` | [`CreateRegisterInformationAddressRequest`](../../doc/models/create-register-information-address-request.md) | Required | - | CreateRegisterInformationAddressRequest getAddress() | setAddress(CreateRegisterInformationAddressRequest address) |
| `PhoneNumbers` | [`List<CreateRegisterInformationPhoneRequest>`](../../doc/models/create-register-information-phone-request.md) | Required | - | List<CreateRegisterInformationPhoneRequest> getPhoneNumbers() | setPhoneNumbers(List<CreateRegisterInformationPhoneRequest> phoneNumbers) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.CreateManagingPartnerRequest;

CreateManagingPartnerRequest createManagingPartnerRequest = new CreateManagingPartnerRequest.Builder(
    null,
    null,
    null,
    null,
    0L,
    null,
    false,
    null,
    Arrays.asList(
        null
    )
)
.motherName("mother_name8")
.build();
```

