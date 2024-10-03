# Balance Operations

```java
BalanceOperationsController balanceOperationsController = client.getBalanceOperationsController();
```

## Class Name

`BalanceOperationsController`

## Methods

* [Get Balance Operations](../../doc/controllers/balance-operations.md#get-balance-operations)
* [Get Balance Operation by Id](../../doc/controllers/balance-operations.md#get-balance-operation-by-id)


# Get Balance Operations

```java
ListBalanceOperationResponse getBalanceOperations(
    final String status,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil,
    final String recipientId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `status` | `String` | Query, Optional | - |
| `createdSince` | `LocalDateTime` | Query, Optional | - |
| `createdUntil` | `LocalDateTime` | Query, Optional | - |
| `recipientId` | `String` | Query, Optional | - |

## Response Type

[`ListBalanceOperationResponse`](../../doc/models/list-balance-operation-response.md)

## Example Usage

```java
try {
    ListBalanceOperationResponse result = balanceOperationsController.getBalanceOperations(null, null, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Balance Operation by Id

```java
GetBalanceOperationResponse getBalanceOperationById(
    final long id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `long` | Template, Required | - |

## Response Type

[`GetBalanceOperationResponse`](../../doc/models/get-balance-operation-response.md)

## Example Usage

```java
long id = 112L;

try {
    GetBalanceOperationResponse result = balanceOperationsController.getBalanceOperationById(id);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

