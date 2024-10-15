# Charges

```java
ChargesController chargesController = client.getChargesController();
```

## Class Name

`ChargesController`

## Methods

* [Update Charge Metadata](../../doc/controllers/charges.md#update-charge-metadata)
* [Capture Charge](../../doc/controllers/charges.md#capture-charge)
* [Get Charge](../../doc/controllers/charges.md#get-charge)
* [Confirm Payment](../../doc/controllers/charges.md#confirm-payment)
* [Get Charge Transactions](../../doc/controllers/charges.md#get-charge-transactions)
* [Update Charge Card](../../doc/controllers/charges.md#update-charge-card)
* [Create Charge](../../doc/controllers/charges.md#create-charge)
* [Update Charge Payment Method](../../doc/controllers/charges.md#update-charge-payment-method)
* [Update Charge Due Date](../../doc/controllers/charges.md#update-charge-due-date)
* [Get Charges Summary](../../doc/controllers/charges.md#get-charges-summary)
* [Retry Charge](../../doc/controllers/charges.md#retry-charge)
* [Get Charges](../../doc/controllers/charges.md#get-charges)
* [Cancel Charge](../../doc/controllers/charges.md#cancel-charge)


# Update Charge Metadata

Updates the metadata from a charge

```java
GetChargeResponse updateChargeMetadata(
    final String chargeId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | The charge id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Request for updating the charge metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";
UpdateMetadataRequest request = new UpdateMetadataRequest.Builder(
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


try {
    GetChargeResponse result = chargesController.updateChargeMetadata(chargeId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Capture Charge

Captures a charge

```java
GetChargeResponse captureCharge(
    final String chargeId,
    final CreateCaptureChargeRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `request` | [`CreateCaptureChargeRequest`](../../doc/models/create-capture-charge-request.md) | Body, Optional | Request for capturing a charge |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

try {
    GetChargeResponse result = chargesController.captureCharge(chargeId, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Charge

Get a charge from its id

```java
GetChargeResponse getCharge(
    final String chargeId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

try {
    GetChargeResponse result = chargesController.getCharge(chargeId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Confirm Payment

```java
GetChargeResponse confirmPayment(
    final String chargeId,
    final CreateConfirmPaymentRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | - |
| `request` | [`CreateConfirmPaymentRequest`](../../doc/models/create-confirm-payment-request.md) | Body, Optional | Request for confirm payment |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

try {
    GetChargeResponse result = chargesController.confirmPayment(chargeId, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Charge Transactions

```java
ListChargeTransactionsResponse getChargeTransactions(
    final String chargeId,
    final Integer page,
    final Integer size)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge Id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |

## Response Type

[`ListChargeTransactionsResponse`](../../doc/models/list-charge-transactions-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

try {
    ListChargeTransactionsResponse result = chargesController.getChargeTransactions(chargeId, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Charge Card

Updates the card from a charge

```java
GetChargeResponse updateChargeCard(
    final String chargeId,
    final UpdateChargeCardRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `request` | [`UpdateChargeCardRequest`](../../doc/models/update-charge-card-request.md) | Body, Required | Request for updating a charge's card |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";
UpdateChargeCardRequest request = new UpdateChargeCardRequest.Builder(
    false,
    "card_id2",
    new CreateCardRequest.Builder()
        .type("credit")
        .build(),
    false
)
.build();


try {
    GetChargeResponse result = chargesController.updateChargeCard(chargeId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Charge

Creates a new charge

```java
GetChargeResponse createCharge(
    final CreateChargeRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `request` | [`CreateChargeRequest`](../../doc/models/create-charge-request.md) | Body, Required | Request for creating a charge |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
CreateChargeRequest request = new CreateChargeRequest.Builder(
    242,
    new CreatePaymentRequest.Builder(
        "payment_method4"
    )
    .build(),
    "order_id0"
)
.build();


try {
    GetChargeResponse result = chargesController.createCharge(request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Charge Payment Method

Updates a charge's payment method

```java
GetChargeResponse updateChargePaymentMethod(
    final String chargeId,
    final UpdateChargePaymentMethodRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `request` | [`UpdateChargePaymentMethodRequest`](../../doc/models/update-charge-payment-method-request.md) | Body, Required | Request for updating the payment method from a charge |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";
UpdateChargePaymentMethodRequest request = new UpdateChargePaymentMethodRequest.Builder(
    false,
    "payment_method4",
    new CreateCreditCardPaymentRequest.Builder()
        .installments(1)
        .capture(true)
        .recurrencyCycle("\"first\" or \"subsequent\"")
        .build(),
    new CreateDebitCardPaymentRequest.Builder()
        .build(),
    new CreateBoletoPaymentRequest.Builder(
        226,
        "instructions2",
        new CreateAddressRequest.Builder(
            "street8",
            "number4",
            "zip_code2",
            "neighborhood4",
            "city2",
            "state6",
            "country2",
            "complement6",
            "line_18",
            "line_26"
        )
        .build(),
        "document_number6",
        "statement_descriptor0"
    )
    .build(),
    new CreateVoucherPaymentRequest.Builder()
        .recurrencyCycle("\"first\" or \"subsequent\"")
        .build(),
    new CreateCashPaymentRequest.Builder(
        "description0",
        false
    )
    .build(),
    new CreateBankTransferPaymentRequest.Builder(
        "bank0",
        236
    )
    .build(),
    new CreatePrivateLabelPaymentRequest.Builder()
        .installments(1)
        .capture(true)
        .recurrencyCycle("\"first\" or \"subsequent\"")
        .build()
)
.build();


try {
    GetChargeResponse result = chargesController.updateChargePaymentMethod(chargeId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Charge Due Date

Updates the due date from a charge

```java
GetChargeResponse updateChargeDueDate(
    final String chargeId,
    final UpdateChargeDueDateRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge Id |
| `request` | [`UpdateChargeDueDateRequest`](../../doc/models/update-charge-due-date-request.md) | Body, Required | Request for updating the due date |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";
UpdateChargeDueDateRequest request = new UpdateChargeDueDateRequest.Builder()
    .build();


try {
    GetChargeResponse result = chargesController.updateChargeDueDate(chargeId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Charges Summary

```java
GetChargesSummaryResponse getChargesSummary(
    final String status,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `status` | `String` | Query, Required | - |
| `createdSince` | `LocalDateTime` | Query, Optional | - |
| `createdUntil` | `LocalDateTime` | Query, Optional | - |

## Response Type

[`GetChargesSummaryResponse`](../../doc/models/get-charges-summary-response.md)

## Example Usage

```java
String status = "status8";

try {
    GetChargesSummaryResponse result = chargesController.getChargesSummary(status, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Retry Charge

Retries a charge

```java
GetChargeResponse retryCharge(
    final String chargeId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

try {
    GetChargeResponse result = chargesController.retryCharge(chargeId, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Charges

Lists all charges

```java
ListChargesResponse getCharges(
    final Integer page,
    final Integer size,
    final String code,
    final String status,
    final String paymentMethod,
    final String customerId,
    final String orderId,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |
| `code` | `String` | Query, Optional | Filter for charge's code |
| `status` | `String` | Query, Optional | Filter for charge's status |
| `paymentMethod` | `String` | Query, Optional | Filter for charge's payment method |
| `customerId` | `String` | Query, Optional | Filter for charge's customer id |
| `orderId` | `String` | Query, Optional | Filter for charge's order id |
| `createdSince` | `LocalDateTime` | Query, Optional | Filter for the beginning of the range for charge's creation |
| `createdUntil` | `LocalDateTime` | Query, Optional | Filter for the end of the range for charge's creation |

## Response Type

[`ListChargesResponse`](../../doc/models/list-charges-response.md)

## Example Usage

```java
try {
    ListChargesResponse result = chargesController.getCharges(null, null, null, null, null, null, null, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Cancel Charge

Cancel a charge

```java
GetChargeResponse cancelCharge(
    final String chargeId,
    final CreateCancelChargeRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `chargeId` | `String` | Template, Required | Charge id |
| `request` | [`CreateCancelChargeRequest`](../../doc/models/create-cancel-charge-request.md) | Body, Optional | Request for cancelling a charge |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetChargeResponse`](../../doc/models/get-charge-response.md)

## Example Usage

```java
String chargeId = "charge_id8";

try {
    GetChargeResponse result = chargesController.cancelCharge(chargeId, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

