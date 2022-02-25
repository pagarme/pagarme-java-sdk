# Orders

```java
OrdersController ordersController = client.getOrdersController();
```

## Class Name

`OrdersController`

## Methods

* [Get Orders](/doc/controllers/orders.md#get-orders)
* [Get Order Item](/doc/controllers/orders.md#get-order-item)
* [Get Order](/doc/controllers/orders.md#get-order)
* [Close Order](/doc/controllers/orders.md#close-order)
* [Create Order](/doc/controllers/orders.md#create-order)
* [Update Order Item](/doc/controllers/orders.md#update-order-item)
* [Delete All Order Items](/doc/controllers/orders.md#delete-all-order-items)
* [Update Order Metadata](/doc/controllers/orders.md#update-order-metadata)
* [Delete Order Item](/doc/controllers/orders.md#delete-order-item)
* [Create Order Item](/doc/controllers/orders.md#create-order-item)


# Get Orders

Gets all orders

```java
CompletableFuture<ListOrderResponse> getOrders(
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

[`ListOrderResponse`](/doc/models/list-order-response.md)

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
CompletableFuture<GetOrderItemResponse> getOrderItem(
    final String orderId,
    final String itemId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order Id |
| `itemId` | `String` | Template, Required | Item Id |

## Response Type

[`GetOrderItemResponse`](/doc/models/get-order-item-response.md)

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
CompletableFuture<GetOrderResponse> getOrder(
    final String orderId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order id |

## Response Type

[`GetOrderResponse`](/doc/models/get-order-response.md)

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
CompletableFuture<GetOrderResponse> closeOrder(
    final String id,
    final UpdateOrderStatusRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Order Id |
| `request` | [`UpdateOrderStatusRequest`](/doc/models/update-order-status-request.md) | Body, Required | Update Order Model |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetOrderResponse`](/doc/models/get-order-response.md)

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
CompletableFuture<GetOrderResponse> createOrder(
    final CreateOrderRequest body,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateOrderRequest`](/doc/models/create-order-request.md) | Body, Required | Request for creating an order |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetOrderResponse`](/doc/models/get-order-response.md)

## Example Usage

```java
CreateOrderRequest body = new CreateOrderRequest();
body.setItems(new LinkedList<>());

CreateOrderItemRequest bodyItems0 = new CreateOrderItemRequest();
bodyItems0.setAmount(101);
bodyItems0.setDescription("description3");
bodyItems0.setQuantity(215);
bodyItems0.setCategory("category1");
body.getItems().add(bodyItems0);

CreateOrderItemRequest bodyItems1 = new CreateOrderItemRequest();
bodyItems1.setAmount(102);
bodyItems1.setDescription("description4");
bodyItems1.setQuantity(216);
bodyItems1.setCategory("category2");
body.getItems().add(bodyItems1);

CreateOrderItemRequest bodyItems2 = new CreateOrderItemRequest();
bodyItems2.setAmount(103);
bodyItems2.setDescription("description5");
bodyItems2.setQuantity(217);
bodyItems2.setCategory("category3");
body.getItems().add(bodyItems2);

body.setCustomer(new CreateCustomerRequest());
body.getCustomer().setName("{\\n    \"name\": \"Tony Stark\"\\n}");
body.getCustomer().setEmail("email2");
body.getCustomer().setDocument("document2");
body.getCustomer().setType("type6");
body.getCustomer().setAddress(new CreateAddressRequest());
body.getCustomer().getAddress().setStreet("street0");
body.getCustomer().getAddress().setNumber("number8");
body.getCustomer().getAddress().setZipCode("zip_code4");
body.getCustomer().getAddress().setNeighborhood("neighborhood6");
body.getCustomer().getAddress().setCity("city0");
body.getCustomer().getAddress().setState("state6");
body.getCustomer().getAddress().setCountry("country4");
body.getCustomer().getAddress().setComplement("complement6");
body.getCustomer().getAddress().setMetadata(new LinkedHashMap<>());
body.getCustomer().getAddress().getMetadata().put("key0", "metadata7");
body.getCustomer().getAddress().getMetadata().put("key1", "metadata6");
body.getCustomer().getAddress().setLine1("line_16");
body.getCustomer().getAddress().setLine2("line_28");
body.getCustomer().setMetadata(new LinkedHashMap<>());
body.getCustomer().getMetadata().put("key0", "metadata9");
body.getCustomer().getMetadata().put("key1", "metadata0");
body.getCustomer().setPhones(new CreatePhonesRequest());
body.getCustomer().setCode("code2");
body.setPayments(new LinkedList<>());

CreatePaymentRequest bodyPayments0 = new CreatePaymentRequest();
bodyPayments0.setPaymentMethod("payment_method0");
bodyPayments0.setPrivateLabel(new CreatePrivateLabelPaymentRequest());
body.getPayments().add(bodyPayments0);

CreatePaymentRequest bodyPayments1 = new CreatePaymentRequest();
bodyPayments1.setPaymentMethod("payment_method9");
bodyPayments1.setPrivateLabel(new CreatePrivateLabelPaymentRequest());
body.getPayments().add(bodyPayments1);

body.setCode("code4");
body.setCustomerId("customer_id4");
body.setMetadata(new LinkedHashMap<>());
body.getMetadata().put("key0", "metadata7");
body.getMetadata().put("key1", "metadata8");
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
CompletableFuture<GetOrderItemResponse> updateOrderItem(
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
| `request` | [`UpdateOrderItemRequest`](/doc/models/update-order-item-request.md) | Body, Required | Item Model |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetOrderItemResponse`](/doc/models/get-order-item-response.md)

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
CompletableFuture<GetOrderResponse> deleteAllOrderItems(
    final String orderId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetOrderResponse`](/doc/models/get-order-response.md)

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
CompletableFuture<GetOrderResponse> updateOrderMetadata(
    final String orderId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | The order id |
| `request` | [`UpdateMetadataRequest`](/doc/models/update-metadata-request.md) | Body, Required | Request for updating the order metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetOrderResponse`](/doc/models/get-order-response.md)

## Example Usage

```java
String orderId = "order_id6";
UpdateMetadataRequest request = new UpdateMetadataRequest();
request.setMetadata(new LinkedHashMap<>());
request.getMetadata().put("key0", "metadata3");

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
CompletableFuture<GetOrderItemResponse> deleteOrderItem(
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

[`GetOrderItemResponse`](/doc/models/get-order-item-response.md)

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
CompletableFuture<GetOrderItemResponse> createOrderItem(
    final String orderId,
    final CreateOrderItemRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order Id |
| `request` | [`CreateOrderItemRequest`](/doc/models/create-order-item-request.md) | Body, Required | Order Item Model |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetOrderItemResponse`](/doc/models/get-order-item-response.md)

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

