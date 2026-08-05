# Charges

```java
ChargesController chargesController = client.getChargesController();
```

## Class Name

`ChargesController`

## Methods

* [Cancel Charge](../../doc/controllers/charges.md#cancel-charge)
* [Capture Charge](../../doc/controllers/charges.md#capture-charge)
* [Confirm Payment](../../doc/controllers/charges.md#confirm-payment)
* [Create Charge](../../doc/controllers/charges.md#create-charge)
* [Get Charge](../../doc/controllers/charges.md#get-charge)
* [Get Charge Transactions](../../doc/controllers/charges.md#get-charge-transactions)
* [Get Charges](../../doc/controllers/charges.md#get-charges)
* [Get Charges Summary](../../doc/controllers/charges.md#get-charges-summary)
* [Retry Charge](../../doc/controllers/charges.md#retry-charge)
* [Update Charge Card](../../doc/controllers/charges.md#update-charge-card)
* [Update Charge Due Date](../../doc/controllers/charges.md#update-charge-due-date)
* [Update Charge Metadata](../../doc/controllers/charges.md#update-charge-metadata)
* [Update Charge Payment Method](../../doc/controllers/charges.md#update-charge-payment-method)


# Cancel Charge

Cancel a charge

```java
CompletableFuture<GetChargeResponse> cancelChargeAsync(
    final String chargeId,
    final CreateCancelChargeRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `request` | [`CreateCancelChargeRequest`](../../doc/models/create-cancel-charge-request.md) | Body, Optional | Request for cancelling a charge |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

chargesController.cancelChargeAsync(chargeId, null, null).thenAccept(result -> {
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


# Capture Charge

Captures a charge

```java
CompletableFuture<GetChargeResponse> captureChargeAsync(
    final String chargeId,
    final CreateCaptureChargeRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `request` | [`CreateCaptureChargeRequest`](../../doc/models/create-capture-charge-request.md) | Body, Optional | Request for capturing a charge |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

chargesController.captureChargeAsync(chargeId, null, null).thenAccept(result -> {
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


# Confirm Payment

```java
CompletableFuture<GetChargeResponse> confirmPaymentAsync(
    final String chargeId,
    final CreateConfirmPaymentRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | - |
| `request` | [`CreateConfirmPaymentRequest`](../../doc/models/create-confirm-payment-request.md) | Body, Optional | Request for confirm payment |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

chargesController.confirmPaymentAsync(chargeId, null, null).thenAccept(result -> {
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


# Create Charge

Creates a new charge

```java
CompletableFuture<GetChargeResponse> createChargeAsync(
    final CreateChargeRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `request` | [`CreateChargeRequest`](../../doc/models/create-charge-request.md) | Body, Required | Request for creating a charge |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
CreateChargeRequest request = new CreateChargeRequest.Builder(
    242,
    null,
    "order_id0"
)
.build();


chargesController.createChargeAsync(request, null).thenAccept(result -> {
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


# Get Charge

Get a charge from its id

```java
CompletableFuture<GetChargeResponse> getChargeAsync(
    final String chargeId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |

## Response Type

**200**

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

chargesController.getChargeAsync(chargeId).thenAccept(result -> {
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


# Get Charge Transactions

```java
CompletableFuture<ListChargeTransactionsResponse> getChargeTransactionsAsync(
    final String chargeId,
    final Integer page,
    final Integer size)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge Id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |

## Response Type

**200**

[`ListChargeTransactionsResponse`](../../doc/models/list-charge-transactions-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

chargesController.getChargeTransactionsAsync(chargeId, null, null).thenAccept(result -> {
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


# Get Charges

Lists all charges

```java
CompletableFuture<ListChargesResponse> getChargesAsync(
    final Integer page,
    final Integer size,
    final String code,
    final String status,
    final String paymentMethod,
    final String customerId,
    final String orderId,
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
| `code` | `String` | Query, Optional | Filter for charge's code |
| `status` | `String` | Query, Optional | Filter for charge's status |
| `paymentMethod` | `String` | Query, Optional | Filter for charge's payment method |
| `customerId` | `String` | Query, Optional | Filter for charge's customer id |
| `orderId` | `String` | Query, Optional | Filter for charge's order id |
| `createdSince` | `LocalDateTime` | Query, Optional | Filter for the beginning of the range for charge's creation |
| `createdUntil` | `LocalDateTime` | Query, Optional | Filter for the end of the range for charge's creation |

## Response Type

**200**

[`ListChargesResponse`](../../doc/models/list-charges-response.md)

## Example Usage

```java
chargesController.getChargesAsync(null, null, null, null, null, null, null, null, null).thenAccept(result -> {
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


# Get Charges Summary

```java
CompletableFuture<GetChargesSummaryResponse> getChargesSummaryAsync(
    final String status,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `status` | `String` | Query, Required | - |
| `createdSince` | `LocalDateTime` | Query, Optional | - |
| `createdUntil` | `LocalDateTime` | Query, Optional | - |

## Response Type

**200**

[`GetChargesSummaryResponse`](../../doc/models/get-charges-summary-response.md)

## Example Usage

```java
String status = "status8";

chargesController.getChargesSummaryAsync(status, null, null).thenAccept(result -> {
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


# Retry Charge

Retries a charge

```java
CompletableFuture<GetChargeResponse> retryChargeAsync(
    final String chargeId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

chargesController.retryChargeAsync(chargeId, null).thenAccept(result -> {
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


# Update Charge Card

Updates the card from a charge

```java
CompletableFuture<GetChargeResponse> updateChargeCardAsync(
    final String chargeId,
    final UpdateChargeCardRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `request` | [`UpdateChargeCardRequest`](../../doc/models/update-charge-card-request.md) | Body, Required | Request for updating a charge's card |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";
UpdateChargeCardRequest request = new UpdateChargeCardRequest.Builder(
    false,
    null,
    new CreateCardRequest.Builder()
        .type("credit")
        .build(),
    false
)
.build();


chargesController.updateChargeCardAsync(chargeId, request, null).thenAccept(result -> {
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


# Update Charge Due Date

Updates the due date from a charge

```java
CompletableFuture<GetChargeResponse> updateChargeDueDateAsync(
    final String chargeId,
    final UpdateChargeDueDateRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge Id |
| `request` | [`UpdateChargeDueDateRequest`](../../doc/models/update-charge-due-date-request.md) | Body, Required | Request for updating the due date |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";
UpdateChargeDueDateRequest request = new UpdateChargeDueDateRequest.Builder()
    .build();


chargesController.updateChargeDueDateAsync(chargeId, request, null).thenAccept(result -> {
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


# Update Charge Metadata

Updates the metadata from a charge

```java
CompletableFuture<GetChargeResponse> updateChargeMetadataAsync(
    final String chargeId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | The charge id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Request for updating the charge metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";
UpdateMetadataRequest request = new UpdateMetadataRequest.Builder(
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


chargesController.updateChargeMetadataAsync(chargeId, request, null).thenAccept(result -> {
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


# Update Charge Payment Method

Updates a charge's payment method

```java
CompletableFuture<GetChargeResponse> updateChargePaymentMethodAsync(
    final String chargeId,
    final UpdateChargePaymentMethodRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `request` | [`UpdateChargePaymentMethodRequest`](../../doc/models/update-charge-payment-method-request.md) | Body, Required | Request for updating the payment method from a charge |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";
UpdateChargePaymentMethodRequest request = new UpdateChargePaymentMethodRequest.Builder(
    false,
    null,
    new CreateCreditCardPaymentRequest.Builder()
        .installments(1)
        .capture(true)
        .recurrencyCycle("\"first\" or \"subsequent\"")
        .build(),
    null,
    null,
    new CreateVoucherPaymentRequest.Builder()
        .recurrencyCycle("\"first\" or \"subsequent\"")
        .build(),
    null,
    null,
    new CreatePrivateLabelPaymentRequest.Builder()
        .installments(1)
        .capture(true)
        .recurrencyCycle("\"first\" or \"subsequent\"")
        .build()
)
.build();


chargesController.updateChargePaymentMethodAsync(chargeId, request, null).thenAccept(result -> {
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

