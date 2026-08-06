
# Update Automatic Anticipation Settings Request

## Structure

`UpdateAutomaticAnticipationSettingsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | - | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `VolumePercentage` | `Integer` | Optional | - | Integer getVolumePercentage() | setVolumePercentage(Integer volumePercentage) |
| `Delay` | `Integer` | Optional | - | Integer getDelay() | setDelay(Integer delay) |
| `Days` | `Integer` | Optional | - | Integer getDays() | setDays(Integer days) |

## Example

```java
import me.pagar.api.models.UpdateAutomaticAnticipationSettingsRequest;

UpdateAutomaticAnticipationSettingsRequest updateAutomaticAnticipationSettingsRequest = new UpdateAutomaticAnticipationSettingsRequest.Builder()
    .enabled(false)
    .type("type4")
    .volumePercentage(178)
    .delay(112)
    .days(20)
    .build();
```

