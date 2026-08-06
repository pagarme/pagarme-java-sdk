
# Get Gateway Error Response

Gateway Response

## Structure

`GetGatewayErrorResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Optional | The message error | String getMessage() | setMessage(String message) |

## Example

```java
import me.pagar.api.models.GetGatewayErrorResponse;

GetGatewayErrorResponse getGatewayErrorResponse = new GetGatewayErrorResponse.Builder()
    .message("message2")
    .build();
```

