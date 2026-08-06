# Transactions

```java
TransactionsController transactionsController = client.getTransactionsController();
```

## Class Name

`TransactionsController`


# Get Transaction

```java
CompletableFuture<GetTransactionResponse> getTransactionAsync(
    final String transactionId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `transactionId` | `String` | Template, Required | - |

## Response Type

**200**

[`GetTransactionResponse`](../../doc/models/get-transaction-response.md)

## Example Usage

```java
String transactionId = "transaction_id8";

transactionsController.getTransactionAsync(transactionId).thenAccept(result -> {
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

