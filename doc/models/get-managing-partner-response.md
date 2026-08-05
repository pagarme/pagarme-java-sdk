
# Get Managing Partner Response

Response object for getting an ManagingPartnerResponse

## Structure

`GetManagingPartnerResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `Document` | `String` | Optional | - | String getDocument() | setDocument(String document) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `MotherName` | `String` | Optional | - | String getMotherName() | setMotherName(String motherName) |
| `Birthdate` | `String` | Optional | - | String getBirthdate() | setBirthdate(String birthdate) |
| `MonthlyIncome` | `String` | Optional | - | String getMonthlyIncome() | setMonthlyIncome(String monthlyIncome) |
| `ProfessionalOccupation` | `String` | Optional | - | String getProfessionalOccupation() | setProfessionalOccupation(String professionalOccupation) |
| `SelfDeclaredRepresentative` | `Boolean` | Optional | - | Boolean getSelfDeclaredRepresentative() | setSelfDeclaredRepresentative(Boolean selfDeclaredRepresentative) |
| `Address` | [`GetRegisterInformationAddressResponse`](../../doc/models/get-register-information-address-response.md) | Optional | - | GetRegisterInformationAddressResponse getAddress() | setAddress(GetRegisterInformationAddressResponse address) |
| `PhoneNumbers` | [`List<GetPhoneNumberResponse>`](../../doc/models/get-phone-number-response.md) | Optional | - | List<GetPhoneNumberResponse> getPhoneNumbers() | setPhoneNumbers(List<GetPhoneNumberResponse> phoneNumbers) |

## Example

```java
import me.pagar.api.models.GetManagingPartnerResponse;

GetManagingPartnerResponse getManagingPartnerResponse = new GetManagingPartnerResponse.Builder()
    .name("name8")
    .email("email8")
    .document("document2")
    .type("type8")
    .motherName("mother_name4")
    .build();
```

