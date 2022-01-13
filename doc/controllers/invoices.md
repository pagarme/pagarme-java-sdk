# Invoices

```java
InvoicesController invoicesController = client.getInvoicesController();
```

## Class Name

`InvoicesController`

## Methods

* [Update Invoice Metadata](/doc/controllers/invoices.md#update-invoice-metadata)
* [Get Partial Invoice](/doc/controllers/invoices.md#get-partial-invoice)
* [Cancel Invoice](/doc/controllers/invoices.md#cancel-invoice)
* [Create Invoice](/doc/controllers/invoices.md#create-invoice)
* [Get Invoices](/doc/controllers/invoices.md#get-invoices)
* [Get Invoice](/doc/controllers/invoices.md#get-invoice)
* [Update Invoice Status](/doc/controllers/invoices.md#update-invoice-status)


# Update Invoice Metadata

Updates the metadata from an invoice

```java
CompletableFuture<GetInvoiceResponse> updateInvoiceMetadata(
    final String invoiceId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `invoiceId` | `String` | Template, Required | The invoice id |
| `request` | [`UpdateMetadataRequest`](/doc/models/update-metadata-request.md) | Body, Required | Request for updating the invoice metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetInvoiceResponse`](/doc/models/get-invoice-response.md)

## Example Usage

```java
String invoiceId = "invoice_id0";
UpdateMetadataRequest request = new UpdateMetadataRequest();
request.setMetadata(new LinkedHashMap<>());
request.getMetadata().put("key0", "metadata3");

try {
    GetInvoiceResponse response = invoicesController.updateInvoiceMetadata(invoiceId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Partial Invoice

```java
CompletableFuture<GetInvoiceResponse> getPartialInvoice(
    final String subscriptionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |

## Response Type

[`GetInvoiceResponse`](/doc/models/get-invoice-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";

try {
    GetInvoiceResponse response = invoicesController.getPartialInvoice(subscriptionId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Cancel Invoice

Cancels an invoice

```java
CompletableFuture<GetInvoiceResponse> cancelInvoice(
    final String invoiceId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `invoiceId` | `String` | Template, Required | Invoice id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetInvoiceResponse`](/doc/models/get-invoice-response.md)

## Example Usage

```java
String invoiceId = "invoice_id0";

try {
    GetInvoiceResponse response = invoicesController.cancelInvoice(invoiceId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Invoice

Create an Invoice

```java
CompletableFuture<GetInvoiceResponse> createInvoice(
    final String subscriptionId,
    final String cycleId,
    final CreateInvoiceRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionId` | `String` | Template, Required | Subscription Id |
| `cycleId` | `String` | Template, Required | Cycle Id |
| `request` | [`CreateInvoiceRequest`](/doc/models/create-invoice-request.md) | Body, Optional | - |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetInvoiceResponse`](/doc/models/get-invoice-response.md)

## Example Usage

```java
String subscriptionId = "subscription_id0";
String cycleId = "cycle_id6";

try {
    GetInvoiceResponse response = invoicesController.createInvoice(subscriptionId, cycleId, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Invoices

Gets all invoices

```java
CompletableFuture<ListInvoicesResponse> getInvoices(
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

[`ListInvoicesResponse`](/doc/models/list-invoices-response.md)

## Example Usage

```java
try {
    ListInvoicesResponse response = invoicesController.getInvoices(null, null, null, null, null, null, null, null, null, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Invoice

Gets an invoice

```java
CompletableFuture<GetInvoiceResponse> getInvoice(
    final String invoiceId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `invoiceId` | `String` | Template, Required | Invoice Id |

## Response Type

[`GetInvoiceResponse`](/doc/models/get-invoice-response.md)

## Example Usage

```java
String invoiceId = "invoice_id0";

try {
    GetInvoiceResponse response = invoicesController.getInvoice(invoiceId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Invoice Status

Updates the status from an invoice

```java
CompletableFuture<GetInvoiceResponse> updateInvoiceStatus(
    final String invoiceId,
    final UpdateInvoiceStatusRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `invoiceId` | `String` | Template, Required | Invoice Id |
| `request` | [`UpdateInvoiceStatusRequest`](/doc/models/update-invoice-status-request.md) | Body, Required | Request for updating an invoice's status |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetInvoiceResponse`](/doc/models/get-invoice-response.md)

## Example Usage

```java
String invoiceId = "invoice_id0";
UpdateInvoiceStatusRequest request = new UpdateInvoiceStatusRequest();
request.setStatus("status8");

try {
    GetInvoiceResponse response = invoicesController.updateInvoiceStatus(invoiceId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

