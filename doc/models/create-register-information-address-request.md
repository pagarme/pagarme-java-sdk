
# Create Register Information Address Request

Register Information Address

## Structure

`CreateRegisterInformationAddressRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Street` | `String` | Required | - | String getStreet() | setStreet(String street) |
| `Complementary` | `String` | Required | - | String getComplementary() | setComplementary(String complementary) |
| `StreetNumber` | `String` | Required | - | String getStreetNumber() | setStreetNumber(String streetNumber) |
| `Neighborhood` | `String` | Required | - | String getNeighborhood() | setNeighborhood(String neighborhood) |
| `City` | `String` | Required | - | String getCity() | setCity(String city) |
| `State` | `String` | Required | - | String getState() | setState(String state) |
| `ZipCode` | `String` | Required | - | String getZipCode() | setZipCode(String zipCode) |
| `ReferencePoint` | `String` | Required | - | String getReferencePoint() | setReferencePoint(String referencePoint) |

## Example

```java
import me.pagar.api.models.CreateRegisterInformationAddressRequest;

CreateRegisterInformationAddressRequest createRegisterInformationAddressRequest = new CreateRegisterInformationAddressRequest.Builder(
    "street8",
    "complementary0",
    "street_number8",
    "neighborhood4",
    "city8",
    "state4",
    "zip_code2",
    "reference_point2"
)
.build();
```

