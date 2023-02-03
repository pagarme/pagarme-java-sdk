# Recipients

```java
RecipientsController recipientsController = client.getRecipientsController();
```

## Class Name

`RecipientsController`

## Methods

* [Update Recipient](../../doc/controllers/recipients.md#update-recipient)
* [Create Anticipation](../../doc/controllers/recipients.md#create-anticipation)
* [Get Anticipation Limits](../../doc/controllers/recipients.md#get-anticipation-limits)
* [Get Recipients](../../doc/controllers/recipients.md#get-recipients)
* [Update Recipient Metadata](../../doc/controllers/recipients.md#update-recipient-metadata)
* [Get Transfer](../../doc/controllers/recipients.md#get-transfer)
* [Get Anticipation](../../doc/controllers/recipients.md#get-anticipation)
* [Update Recipient Transfer Settings](../../doc/controllers/recipients.md#update-recipient-transfer-settings)
* [Get Anticipations](../../doc/controllers/recipients.md#get-anticipations)
* [Update Recipient Default Bank Account](../../doc/controllers/recipients.md#update-recipient-default-bank-account)
* [Create Withdraw](../../doc/controllers/recipients.md#create-withdraw)
* [Get Balance](../../doc/controllers/recipients.md#get-balance)
* [Create Transfer](../../doc/controllers/recipients.md#create-transfer)
* [Create Recipient](../../doc/controllers/recipients.md#create-recipient)
* [Update Automatic Anticipation Settings](../../doc/controllers/recipients.md#update-automatic-anticipation-settings)
* [Get Recipient](../../doc/controllers/recipients.md#get-recipient)
* [Get Withdrawals](../../doc/controllers/recipients.md#get-withdrawals)
* [Get Withdraw by Id](../../doc/controllers/recipients.md#get-withdraw-by-id)
* [Get Transfers](../../doc/controllers/recipients.md#get-transfers)
* [Get Recipient by Code](../../doc/controllers/recipients.md#get-recipient-by-code)
* [Get Default Recipient](../../doc/controllers/recipients.md#get-default-recipient)


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
UpdateRecipientRequest request = new UpdateRecipientRequest();
request.setName("name6");
request.setEmail("email0");
request.setDescription("description6");
request.setType("type4");
request.setStatus("status8");
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");

request.setMetadata(metadata);


try {
    GetRecipientResponse response = recipientsController.updateRecipient(recipientId, request, null);
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
CreateAnticipationRequest request = new CreateAnticipationRequest();
request.setAmount(242);
request.setTimeframe("timeframe8");
request.setPaymentDate(LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME));


try {
    GetAnticipationResponse response = recipientsController.createAnticipation(recipientId, request, null);
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
LocalDateTime paymentDate = LocalDateTime.parse("2016-03-13T12:52:32.123Z", DateTimeFormatter.ISO_DATE_TIME);

try {
    GetAnticipationLimitResponse response = recipientsController.getAnticipationLimits(recipientId, timeframe, paymentDate);
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
    ListRecipientResponse response = recipientsController.getRecipients(null, null);
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
UpdateMetadataRequest request = new UpdateMetadataRequest();
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");

request.setMetadata(metadata);


try {
    GetRecipientResponse response = recipientsController.updateRecipientMetadata(recipientId, request, null);
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
    GetTransferResponse response = recipientsController.getTransfer(recipientId, transferId);
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
    GetAnticipationResponse response = recipientsController.getAnticipation(recipientId, anticipationId);
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
UpdateTransferSettingsRequest request = new UpdateTransferSettingsRequest();
request.setTransferEnabled("transfer_enabled2");
request.setTransferInterval("transfer_interval6");
request.setTransferDay("transfer_day6");


try {
    GetRecipientResponse response = recipientsController.updateRecipientTransferSettings(recipientId, request, null);
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
    ListAnticipationResponse response = recipientsController.getAnticipations(recipientId, null, null, null, null, null, null, null, null);
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
UpdateRecipientBankAccountRequest request = new UpdateRecipientBankAccountRequest();
CreateBankAccountRequest bankAccount = new CreateBankAccountRequest();
bankAccount.setHolderName("holder_name6");
bankAccount.setHolderType("holder_type2");
bankAccount.setHolderDocument("holder_document4");
bankAccount.setBank("bank8");
bankAccount.setBranchNumber("branch_number6");
bankAccount.setBranchCheckDigit("branch_check_digit6");
bankAccount.setAccountNumber("account_number0");
bankAccount.setAccountCheckDigit("account_check_digit6");
bankAccount.setType("type0");
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata9");
metadata.put("key1", "metadata8");

bankAccount.setMetadata(metadata);
bankAccount.setPixKey("pix_key4");

request.setBankAccount(bankAccount);
request.setPaymentMode("bank_transfer");


try {
    GetRecipientResponse response = recipientsController.updateRecipientDefaultBankAccount(recipientId, request, null);
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
CreateWithdrawRequest request = new CreateWithdrawRequest();
request.setAmount(242);

try {
    GetWithdrawResponse response = recipientsController.createWithdraw(recipientId, request);
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
    GetBalanceResponse response = recipientsController.getBalance(recipientId);
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
CreateTransferRequest request = new CreateTransferRequest();
request.setAmount(242);
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");

request.setMetadata(metadata);


try {
    GetTransferResponse response = recipientsController.createTransfer(recipientId, request, null);
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
CreateRecipientRequest request = new CreateRecipientRequest();
request.setName("name6");
request.setEmail("email0");
request.setDescription("description6");
request.setDocument("document0");
request.setType("type4");
CreateBankAccountRequest defaultBankAccount = new CreateBankAccountRequest();
defaultBankAccount.setHolderName("holder_name0");
defaultBankAccount.setHolderType("holder_type6");
defaultBankAccount.setHolderDocument("holder_document8");
defaultBankAccount.setBank("bank2");
defaultBankAccount.setBranchNumber("branch_number0");
defaultBankAccount.setBranchCheckDigit("branch_check_digit0");
defaultBankAccount.setAccountNumber("account_number4");
defaultBankAccount.setAccountCheckDigit("account_check_digit0");
defaultBankAccount.setType("type4");
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata5");

defaultBankAccount.setMetadata(metadata);
defaultBankAccount.setPixKey("pix_key8");

request.setDefaultBankAccount(defaultBankAccount);
Map<String, String> metadata = new LinkedHashMap<>();
metadata.put("key0", "metadata3");

request.setMetadata(metadata);
request.setCode("code4");
request.setPaymentMode("bank_transfer");


try {
    GetRecipientResponse response = recipientsController.createRecipient(request, null);
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
UpdateAutomaticAnticipationSettingsRequest request = new UpdateAutomaticAnticipationSettingsRequest();


try {
    GetRecipientResponse response = recipientsController.updateAutomaticAnticipationSettings(recipientId, request, null);
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
    GetRecipientResponse response = recipientsController.getRecipient(recipientId);
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
    ListWithdrawals response = recipientsController.getWithdrawals(recipientId, null, null, null, null, null);
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
    GetWithdrawResponse response = recipientsController.getWithdrawById(recipientId, withdrawalId);
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
    ListTransferResponse response = recipientsController.getTransfers(recipientId, null, null, null, null, null);
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
    GetRecipientResponse response = recipientsController.getRecipientByCode(code);
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
    GetRecipientResponse response = recipientsController.getDefaultRecipient();
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

