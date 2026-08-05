
# Create Card Options Request

Options for creating the card

## Structure

`CreateCardOptionsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `VerifyCard` | `boolean` | Required | Indicates if the card should be verified before creation. If true, executes an authorization before saving the card. | boolean getVerifyCard() | setVerifyCard(boolean verifyCard) |

## Example

```java
import me.pagar.api.models.CreateCardOptionsRequest;

CreateCardOptionsRequest createCardOptionsRequest = new CreateCardOptionsRequest.Builder(
    false
)
.build();
```

