
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

## Example (as JSON)

```json
{
  "enabled": false,
  "type": "type8",
  "volume_percentage": 178,
  "delay": 112,
  "days": [
    88
  ]
}
```

