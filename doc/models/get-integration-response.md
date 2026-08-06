
# Get Integration Response

## Structure

`GetIntegrationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |

## Example

```java
import me.pagar.api.models.GetIntegrationResponse;

GetIntegrationResponse getIntegrationResponse = new GetIntegrationResponse.Builder()
    .code("code2")
    .build();
```

