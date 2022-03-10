
# Get Card Response

Response object for getting a credit card

## Structure

`GetCardResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `LastFourDigits` | `String` | Required | - | String getLastFourDigits() | setLastFourDigits(String lastFourDigits) |
| `Brand` | `String` | Required | - | String getBrand() | setBrand(String brand) |
| `HolderName` | `String` | Required | - | String getHolderName() | setHolderName(String holderName) |
| `ExpMonth` | `int` | Required | - | int getExpMonth() | setExpMonth(int expMonth) |
| `ExpYear` | `int` | Required | - | int getExpYear() | setExpYear(int expYear) |
| `Status` | `String` | Required | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `BillingAddress` | [`GetBillingAddressResponse`](../../doc/models/get-billing-address-response.md) | Required | - | GetBillingAddressResponse getBillingAddress() | setBillingAddress(GetBillingAddressResponse billingAddress) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | - | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Metadata` | `Map<String, String>` | Required | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Type` | `String` | Required | Card type | String getType() | setType(String type) |
| `HolderDocument` | `String` | Required | Document number for the card's holder | String getHolderDocument() | setHolderDocument(String holderDocument) |
| `DeletedAt` | `LocalDateTime` | Optional | - | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |
| `FirstSixDigits` | `String` | Required | First six digits | String getFirstSixDigits() | setFirstSixDigits(String firstSixDigits) |
| `Label` | `String` | Required | - | String getLabel() | setLabel(String label) |

## Example (as JSON)

```json
{
  "id": "id0",
  "last_four_digits": "last_four_digits6",
  "brand": "brand4",
  "holder_name": "holder_name4",
  "exp_month": 42,
  "exp_year": 254,
  "status": "status8",
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "billing_address": {
    "street": "street8",
    "number": "number4",
    "zip_code": "zip_code2",
    "neighborhood": "neighborhood4",
    "city": "city2",
    "state": "state6",
    "country": "country2",
    "complement": "complement6",
    "line_1": "line_18",
    "line_2": "line_26"
  },
  "customer": null,
  "metadata": {
    "key0": "metadata3",
    "key1": "metadata4",
    "key2": "metadata5"
  },
  "type": "type0",
  "holder_document": "holder_document6",
  "deleted_at": null,
  "first_six_digits": "first_six_digits0",
  "label": "label0"
}
```

