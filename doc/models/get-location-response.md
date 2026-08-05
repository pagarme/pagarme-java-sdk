
# Get Location Response

Response object for geetting an order location request

## Structure

`GetLocationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Latitude` | `String` | Optional | Latitude | String getLatitude() | setLatitude(String latitude) |
| `Longitude` | `String` | Optional | Longitude | String getLongitude() | setLongitude(String longitude) |

## Example

```java
import me.pagar.api.models.GetLocationResponse;

GetLocationResponse getLocationResponse = new GetLocationResponse.Builder()
    .latitude("latitude2")
    .longitude("longitude8")
    .build();
```

