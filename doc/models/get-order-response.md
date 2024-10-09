
# Get Order Response

Response object for getting an Order

## Structure

`GetOrderResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Code` | `String` | Optional | - | String getCode() | setCode(String code) |
| `Amount` | `Integer` | Optional | - | Integer getAmount() | setAmount(Integer amount) |
| `Currency` | `String` | Optional | - | String getCurrency() | setCurrency(String currency) |
| `Closed` | `Boolean` | Optional | Indicates whether the order is closed | Boolean getClosed() | setClosed(Boolean closed) |
| `Items` | [`List<GetOrderItemResponse>`](../../doc/models/get-order-item-response.md) | Optional | - | List<GetOrderItemResponse> getItems() | setItems(List<GetOrderItemResponse> items) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | - | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Optional | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `ClosedAt` | `LocalDateTime` | Optional | - | LocalDateTime getClosedAt() | setClosedAt(LocalDateTime closedAt) |
| `Charges` | [`List<GetChargeResponse>`](../../doc/models/get-charge-response.md) | Optional | - | List<GetChargeResponse> getCharges() | setCharges(List<GetChargeResponse> charges) |
| `InvoiceUrl` | `String` | Optional | - | String getInvoiceUrl() | setInvoiceUrl(String invoiceUrl) |
| `Shipping` | [`GetShippingResponse`](../../doc/models/get-shipping-response.md) | Optional | - | GetShippingResponse getShipping() | setShipping(GetShippingResponse shipping) |
| `Metadata` | `Map<String, String>` | Optional | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Checkouts` | [`List<GetCheckoutPaymentResponse>`](../../doc/models/get-checkout-payment-response.md) | Optional | Checkout Payment Settings Response | List<GetCheckoutPaymentResponse> getCheckouts() | setCheckouts(List<GetCheckoutPaymentResponse> checkouts) |
| `Ip` | `String` | Optional | Ip address | String getIp() | setIp(String ip) |
| `SessionId` | `String` | Optional | Session id | String getSessionId() | setSessionId(String sessionId) |
| `Location` | [`GetLocationResponse`](../../doc/models/get-location-response.md) | Optional | Location | GetLocationResponse getLocation() | setLocation(GetLocationResponse location) |
| `Device` | [`GetDeviceResponse`](../../doc/models/get-device-response.md) | Optional | Device's informations | GetDeviceResponse getDevice() | setDevice(GetDeviceResponse device) |
| `Integration` | [`GetIntegrationResponse`](../../doc/models/get-integration-response.md) | Optional | - | GetIntegrationResponse getIntegration() | setIntegration(GetIntegrationResponse integration) |

## Example (as JSON)

```json
{
  "id": "id6",
  "code": "code4",
  "amount": 64,
  "currency": "currency6",
  "closed": false
}
```

