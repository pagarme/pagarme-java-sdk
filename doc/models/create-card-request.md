
# Create Card Request

Card data

## Structure

`CreateCardRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Number` | `String` | Optional | Credit card number | String getNumber() | setNumber(String number) |
| `HolderName` | `String` | Optional | Holder name, as written on the card | String getHolderName() | setHolderName(String holderName) |
| `ExpMonth` | `Integer` | Optional | The expiration month | Integer getExpMonth() | setExpMonth(Integer expMonth) |
| `ExpYear` | `Integer` | Optional | The expiration year, that can be informed with 2 or 4 digits | Integer getExpYear() | setExpYear(Integer expYear) |
| `Cvv` | `String` | Optional | The card's security code | String getCvv() | setCvv(String cvv) |
| `BillingAddress` | [`CreateAddressRequest`](../../doc/models/create-address-request.md) | Optional | Card's billing address | CreateAddressRequest getBillingAddress() | setBillingAddress(CreateAddressRequest billingAddress) |
| `Brand` | `String` | Optional | Card brand | String getBrand() | setBrand(String brand) |
| `BillingAddressId` | `String` | Optional | The address id for the billing address | String getBillingAddressId() | setBillingAddressId(String billingAddressId) |
| `Metadata` | `Map<String, String>` | Optional | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Type` | `String` | Optional | Card type<br>**Default**: `"credit"` | String getType() | setType(String type) |
| `Options` | [`CreateCardOptionsRequest`](../../doc/models/create-card-options-request.md) | Optional | Options for creating the card | CreateCardOptionsRequest getOptions() | setOptions(CreateCardOptionsRequest options) |
| `HolderDocument` | `String` | Optional | Document number for the card's holder | String getHolderDocument() | setHolderDocument(String holderDocument) |
| `PrivateLabel` | `Boolean` | Optional | Indicates whether it is a private label card | Boolean getPrivateLabel() | setPrivateLabel(Boolean privateLabel) |
| `Label` | `String` | Optional | - | String getLabel() | setLabel(String label) |
| `Id` | `String` | Optional | Identifier | String getId() | setId(String id) |
| `Token` | `String` | Optional | token identifier | String getToken() | setToken(String token) |

## Example (as JSON)

```json
{
  "number": null,
  "holder_name": null,
  "exp_month": null,
  "exp_year": null,
  "cvv": null,
  "billing_address": null,
  "brand": null,
  "billing_address_id": null,
  "metadata": null,
  "type": null,
  "options": null,
  "holder_document": null,
  "private_label": null,
  "label": null,
  "id": null,
  "token": null
}
```

