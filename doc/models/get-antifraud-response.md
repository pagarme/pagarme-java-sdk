
# Get Antifraud Response

## Structure

`GetAntifraudResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `ReturnCode` | `String` | Optional | - | String getReturnCode() | setReturnCode(String returnCode) |
| `ReturnMessage` | `String` | Optional | - | String getReturnMessage() | setReturnMessage(String returnMessage) |
| `ProviderName` | `String` | Optional | - | String getProviderName() | setProviderName(String providerName) |
| `Score` | `String` | Optional | - | String getScore() | setScore(String score) |

## Example

```java
import me.pagar.api.models.GetAntifraudResponse;

GetAntifraudResponse getAntifraudResponse = new GetAntifraudResponse.Builder()
    .status("status0")
    .returnCode("return_code8")
    .returnMessage("return_message4")
    .providerName("provider_name4")
    .score("score8")
    .build();
```

