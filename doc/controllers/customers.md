# Customers

```java
CustomersController customersController = client.getCustomersController();
```

## Class Name

`CustomersController`

## Methods

* [Create Access Token](../../doc/controllers/customers.md#create-access-token)
* [Create Address](../../doc/controllers/customers.md#create-address)
* [Create Card](../../doc/controllers/customers.md#create-card)
* [Create Customer](../../doc/controllers/customers.md#create-customer)
* [Delete Access Token](../../doc/controllers/customers.md#delete-access-token)
* [Delete Access Tokens](../../doc/controllers/customers.md#delete-access-tokens)
* [Delete Address](../../doc/controllers/customers.md#delete-address)
* [Delete Card](../../doc/controllers/customers.md#delete-card)
* [Get Access Token](../../doc/controllers/customers.md#get-access-token)
* [Get Access Tokens](../../doc/controllers/customers.md#get-access-tokens)
* [Get Address](../../doc/controllers/customers.md#get-address)
* [Get Addresses](../../doc/controllers/customers.md#get-addresses)
* [Get Card](../../doc/controllers/customers.md#get-card)
* [Get Cards](../../doc/controllers/customers.md#get-cards)
* [Get Customer](../../doc/controllers/customers.md#get-customer)
* [Get Customers](../../doc/controllers/customers.md#get-customers)
* [Renew Card](../../doc/controllers/customers.md#renew-card)
* [Update Address](../../doc/controllers/customers.md#update-address)
* [Update Card](../../doc/controllers/customers.md#update-card)
* [Update Customer](../../doc/controllers/customers.md#update-customer)
* [Update Customer Metadata](../../doc/controllers/customers.md#update-customer-metadata)


# Create Access Token

Creates a access token for a customer

```java
CompletableFuture<GetAccessTokenResponse> createAccessTokenAsync(
    final String customerId,
    final CreateAccessTokenRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `request` | [`CreateAccessTokenRequest`](../../doc/models/create-access-token-request.md) | Body, Required | Request for creating a access token |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetAccessTokenResponse`](../../doc/models/get-access-token-response.md)

## Example Usage

```java
String customerId = "customer_id8";
CreateAccessTokenRequest request = new CreateAccessTokenRequest.Builder()
    .build();


customersController.createAccessTokenAsync(customerId, request, null).thenAccept(result -> {
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


# Create Address

Creates a new address for a customer

```java
CompletableFuture<GetAddressResponse> createAddressAsync(
    final String customerId,
    final CreateAddressRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `request` | [`CreateAddressRequest`](../../doc/models/create-address-request.md) | Body, Required | Request for creating an address |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetAddressResponse`](../../doc/models/get-address-response.md)

## Example Usage

```java
String customerId = "customer_id8";
CreateAddressRequest request = new CreateAddressRequest.Builder(
    "street6",
    "number4",
    "zip_code0",
    "neighborhood2",
    "city6",
    "state2",
    "country0",
    "complement2",
    "line_10",
    "line_24"
)
.build();


customersController.createAddressAsync(customerId, request, null).thenAccept(result -> {
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


# Create Card

Creates a new card for a customer

```java
CompletableFuture<GetCardResponse> createCardAsync(
    final String customerId,
    final CreateCardRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `request` | [`CreateCardRequest`](../../doc/models/create-card-request.md) | Body, Required | Request for creating a card |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetCardResponse`](../../doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
CreateCardRequest request = new CreateCardRequest.Builder()
    .type("credit")
    .build();


customersController.createCardAsync(customerId, request, null).thenAccept(result -> {
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


# Create Customer

Creates a new customer

```java
CompletableFuture<GetCustomerResponse> createCustomerAsync(
    final CreateCustomerRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `request` | [`CreateCustomerRequest`](../../doc/models/create-customer-request.md) | Body, Required | Request for creating a customer |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetCustomerResponse`](../../doc/models/get-customer-response.md)

## Example Usage

```java
CreateCustomerRequest request = new CreateCustomerRequest.Builder(
    "Tony Stark",
    null,
    null,
    null,
    null,
    null,
    null,
    null
)
.build();


customersController.createCustomerAsync(request, null).thenAccept(result -> {
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


# Delete Access Token

Delete a customer's access token

```java
CompletableFuture<GetAccessTokenResponse> deleteAccessTokenAsync(
    final String customerId,
    final String tokenId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `tokenId` | `String` | Template, Required | Token Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetAccessTokenResponse`](../../doc/models/get-access-token-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String tokenId = "token_id6";

customersController.deleteAccessTokenAsync(customerId, tokenId, null).thenAccept(result -> {
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


# Delete Access Tokens

Delete a Customer's access tokens

```java
CompletableFuture<ListAccessTokensResponse> deleteAccessTokensAsync(
    final String customerId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |

## Response Type

**200**

[`ListAccessTokensResponse`](../../doc/models/list-access-tokens-response.md)

## Example Usage

```java
String customerId = "customer_id8";

customersController.deleteAccessTokensAsync(customerId).thenAccept(result -> {
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


# Delete Address

Delete a Customer's address

```java
CompletableFuture<GetAddressResponse> deleteAddressAsync(
    final String customerId,
    final String addressId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `addressId` | `String` | Template, Required | Address Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetAddressResponse`](../../doc/models/get-address-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String addressId = "address_id0";

customersController.deleteAddressAsync(customerId, addressId, null).thenAccept(result -> {
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


# Delete Card

Delete a customer's card

```java
CompletableFuture<GetCardResponse> deleteCardAsync(
    final String customerId,
    final String cardId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `cardId` | `String` | Template, Required | Card Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetCardResponse`](../../doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String cardId = "card_id4";

customersController.deleteCardAsync(customerId, cardId, null).thenAccept(result -> {
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


# Get Access Token

Get a Customer's access token

```java
CompletableFuture<GetAccessTokenResponse> getAccessTokenAsync(
    final String customerId,
    final String tokenId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `tokenId` | `String` | Template, Required | Token Id |

## Response Type

**200**

[`GetAccessTokenResponse`](../../doc/models/get-access-token-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String tokenId = "token_id6";

customersController.getAccessTokenAsync(customerId, tokenId).thenAccept(result -> {
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


# Get Access Tokens

Get all access tokens from a customer

```java
CompletableFuture<ListAccessTokensResponse> getAccessTokensAsync(
    final String customerId,
    final Integer page,
    final Integer size)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |

## Response Type

**200**

[`ListAccessTokensResponse`](../../doc/models/list-access-tokens-response.md)

## Example Usage

```java
String customerId = "customer_id8";

customersController.getAccessTokensAsync(customerId, null, null).thenAccept(result -> {
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


# Get Address

Get a customer's address

```java
CompletableFuture<GetAddressResponse> getAddressAsync(
    final String customerId,
    final String addressId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `addressId` | `String` | Template, Required | Address Id |

## Response Type

**200**

[`GetAddressResponse`](../../doc/models/get-address-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String addressId = "address_id0";

customersController.getAddressAsync(customerId, addressId).thenAccept(result -> {
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


# Get Addresses

Gets all adressess from a customer

```java
CompletableFuture<ListAddressesResponse> getAddressesAsync(
    final String customerId,
    final Integer page,
    final Integer size)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |

## Response Type

**200**

[`ListAddressesResponse`](../../doc/models/list-addresses-response.md)

## Example Usage

```java
String customerId = "customer_id8";

customersController.getAddressesAsync(customerId, null, null).thenAccept(result -> {
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


# Get Card

Get a customer's card

```java
CompletableFuture<GetCardResponse> getCardAsync(
    final String customerId,
    final String cardId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `cardId` | `String` | Template, Required | Card id |

## Response Type

**200**

[`GetCardResponse`](../../doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String cardId = "card_id4";

customersController.getCardAsync(customerId, cardId).thenAccept(result -> {
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


# Get Cards

Get all cards from a customer

```java
CompletableFuture<ListCardsResponse> getCardsAsync(
    final String customerId,
    final Integer page,
    final Integer size)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |

## Response Type

**200**

[`ListCardsResponse`](../../doc/models/list-cards-response.md)

## Example Usage

```java
String customerId = "customer_id8";

customersController.getCardsAsync(customerId, null, null).thenAccept(result -> {
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


# Get Customer

Get a customer

```java
CompletableFuture<GetCustomerResponse> getCustomerAsync(
    final String customerId)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |

## Response Type

**200**

[`GetCustomerResponse`](../../doc/models/get-customer-response.md)

## Example Usage

```java
String customerId = "customer_id8";

customersController.getCustomerAsync(customerId).thenAccept(result -> {
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


# Get Customers

Get all Customers

```java
CompletableFuture<ListCustomersResponse> getCustomersAsync(
    final String name,
    final String document,
    final Integer page,
    final Integer size,
    final String email,
    final String code)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Name of the Customer |
| `document` | `String` | Query, Optional | Document of the Customer |
| `page` | `Integer` | Query, Optional | Current page the the search<br><br>**Default**: `1` |
| `size` | `Integer` | Query, Optional | Quantity pages of the search<br><br>**Default**: `10` |
| `email` | `String` | Query, Optional | Customer's email |
| `code` | `String` | Query, Optional | Customer's code |

## Response Type

**200**

[`ListCustomersResponse`](../../doc/models/list-customers-response.md)

## Example Usage

```java
Integer page = 1;
Integer size = 10;

customersController.getCustomersAsync(null, null, page, size, null, null).thenAccept(result -> {
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


# Renew Card

Renew a card

```java
CompletableFuture<GetCardResponse> renewCardAsync(
    final String customerId,
    final String cardId,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `cardId` | `String` | Template, Required | Card Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetCardResponse`](../../doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String cardId = "card_id4";

customersController.renewCardAsync(customerId, cardId, null).thenAccept(result -> {
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


# Update Address

Updates an address

```java
CompletableFuture<GetAddressResponse> updateAddressAsync(
    final String customerId,
    final String addressId,
    final UpdateAddressRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `addressId` | `String` | Template, Required | Address Id |
| `request` | [`UpdateAddressRequest`](../../doc/models/update-address-request.md) | Body, Required | Request for updating an address |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetAddressResponse`](../../doc/models/get-address-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String addressId = "address_id0";
UpdateAddressRequest request = new UpdateAddressRequest.Builder(
    "number4",
    "complement2",
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }},
    "line_24"
)
.build();


customersController.updateAddressAsync(customerId, addressId, request, null).thenAccept(result -> {
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


# Update Card

Updates a card

```java
CompletableFuture<GetCardResponse> updateCardAsync(
    final String customerId,
    final String cardId,
    final UpdateCardRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `cardId` | `String` | Template, Required | Card id |
| `request` | [`UpdateCardRequest`](../../doc/models/update-card-request.md) | Body, Required | Request for updating a card |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetCardResponse`](../../doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String cardId = "card_id4";
UpdateCardRequest request = new UpdateCardRequest.Builder(
    "holder_name2",
    10,
    30,
    null,
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }},
    "label6"
)
.build();


customersController.updateCardAsync(customerId, cardId, request, null).thenAccept(result -> {
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


# Update Customer

Updates a customer

```java
CompletableFuture<GetCustomerResponse> updateCustomerAsync(
    final String customerId,
    final UpdateCustomerRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `request` | [`UpdateCustomerRequest`](../../doc/models/update-customer-request.md) | Body, Required | Request for updating a customer |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetCustomerResponse`](../../doc/models/get-customer-response.md)

## Example Usage

```java
String customerId = "customer_id8";
UpdateCustomerRequest request = new UpdateCustomerRequest.Builder()
    .build();


customersController.updateCustomerAsync(customerId, request, null).thenAccept(result -> {
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


# Update Customer Metadata

Updates the metadata a customer

```java
CompletableFuture<GetCustomerResponse> updateCustomerMetadataAsync(
    final String customerId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [httpBasic](../../doc/auth/basic-authentication.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | The customer id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Request for updating the customer metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

**200**

[`GetCustomerResponse`](../../doc/models/get-customer-response.md)

## Example Usage

```java
String customerId = "customer_id8";
UpdateMetadataRequest request = new UpdateMetadataRequest.Builder(
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }}
)
.build();


customersController.updateCustomerMetadataAsync(customerId, request, null).thenAccept(result -> {
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

