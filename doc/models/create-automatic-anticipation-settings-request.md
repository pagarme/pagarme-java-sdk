
# Create Automatic Anticipation Settings Request

## Structure

`CreateAutomaticAnticipationSettingsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `boolean` | Required | - | boolean getEnabled() | setEnabled(boolean enabled) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `VolumePercentage` | `int` | Required | - | int getVolumePercentage() | setVolumePercentage(int volumePercentage) |
| `Delay` | `int` | Required | - | int getDelay() | setDelay(int delay) |
| `Days` | `List<Integer>` | Required | - | List<Integer> getDays() | setDays(List<Integer> days) |

## Example

```java
import java.util.Arrays;
import me.pagar.api.models.CreateAutomaticAnticipationSettingsRequest;

CreateAutomaticAnticipationSettingsRequest createAutomaticAnticipationSettingsRequest = new CreateAutomaticAnticipationSettingsRequest.Builder(
    false,
    "type4",
    24,
    10,
    Arrays.asList(
        242,
        243
    )
)
.build();
```

