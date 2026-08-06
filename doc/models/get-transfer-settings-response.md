
# Get Transfer Settings Response

## Structure

`GetTransferSettingsResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransferEnabled` | `Boolean` | Optional | - | Boolean getTransferEnabled() | setTransferEnabled(Boolean transferEnabled) |
| `TransferInterval` | `String` | Optional | - | String getTransferInterval() | setTransferInterval(String transferInterval) |
| `TransferDay` | `Integer` | Optional | - | Integer getTransferDay() | setTransferDay(Integer transferDay) |

## Example

```java
import me.pagar.api.models.GetTransferSettingsResponse;

GetTransferSettingsResponse getTransferSettingsResponse = new GetTransferSettingsResponse.Builder()
    .transferEnabled(false)
    .transferInterval("transfer_interval4")
    .transferDay(156)
    .build();
```

