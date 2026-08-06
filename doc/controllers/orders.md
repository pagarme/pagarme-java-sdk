# Orders

```java
OrdersController ordersController = client.getOrdersController();
```

## Class Name

`OrdersController`

## Methods

* [Close Order](../../doc/controllers/orders.md#close-order)
* [Create Order](../../doc/controllers/orders.md#create-order)
* [Create Order Item](../../doc/controllers/orders.md#create-order-item)
* [Delete All Order Items](../../doc/controllers/orders.md#delete-all-order-items)
* [Delete Order Item](../../doc/controllers/orders.md#delete-order-item)
* [Get Order](../../doc/controllers/orders.md#get-order)
* [Get Order Item](../../doc/controllers/orders.md#get-order-item)
* [Get Orders](../../doc/controllers/orders.md#get-orders)
* [Update Order Item](../../doc/controllers/orders.md#update-order-item)
* [Update Order Metadata](../../doc/controllers/orders.md#update-order-metadata)


# Close Order

```java
CompletableFuture<GetOrderResponse> closeOrderAsync(
    final String id,
    final UpdateOrderStatusRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Order Id |
| `request` | [`UpdateOrderStatusRequest`](../../doc/models/update-order-status-request.md) | Body, Required | Update Order Model |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetOrderResponse`](../../doc/models/get-order-response.md)

## Example Usage

```java
String id = "id0";
UpdateOrderStatusRequest request = new UpdateOrderStatusRequest.Builder(
    "status8"
)
.build();


ordersController.closeOrderAsync(id, request, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```


# Create Order

Creates a new Order

```java
CompletableFuture<GetOrderResponse> createOrderAsync(
    final CreateOrderRequest body,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateOrderRequest`](../../doc/models/create-order-request.md) | Body, Required | Request for creating an order |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetOrderResponse`](../../doc/models/get-order-response.md)

## Example Usage

```java
CreateOrderRequest body = new CreateOrderRequest.Builder(
    Arrays.asList(
        null
    ),
    new CreateCustomerRequest.Builder(
        "Tony Stark",
        null,
        null,
        null,
        null,
        null,
        null,
        null
    )
    .build(),
    Arrays.asList(
        null
    ),
    null,
    true
)
.build();


ordersController.createOrderAsync(body, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```


# Create Order Item

```java
CompletableFuture<GetOrderItemResponse> createOrderItemAsync(
    final String orderId,
    final CreateOrderItemRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order Id |
| `request` | [`CreateOrderItemRequest`](../../doc/models/create-order-item-request.md) | Body, Required | Order Item Model |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

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


ordersController.createOrderItemAsync(orderId, request, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```


# Delete All Order Items

```java
CompletableFuture<GetOrderResponse> deleteAllOrderItemsAsync(
    final String orderId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetOrderResponse`](../../doc/models/get-order-response.md)

## Example Usage

```java
String orderId = "orderId2";

ordersController.deleteAllOrderItemsAsync(orderId, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```


# Delete Order Item

```java
CompletableFuture<GetOrderItemResponse> deleteOrderItemAsync(
    final String orderId,
    final String itemId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order Id |
| `itemId` | `String` | Template, Required | Item Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetOrderItemResponse`](../../doc/models/get-order-item-response.md)

## Example Usage

```java
String orderId = "orderId2";
String itemId = "itemId8";

ordersController.deleteOrderItemAsync(orderId, itemId, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```


# Get Order

Gets an order

```java
CompletableFuture<GetOrderResponse> getOrderAsync(
    final String orderId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order id |

## Response Type

**200**

[`GetOrderResponse`](../../doc/models/get-order-response.md)

## Example Usage

```java
String orderId = "order_id6";

ordersController.getOrderAsync(orderId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```


# Get Order Item

```java
CompletableFuture<GetOrderItemResponse> getOrderItemAsync(
    final String orderId,
    final String itemId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order Id |
| `itemId` | `String` | Template, Required | Item Id |

## Response Type

**200**

[`GetOrderItemResponse`](../../doc/models/get-order-item-response.md)

## Example Usage

```java
String orderId = "orderId2";
String itemId = "itemId8";

ordersController.getOrderItemAsync(orderId, itemId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```


# Get Orders

Gets all orders

```java
CompletableFuture<ListOrderResponse> getOrdersAsync(
    final Integer page,
    final Integer size,
    final String code,
    final String status,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil,
    final String customerId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

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

**200**

[`ListOrderResponse`](../../doc/models/list-order-response.md)

## Example Usage

```java
ordersController.getOrdersAsync(null, null, null, null, null, null, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```


# Update Order Item

```java
CompletableFuture<GetOrderItemResponse> updateOrderItemAsync(
    final String orderId,
    final String itemId,
    final UpdateOrderItemRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | Order Id |
| `itemId` | `String` | Template, Required | Item Id |
| `request` | [`UpdateOrderItemRequest`](../../doc/models/update-order-item-request.md) | Body, Required | Item Model |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

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


ordersController.updateOrderItemAsync(orderId, itemId, request, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```


# Update Order Metadata

Updates the metadata from an order

```java
CompletableFuture<GetOrderResponse> updateOrderMetadataAsync(
    final String orderId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `orderId` | `String` | Template, Required | The order id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Request for updating the order metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

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


ordersController.updateOrderMetadataAsync(orderId, request, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ErrorException) {
        ErrorException errorException = (ErrorException) cause;
        errorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

