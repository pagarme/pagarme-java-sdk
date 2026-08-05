
# Create Register Information Individual Request

## Structure

`CreateRegisterInformationIndividualRequest`

## Inherits From

[`CreateRegisterInformationBaseRequest`](../../doc/models/create-register-information-base-request.md)

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `MotherName` | `String` | Optional | - | String getMotherName() | setMotherName(String motherName) |
| `Birthdate` | `String` | Required | - | String getBirthdate() | setBirthdate(String birthdate) |
| `MonthlyIncome` | `long` | Required | - | long getMonthlyIncome() | setMonthlyIncome(long monthlyIncome) |
| `ProfessionalOccupation` | `String` | Required | - | String getProfessionalOccupation() | setProfessionalOccupation(String professionalOccupation) |
| `Address` | [`CreateRegisterInformationAddressRequest`](../../doc/models/create-register-information-address-request.md) | Required | - | CreateRegisterInformationAddressRequest getAddress() | setAddress(CreateRegisterInformationAddressRequest address) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.CreateRegisterInformationIndividualRequest;
import me.pagar.api.models.CreateRegisterInformationPhoneRequest;

CreateRegisterInformationIndividualRequest createRegisterInformationIndividualRequest = new CreateRegisterInformationIndividualRequest.Builder(
    "email4",
    "document6",
    "type8",
    Arrays.asList(
        null,
        new CreateRegisterInformationPhoneRequest.Builder(
            null,
            null,
            null
        )
        .build()
    ),
    "name2",
    "birthdate6",
    20L,
    "professional_occupation6",
    null
)
.motherName("mother_name8")
.siteUrl("site_url4")
.build();
```

