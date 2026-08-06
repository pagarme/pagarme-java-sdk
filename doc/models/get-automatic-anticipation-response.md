
# Get Automatic Anticipation Response

## Structure

`GetAutomaticAnticipationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | - | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `VolumePercentage` | `Integer` | Optional | - | Integer getVolumePercentage() | setVolumePercentage(Integer volumePercentage) |
| `Delay` | `Integer` | Optional | - | Integer getDelay() | setDelay(Integer delay) |
| `Days` | `List<Integer>` | Optional | - | List<Integer> getDays() | setDays(List<Integer> days) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.GetAutomaticAnticipationResponse;

GetAutomaticAnticipationResponse getAutomaticAnticipationResponse = new GetAutomaticAnticipationResponse.Builder()
    .enabled(false)
    .type("type4")
    .volumePercentage(86)
    .delay(204)
    .days(Arrays.asList(
        180,
        181,
        182
    ))
    .build();
```

