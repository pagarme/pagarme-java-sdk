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
    ListOrderResponse result = ordersController.getOrders(null, null, null, null, null, null, null);
    System.out.println(result);
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
    GetOrderItemResponse result = ordersController.getOrderItem(orderId, itemId);
    System.out.println(result);
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
    GetOrderResponse result = ordersController.getOrder(orderId);
    System.out.println(result);
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
UpdateOrderStatusRequest request = new UpdateOrderStatusRequest.Builder(
    "status8"
)
.build();


try {
    GetOrderResponse result = ordersController.closeOrder(id, request, null);
    System.out.println(result);
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
CreateOrderRequest body = new CreateOrderRequest.Builder(
    Arrays.asList(
        new CreateOrderItemRequest.Builder(
            101,
            "description3",
            215,
            "category1"
        )
        .build()
    ),
    new CreateCustomerRequest.Builder(
        "{\\n    \"name\": \"Tony Stark\"\\n}",
        "email2",
        "document2",
        "type6",
        new CreateAddressRequest.Builder(
            "street0",
            "number8",
            "zip_code4",
            "neighborhood6",
            "city0",
            "state6",
            "country4",
            "complement6",
            new LinkedHashMap<String, String>() {{
                put("key0", "metadata7");
                put("key1", "metadata6");
            }},
            "line_16",
            "line_28"
        )
        .build(),
        new LinkedHashMap<String, String>() {{
            put("key0", "metadata9");
            put("key1", "metadata0");
        }},
        new CreatePhonesRequest.Builder()
            .build(),
        "code2"
    )
    .build(),
    Arrays.asList(
        new CreatePaymentRequest.Builder(
            "payment_method0"
        )
        .build()
    ),
    "code4",
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata7");
        put("key1", "metadata8");
    }},
    true
)
.build();


try {
    GetOrderResponse result = ordersController.createOrder(body, null);
    System.out.println(result);
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
UpdateOrderItemRequest request = new UpdateOrderItemRequest.Builder(
    242,
    "description6",
    100,
    "category4"
)
.build();


try {
    GetOrderItemResponse result = ordersController.updateOrderItem(orderId, itemId, request, null);
    System.out.println(result);
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
    GetOrderResponse result = ordersController.deleteAllOrderItems(orderId, null);
    System.out.println(result);
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
UpdateMetadataRequest request = new UpdateMetadataRequest.Builder(
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


try {
    GetOrderResponse result = ordersController.updateOrderMetadata(orderId, request, null);
    System.out.println(result);
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
    GetOrderItemResponse result = ordersController.deleteOrderItem(orderId, itemId, null);
    System.out.println(result);
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
CreateOrderItemRequest request = new CreateOrderItemRequest.Builder(
    242,
    "description6",
    100,
    "category4"
)
.build();


try {
    GetOrderItemResponse result = ordersController.createOrderItem(orderId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

