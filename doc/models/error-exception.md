
# Error Exception

Api Error Exception

## Structure

`ErrorException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Required | - | String getMessageField() | setMessageField(String messageField) |
| `Errors` | `Object` | Required | - | Object getErrors() | setErrors(Object errors) |
| `Request` | `Object` | Required | - | Object getRequest() | setRequest(Object request) |

## Example (as JSON)

```json
{
  "message": "message4",
  "errors": {
    "key1": "val1",
    "key2": "val2"
  },
  "request": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

