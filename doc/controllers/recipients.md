# Recipients

```java
RecipientsController recipientsController = client.getRecipientsController();
```

## Class Name

`RecipientsController`

## Methods

* [Create Anticipation](../../doc/controllers/recipients.md#create-anticipation)
* [Create KYC Link](../../doc/controllers/recipients.md#create-kyc-link)
* [Create Recipient](../../doc/controllers/recipients.md#create-recipient)
* [Create Transfer](../../doc/controllers/recipients.md#create-transfer)
* [Create Withdraw](../../doc/controllers/recipients.md#create-withdraw)
* [Get Anticipation](../../doc/controllers/recipients.md#get-anticipation)
* [Get Anticipation Limits](../../doc/controllers/recipients.md#get-anticipation-limits)
* [Get Anticipations](../../doc/controllers/recipients.md#get-anticipations)
* [Get Balance](../../doc/controllers/recipients.md#get-balance)
* [Get Default Recipient](../../doc/controllers/recipients.md#get-default-recipient)
* [Get Recipient](../../doc/controllers/recipients.md#get-recipient)
* [Get Recipient by Code](../../doc/controllers/recipients.md#get-recipient-by-code)
* [Get Recipients](../../doc/controllers/recipients.md#get-recipients)
* [Get Transfer](../../doc/controllers/recipients.md#get-transfer)
* [Get Transfers](../../doc/controllers/recipients.md#get-transfers)
* [Get Withdraw by Id](../../doc/controllers/recipients.md#get-withdraw-by-id)
* [Get Withdrawals](../../doc/controllers/recipients.md#get-withdrawals)
* [Update Automatic Anticipation Settings](../../doc/controllers/recipients.md#update-automatic-anticipation-settings)
* [Update Recipient](../../doc/controllers/recipients.md#update-recipient)
* [Update Recipient Code](../../doc/controllers/recipients.md#update-recipient-code)
* [Update Recipient Default Bank Account](../../doc/controllers/recipients.md#update-recipient-default-bank-account)
* [Update Recipient Metadata](../../doc/controllers/recipients.md#update-recipient-metadata)
* [Update Recipient Transfer Settings](../../doc/controllers/recipients.md#update-recipient-transfer-settings)


# Create Anticipation

Creates an anticipation

```java
CompletableFuture<GetAnticipationResponse> createAnticipationAsync(
    final String recipientId,
    final CreateAnticipationRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `request` | [`CreateAnticipationRequest`](../../doc/models/create-anticipation-request.md) | Body, Required | Anticipation data |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetAnticipationResponse`](../../doc/models/get-anticipation-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
CreateAnticipationRequest request = new CreateAnticipationRequest.Builder(
    242,
    "timeframe8",
    DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z")
)
.build();


recipientsController.createAnticipationAsync(recipientId, request, null).thenAccept(result -> {
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


# Create KYC Link

Create a KYC link

```java
CompletableFuture<CreateKYCLinkResponse> createKYCLinkAsync(
    final String recipientId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |

## Response Type

**200**

[`CreateKYCLinkResponse`](../../doc/models/create-kyc-link-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";

recipientsController.createKYCLinkAsync(recipientId).thenAccept(result -> {
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


# Create Recipient

Creates a new recipient

```java
CompletableFuture<GetRecipientResponse> createRecipientAsync(
    final CreateRecipientRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `request` | [`CreateRecipientRequest`](../../doc/models/create-recipient-request.md) | Body, Required | Recipient data |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
CreateRecipientRequest request = new CreateRecipientRequest.Builder(
    null,
    null,
    null,
    "bank_transfer"
)
.build();


recipientsController.createRecipientAsync(request, null).thenAccept(result -> {
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


# Create Transfer

Creates a transfer for a recipient

```java
CompletableFuture<GetTransferResponse> createTransferAsync(
    final String recipientId,
    final CreateTransferRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient Id |
| `request` | [`CreateTransferRequest`](../../doc/models/create-transfer-request.md) | Body, Required | Transfer data |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetTransferResponse`](../../doc/models/get-transfer-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
CreateTransferRequest request = new CreateTransferRequest.Builder(
    242,
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


recipientsController.createTransferAsync(recipientId, request, null).thenAccept(result -> {
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


# Create Withdraw

```java
CompletableFuture<GetWithdrawResponse> createWithdrawAsync(
    final String recipientId,
    final CreateWithdrawRequest request)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | - |
| `request` | [`CreateWithdrawRequest`](../../doc/models/create-withdraw-request.md) | Body, Required | - |

## Response Type

**200**

[`GetWithdrawResponse`](../../doc/models/get-withdraw-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
CreateWithdrawRequest request = new CreateWithdrawRequest.Builder(
    242
)
.build();

recipientsController.createWithdrawAsync(recipientId, request).thenAccept(result -> {
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


# Get Anticipation

Gets an anticipation

```java
CompletableFuture<GetAnticipationResponse> getAnticipationAsync(
    final String recipientId,
    final String anticipationId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `anticipationId` | `String` | Template, Required | Anticipation id |

## Response Type

**200**

[`GetAnticipationResponse`](../../doc/models/get-anticipation-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
String anticipationId = "anticipation_id0";

recipientsController.getAnticipationAsync(recipientId, anticipationId).thenAccept(result -> {
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


# Get Anticipation Limits

Gets the anticipation limits for a recipient

```java
CompletableFuture<GetAnticipationLimitResponse> getAnticipationLimitsAsync(
    final String recipientId,
    final String timeframe,
    final LocalDateTime paymentDate)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `timeframe` | `String` | Query, Required | Timeframe |
| `paymentDate` | `LocalDateTime` | Query, Required | Anticipation payment date |

## Response Type

**200**

[`GetAnticipationLimitResponse`](../../doc/models/get-anticipation-limit-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
String timeframe = "timeframe2";
LocalDateTime paymentDate = DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z");

recipientsController.getAnticipationLimitsAsync(recipientId, timeframe, paymentDate).thenAccept(result -> {
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


# Get Anticipations

Retrieves a paginated list of anticipations from a recipient

```java
CompletableFuture<ListAnticipationResponse> getAnticipationsAsync(
    final String recipientId,
    final Integer page,
    final Integer size,
    final String status,
    final String timeframe,
    final LocalDateTime paymentDateSince,
    final LocalDateTime paymentDateUntil,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |
| `status` | `String` | Query, Optional | Filter for anticipation status |
| `timeframe` | `String` | Query, Optional | Filter for anticipation timeframe |
| `paymentDateSince` | `LocalDateTime` | Query, Optional | Filter for start range for anticipation payment date |
| `paymentDateUntil` | `LocalDateTime` | Query, Optional | Filter for end range for anticipation payment date |
| `createdSince` | `LocalDateTime` | Query, Optional | Filter for start range for anticipation creation date |
| `createdUntil` | `LocalDateTime` | Query, Optional | Filter for end range for anticipation creation date |

## Response Type

**200**

[`ListAnticipationResponse`](../../doc/models/list-anticipation-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";

recipientsController.getAnticipationsAsync(recipientId, null, null, null, null, null, null, null, null).thenAccept(result -> {
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


# Get Balance

Get balance information for a recipient

```java
CompletableFuture<GetBalanceResponse> getBalanceAsync(
    final String recipientId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |

## Response Type

**200**

[`GetBalanceResponse`](../../doc/models/get-balance-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";

recipientsController.getBalanceAsync(recipientId).thenAccept(result -> {
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


# Get Default Recipient

```java
CompletableFuture<GetRecipientResponse> getDefaultRecipientAsync()
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Response Type

**200**

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
recipientsController.getDefaultRecipientAsync().thenAccept(result -> {
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


# Get Recipient

Retrieves recipient information

```java
CompletableFuture<GetRecipientResponse> getRecipientAsync(
    final String recipientId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipiend id |

## Response Type

**200**

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";

recipientsController.getRecipientAsync(recipientId).thenAccept(result -> {
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


# Get Recipient by Code

Retrieves recipient information

```java
CompletableFuture<GetRecipientResponse> getRecipientByCodeAsync(
    final String code)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `code` | `String` | Template, Required | Recipient code |

## Response Type

**200**

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
String code = "code8";

recipientsController.getRecipientByCodeAsync(code).thenAccept(result -> {
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


# Get Recipients

Retrieves paginated recipients information

```java
CompletableFuture<ListRecipientResponse> getRecipientsAsync(
    final Integer page,
    final Integer size)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |

## Response Type

**200**

[`ListRecipientResponse`](../../doc/models/list-recipient-response.md)

## Example Usage

```java
recipientsController.getRecipientsAsync(null, null).thenAccept(result -> {
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


# Get Transfer

Gets a transfer

```java
CompletableFuture<GetTransferResponse> getTransferAsync(
    final String recipientId,
    final String transferId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `transferId` | `String` | Template, Required | Transfer id |

## Response Type

**200**

[`GetTransferResponse`](../../doc/models/get-transfer-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
String transferId = "transfer_id6";

recipientsController.getTransferAsync(recipientId, transferId).thenAccept(result -> {
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

Gets a paginated list of transfers for the recipient

```java
CompletableFuture<ListTransferResponse> getTransfersAsync(
    final String recipientId,
    final Integer page,
    final Integer size,
    final String status,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |
| `status` | `String` | Query, Optional | Filter for transfer status |
| `createdSince` | `LocalDateTime` | Query, Optional | Filter for start range of transfer creation date |
| `createdUntil` | `LocalDateTime` | Query, Optional | Filter for end range of transfer creation date |

## Response Type

**200**

[`ListTransferResponse`](../../doc/models/list-transfer-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";

recipientsController.getTransfersAsync(recipientId, null, null, null, null, null).thenAccept(result -> {
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


# Get Withdraw by Id

```java
CompletableFuture<GetWithdrawResponse> getWithdrawByIdAsync(
    final String recipientId,
    final String withdrawalId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | - |
| `withdrawalId` | `String` | Template, Required | - |

## Response Type

**200**

[`GetWithdrawResponse`](../../doc/models/get-withdraw-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
String withdrawalId = "withdrawal_id2";

recipientsController.getWithdrawByIdAsync(recipientId, withdrawalId).thenAccept(result -> {
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


# Get Withdrawals

Gets a paginated list of transfers for the recipient

```java
CompletableFuture<ListWithdrawals> getWithdrawalsAsync(
    final String recipientId,
    final Integer page,
    final Integer size,
    final String status,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | - |
| `page` | `Integer` | Query, Optional | - |
| `size` | `Integer` | Query, Optional | - |
| `status` | `String` | Query, Optional | - |
| `createdSince` | `LocalDateTime` | Query, Optional | - |
| `createdUntil` | `LocalDateTime` | Query, Optional | - |

## Response Type

**200**

[`ListWithdrawals`](../../doc/models/list-withdrawals.md)

## Example Usage

```java
String recipientId = "recipient_id0";

recipientsController.getWithdrawalsAsync(recipientId, null, null, null, null, null).thenAccept(result -> {
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


# Update Automatic Anticipation Settings

Updates recipient metadata

```java
CompletableFuture<GetRecipientResponse> updateAutomaticAnticipationSettingsAsync(
    final String recipientId,
    final UpdateAutomaticAnticipationSettingsRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `request` | [`UpdateAutomaticAnticipationSettingsRequest`](../../doc/models/update-automatic-anticipation-settings-request.md) | Body, Required | Metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
UpdateAutomaticAnticipationSettingsRequest request = new UpdateAutomaticAnticipationSettingsRequest.Builder()
    .build();


recipientsController.updateAutomaticAnticipationSettingsAsync(recipientId, request, null).thenAccept(result -> {
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


# Update Recipient

Updates a recipient

```java
CompletableFuture<GetRecipientResponse> updateRecipientAsync(
    final String recipientId,
    final UpdateRecipientRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `request` | [`UpdateRecipientRequest`](../../doc/models/update-recipient-request.md) | Body, Required | Recipient data |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
UpdateRecipientRequest request = new UpdateRecipientRequest.Builder(
    "name6",
    "email0",
    "description6",
    "type4",
    "status8",
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


recipientsController.updateRecipientAsync(recipientId, request, null).thenAccept(result -> {
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


# Update Recipient Code

Updates recipient code

```java
CompletableFuture<GetRecipientResponse> updateRecipientCodeAsync(
    final String recipientId,
    final UpdateRecipientCodeRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `request` | [`UpdateRecipientCodeRequest`](../../doc/models/update-recipient-code-request.md) | Body, Required | UpdateRecipientCodeRequest |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
UpdateRecipientCodeRequest request = new UpdateRecipientCodeRequest.Builder(
    "code4"
)
.build();


recipientsController.updateRecipientCodeAsync(recipientId, request, null).thenAccept(result -> {
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


# Update Recipient Default Bank Account

Updates the default bank account from a recipient

```java
CompletableFuture<GetRecipientResponse> updateRecipientDefaultBankAccountAsync(
    final String recipientId,
    final UpdateRecipientBankAccountRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `request` | [`UpdateRecipientBankAccountRequest`](../../doc/models/update-recipient-bank-account-request.md) | Body, Required | Bank account data |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
UpdateRecipientBankAccountRequest request = new UpdateRecipientBankAccountRequest.Builder(
    null,
    "bank_transfer"
)
.build();


recipientsController.updateRecipientDefaultBankAccountAsync(recipientId, request, null).thenAccept(result -> {
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


# Update Recipient Metadata

Updates recipient metadata

```java
CompletableFuture<GetRecipientResponse> updateRecipientMetadataAsync(
    final String recipientId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
UpdateMetadataRequest request = new UpdateMetadataRequest.Builder(
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


recipientsController.updateRecipientMetadataAsync(recipientId, request, null).thenAccept(result -> {
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


# Update Recipient Transfer Settings

```java
CompletableFuture<GetRecipientResponse> updateRecipientTransferSettingsAsync(
    final String recipientId,
    final UpdateTransferSettingsRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient Identificator |
| `request` | [`UpdateTransferSettingsRequest`](../../doc/models/update-transfer-settings-request.md) | Body, Required | - |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
UpdateTransferSettingsRequest request = new UpdateTransferSettingsRequest.Builder(
    "transfer_enabled2",
    "transfer_interval6",
    "transfer_day6"
)
.build();


recipientsController.updateRecipientTransferSettingsAsync(recipientId, request, null).thenAccept(result -> {
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

