
# Get Card Response

Response object for getting a credit card

## Structure

`GetCardResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `LastFourDigits` | `String` | Optional | - | String getLastFourDigits() | setLastFourDigits(String lastFourDigits) |
| `Brand` | `String` | Optional | - | String getBrand() | setBrand(String brand) |
| `HolderName` | `String` | Optional | - | String getHolderName() | setHolderName(String holderName) |
| `ExpMonth` | `Integer` | Optional | - | Integer getExpMonth() | setExpMonth(Integer expMonth) |
| `ExpYear` | `Integer` | Optional | - | Integer getExpYear() | setExpYear(Integer expYear) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `BillingAddress` | [`GetBillingAddressResponse`](../../doc/models/get-billing-address-response.md) | Optional | - | GetBillingAddressResponse getBillingAddress() | setBillingAddress(GetBillingAddressResponse billingAddress) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | - | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Type` | `String` | Optional | Card type | String getType() | setType(String type) |
| `HolderDocument` | `String` | Optional | Document number for the card's holder | String getHolderDocument() | setHolderDocument(String holderDocument) |
| `DeletedAt` | `LocalDateTime` | Optional | - | LocalDateTime getDeletedAt() | setDeletedAt(LocalDateTime deletedAt) |
| `FirstSixDigits` | `String` | Optional | First six digits | String getFirstSixDigits() | setFirstSixDigits(String firstSixDigits) |
| `Label` | `String` | Optional | - | String getLabel() | setLabel(String label) |

## Example (as JSON)

```json
{
  "id": "id4",
  "last_four_digits": "last_four_digits0",
  "brand": "brand8",
  "holder_name": "holder_name0",
  "exp_month": 52
}
```

