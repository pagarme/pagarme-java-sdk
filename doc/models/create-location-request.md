
# Create Location Request

Request for creating a location

## Structure

`CreateLocationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Latitude` | `String` | Required | Latitude | String getLatitude() | setLatitude(String latitude) |
| `Longitude` | `String` | Required | Longitude | String getLongitude() | setLongitude(String longitude) |

## Example

```java
import me.pagar.api.models.CreateLocationRequest;

CreateLocationRequest createLocationRequest = new CreateLocationRequest.Builder(
    "latitude0",
    "longitude0"
)
.build();
```

