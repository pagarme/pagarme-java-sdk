# Payables

```java
PayablesController payablesController = client.getPayablesController();
```

## Class Name

`PayablesController`


# Get Payables

```java
CompletableFuture<ListPayablesResponse> getPayablesAsync(
    final String type,
    final String splitId,
    final String bulkAnticipationId,
    final Integer installment,
    final String status,
    final String recipientId,
    final Integer amount,
    final String chargeId,
    final String paymentDateUntil,
    final LocalDateTime paymentDateSince,
    final LocalDateTime updatedUntil,
    final LocalDateTime updatedSince,
    final LocalDateTime createdUntil,
    final LocalDateTime createdSince,
    final String liquidationArrangementId,
    final Integer page,
    final Integer size,
    final Long gatewayId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `type` | `String` | Query, Optional | - |
| `splitId` | `String` | Query, Optional | - |
| `bulkAnticipationId` | `String` | Query, Optional | - |
| `installment` | `Integer` | Query, Optional | - |
| `status` | `String` | Query, Optional | - |
| `recipientId` | `String` | Query, Optional | - |
| `amount` | `Integer` | Query, Optional | - |
| `chargeId` | `String` | Query, Optional | - |
| `paymentDateUntil` | `String` | Query, Optional | - |
| `paymentDateSince` | `LocalDateTime` | Query, Optional | - |
| `updatedUntil` | `LocalDateTime` | Query, Optional | - |
| `updatedSince` | `LocalDateTime` | Query, Optional | - |
| `createdUntil` | `LocalDateTime` | Query, Optional | - |
| `createdSince` | `LocalDateTime` | Query, Optional | - |
| `liquidationArrangementId` | `String` | Query, Optional | - |
| `page` | `Integer` | Query, Optional | - |
| `size` | `Integer` | Query, Optional | - |
| `gatewayId` | `Long` | Query, Optional | - |

## Response Type

**200**

[`ListPayablesResponse`](../../doc/models/list-payables-response.md)

## Example Usage

```java
payablesController.getPayablesAsync(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null).thenAccept(result -> {
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

