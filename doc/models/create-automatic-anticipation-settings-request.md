
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

## Example (as JSON)

```json
{
  "enabled": false,
  "type": "type8",
  "volume_percentage": 208,
  "delay": 82,
  "days": [
    58,
    59
  ]
}
```

