
# Get Order Response

Response object for getting an Order

## Structure

`GetOrderResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | - | String getId() | setId(String id) |
| `Code` | `String` | Required | - | String getCode() | setCode(String code) |
| `Currency` | `String` | Required | - | String getCurrency() | setCurrency(String currency) |
| `Items` | [`List<GetOrderItemResponse>`](../../doc/models/get-order-item-response.md) | Required | - | List<GetOrderItemResponse> getItems() | setItems(List<GetOrderItemResponse> items) |
| `Customer` | [`GetCustomerResponse`](../../doc/models/get-customer-response.md) | Optional | - | GetCustomerResponse getCustomer() | setCustomer(GetCustomerResponse customer) |
| `Status` | `String` | Required | - | String getStatus() | setStatus(String status) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |
| `Charges` | [`List<GetChargeResponse>`](../../doc/models/get-charge-response.md) | Required | - | List<GetChargeResponse> getCharges() | setCharges(List<GetChargeResponse> charges) |
| `InvoiceUrl` | `String` | Required | - | String getInvoiceUrl() | setInvoiceUrl(String invoiceUrl) |
| `Shipping` | [`GetShippingResponse`](../../doc/models/get-shipping-response.md) | Required | - | GetShippingResponse getShipping() | setShipping(GetShippingResponse shipping) |
| `Metadata` | `Map<String, String>` | Required | - | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
| `Checkouts` | [`List<GetCheckoutPaymentResponse>`](../../doc/models/get-checkout-payment-response.md) | Optional | Checkout Payment Settings Response | List<GetCheckoutPaymentResponse> getCheckouts() | setCheckouts(List<GetCheckoutPaymentResponse> checkouts) |
| `Ip` | `String` | Optional | Ip address | String getIp() | setIp(String ip) |
| `SessionId` | `String` | Optional | Session id | String getSessionId() | setSessionId(String sessionId) |
| `Location` | [`GetLocationResponse`](../../doc/models/get-location-response.md) | Optional | Location | GetLocationResponse getLocation() | setLocation(GetLocationResponse location) |
| `Device` | [`GetDeviceResponse`](../../doc/models/get-device-response.md) | Optional | Device's informations | GetDeviceResponse getDevice() | setDevice(GetDeviceResponse device) |
| `Closed` | `boolean` | Required | Indicates whether the order is closed | boolean getClosed() | setClosed(boolean closed) |

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
      "category": "category5",
      "code": "code5"
    },
    {
      "id": "id8",
      "amount": 14,
      "description": "description8",
      "quantity": 128,
      "category": "category6",
      "code": "code6"
    }
  ],
  "customer": null,
  "status": "status8",
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z",
  "charges": [
    {
      "id": "id8",
      "code": "code6",
      "gateway_id": "gateway_id2",
      "amount": 42,
      "status": "status0",
      "currency": "currency2",
      "payment_method": "payment_method2",
      "due_at": "2016-03-13T12:52:32.123Z",
      "created_at": "2016-03-13T12:52:32.123Z",
      "updated_at": "2016-03-13T12:52:32.123Z",
      "last_transaction": null,
      "invoice": null,
      "order": null,
      "customer": null,
      "metadata": {
        "key0": "metadata5"
      },
      "paid_at": null,
      "canceled_at": null,
      "canceled_amount": 152,
      "paid_amount": 122
    },
    {
      "id": "id9",
      "code": "code7",
      "gateway_id": "gateway_id1",
      "amount": 43,
      "status": "status9",
      "currency": "currency1",
      "payment_method": "payment_method1",
      "due_at": "2016-03-13T12:52:32.123Z",
      "created_at": "2016-03-13T12:52:32.123Z",
      "updated_at": "2016-03-13T12:52:32.123Z",
      "last_transaction": null,
      "invoice": null,
      "order": null,
      "customer": null,
      "metadata": {
        "key0": "metadata4",
        "key1": "metadata5",
        "key2": "metadata6"
      },
      "paid_at": null,
      "canceled_at": null,
      "canceled_amount": 153,
      "paid_amount": 121
    }
  ],
  "invoice_url": "invoice_url2",
  "shipping": {
    "amount": 52,
    "description": "description6",
    "recipient_name": "recipient_name2",
    "recipient_phone": "recipient_phone6",
    "address": {
      "id": "id0",
      "street": "street0",
      "number": "number8",
      "complement": "complement6",
      "zip_code": "zip_code4",
      "neighborhood": "neighborhood6",
      "city": "city0",
      "state": "state6",
      "country": "country4",
      "status": "status2",
      "created_at": "2016-03-13T12:52:32.123Z",
      "updated_at": "2016-03-13T12:52:32.123Z",
      "customer": null,
      "metadata": {
        "key0": "metadata7"
      },
      "line_1": "line_14",
      "line_2": "line_28",
      "deleted_at": null
    },
    "max_delivery_date": null,
    "estimated_delivery_date": null,
    "type": "type6"
  },
  "metadata": {
    "key0": "metadata3",
    "key1": "metadata4",
    "key2": "metadata5"
  },
  "checkouts": null,
  "ip": null,
  "session_id": null,
  "location": null,
  "device": null,
  "closed": false
}
```

