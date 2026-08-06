
# Pix Additional Information

Pix Additional Information

## Structure

`PixAdditionalInformation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Value` | `String` | Optional | - | String getValue() | setValue(String value) |

## Example

```java
import me.pagar.api.models.PixAdditionalInformation;

PixAdditionalInformation pixAdditionalInformation = new PixAdditionalInformation.Builder()
    .name("Name2")
    .value("Value0")
    .build();
```

