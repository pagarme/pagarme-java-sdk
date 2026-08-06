
# Create Card Payment Contactless POI Request

## Structure

`CreateCardPaymentContactlessPOIRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SystemName` | `String` | Required | system name | String getSystemName() | setSystemName(String systemName) |
| `Model` | `String` | Required | model | String getModel() | setModel(String model) |
| `Provider` | `String` | Required | provider | String getProvider() | setProvider(String provider) |
| `SerialNumber` | `String` | Required | serial number | String getSerialNumber() | setSerialNumber(String serialNumber) |
| `VersionNumber` | `String` | Required | version number | String getVersionNumber() | setVersionNumber(String versionNumber) |

## Example

```java
import me.pagar.api.models.CreateCardPaymentContactlessPOIRequest;

CreateCardPaymentContactlessPOIRequest createCardPaymentContactlessPOIRequest = new CreateCardPaymentContactlessPOIRequest.Builder(
    "system_name4",
    "model2",
    "provider4",
    "serial_number8",
    "version_number4"
)
.build();
```

