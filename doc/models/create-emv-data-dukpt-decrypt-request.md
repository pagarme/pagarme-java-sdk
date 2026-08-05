
# Create Emv Data Dukpt Decrypt Request

## Structure

`CreateEmvDataDukptDecryptRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ksn` | `String` | Required | Key serial number | String getKsn() | setKsn(String ksn) |

## Example

```java
import me.pagar.api.models.CreateEmvDataDukptDecryptRequest;

CreateEmvDataDukptDecryptRequest createEmvDataDukptDecryptRequest = new CreateEmvDataDukptDecryptRequest.Builder(
    "ksn2"
)
.build();
```

