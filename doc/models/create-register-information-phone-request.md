
# Create Register Information Phone Request

Register Information Phone

## Structure

`CreateRegisterInformationPhoneRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ddd` | `String` | Required | - | String getDdd() | setDdd(String ddd) |
| `Number` | `String` | Required | - | String getNumber() | setNumber(String number) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |

## Example

```java
import me.pagar.api.models.CreateRegisterInformationPhoneRequest;

CreateRegisterInformationPhoneRequest createRegisterInformationPhoneRequest = new CreateRegisterInformationPhoneRequest.Builder(
    "ddd2",
    "number0",
    "type8"
)
.build();
```

