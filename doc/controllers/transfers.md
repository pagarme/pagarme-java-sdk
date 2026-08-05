# Transfers

```java
TransfersController transfersController = client.getTransfersController();
```

## Class Name

`TransfersController`

## Methods

* [Create Transfer](../../doc/controllers/transfers.md#create-transfer)
* [Get Transfer by Id](../../doc/controllers/transfers.md#get-transfer-by-id)
* [Get Transfers](../../doc/controllers/transfers.md#get-transfers)


# Create Transfer

```java
CompletableFuture<GetTransfer> createTransferAsync(
    final CreateTransfer request)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `request` | [`CreateTransfer`](../../doc/models/create-transfer.md) | Body, Required | - |

## Response Type

**200**

[`GetTransfer`](../../doc/models/get-transfer.md)

## Example Usage

```java
CreateTransfer request = new CreateTransfer.Builder(
    242,
    "source_id0",
    "target_id6"
)
.build();

transfersController.createTransferAsync(request).thenAccept(result -> {
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


# Get Transfer by Id

```java
CompletableFuture<GetTransfer> getTransferByIdAsync(
    final String transferId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `transferId` | `String` | Template, Required | - |

## Response Type

**200**

[`GetTransfer`](../../doc/models/get-transfer.md)

## Example Usage

```java
String transferId = "transfer_id6";

transfersController.getTransferByIdAsync(transferId).thenAccept(result -> {
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


# Get Transfers

Gets all transfers

```java
CompletableFuture<ListTransfers> getTransfersAsync()
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Response Type

**200**

[`ListTransfers`](../../doc/models/list-transfers.md)

## Example Usage

```java
transfersController.getTransfersAsync().thenAccept(result -> {
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

