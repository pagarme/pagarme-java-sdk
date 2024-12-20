# Recipients

```java
RecipientsController recipientsController = client.getRecipientsController();
```

## Class Name

`RecipientsController`

## Methods

* [Update Recipient](../../doc/controllers/recipients.md#update-recipient)
* [Get Withdraw by Id](../../doc/controllers/recipients.md#get-withdraw-by-id)
* [Get Recipient](../../doc/controllers/recipients.md#get-recipient)
* [Get Balance](../../doc/controllers/recipients.md#get-balance)
* [Get Recipients](../../doc/controllers/recipients.md#get-recipients)
* [Update Recipient Default Bank Account](../../doc/controllers/recipients.md#update-recipient-default-bank-account)
* [Get Transfers](../../doc/controllers/recipients.md#get-transfers)
* [Get Transfer](../../doc/controllers/recipients.md#get-transfer)
* [Create Withdraw](../../doc/controllers/recipients.md#create-withdraw)
* [Get Anticipation](../../doc/controllers/recipients.md#get-anticipation)
* [Update Recipient Transfer Settings](../../doc/controllers/recipients.md#update-recipient-transfer-settings)
* [Get Recipient by Code](../../doc/controllers/recipients.md#get-recipient-by-code)
* [Update Automatic Anticipation Settings](../../doc/controllers/recipients.md#update-automatic-anticipation-settings)
* [Create Transfer](../../doc/controllers/recipients.md#create-transfer)
* [Create Recipient](../../doc/controllers/recipients.md#create-recipient)
* [Get Default Recipient](../../doc/controllers/recipients.md#get-default-recipient)
* [Create Anticipation](../../doc/controllers/recipients.md#create-anticipation)
* [Get Anticipation Limits](../../doc/controllers/recipients.md#get-anticipation-limits)
* [Update Recipient Metadata](../../doc/controllers/recipients.md#update-recipient-metadata)
* [Get Anticipations](../../doc/controllers/recipients.md#get-anticipations)
* [Get Withdrawals](../../doc/controllers/recipients.md#get-withdrawals)
* [Create KYC Link](../../doc/controllers/recipients.md#create-kyc-link)
* [Update Recipient Code](../../doc/controllers/recipients.md#update-recipient-code)


# Update Recipient

Updates a recipient

```java
GetRecipientResponse updateRecipient(
    final String recipientId,
    final UpdateRecipientRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `request` | [`UpdateRecipientRequest`](../../doc/models/update-recipient-request.md) | Body, Required | Recipient data |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

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


try {
    GetRecipientResponse result = recipientsController.updateRecipient(recipientId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Withdraw by Id

```java
GetWithdrawResponse getWithdrawById(
    final String recipientId,
    final String withdrawalId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | - |
| `withdrawalId` | `String` | Template, Required | - |

## Response Type

[`GetWithdrawResponse`](../../doc/models/get-withdraw-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
String withdrawalId = "withdrawal_id2";

try {
    GetWithdrawResponse result = recipientsController.getWithdrawById(recipientId, withdrawalId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Recipient

Retrieves recipient information

```java
GetRecipientResponse getRecipient(
    final String recipientId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipiend id |

## Response Type

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";

try {
    GetRecipientResponse result = recipientsController.getRecipient(recipientId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Balance

Get balance information for a recipient

```java
GetBalanceResponse getBalance(
    final String recipientId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |

## Response Type

[`GetBalanceResponse`](../../doc/models/get-balance-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";

try {
    GetBalanceResponse result = recipientsController.getBalance(recipientId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Recipients

Retrieves paginated recipients information

```java
ListRecipientResponse getRecipients(
    final Integer page,
    final Integer size)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |

## Response Type

[`ListRecipientResponse`](../../doc/models/list-recipient-response.md)

## Example Usage

```java
try {
    ListRecipientResponse result = recipientsController.getRecipients(null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Recipient Default Bank Account

Updates the default bank account from a recipient

```java
GetRecipientResponse updateRecipientDefaultBankAccount(
    final String recipientId,
    final UpdateRecipientBankAccountRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `request` | [`UpdateRecipientBankAccountRequest`](../../doc/models/update-recipient-bank-account-request.md) | Body, Required | Bank account data |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
UpdateRecipientBankAccountRequest request = new UpdateRecipientBankAccountRequest.Builder(
    new CreateBankAccountRequest.Builder(
        "holder_name0",
        "holder_type6",
        "holder_document8",
        "bank2",
        "branch_number0",
        "account_number4",
        "account_check_digit0",
        "type6",
        new LinkedHashMap<String, String>() {{
            put("key0", "metadata1");
            put("key1", "metadata0");
        }}
    )
    .build(),
    "bank_transfer"
)
.build();


try {
    GetRecipientResponse result = recipientsController.updateRecipientDefaultBankAccount(recipientId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Transfers

Gets a paginated list of transfers for the recipient

```java
ListTransferResponse getTransfers(
    final String recipientId,
    final Integer page,
    final Integer size,
    final String status,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil)
```

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

[`ListTransferResponse`](../../doc/models/list-transfer-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";

try {
    ListTransferResponse result = recipientsController.getTransfers(recipientId, null, null, null, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Transfer

Gets a transfer

```java
GetTransferResponse getTransfer(
    final String recipientId,
    final String transferId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `transferId` | `String` | Template, Required | Transfer id |

## Response Type

[`GetTransferResponse`](../../doc/models/get-transfer-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
String transferId = "transfer_id6";

try {
    GetTransferResponse result = recipientsController.getTransfer(recipientId, transferId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Withdraw

```java
GetWithdrawResponse createWithdraw(
    final String recipientId,
    final CreateWithdrawRequest request)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | - |
| `request` | [`CreateWithdrawRequest`](../../doc/models/create-withdraw-request.md) | Body, Required | - |

## Response Type

[`GetWithdrawResponse`](../../doc/models/get-withdraw-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
CreateWithdrawRequest request = new CreateWithdrawRequest.Builder(
    242
)
.build();

try {
    GetWithdrawResponse result = recipientsController.createWithdraw(recipientId, request);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Anticipation

Gets an anticipation

```java
GetAnticipationResponse getAnticipation(
    final String recipientId,
    final String anticipationId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `anticipationId` | `String` | Template, Required | Anticipation id |

## Response Type

[`GetAnticipationResponse`](../../doc/models/get-anticipation-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
String anticipationId = "anticipation_id0";

try {
    GetAnticipationResponse result = recipientsController.getAnticipation(recipientId, anticipationId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Recipient Transfer Settings

```java
GetRecipientResponse updateRecipientTransferSettings(
    final String recipientId,
    final UpdateTransferSettingsRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient Identificator |
| `request` | [`UpdateTransferSettingsRequest`](../../doc/models/update-transfer-settings-request.md) | Body, Required | - |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

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


try {
    GetRecipientResponse result = recipientsController.updateRecipientTransferSettings(recipientId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Recipient by Code

Retrieves recipient information

```java
GetRecipientResponse getRecipientByCode(
    final String code)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `code` | `String` | Template, Required | Recipient code |

## Response Type

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
String code = "code8";

try {
    GetRecipientResponse result = recipientsController.getRecipientByCode(code);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Automatic Anticipation Settings

Updates recipient metadata

```java
GetRecipientResponse updateAutomaticAnticipationSettings(
    final String recipientId,
    final UpdateAutomaticAnticipationSettingsRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `request` | [`UpdateAutomaticAnticipationSettingsRequest`](../../doc/models/update-automatic-anticipation-settings-request.md) | Body, Required | Metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
UpdateAutomaticAnticipationSettingsRequest request = new UpdateAutomaticAnticipationSettingsRequest.Builder()
    .build();


try {
    GetRecipientResponse result = recipientsController.updateAutomaticAnticipationSettings(recipientId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Transfer

Creates a transfer for a recipient

```java
GetTransferResponse createTransfer(
    final String recipientId,
    final CreateTransferRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient Id |
| `request` | [`CreateTransferRequest`](../../doc/models/create-transfer-request.md) | Body, Required | Transfer data |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

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


try {
    GetTransferResponse result = recipientsController.createTransfer(recipientId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Recipient

Creates a new recipient

```java
GetRecipientResponse createRecipient(
    final CreateRecipientRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `request` | [`CreateRecipientRequest`](../../doc/models/create-recipient-request.md) | Body, Required | Recipient data |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
CreateRecipientRequest request = new CreateRecipientRequest.Builder(
    new CreateBankAccountRequest.Builder(
        "holder_name4",
        "holder_type0",
        "holder_document2",
        "bank6",
        "branch_number4",
        "account_number8",
        "account_check_digit4",
        "type2",
        new LinkedHashMap<String, String>() {{
            put("key0", "metadata5");
            put("key1", "metadata4");
            put("key2", "metadata3");
        }}
    )
    .build(),
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }},
    "code4",
    "bank_transfer"
)
.build();


try {
    GetRecipientResponse result = recipientsController.createRecipient(request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Default Recipient

```java
GetRecipientResponse getDefaultRecipient()
```

## Response Type

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
try {
    GetRecipientResponse result = recipientsController.getDefaultRecipient();
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Anticipation

Creates an anticipation

```java
GetAnticipationResponse createAnticipation(
    final String recipientId,
    final CreateAnticipationRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `request` | [`CreateAnticipationRequest`](../../doc/models/create-anticipation-request.md) | Body, Required | Anticipation data |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

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


try {
    GetAnticipationResponse result = recipientsController.createAnticipation(recipientId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Anticipation Limits

Gets the anticipation limits for a recipient

```java
GetAnticipationLimitResponse getAnticipationLimits(
    final String recipientId,
    final String timeframe,
    final LocalDateTime paymentDate)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `timeframe` | `String` | Query, Required | Timeframe |
| `paymentDate` | `LocalDateTime` | Query, Required | Anticipation payment date |

## Response Type

[`GetAnticipationLimitResponse`](../../doc/models/get-anticipation-limit-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
String timeframe = "timeframe2";
LocalDateTime paymentDate = DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z");

try {
    GetAnticipationLimitResponse result = recipientsController.getAnticipationLimits(recipientId, timeframe, paymentDate);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Recipient Metadata

Updates recipient metadata

```java
GetRecipientResponse updateRecipientMetadata(
    final String recipientId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

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


try {
    GetRecipientResponse result = recipientsController.updateRecipientMetadata(recipientId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Anticipations

Retrieves a paginated list of anticipations from a recipient

```java
ListAnticipationResponse getAnticipations(
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

[`ListAnticipationResponse`](../../doc/models/list-anticipation-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";

try {
    ListAnticipationResponse result = recipientsController.getAnticipations(recipientId, null, null, null, null, null, null, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Withdrawals

Gets a paginated list of transfers for the recipient

```java
ListWithdrawals getWithdrawals(
    final String recipientId,
    final Integer page,
    final Integer size,
    final String status,
    final LocalDateTime createdSince,
    final LocalDateTime createdUntil)
```

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

[`ListWithdrawals`](../../doc/models/list-withdrawals.md)

## Example Usage

```java
String recipientId = "recipient_id0";

try {
    ListWithdrawals result = recipientsController.getWithdrawals(recipientId, null, null, null, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create KYC Link

Create a KYC link

```java
CreateKYCLinkResponse createKYCLink(
    final String recipientId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |

## Response Type

[`CreateKYCLinkResponse`](../../doc/models/create-kyc-link-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";

try {
    CreateKYCLinkResponse result = recipientsController.createKYCLink(recipientId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Recipient Code

Updates recipient code

```java
GetRecipientResponse updateRecipientCode(
    final String recipientId,
    final UpdateRecipientCodeRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `recipientId` | `String` | Template, Required | Recipient id |
| `request` | [`UpdateRecipientCodeRequest`](../../doc/models/update-recipient-code-request.md) | Body, Required | UpdateRecipientCodeRequest |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetRecipientResponse`](../../doc/models/get-recipient-response.md)

## Example Usage

```java
String recipientId = "recipient_id0";
UpdateRecipientCodeRequest request = new UpdateRecipientCodeRequest.Builder(
    "code4"
)
.build();


try {
    GetRecipientResponse result = recipientsController.updateRecipientCode(recipientId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

