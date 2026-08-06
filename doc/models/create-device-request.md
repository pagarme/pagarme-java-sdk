
# Create Device Request

Request for creating a device

## Structure

`CreateDeviceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Platform` | `String` | Optional | Device's platform | String getPlatform() | setPlatform(String platform) |

## Example

```java
import me.pagar.api.models.CreateDeviceRequest;

CreateDeviceRequest createDeviceRequest = new CreateDeviceRequest.Builder()
    .platform("platform2")
    .build();
```

