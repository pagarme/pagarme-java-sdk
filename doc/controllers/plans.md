# Plans

```java
PlansController plansController = client.getPlansController();
```

## Class Name

`PlansController`

## Methods

* [Create Plan](../../doc/controllers/plans.md#create-plan)
* [Create Plan Item](../../doc/controllers/plans.md#create-plan-item)
* [Delete Plan](../../doc/controllers/plans.md#delete-plan)
* [Delete Plan Item](../../doc/controllers/plans.md#delete-plan-item)
* [Get Plan](../../doc/controllers/plans.md#get-plan)
* [Get Plan Item](../../doc/controllers/plans.md#get-plan-item)
* [Get Plans](../../doc/controllers/plans.md#get-plans)
* [Update Plan](../../doc/controllers/plans.md#update-plan)
* [Update Plan Item](../../doc/controllers/plans.md#update-plan-item)
* [Update Plan Metadata](../../doc/controllers/plans.md#update-plan-metadata)


# Create Plan

Creates a new plan

```java
CompletableFuture<GetPlanResponse> createPlanAsync(
    final CreatePlanRequest body,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreatePlanRequest`](../../doc/models/create-plan-request.md) | Body, Required | Request for creating a plan |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetPlanResponse`](../../doc/models/get-plan-response.md)

## Example Usage

```java
CreatePlanRequest body = new CreatePlanRequest.Builder(
    null,
    null,
    null,
    Arrays.asList(
        null
    ),
    false,
    null,
    null,
    null,
    null,
    0,
    null,
    null,
    null,
    null
)
.build();


plansController.createPlanAsync(body, null).thenAccept(result -> {
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


# Create Plan Item

Adds a new item to a plan

```java
CompletableFuture<GetPlanItemResponse> createPlanItemAsync(
    final String planId,
    final CreatePlanItemRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |
| `request` | [`CreatePlanItemRequest`](../../doc/models/create-plan-item-request.md) | Body, Required | Request for creating a plan item |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetPlanItemResponse`](../../doc/models/get-plan-item-response.md)

## Example Usage

```java
String planId = "plan_id8";
CreatePlanItemRequest request = new CreatePlanItemRequest.Builder(
    "name6",
    null,
    "id6",
    "description6"
)
.build();


plansController.createPlanItemAsync(planId, request, null).thenAccept(result -> {
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


# Delete Plan

Deletes a plan

```java
CompletableFuture<GetPlanResponse> deletePlanAsync(
    final String planId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetPlanResponse`](../../doc/models/get-plan-response.md)

## Example Usage

```java
String planId = "plan_id8";

plansController.deletePlanAsync(planId, null).thenAccept(result -> {
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


# Delete Plan Item

Removes an item from a plan

```java
CompletableFuture<GetPlanItemResponse> deletePlanItemAsync(
    final String planId,
    final String planItemId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |
| `planItemId` | `String` | Template, Required | Plan item id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetPlanItemResponse`](../../doc/models/get-plan-item-response.md)

## Example Usage

```java
String planId = "plan_id8";
String planItemId = "plan_item_id0";

plansController.deletePlanItemAsync(planId, planItemId, null).thenAccept(result -> {
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


# Get Plan

Gets a plan

```java
CompletableFuture<GetPlanResponse> getPlanAsync(
    final String planId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |

## Response Type

**200**

[`GetPlanResponse`](../../doc/models/get-plan-response.md)

## Example Usage

```java
String planId = "plan_id8";

plansController.getPlanAsync(planId).thenAccept(result -> {
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


# Get Plan Item

Gets a plan item

```java
CompletableFuture<GetPlanItemResponse> getPlanItemAsync(
    final String planId,
    final String planItemId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |
| `planItemId` | `String` | Template, Required | Plan item id |

## Response Type

**200**

[`GetPlanItemResponse`](../../doc/models/get-plan-item-response.md)

## Example Usage

```java
String planId = "plan_id8";
String planItemId = "plan_item_id0";

plansController.getPlanItemAsync(planId, planItemId).thenAccept(result -> {
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


# Get Plans

Gets all plans

```java
CompletableFuture<ListPlansResponse> getPlansAsync(
    final Integer page,
    final Integer size,
    final String name,
    final String status,
    final String billingType,
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
| `name` | `String` | Query, Optional | Filter for Plan's name |
| `status` | `String` | Query, Optional | Filter for Plan's status |
| `billingType` | `String` | Query, Optional | Filter for plan's billing type |
| `createdSince` | `LocalDateTime` | Query, Optional | Filter for plan's creation date start range |
| `createdUntil` | `LocalDateTime` | Query, Optional | Filter for plan's creation date end range |

## Response Type

**200**

[`ListPlansResponse`](../../doc/models/list-plans-response.md)

## Example Usage

```java
plansController.getPlansAsync(null, null, null, null, null, null, null).thenAccept(result -> {
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


# Update Plan

Updates a plan

```java
CompletableFuture<GetPlanResponse> updatePlanAsync(
    final String planId,
    final UpdatePlanRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |
| `request` | [`UpdatePlanRequest`](../../doc/models/update-plan-request.md) | Body, Required | Request for updating a plan |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetPlanResponse`](../../doc/models/get-plan-response.md)

## Example Usage

```java
String planId = "plan_id8";
UpdatePlanRequest request = new UpdatePlanRequest.Builder(
    "name6",
    "description6",
    Arrays.asList(
        151,
        152
    ),
    "statement_descriptor6",
    "currency6",
    "interval4",
    114,
    Arrays.asList(
        "payment_methods1",
        "payment_methods0",
        "payment_methods9"
    ),
    "billing_type0",
    "status8",
    false,
    Arrays.asList(
        115
    ),
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


plansController.updatePlanAsync(planId, request, null).thenAccept(result -> {
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


# Update Plan Item

Updates a plan item

```java
CompletableFuture<GetPlanItemResponse> updatePlanItemAsync(
    final String planId,
    final String planItemId,
    final UpdatePlanItemRequest body,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | Plan id |
| `planItemId` | `String` | Template, Required | Plan item id |
| `body` | [`UpdatePlanItemRequest`](../../doc/models/update-plan-item-request.md) | Body, Required | Request for updating the plan item |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetPlanItemResponse`](../../doc/models/get-plan-item-response.md)

## Example Usage

```java
String planId = "plan_id8";
String planItemId = "plan_item_id0";
UpdatePlanItemRequest body = new UpdatePlanItemRequest.Builder(
    null,
    null,
    null,
    new UpdatePricingSchemeRequest.Builder(
        null,
        Arrays.asList(
            null
        )
    )
    .build()
)
.build();


plansController.updatePlanItemAsync(planId, planItemId, body, null).thenAccept(result -> {
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


# Update Plan Metadata

Updates the metadata from a plan

```java
CompletableFuture<GetPlanResponse> updatePlanMetadataAsync(
    final String planId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planId` | `String` | Template, Required | The plan id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Request for updating the plan metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetPlanResponse`](../../doc/models/get-plan-response.md)

## Example Usage

```java
String planId = "plan_id8";
UpdateMetadataRequest request = new UpdateMetadataRequest.Builder(
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


plansController.updatePlanMetadataAsync(planId, request, null).thenAccept(result -> {
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

