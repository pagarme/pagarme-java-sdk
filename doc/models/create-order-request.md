
# Create Order Request

Request for creating an order

## Structure

`CreateOrderRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<CreateOrderItemRequest>`](../../doc/models/create-order-item-request.md) | Required | Items | List<CreateOrderItemRequest> getItems() | setItems(List<CreateOrderItemRequest> items) |
| `Customer` | [`CreateCustomerRequest`](../../doc/models/create-customer-request.md) | Required | Customer | CreateCustomerRequest getCustomer() | setCustomer(CreateCustomerRequest customer) |
| `Payments` | [`List<CreatePaymentRequest>`](../../doc/models/create-payment-request.md) | Required | Payment data | List<CreatePaymentRequest> getPayments() | setPayments(List<CreatePaymentRequest> payments) |
| `Code` | `String` | Required | The order code | String getCode() | setCode(String code) |
| `CustomerId` | `String` | Optional | The customer id | String getCustomerId() | setCustomerId(String customerId) |
| `Shipping` | [`CreateShippingRequest`](../../doc/models/create-shipping-request.md) | Optional | Shipping data | CreateShippingRequest getShipping() | setShipping(CreateShippingRequest shipping) |
| `Metadata` | `Map<String, String>` | Required | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `AntifraudEnabled` | `Boolean` | Optional | Defines whether the order will go through anti-fraud | Boolean getAntifraudEnabled() | setAntifraudEnabled(Boolean antifraudEnabled) |
| `Ip` | `String` | Optional | Ip address | String getIp() | setIp(String ip) |
| `SessionId` | `String` | Optional | Session id | String getSessionId() | setSessionId(String sessionId) |
| `Location` | [`CreateLocationRequest`](../../doc/models/create-location-request.md) | Optional | Request's location | CreateLocationRequest getLocation() | setLocation(CreateLocationRequest location) |
| `Device` | [`CreateDeviceRequest`](../../doc/models/create-device-request.md) | Optional | Device's informations | CreateDeviceRequest getDevice() | setDevice(CreateDeviceRequest device) |
| `Closed` | `boolean` | Required | **Default**: `true` | boolean getClosed() | setClosed(boolean closed) |
| `Currency` | `String` | Optional | Currency | String getCurrency() | setCurrency(String currency) |
| `Antifraud` | [`CreateAntifraudRequest`](../../doc/models/create-antifraud-request.md) | Optional | - | CreateAntifraudRequest getAntifraud() | setAntifraud(CreateAntifraudRequest antifraud) |
| `Submerchant` | [`CreateSubMerchantRequest`](../../doc/models/create-sub-merchant-request.md) | Optional | SubMerchant | CreateSubMerchantRequest getSubmerchant() | setSubmerchant(CreateSubMerchantRequest submerchant) |

## Example (as JSON)

```json
{
  "items": null,
  "customer": {
    "name": "{\n    \"name\": \"Tony Stark\"\n}",
    "email": null,
    "document": null,
    "type": null,
    "address": null,
    "metadata": null,
    "phones": null,
    "code": null
  },
  "payments": null,
  "code": null,
  "metadata": null,
  "closed": true
}
```

