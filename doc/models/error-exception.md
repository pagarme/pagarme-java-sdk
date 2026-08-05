
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

## Example

```java
try {
    // make the API call
} catch (ErrorException e) {
    e.printStackTrace();
} catch (ApiException e) {
    e.printStackTrace();
}
```

