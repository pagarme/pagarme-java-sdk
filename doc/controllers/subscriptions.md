# Subscriptions

```java
SubscriptionsController subscriptionsController = client.getSubscriptionsController();
```

## Class Name

`SubscriptionsController`

## Methods

* [Cancel Subscription](../../doc/controllers/subscriptions.md#cancel-subscription)
* [Create an Usage](../../doc/controllers/subscriptions.md#create-an-usage)
* [Create Discount](../../doc/controllers/subscriptions.md#create-discount)
* [Create Increment](../../doc/controllers/subscriptions.md#create-increment)
* [Create Subscription](../../doc/controllers/subscriptions.md#create-subscription)
* [Create Subscription Item](../../doc/controllers/subscriptions.md#create-subscription-item)
* [Create Usage](../../doc/controllers/subscriptions.md#create-usage)
* [Delete Discount](../../doc/controllers/subscriptions.md#delete-discount)
* [Delete Increment](../../doc/controllers/subscriptions.md#delete-increment)
* [Delete Subscription Item](../../doc/controllers/subscriptions.md#delete-subscription-item)
* [Delete Usage](../../doc/controllers/subscriptions.md#delete-usage)
* [Get Discount by Id](../../doc/controllers/subscriptions.md#get-discount-by-id)
* [Get Discounts](../../doc/controllers/subscriptions.md#get-discounts)
* [Get Increment by Id](../../doc/controllers/subscriptions.md#get-increment-by-id)
* [Get Increments](../../doc/controllers/subscriptions.md#get-increments)
* [Get Subscription](../../doc/controllers/subscriptions.md#get-subscription)
* [Get Subscription Cycle by Id](../../doc/controllers/subscriptions.md#get-subscription-cycle-by-id)
* [Get Subscription Cycles](../../doc/controllers/subscriptions.md#get-subscription-cycles)
* [Get Subscription Item](../../doc/controllers/subscriptions.md#get-subscription-item)
* [Get Subscription Items](../../doc/controllers/subscriptions.md#get-subscription-items)
* [Get Subscriptions](../../doc/controllers/subscriptions.md#get-subscriptions)
* [Get Usage Report](../../doc/controllers/subscriptions.md#get-usage-report)
* [Get Usages](../../doc/controllers/subscriptions.md#get-usages)
* [Renew Subscription](../../doc/controllers/subscriptions.md#renew-subscription)
* [Update Current Cycle Status](../../doc/controllers/subscriptions.md#update-current-cycle-status)
* [Update Latest Period End At](../../doc/controllers/subscriptions.md#update-latest-period-end-at)
* [Update Split Subscription](../../doc/controllers/subscriptions.md#update-split-subscription)
* [Update Subscription Affiliation Id](../../doc/controllers/subscriptions.md#update-subscription-affiliation-id)
* [Update Subscription Billing Date](../../doc/controllers/subscriptions.md#update-subscription-billing-date)
* [Update Subscription Card](../../doc/controllers/subscriptions.md#update-subscription-card)
* [Update Subscription Due Days](../../doc/controllers/subscriptions.md#update-subscription-due-days)
* [Update Subscription Item](../../doc/controllers/subscriptions.md#update-subscription-item)
* [Update Subscription Metadata](../../doc/controllers/subscriptions.md#update-subscription-metadata)
* [Update Subscription Minium Price](../../doc/controllers/subscriptions.md#update-subscription-minium-price)
* [Update Subscription Payment Method](../../doc/controllers/subscriptions.md#update-subscription-payment-method)
* [Update Subscription Start At](../../doc/controllers/subscriptions.md#update-subscription-start-at)


# Cancel Subscription

Cancels a subscription

```java
CompletableFuture<GetSubscriptionResponse> cancelSubscriptionAsync(
    final String subscriptionId,
    final CreateCancelSubscriptionRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`CreateCancelSubscriptionRequest`](../../doc/models/create-cancel-subscription-request.md) | Body, Optional | Request for cancelling a subscription |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
CreateCancelSubscriptionRequest request = new CreateCancelSubscriptionRequest.Builder(
    true
)
.build();


subscriptionsController.cancelSubscriptionAsync(subscriptionId, request, null).thenAccept(result -> {
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


# Create an Usage

Create Usage

```java
CompletableFuture<GetUsageResponse> createAnUsageAsync(
    final String subscriptionId,
    final String itemId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `itemId` | `String` | Template, Required | Item id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetUsageResponse`](../../doc/models/get-usage-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String itemId = "item_id0";

subscriptionsController.createAnUsageAsync(subscriptionId, itemId, null).thenAccept(result -> {
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


# Create Discount

Creates a discount

```java
CompletableFuture<GetDiscountResponse> createDiscountAsync(
    final String subscriptionId,
    final CreateDiscountRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`CreateDiscountRequest`](../../doc/models/create-discount-request.md) | Body, Required | Request for creating a discount |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetDiscountResponse`](../../doc/models/get-discount-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
CreateDiscountRequest request = new CreateDiscountRequest.Builder(
    185.28D,
    "discount_type4",
    "item_id6"
)
.build();


subscriptionsController.createDiscountAsync(subscriptionId, request, null).thenAccept(result -> {
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


# Create Increment

Creates a increment

```java
CompletableFuture<GetIncrementResponse> createIncrementAsync(
    final String subscriptionId,
    final CreateIncrementRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`CreateIncrementRequest`](../../doc/models/create-increment-request.md) | Body, Required | Request for creating a increment |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetIncrementResponse`](../../doc/models/get-increment-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
CreateIncrementRequest request = new CreateIncrementRequest.Builder(
    185.28D,
    "increment_type8",
    "item_id6"
)
.build();


subscriptionsController.createIncrementAsync(subscriptionId, request, null).thenAccept(result -> {
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


# Create Subscription

Creates a new subscription

```java
CompletableFuture<GetSubscriptionResponse> createSubscriptionAsync(
    final CreateSubscriptionRequest body,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateSubscriptionRequest`](../../doc/models/create-subscription-request.md) | Body, Required | Request for creating a subscription |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
CreateSubscriptionRequest body = new CreateSubscriptionRequest.Builder(
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
    new CreateCardRequest.Builder()
        .type("credit")
        .build(),
    null,
    null,
    null,
    null,
    null,
    null,
    null,
    0,
    null,
    Arrays.asList(
        new CreateSubscriptionItemRequest.Builder(
            null,
            null,
            null,
            null,
            Arrays.asList(
                null
            ),
            null
        )
        .build()
    ),
    null,
    Arrays.asList(
        null
    ),
    null,
    Arrays.asList(
        null
    )
)
.build();


subscriptionsController.createSubscriptionAsync(body, null).thenAccept(result -> {
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


# Create Subscription Item

Creates a new Subscription item

```java
CompletableFuture<GetSubscriptionItemResponse> createSubscriptionItemAsync(
    final String subscriptionId,
    final CreateSubscriptionItemRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`CreateSubscriptionItemRequest`](../../doc/models/create-subscription-item-request.md) | Body, Required | Request for creating a subscription item |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionItemResponse`](../../doc/models/get-subscription-item-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
CreateSubscriptionItemRequest request = new CreateSubscriptionItemRequest.Builder(
    null,
    null,
    null,
    null,
    Arrays.asList(
        null
    ),
    null
)
.build();


subscriptionsController.createSubscriptionItemAsync(subscriptionId, request, null).thenAccept(result -> {
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


# Create Usage

Creates a usage

```java
CompletableFuture<GetUsageResponse> createUsageAsync(
    final String subscriptionId,
    final String itemId,
    final CreateUsageRequest body,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `itemId` | `String` | Template, Required | Item id |
| `body` | [`CreateUsageRequest`](../../doc/models/create-usage-request.md) | Body, Required | Request for creating a usage |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetUsageResponse`](../../doc/models/get-usage-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String itemId = "item_id0";
CreateUsageRequest body = new CreateUsageRequest.Builder(
    156,
    "description4",
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();


subscriptionsController.createUsageAsync(subscriptionId, itemId, body, null).thenAccept(result -> {
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


# Delete Discount

Deletes a discount

```java
CompletableFuture<GetDiscountResponse> deleteDiscountAsync(
    final String subscriptionId,
    final String discountId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `discountId` | `String` | Template, Required | Discount Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetDiscountResponse`](../../doc/models/get-discount-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String discountId = "discount_id8";

subscriptionsController.deleteDiscountAsync(subscriptionId, discountId, null).thenAccept(result -> {
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


# Delete Increment

Deletes a increment

```java
CompletableFuture<GetIncrementResponse> deleteIncrementAsync(
    final String subscriptionId,
    final String incrementId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `incrementId` | `String` | Template, Required | Increment id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetIncrementResponse`](../../doc/models/get-increment-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String incrementId = "increment_id8";

subscriptionsController.deleteIncrementAsync(subscriptionId, incrementId, null).thenAccept(result -> {
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


# Delete Subscription Item

Deletes a subscription item

```java
CompletableFuture<GetSubscriptionItemResponse> deleteSubscriptionItemAsync(
    final String subscriptionId,
    final String subscriptionItemId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `subscriptionItemId` | `String` | Template, Required | Subscription item id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionItemResponse`](../../doc/models/get-subscription-item-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String subscriptionItemId = "subscription_item_id4";

subscriptionsController.deleteSubscriptionItemAsync(subscriptionId, subscriptionItemId, null).thenAccept(result -> {
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


# Delete Usage

Deletes a usage

```java
CompletableFuture<GetUsageResponse> deleteUsageAsync(
    final String subscriptionId,
    final String itemId,
    final String usageId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `itemId` | `String` | Template, Required | The subscription item id |
| `usageId` | `String` | Template, Required | The usage id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetUsageResponse`](../../doc/models/get-usage-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String itemId = "item_id0";
String usageId = "usage_id0";

subscriptionsController.deleteUsageAsync(subscriptionId, itemId, usageId, null).thenAccept(result -> {
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


# Get Discount by Id

```java
CompletableFuture<GetDiscountResponse> getDiscountByIdAsync(
    final String subscriptionId,
    final String discountId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `discountId` | `String` | Template, Required | - |

## Response Type

**200**

[`GetDiscountResponse`](../../doc/models/get-discount-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String discountId = "discountId0";

subscriptionsController.getDiscountByIdAsync(subscriptionId, discountId).thenAccept(result -> {
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


# Get Discounts

```java
CompletableFuture<ListDiscountsResponse> getDiscountsAsync(
    final String subscriptionId,
    final int page,
    final int size)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `page` | `int` | Query, Required | Page number |
| `size` | `int` | Query, Required | Page size |

## Response Type

**200**

[`ListDiscountsResponse`](../../doc/models/list-discounts-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
int page = 30;
int size = 18;

subscriptionsController.getDiscountsAsync(subscriptionId, page, size).thenAccept(result -> {
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


# Get Increment by Id

```java
CompletableFuture<GetIncrementResponse> getIncrementByIdAsync(
    final String subscriptionId,
    final String incrementId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription Id |
| `incrementId` | `String` | Template, Required | The increment Id |

## Response Type

**200**

[`GetIncrementResponse`](../../doc/models/get-increment-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String incrementId = "increment_id8";

subscriptionsController.getIncrementByIdAsync(subscriptionId, incrementId).thenAccept(result -> {
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


# Get Increments

```java
CompletableFuture<ListIncrementsResponse> getIncrementsAsync(
    final String subscriptionId,
    final Integer page,
    final Integer size)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |

## Response Type

**200**

[`ListIncrementsResponse`](../../doc/models/list-increments-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

subscriptionsController.getIncrementsAsync(subscriptionId, null, null).thenAccept(result -> {
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


# Get Subscription

Gets a subscription

```java
CompletableFuture<GetSubscriptionResponse> getSubscriptionAsync(
    final String subscriptionId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |

## Response Type

**200**

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

subscriptionsController.getSubscriptionAsync(subscriptionId).thenAccept(result -> {
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


# Get Subscription Cycle by Id

```java
CompletableFuture<GetPeriodResponse> getSubscriptionCycleByIdAsync(
    final String subscriptionId,
    final String cycleId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `cycleId` | `String` | Template, Required | - |

## Response Type

**200**

[`GetPeriodResponse`](../../doc/models/get-period-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String cycleId = "cycleId0";

subscriptionsController.getSubscriptionCycleByIdAsync(subscriptionId, cycleId).thenAccept(result -> {
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


# Get Subscription Cycles

```java
CompletableFuture<ListCyclesResponse> getSubscriptionCyclesAsync(
    final String subscriptionId,
    final String page,
    final String size)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `page` | `String` | Query, Required | Page number |
| `size` | `String` | Query, Required | Page size |

## Response Type

**200**

[`ListCyclesResponse`](../../doc/models/list-cycles-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String page = "page8";
String size = "size0";

subscriptionsController.getSubscriptionCyclesAsync(subscriptionId, page, size).thenAccept(result -> {
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


# Get Subscription Item

Get Subscription Item

```java
CompletableFuture<GetSubscriptionItemResponse> getSubscriptionItemAsync(
    final String subscriptionId,
    final String itemId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `itemId` | `String` | Template, Required | Item id |

## Response Type

**200**

[`GetSubscriptionItemResponse`](../../doc/models/get-subscription-item-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String itemId = "item_id0";

subscriptionsController.getSubscriptionItemAsync(subscriptionId, itemId).thenAccept(result -> {
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


# Get Subscription Items

Get Subscription Items

```java
CompletableFuture<ListSubscriptionItemsResponse> getSubscriptionItemsAsync(
    final String subscriptionId,
    final Integer page,
    final Integer size,
    final String name,
    final String code,
    final String status,
    final String description,
    final String createdSince,
    final String createdUntil)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |
| `name` | `String` | Query, Optional | The item name |
| `code` | `String` | Query, Optional | Identification code in the client system |
| `status` | `String` | Query, Optional | The item statis |
| `description` | `String` | Query, Optional | The item description |
| `createdSince` | `String` | Query, Optional | Filter for item's creation date start range |
| `createdUntil` | `String` | Query, Optional | Filter for item's creation date end range |

## Response Type

**200**

[`ListSubscriptionItemsResponse`](../../doc/models/list-subscription-items-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

subscriptionsController.getSubscriptionItemsAsync(subscriptionId, null, null, null, null, null, null, null, null).thenAccept(result -> {
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


# Get Subscriptions

Gets all subscriptions

```java
CompletableFuture<ListSubscriptionsResponse> getSubscriptionsAsync(
    final Integer page,
    final Integer size,
    final String code,
    final String billingType,
    final String customerId,
    final String planId,
    final String cardId,
    final String status,
    final LocalDateTime nextBillingSince,
    final LocalDateTime nextBillingUntil,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |
| `code` | `String` | Query, Optional | Filter for subscription's code |
| `billingType` | `String` | Query, Optional | Filter for subscription's billing type |
| `customerId` | `String` | Query, Optional | Filter for subscription's customer id |
| `planId` | `String` | Query, Optional | Filter for subscription's plan id |
| `cardId` | `String` | Query, Optional | Filter for subscription's card id |
| `status` | `String` | Query, Optional | Filter for subscription's status |
| `nextBillingSince` | `LocalDateTime` | Query, Optional | Filter for subscription's next billing date start range |
| `nextBillingUntil` | `LocalDateTime` | Query, Optional | Filter for subscription's next billing date end range |
| `createdSince` | `LocalDateTime` | Query, Optional | Filter for subscription's creation date start range |
| `createdUntil` | `LocalDateTime` | Query, Optional | Filter for subscriptions creation date end range |

## Response Type

**200**

[`ListSubscriptionsResponse`](../../doc/models/list-subscriptions-response.md)

## Example Usage

```java
subscriptionsController.getSubscriptionsAsync(null, null, null, null, null, null, null, null, null, null, null, null).thenAccept(result -> {
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


# Get Usage Report

```java
CompletableFuture<GetUsageReportResponse> getUsageReportAsync(
    final String subscriptionId,
    final String periodId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription Id |
| `periodId` | `String` | Template, Required | The period Id |

## Response Type

**200**

[`GetUsageReportResponse`](../../doc/models/get-usage-report-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String periodId = "period_id0";

subscriptionsController.getUsageReportAsync(subscriptionId, periodId).thenAccept(result -> {
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


# Get Usages

Lists all usages from a subscription item

```java
CompletableFuture<ListUsagesResponse> getUsagesAsync(
    final String subscriptionId,
    final String itemId,
    final Integer page,
    final Integer size,
    final String code,
    final String group,
    final LocalDateTime usedSince,
    final LocalDateTime usedUntil)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `itemId` | `String` | Template, Required | The subscription item id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |
| `code` | `String` | Query, Optional | Identification code in the client system |
| `group` | `String` | Query, Optional | Identification group in the client system |
| `usedSince` | `LocalDateTime` | Query, Optional | - |
| `usedUntil` | `LocalDateTime` | Query, Optional | - |

## Response Type

**200**

[`ListUsagesResponse`](../../doc/models/list-usages-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String itemId = "item_id0";

subscriptionsController.getUsagesAsync(subscriptionId, itemId, null, null, null, null, null, null).thenAccept(result -> {
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


# Renew Subscription

```java
CompletableFuture<GetPeriodResponse> renewSubscriptionAsync(
    final String subscriptionId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | - |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetPeriodResponse`](../../doc/models/get-period-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

subscriptionsController.renewSubscriptionAsync(subscriptionId, null).thenAccept(result -> {
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


# Update Current Cycle Status

```java
CompletableFuture<Void> updateCurrentCycleStatusAsync(
    final String subscriptionId,
    final UpdateCurrentCycleStatusRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `request` | [`UpdateCurrentCycleStatusRequest`](../../doc/models/update-current-cycle-status-request.md) | Body, Required | Request for updating the end date of the subscription current status |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

`void`

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateCurrentCycleStatusRequest request = new UpdateCurrentCycleStatusRequest.Builder(
    "status8"
)
.build();


subscriptionsController.updateCurrentCycleStatusAsync(subscriptionId, request, null).thenAccept(result -> {
    // TODO success callback handler
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


# Update Latest Period End At

```java
CompletableFuture<GetSubscriptionResponse> updateLatestPeriodEndAtAsync(
    final String subscriptionId,
    final UpdateCurrentCycleEndDateRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | - |
| `request` | [`UpdateCurrentCycleEndDateRequest`](../../doc/models/update-current-cycle-end-date-request.md) | Body, Required | Request for updating the end date of the current signature cycle |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateCurrentCycleEndDateRequest request = new UpdateCurrentCycleEndDateRequest.Builder()
    .build();


subscriptionsController.updateLatestPeriodEndAtAsync(subscriptionId, request, null).thenAccept(result -> {
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


# Update Split Subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSplitSubscriptionAsync(
    final String id,
    final UpdateSubscriptionSplitRequest request)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Subscription's id |
| `request` | [`UpdateSubscriptionSplitRequest`](../../doc/models/update-subscription-split-request.md) | Body, Required | - |

## Response Type

**200**

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String id = "id0";
UpdateSubscriptionSplitRequest request = new UpdateSubscriptionSplitRequest.Builder(
    false,
    Arrays.asList(
        null
    )
)
.build();

subscriptionsController.updateSplitSubscriptionAsync(id, request).thenAccept(result -> {
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


# Update Subscription Affiliation Id

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionAffiliationIdAsync(
    final String subscriptionId,
    final UpdateSubscriptionAffiliationIdRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | - |
| `request` | [`UpdateSubscriptionAffiliationIdRequest`](../../doc/models/update-subscription-affiliation-id-request.md) | Body, Required | Request for updating a subscription affiliation id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionAffiliationIdRequest request = new UpdateSubscriptionAffiliationIdRequest.Builder(
    "gateway_affiliation_id2"
)
.build();


subscriptionsController.updateSubscriptionAffiliationIdAsync(subscriptionId, request, null).thenAccept(result -> {
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


# Update Subscription Billing Date

Updates the billing date from a subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionBillingDateAsync(
    final String subscriptionId,
    final UpdateSubscriptionBillingDateRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `request` | [`UpdateSubscriptionBillingDateRequest`](../../doc/models/update-subscription-billing-date-request.md) | Body, Required | Request for updating the subscription billing date |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionBillingDateRequest request = new UpdateSubscriptionBillingDateRequest.Builder(
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();


subscriptionsController.updateSubscriptionBillingDateAsync(subscriptionId, request, null).thenAccept(result -> {
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


# Update Subscription Card

Updates the credit card from a subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionCardAsync(
    final String subscriptionId,
    final UpdateSubscriptionCardRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`UpdateSubscriptionCardRequest`](../../doc/models/update-subscription-card-request.md) | Body, Required | Request for updating a card |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionCardRequest request = new UpdateSubscriptionCardRequest.Builder(
    new CreateCardRequest.Builder()
        .type("credit")
        .build(),
    null
)
.build();


subscriptionsController.updateSubscriptionCardAsync(subscriptionId, request, null).thenAccept(result -> {
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


# Update Subscription Due Days

Updates the boleto due days from a subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionDueDaysAsync(
    final String subscriptionId,
    final UpdateSubscriptionDueDaysRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `request` | [`UpdateSubscriptionDueDaysRequest`](../../doc/models/update-subscription-due-days-request.md) | Body, Required | - |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionDueDaysRequest request = new UpdateSubscriptionDueDaysRequest.Builder(
    226
)
.build();


subscriptionsController.updateSubscriptionDueDaysAsync(subscriptionId, request, null).thenAccept(result -> {
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


# Update Subscription Item

Updates a subscription item

```java
CompletableFuture<GetSubscriptionItemResponse> updateSubscriptionItemAsync(
    final String subscriptionId,
    final String itemId,
    final UpdateSubscriptionItemRequest body,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `itemId` | `String` | Template, Required | Item id |
| `body` | [`UpdateSubscriptionItemRequest`](../../doc/models/update-subscription-item-request.md) | Body, Required | Request for updating a subscription item |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionItemResponse`](../../doc/models/get-subscription-item-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String itemId = "item_id0";
UpdateSubscriptionItemRequest body = new UpdateSubscriptionItemRequest.Builder(
    null,
    null,
    new UpdatePricingSchemeRequest.Builder(
        null,
        Arrays.asList(
            null
        )
    )
    .build(),
    null
)
.build();


subscriptionsController.updateSubscriptionItemAsync(subscriptionId, itemId, body, null).thenAccept(result -> {
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


# Update Subscription Metadata

Updates the metadata from a subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionMetadataAsync(
    final String subscriptionId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Request for updating the subscrption metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateMetadataRequest request = new UpdateMetadataRequest.Builder(
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


subscriptionsController.updateSubscriptionMetadataAsync(subscriptionId, request, null).thenAccept(result -> {
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


# Update Subscription Minium Price

Atualização do valor mínimo da assinatura

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionMiniumPriceAsync(
    final String subscriptionId,
    final UpdateSubscriptionMinimumPriceRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `request` | [`UpdateSubscriptionMinimumPriceRequest`](../../doc/models/update-subscription-minimum-price-request.md) | Body, Required | Request da requisição com o valor mínimo que será configurado |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionMinimumPriceRequest request = new UpdateSubscriptionMinimumPriceRequest.Builder()
    .build();


subscriptionsController.updateSubscriptionMiniumPriceAsync(subscriptionId, request, null).thenAccept(result -> {
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


# Update Subscription Payment Method

Updates the payment method from a subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionPaymentMethodAsync(
    final String subscriptionId,
    final UpdateSubscriptionPaymentMethodRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription id |
| `request` | [`UpdateSubscriptionPaymentMethodRequest`](../../doc/models/update-subscription-payment-method-request.md) | Body, Required | Request for updating the paymentmethod from a subscription |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionPaymentMethodRequest request = new UpdateSubscriptionPaymentMethodRequest.Builder(
    null,
    null,
    new CreateCardRequest.Builder()
        .type("credit")
        .build()
)
.build();


subscriptionsController.updateSubscriptionPaymentMethodAsync(subscriptionId, request, null).thenAccept(result -> {
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


# Update Subscription Start At

Updates the start at date from a subscription

```java
CompletableFuture<GetSubscriptionResponse> updateSubscriptionStartAtAsync(
    final String subscriptionId,
    final UpdateSubscriptionStartAtRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | The subscription id |
| `request` | [`UpdateSubscriptionStartAtRequest`](../../doc/models/update-subscription-start-at-request.md) | Body, Required | Request for updating the subscription start date |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetSubscriptionResponse`](../../doc/models/get-subscription-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
UpdateSubscriptionStartAtRequest request = new UpdateSubscriptionStartAtRequest.Builder(
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();


subscriptionsController.updateSubscriptionStartAtAsync(subscriptionId, request, null).thenAccept(result -> {
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

