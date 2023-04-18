
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

## Example (as JSON)

```json
{
  "enabled": false,
  "type": "type0",
  "volume_percentage": 62,
  "delay": 228,
  "days": 120
}
```

