
# Create Phone Request

## Structure

`CreatePhoneRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CountryCode` | `String` | Optional | - | String getCountryCode() | setCountryCode(String countryCode) |
| `Number` | `String` | Optional | - | String getNumber() | setNumber(String number) |
| `AreaCode` | `String` | Optional | - | String getAreaCode() | setAreaCode(String areaCode) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |

## Example

```java
import me.pagar.api.models.CreatePhoneRequest;

CreatePhoneRequest createPhoneRequest = new CreatePhoneRequest.Builder()
    .countryCode("country_code2")
    .number("number4")
    .areaCode("area_code8")
    .type("Type8")
    .build();
```

