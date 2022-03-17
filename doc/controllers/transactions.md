# Transactions

```java
TransactionsController transactionsController = client.getTransactionsController();
```

## Class Name

`TransactionsController`


# Get Transaction

```java
CompletableFuture<GetTransactionResponse> getTransaction(
    final String transactionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `transactionId` | `String` | Template, Required | - |

## Response Type

[`GetTransactionResponse`](../../doc/models/get-transaction-response.md)

## Example Usage

```java
String transactionId = "transaction_id8";

try {
    GetTransactionResponse response = transactionsController.getTransaction(transactionId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

