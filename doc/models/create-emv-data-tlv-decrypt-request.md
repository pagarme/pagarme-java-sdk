
# Create Emv Data Tlv Decrypt Request

## Structure

`CreateEmvDataTlvDecryptRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Tag` | `String` | Required | Emv tag | String getTag() | setTag(String tag) |
| `Lenght` | `String` | Required | Emv lenght | String getLenght() | setLenght(String lenght) |
| `Value` | `String` | Required | Emv value | String getValue() | setValue(String value) |

## Example

```java
import me.pagar.api.models.CreateEmvDataTlvDecryptRequest;

CreateEmvDataTlvDecryptRequest createEmvDataTlvDecryptRequest = new CreateEmvDataTlvDecryptRequest.Builder(
    "tag8",
    "lenght4",
    "value6"
)
.build();
```

