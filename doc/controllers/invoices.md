# Invoices

```java
InvoicesController invoicesController = client.getInvoicesController();
```

## Class Name

`InvoicesController`

## Methods

* [Cancel Invoice](../../doc/controllers/invoices.md#cancel-invoice)
* [Create Invoice](../../doc/controllers/invoices.md#create-invoice)
* [Get Invoice](../../doc/controllers/invoices.md#get-invoice)
* [Get Invoices](../../doc/controllers/invoices.md#get-invoices)
* [Get Partial Invoice](../../doc/controllers/invoices.md#get-partial-invoice)
* [Update Invoice Metadata](../../doc/controllers/invoices.md#update-invoice-metadata)
* [Update Invoice Status](../../doc/controllers/invoices.md#update-invoice-status)


# Cancel Invoice

Cancels an invoice

```java
CompletableFuture<GetInvoiceResponse> cancelInvoiceAsync(
    final String invoiceId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `invoiceId` | `String` | Template, Required | Invoice id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetInvoiceResponse`](../../doc/models/get-invoice-response.md)

## Example Usage

```java
String invoiceId = "invoice_id0";

invoicesController.cancelInvoiceAsync(invoiceId, null).thenAccept(result -> {
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


# Create Invoice

Create an Invoice

```java
CompletableFuture<GetInvoiceResponse> createInvoiceAsync(
    final String subscriptionId,
    final String cycleId,
    final CreateInvoiceRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `cycleId` | `String` | Template, Required | Cycle Id |
| `request` | [`CreateInvoiceRequest`](../../doc/models/create-invoice-request.md) | Body, Optional | - |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetInvoiceResponse`](../../doc/models/get-invoice-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String cycleId = "cycle_id6";

invoicesController.createInvoiceAsync(subscriptionId, cycleId, null, null).thenAccept(result -> {
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


# Get Invoice

Gets an invoice

```java
CompletableFuture<GetInvoiceResponse> getInvoiceAsync(
    final String invoiceId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `invoiceId` | `String` | Template, Required | Invoice Id |

## Response Type

**200**

[`GetInvoiceResponse`](../../doc/models/get-invoice-response.md)

## Example Usage

```java
String invoiceId = "invoice_id0";

invoicesController.getInvoiceAsync(invoiceId).thenAccept(result -> {
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


# Get Invoices

Gets all invoices

```java
CompletableFuture<ListInvoicesResponse> getInvoicesAsync(
    final Integer page,
    final Integer size,
    final String code,
    final String customerId,
    final String subscriptionId,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil,
    final String status,
    final LocalDateTime dueSince,
    final LocalDateTime dueUntil,
    final String customerDocument)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |
| `code` | `String` | Query, Optional | Filter for Invoice's code |
| `customerId` | `String` | Query, Optional | Filter for Invoice's customer id |
| `subscriptionId` | `String` | Query, Optional | Filter for Invoice's subscription id |
| `createdSince` | `LocalDateTime` | Query, Optional | Filter for Invoice's creation date start range |
| `createdUntil` | `LocalDateTime` | Query, Optional | Filter for Invoices creation date end range |
| `status` | `String` | Query, Optional | Filter for Invoice's status |
| `dueSince` | `LocalDateTime` | Query, Optional | Filter for Invoice's due date start range |
| `dueUntil` | `LocalDateTime` | Query, Optional | Filter for Invoice's due date end range |
| `customerDocument` | `String` | Query, Optional | - |

## Response Type

**200**

[`ListInvoicesResponse`](../../doc/models/list-invoices-response.md)

## Example Usage

```java
invoicesController.getInvoicesAsync(null, null, null, null, null, null, null, null, null, null, null).thenAccept(result -> {
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


# Get Partial Invoice

```java
CompletableFuture<GetInvoiceResponse> getPartialInvoiceAsync(
    final String subscriptionId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |

## Response Type

**200**

[`GetInvoiceResponse`](../../doc/models/get-invoice-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

invoicesController.getPartialInvoiceAsync(subscriptionId).thenAccept(result -> {
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


# Update Invoice Metadata

Updates the metadata from an invoice

```java
CompletableFuture<GetInvoiceResponse> updateInvoiceMetadataAsync(
    final String invoiceId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `invoiceId` | `String` | Template, Required | The invoice id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Request for updating the invoice metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetInvoiceResponse`](../../doc/models/get-invoice-response.md)

## Example Usage

```java
String invoiceId = "invoice_id0";
UpdateMetadataRequest request = new UpdateMetadataRequest.Builder(
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


invoicesController.updateInvoiceMetadataAsync(invoiceId, request, null).thenAccept(result -> {
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


# Update Invoice Status

Updates the status from an invoice

```java
CompletableFuture<GetInvoiceResponse> updateInvoiceStatusAsync(
    final String invoiceId,
    final UpdateInvoiceStatusRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `invoiceId` | `String` | Template, Required | Invoice Id |
| `request` | [`UpdateInvoiceStatusRequest`](../../doc/models/update-invoice-status-request.md) | Body, Required | Request for updating an invoice's status |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetInvoiceResponse`](../../doc/models/get-invoice-response.md)

## Example Usage

```java
String invoiceId = "invoice_id0";
UpdateInvoiceStatusRequest request = new UpdateInvoiceStatusRequest.Builder(
    "status8"
)
.build();


invoicesController.updateInvoiceStatusAsync(invoiceId, request, null).thenAccept(result -> {
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

