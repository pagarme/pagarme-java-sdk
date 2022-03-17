
# Create Card Request

Card data

## Structure

`CreateCardRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Number` | `String` | Required | Credit card number | String getNumber() | setNumber(String number) |
| `HolderName` | `String` | Required | Holder name, as written on the card | String getHolderName() | setHolderName(String holderName) |
| `ExpMonth` | `int` | Required | The expiration month | int getExpMonth() | setExpMonth(int expMonth) |
| `ExpYear` | `int` | Required | The expiration year, that can be informed with 2 or 4 digits | int getExpYear() | setExpYear(int expYear) |
| `Cvv` | `String` | Required | The card's security code | String getCvv() | setCvv(String cvv) |
| `BillingAddress` | [`CreateAddressRequest`](../../doc/models/create-address-request.md) | Required | Card's billing address | CreateAddressRequest getBillingAddress() | setBillingAddress(CreateAddressRequest billingAddress) |
| `Brand` | `String` | Required | Card brand | String getBrand() | setBrand(String brand) |
| `BillingAddressId` | `String` | Required | The address id for the billing address | String getBillingAddressId() | setBillingAddressId(String billingAddressId) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Type` | `String` | Required | Card type<br>**Default**: `"credit"` | String getType() | setType(String type) |
| `Options` | [`CreateCardOptionsRequest`](../../doc/models/create-card-options-request.md) | Required | Options for creating the card | CreateCardOptionsRequest getOptions() | setOptions(CreateCardOptionsRequest options) |
| `HolderDocument` | `String` | Optional | Document number for the card's holder | String getHolderDocument() | setHolderDocument(String holderDocument) |
| `PrivateLabel` | `boolean` | Required | Indicates whether it is a private label card | boolean getPrivateLabel() | setPrivateLabel(boolean privateLabel) |
| `Label` | `String` | Required | - | String getLabel() | setLabel(String label) |
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
  "type": "credit",
  "options": null,
  "private_label": null,
  "label": null
}
```

