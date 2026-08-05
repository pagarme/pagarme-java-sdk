
# Get Device Response

Response object for geetting an order device

## Structure

`GetDeviceResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Platform` | `String` | Optional | Device's platform name | String getPlatform() | setPlatform(String platform) |

## Example

```java
import me.pagar.api.models.GetDeviceResponse;

GetDeviceResponse getDeviceResponse = new GetDeviceResponse.Builder()
    .platform("platform0")
    .build();
```

