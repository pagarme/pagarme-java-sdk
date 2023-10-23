
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
| `Metadata` | `Map<String, String>` | Optional | Metadata | Map<String, String> getMetadata() | setMetadata(Map<String, String> metadata) |
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
  "items": [
    {
      "amount": 164,
      "description": "description2",
      "quantity": 22,
      "category": "category6",
      "code": "code6"
    }
  ],
  "customer": {
    "name": "{\n    \"name\": \"Tony Stark\"\n}",
    "email": "email6",
    "document": "document6",
    "type": "type0",
    "address": {
      "street": "street6",
      "number": "number4",
      "zip_code": "zip_code0",
      "neighborhood": "neighborhood2",
      "city": "city6",
      "state": "state2",
      "country": "country0",
      "complement": "complement2",
      "metadata": {
        "key0": "metadata3",
        "key1": "metadata2",
        "key2": "metadata1"
      },
      "line_1": "line_10",
      "line_2": "line_24"
    },
    "metadata": {
      "key0": "metadata3"
    },
    "phones": {
      "home_phone": {
        "country_code": "country_code0",
        "number": "number2",
        "area_code": "area_code0",
        "Type": "Type0"
      },
      "mobile_phone": {
        "country_code": "country_code0",
        "number": "number8",
        "area_code": "area_code0",
        "Type": "Type0"
      }
    },
    "code": "code8",
    "gender": "gender6",
    "document_type": "document_type8"
  },
  "payments": [
    {
      "payment_method": "payment_method8",
      "credit_card": {
        "installments": 52,
        "statement_descriptor": "statement_descriptor8",
        "card": {
          "number": "number6",
          "holder_name": "holder_name2",
          "exp_month": 228,
          "exp_year": 68,
          "cvv": "cvv4"
        },
        "card_id": "card_id4",
        "card_token": "card_token2"
      },
      "debit_card": {
        "statement_descriptor": "statement_descriptor4",
        "card": {
          "number": "number6",
          "holder_name": "holder_name2",
          "exp_month": 228,
          "exp_year": 68,
          "cvv": "cvv4"
        },
        "card_id": "card_id0",
        "card_token": "card_token6",
        "recurrence": false
      },
      "boleto": {
        "retries": 226,
        "bank": "bank8",
        "instructions": "instructions2",
        "due_at": "2016-03-13T12:52:32.123Z",
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
        "billing_address_id": "billing_address_id6",
        "nosso_numero": "nosso_numero0",
        "document_number": "document_number6",
        "statement_descriptor": "statement_descriptor0",
        "interest": {
          "days": 156,
          "type": "type0",
          "amount": 230
        }
      },
      "currency": "currency2",
      "voucher": {
        "statement_descriptor": "statement_descriptor2",
        "card_id": "card_id8",
        "card_token": "card_token8",
        "Card": {
          "number": "number8",
          "holder_name": "holder_name6",
          "exp_month": 240,
          "exp_year": 56,
          "cvv": "cvv8"
        },
        "recurrency_cycle": "recurrency_cycle6"
      }
    }
  ],
  "code": "code6",
  "closed": true,
  "customer_id": "customer_id6",
  "shipping": {
    "amount": 52,
    "description": "description6",
    "recipient_name": "recipient_name2",
    "recipient_phone": "recipient_phone6",
    "address_id": "address_id6",
    "address": {
      "street": "street6",
      "number": "number4",
      "zip_code": "zip_code0",
      "neighborhood": "neighborhood2",
      "city": "city6",
      "state": "state2",
      "country": "country0",
      "complement": "complement2",
      "metadata": {
        "key0": "metadata3",
        "key1": "metadata2",
        "key2": "metadata1"
      },
      "line_1": "line_10",
      "line_2": "line_24"
    },
    "max_delivery_date": "2016-03-13T12:52:32.123Z",
    "estimated_delivery_date": "2016-03-13T12:52:32.123Z",
    "type": "type6"
  },
  "metadata": {
    "key0": "metadata5"
  },
  "antifraud_enabled": false,
  "ip": "ip2"
}
```

