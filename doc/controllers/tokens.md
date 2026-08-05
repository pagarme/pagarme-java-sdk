# Tokens

```java
TokensController tokensController = client.getTokensController();
```

## Class Name

`TokensController`

## Methods

* [Create Token](../../doc/controllers/tokens.md#create-token)
* [Get Token](../../doc/controllers/tokens.md#get-token)


# Create Token

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<GetTokenResponse> createTokenAsync(
    final String publicKey,
    final CreateTokenRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `publicKey` | `String` | Template, Required | Public key |
| `request` | [`CreateTokenRequest`](../../doc/models/create-token-request.md) | Body, Required | Request for creating a token |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetTokenResponse`](../../doc/models/get-token-response.md)

## Example Usage

```java
String publicKey = "public_key6";
CreateTokenRequest request = new CreateTokenRequest.Builder(
    "card",
    null
)
.build();


tokensController.createTokenAsync(publicKey, request, null).thenAccept(result -> {
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


# Get Token

Gets a token from its id

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<GetTokenResponse> getTokenAsync(
    final String id,
    final String publicKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Token id |
| `publicKey` | `String` | Template, Required | Public key |

## Response Type

**200**

[`GetTokenResponse`](../../doc/models/get-token-response.md)

## Example Usage

```java
String id = "id0";
String publicKey = "public_key6";

tokensController.getTokenAsync(id, publicKey).thenAccept(result -> {
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

