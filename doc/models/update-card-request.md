
# Update Card Request

Request for updating a card

## Structure

`UpdateCardRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `HolderName` | `String` | Required | Holder name | String getHolderName() | setHolderName(String holderName) |
| `ExpMonth` | `int` | Required | Expiration month | int getExpMonth() | setExpMonth(int expMonth) |
| `ExpYear` | `int` | Required | Expiration year | int getExpYear() | setExpYear(int expYear) |
| `BillingAddressId` | `String` | Required | Id of the address to be used as billing address | String getBillingAddressId() | setBillingAddressId(String billingAddressId) |
| `BillingAddress` | [`CreateAddressRequest`](../../doc/models/create-address-request.md) | Required | Billing address | CreateAddressRequest getBillingAddress() | setBillingAddress(CreateAddressRequest billingAddress) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Label` | `String` | Required | - | String getLabel() | setLabel(String label) |

## Example (as JSON)

```json
{
  "holder_name": "holder_name4",
  "exp_month": 42,
  "exp_year": 254,
  "billing_address_id": "billing_address_id6",
  "billing_address": {
    "street": "street8",
    "number": "number4",
    "zip_code": "zip_code2",
    "neighborhood": "neighborhood4",
    "city": "city2",
    "state": "state6",
    "country": "country2",
    "complement": "complement6",
    "metadata": {
      "key0": "metadata5",
      "key1": "metadata6"
    },
    "line_1": "line_18",
    "line_2": "line_26"
  },
  "metadata": {
    "key0": "metadata3",
    "key1": "metadata4",
    "key2": "metadata5"
  },
  "label": "label0"
}
```

