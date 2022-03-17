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
CompletableFuture<GetTokenResponse> createToken(
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

[`GetTokenResponse`](../../doc/models/get-token-response.md)

## Example Usage

```java
String publicKey = "public_key6";
CreateTokenRequest request = new CreateTokenRequest();
request.setType("card");
request.setCard(new CreateCardTokenRequest());
request.getCard().setNumber("number2");
request.getCard().setHolderName("holder_name6");
request.getCard().setExpMonth(80);
request.getCard().setExpYear(216);
request.getCard().setCvv("cvv8");
request.getCard().setBrand("brand4");
request.getCard().setLabel("label0");

try {
    GetTokenResponse response = tokensController.createToken(publicKey, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Token

Gets a token from its id

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<GetTokenResponse> getToken(
    final String id,
    final String publicKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Template, Required | Token id |
| `publicKey` | `String` | Template, Required | Public key |

## Response Type

[`GetTokenResponse`](../../doc/models/get-token-response.md)

## Example Usage

```java
String id = "id0";
String publicKey = "public_key6";

try {
    GetTokenResponse response = tokensController.getToken(id, publicKey);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

