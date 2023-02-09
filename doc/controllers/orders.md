# Orders

```java
OrdersController ordersController = client.getOrdersController();
```

## Class Name

`OrdersController`

## Methods

* [Get Orders](../../doc/controllers/orders.md#get-orders)
* [Get Order Item](../../doc/controllers/orders.md#get-order-item)
* [Get Order](../../doc/controllers/orders.md#get-order)
* [Close Order](../../doc/controllers/orders.md#close-order)
* [Create Order](../../doc/controllers/orders.md#create-order)
* [Update Order Item](../../doc/controllers/orders.md#update-order-item)
* [Delete All Order Items](../../doc/controllers/orders.md#delete-all-order-items)
* [Update Order Metadata](../../doc/controllers/orders.md#update-order-metadata)
* [Delete Order Item](../../doc/controllers/orders.md#delete-order-item)
* [Create Order Item](../../doc/controllers/orders.md#create-order-item)


# Get Orders

Gets all orders

```java
ListOrderResponse getOrders(
    final Integer page,
    final Integer size,
    final String code,
    final String status,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil,
    final String customerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |
| `code` | `String` | Query, Optional | Filter for order's code |
| `status` | `String` | Query, Optional | Filter for order's status |
| `createdSince` | `LocalDateTime` | Query, Optional | Filter for order's creation date start range |
| `createdUntil` | `LocalDateTime` | Query, Optional | Filter for order's creation date end range |
| `customerId` | `String` | Query, Optional | Filter for order's customer id |

## Response Type

[`ListOrderResponse`](../../doc/models/list-order-response.md)

## Example Usage

```java
try {
    ListOrderResponse response = ordersController.getOrders(null, null, null, null, null, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Order Item

```java
GetOrderItemResponse getOrderItem(
    final String orderId,
    final String itemId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order Id |
| `itemId` | `String` | Template, Required | Item Id |

## Response Type

[`GetOrderItemResponse`](../../doc/models/get-order-item-response.md)

## Example Usage

```java
String orderId = "orderId2";
String itemId = "itemId8";

try {
    GetOrderItemResponse response = ordersController.getOrderItem(orderId, itemId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Order

Gets an order

```java
GetOrderResponse getOrder(
    final String orderId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order id |

## Response Type

[`GetOrderResponse`](../../doc/models/get-order-response.md)

## Example Usage

```java
String orderId = "order_id6";

try {
    GetOrderResponse response = ordersController.getOrder(orderId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Close Order

```java
GetOrderResponse closeOrder(
    final String id,
    final UpdateOrderStatusRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Order Id |
| `request` | [`UpdateOrderStatusRequest`](../../doc/models/update-order-status-request.md) | Body, Required | Update Order Model |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetOrderResponse`](../../doc/models/get-order-response.md)

## Example Usage

```java
String id = "id0";
UpdateOrderStatusRequest request = new UpdateOrderStatusRequest();
request.setStatus("status8");


try {
    GetOrderResponse response = ordersController.closeOrder(id, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Order

Creates a new Order

```java
GetOrderResponse createOrder(
    final CreateOrderRequest body,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateOrderRequest`](../../doc/models/create-order-request.md) | Body, Required | Request for creating an order |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetOrderResponse`](../../doc/models/get-order-response.md)

## Example Usage

```java
CreateOrderRequest body = new CreateOrderRequest();
List<CreateOrderItemRequest> items = new LinkedList<>();
CreateOrderItemRequest items0 = new CreateOrderItemRequest();
items0.setAmount(101);
items0.setDescription("description3");
items0.setQuantity(215);
items0.setCategory("category1");

items.add(items0);
CreateOrderItemRequest items1 = new CreateOrderItemRequest();
items1.setAmount(102);
items1.setDescription("description4");
items1.setQuantity(216);
items1.setCategory("category2");

items.add(items1);
CreateOrderItemRequest items2 = new CreateOrderItemRequest();
items2.setAmount(103);
items2.setDescription("description5");
items2.setQuantity(217);
items2.setCategory("category3");

items.add(items2);

body.setItems(items);
CreateCustomerRequest customer = new CreateCustomerRequest();
customer.setName("{\\n    \"name\": \"Tony Stark\"\\n}");
customer.setEmail("email2");
customer.setDocument("document2");
customer.setType("type6");
CreateAddressRequest address = new CreateAddressRequest();
address.setStreet("street0");
address.setNumber("number8");
address.setZipCode("zip_code4");
address.setNeighborhood("neighborhood6");
address.setCity("city0");
address.setState("state6");
address.setCountry("country4");
address.setComplement("complement6");
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata7");
metadata.put("key1", "metadata6");

address.setMetadata(metadata);
address.setLine1("line_16");
address.setLine2("line_28");

customer.setAddress(address);
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata9");
metadata.put("key1", "metadata0");

customer.setMetadata(metadata);
CreatePhonesRequest phones = new CreatePhonesRequest();

customer.setPhones(phones);
customer.setCode("code2");

body.setCustomer(customer);
List<CreatePaymentRequest> payments = new LinkedList<>();
CreatePaymentRequest payments0 = new CreatePaymentRequest();
payments0.setPaymentMethod("payment_method0");

payments.add(payments0);
CreatePaymentRequest payments1 = new CreatePaymentRequest();
payments1.setPaymentMethod("payment_method9");

payments.add(payments1);

body.setPayments(payments);
body.setCode("code4");
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata7");
metadata.put("key1", "metadata8");

body.setMetadata(metadata);
body.setClosed(true);


try {
    GetOrderResponse response = ordersController.createOrder(body, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Order Item

```java
GetOrderItemResponse updateOrderItem(
    final String orderId,
    final String itemId,
    final UpdateOrderItemRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order Id |
| `itemId` | `String` | Template, Required | Item Id |
| `request` | [`UpdateOrderItemRequest`](../../doc/models/update-order-item-request.md) | Body, Required | Item Model |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetOrderItemResponse`](../../doc/models/get-order-item-response.md)

## Example Usage

```java
String orderId = "orderId2";
String itemId = "itemId8";
UpdateOrderItemRequest request = new UpdateOrderItemRequest();
request.setAmount(242);
request.setDescription("description6");
request.setQuantity(100);
request.setCategory("category4");


try {
    GetOrderItemResponse response = ordersController.updateOrderItem(orderId, itemId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete All Order Items

```java
GetOrderResponse deleteAllOrderItems(
    final String orderId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetOrderResponse`](../../doc/models/get-order-response.md)

## Example Usage

```java
String orderId = "orderId2";

try {
    GetOrderResponse response = ordersController.deleteAllOrderItems(orderId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Order Metadata

Updates the metadata from an order

```java
GetOrderResponse updateOrderMetadata(
    final String orderId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | The order id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Request for updating the order metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetOrderResponse`](../../doc/models/get-order-response.md)

## Example Usage

```java
String orderId = "order_id6";
UpdateMetadataRequest request = new UpdateMetadataRequest();
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");

request.setMetadata(metadata);


try {
    GetOrderResponse response = ordersController.updateOrderMetadata(orderId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Order Item

```java
GetOrderItemResponse deleteOrderItem(
    final String orderId,
    final String itemId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order Id |
| `itemId` | `String` | Template, Required | Item Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetOrderItemResponse`](../../doc/models/get-order-item-response.md)

## Example Usage

```java
String orderId = "orderId2";
String itemId = "itemId8";

try {
    GetOrderItemResponse response = ordersController.deleteOrderItem(orderId, itemId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Order Item

```java
GetOrderItemResponse createOrderItem(
    final String orderId,
    final CreateOrderItemRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order Id |
| `request` | [`CreateOrderItemRequest`](../../doc/models/create-order-item-request.md) | Body, Required | Order Item Model |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetOrderItemResponse`](../../doc/models/get-order-item-response.md)

## Example Usage

```java
String orderId = "orderId2";
CreateOrderItemRequest request = new CreateOrderItemRequest();
request.setAmount(242);
request.setDescription("description6");
request.setQuantity(100);
request.setCategory("category4");


try {
    GetOrderItemResponse response = ordersController.createOrderItem(orderId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

