
# Create Emv Data Decrypt Request

## Structure

`CreateEmvDataDecryptRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Cipher` | `String` | Required | Emv Decrypt cipher type | String getCipher() | setCipher(String cipher) |
| `Dukpt` | [`CreateEmvDataDukptDecryptRequest`](../../doc/models/create-emv-data-dukpt-decrypt-request.md) | Optional | Dukpt data request | CreateEmvDataDukptDecryptRequest getDukpt() | setDukpt(CreateEmvDataDukptDecryptRequest dukpt) |
| `Tags` | [`List<CreateEmvDataTlvDecryptRequest>`](../../doc/models/create-emv-data-tlv-decrypt-request.md) | Required | Encrypted tags list | List<CreateEmvDataTlvDecryptRequest> getTags() | setTags(List<CreateEmvDataTlvDecryptRequest> tags) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.CreateEmvDataDecryptRequest;

CreateEmvDataDecryptRequest createEmvDataDecryptRequest = new CreateEmvDataDecryptRequest.Builder(
    null,
    Arrays.asList(
        null
    )
)
.dukpt(null)
.build();
```

