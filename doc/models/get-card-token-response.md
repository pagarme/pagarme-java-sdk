
# Get Card Token Response

Card token data

## Structure

`GetCardTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LastFourDigits` | `String` | Optional | - | String getLastFourDigits() | setLastFourDigits(String lastFourDigits) |
| `HolderName` | `String` | Optional | - | String getHolderName() | setHolderName(String holderName) |
| `HolderDocument` | `String` | Optional | - | String getHolderDocument() | setHolderDocument(String holderDocument) |
| `ExpMonth` | `Integer` | Optional | - | Integer getExpMonth() | setExpMonth(Integer expMonth) |
| `ExpYear` | `Integer` | Optional | - | Integer getExpYear() | setExpYear(Integer expYear) |
| `Brand` | `String` | Optional | - | String getBrand() | setBrand(String brand) |
| `Type` | `String` | Optional | - | String getType() | setType(String type) |
| `Label` | `String` | Optional | - | String getLabel() | setLabel(String label) |

## Example

```java
import me.pagar.api.models.GetCardTokenResponse;

GetCardTokenResponse getCardTokenResponse = new GetCardTokenResponse.Builder()
    .lastFourDigits("last_four_digits8")
    .holderName("holder_name8")
    .holderDocument("holder_document6")
    .expMonth(232)
    .expYear(64)
    .build();
```

