
# Get Automatic Anticipation Response

## Structure

`GetAutomaticAnticipationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Required | - | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `VolumePercentage` | `Integer` | Required | - | Integer getVolumePercentage() | setVolumePercentage(Integer volumePercentage) |
| `Delay` | `Integer` | Required | - | Integer getDelay() | setDelay(Integer delay) |
| `Days` | `List<Integer>` | Required | - | List<Integer> getDays() | setDays(List<Integer> days) |

## Example (as JSON)

```json
{
  "enabled": false,
  "type": "type0",
  "volume_percentage": 62,
  "delay": 228,
  "days": [
    188,
    189,
    190
  ]
}
```

