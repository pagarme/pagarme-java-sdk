# Payables

```java
PayablesController payablesController = client.getPayablesController();
```

## Class Name

`PayablesController`

## Methods

* [Get Payables](../../doc/controllers/payables.md#get-payables)
* [Get Payable by Id](../../doc/controllers/payables.md#get-payable-by-id)


# Get Payables

```java
ListPayablesResponse getPayables(
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

[`ListPayablesResponse`](../../doc/models/list-payables-response.md)

## Example Usage

```java
try {
    ListPayablesResponse result = payablesController.getPayables(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Payable by Id

```java
GetPayableResponse getPayableById(
    final long id)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `long` | Template, Required | - |

## Response Type

[`GetPayableResponse`](../../doc/models/get-payable-response.md)

## Example Usage

```java
long id = 112L;

try {
    GetPayableResponse result = payablesController.getPayableById(id);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

