
# Get Gateway Response Response

The Transaction Gateway Response

## Structure

`GetGatewayResponseResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Optional | The error code | String getCode() | setCode(String code) |
| `Errors` | [`List<GetGatewayErrorResponse>`](../../doc/models/get-gateway-error-response.md) | Optional | The gateway response errors list | List<GetGatewayErrorResponse> getErrors() | setErrors(List<GetGatewayErrorResponse> errors) |

## Example (as JSON)

```json
{
  "code": null,
  "errors": null
}
```

