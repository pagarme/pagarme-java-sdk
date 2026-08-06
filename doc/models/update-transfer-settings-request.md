
# Update Transfer Settings Request

## Structure

`UpdateTransferSettingsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransferEnabled` | `String` | Required | - | String getTransferEnabled() | setTransferEnabled(String transferEnabled) |
| `TransferInterval` | `String` | Required | - | String getTransferInterval() | setTransferInterval(String transferInterval) |
| `TransferDay` | `String` | Required | - | String getTransferDay() | setTransferDay(String transferDay) |

## Example

```java
import me.pagar.api.models.UpdateTransferSettingsRequest;

UpdateTransferSettingsRequest updateTransferSettingsRequest = new UpdateTransferSettingsRequest.Builder(
    "transfer_enabled8",
    "transfer_interval2",
    "transfer_day2"
)
.build();
```

