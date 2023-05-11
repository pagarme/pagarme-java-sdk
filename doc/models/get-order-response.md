
# Get Order Response

Response object for getting an Order

## Structure

`GetOrderResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `Items` | [`List<GetOrderItemResponse>`](../../doc/models/get-order-item-response.md) | Optional | - | List<GetOrderItemResponse> getItems() | setItems(List<GetOrderItemResponse> items) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | - | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Charges` | [`List<GetChargeResponse>`](../../doc/models/get-charge-response.md) | Optional | - | List<GetChargeResponse> getCharges() | setCharges(List<GetChargeResponse> charges) |
| `InvoiceUrl` | `String` | Optional | - | String getInvoiceUrl() | setInvoiceUrl(String invoiceUrl) |
| `Shipping` | [`GetShippingResponse`](../../doc/models/get-shipping-response.md) | Optional | - | GetShippingResponse getShipping() | setShipping(GetShippingResponse shipping) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Checkouts` | [`List<GetCheckoutPaymentResponse>`](../../doc/models/get-checkout-payment-response.md) | Optional | Checkout Payment Settings Response | List<GetCheckoutPaymentResponse> getCheckouts() | setCheckouts(List<GetCheckoutPaymentResponse> checkouts) |
| `Ip` | `String` | Optional | Ip address | String getIp() | setIp(String ip) |
| `SessionId` | `String` | Optional | Session id | String getSessionId() | setSessionId(String sessionId) |
| `Location` | [`GetLocationResponse`](../../doc/models/get-location-response.md) | Optional | Location | GetLocationResponse getLocation() | setLocation(GetLocationResponse location) |
| `Device` | [`GetDeviceResponse`](../../doc/models/get-device-response.md) | Optional | Device's informations | GetDeviceResponse getDevice() | setDevice(GetDeviceResponse device) |
| `Closed` | `Boolean` | Optional | Indicates whether the order is closed | Boolean getClosed() | setClosed(Boolean closed) |

## Example (as JSON)

```json
{
  "id": "id0",
  "code": "code8",
  "currency": "currency0",
  "items": [
    {
      "id": "id7",
      "amount": 13,
      "description": "description7",
      "quantity": 127,
      "category": "category5"
    },
    {
      "id": "id8",
      "amount": 14,
      "description": "description8",
      "quantity": 128,
      "category": "category6"
    }
  ],
  "customer": {
    "id": "id0",
    "name": "name0",
    "email": "email6",
    "delinquent": false,
    "created_at": "2016-03-13T12:52:32.123Z"
  }
}
```

