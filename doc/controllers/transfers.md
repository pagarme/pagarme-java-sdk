# Transfers

```java
TransfersController transfersController = client.getTransfersController();
```

## Class Name

`TransfersController`

## Methods

* [Get Transfers](../../doc/controllers/transfers.md#get-transfers)
* [Get Transfer by Id](../../doc/controllers/transfers.md#get-transfer-by-id)
* [Create Transfer](../../doc/controllers/transfers.md#create-transfer)


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
    ListTransfers result = transfersController.getTransfers();
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


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
    GetTransfer result = transfersController.getTransferById(transferId);
    System.out.println(result);
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
CreateTransfer request = new CreateTransfer.Builder(
    242,
    "source_id0",
    "target_id6"
)
.build();

try {
    GetTransfer result = transfersController.createTransfer(request);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

