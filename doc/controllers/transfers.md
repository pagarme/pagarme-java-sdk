# Transfers

```java
TransfersController transfersController = client.getTransfersController();
```

## Class Name

`TransfersController`

## Methods

* [Get Transfer by Id](../../doc/controllers/transfers.md#get-transfer-by-id)
* [Create Transfer](../../doc/controllers/transfers.md#create-transfer)
* [Get Transfers](../../doc/controllers/transfers.md#get-transfers)


# Get Transfer by Id

```java
GetTransfer getTransferById(
    final String transferId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `transferId` | `String` | Template, Required | - |

## Response Type

[`GetTransfer`](../../doc/models/get-transfer.md)

## Example Usage

```java
String transferId = "transfer_id6";

try {
    GetTransfer response = transfersController.getTransferById(transferId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Transfer

```java
GetTransfer createTransfer(
    final CreateTransfer request)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `request` | [`CreateTransfer`](../../doc/models/create-transfer.md) | Body, Required | - |

## Response Type

[`GetTransfer`](../../doc/models/get-transfer.md)

## Example Usage

```java
CreateTransfer request = new CreateTransfer();
request.setAmount(242);
request.setSourceId("source_id0");
request.setTargetId("target_id6");

try {
    GetTransfer response = transfersController.createTransfer(request);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Transfers

Gets all transfers

```java
ListTransfers getTransfers()
```

## Response Type

[`ListTransfers`](../../doc/models/list-transfers.md)

## Example Usage

```java
try {
    ListTransfers response = transfersController.getTransfers();
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

