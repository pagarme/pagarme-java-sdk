
# Update Recipient Code Request

Update code for a recipient

## Structure

`UpdateRecipientCodeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `String` | Required | Code | String getCode() | setCode(String code) |

## Example

```java
import me.pagar.api.models.UpdateRecipientCodeRequest;

UpdateRecipientCodeRequest updateRecipientCodeRequest = new UpdateRecipientCodeRequest.Builder(
    "code8"
)
.build();
```

