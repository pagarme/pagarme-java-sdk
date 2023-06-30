# Customers

```java
CustomersController customersController = client.getCustomersController();
```

## Class Name

`CustomersController`

## Methods

* [Update Card](../../doc/controllers/customers.md#update-card)
* [Update Address](../../doc/controllers/customers.md#update-address)
* [Delete Access Token](../../doc/controllers/customers.md#delete-access-token)
* [Create Address](../../doc/controllers/customers.md#create-address)
* [Create Customer](../../doc/controllers/customers.md#create-customer)
* [Create Card](../../doc/controllers/customers.md#create-card)
* [Get Cards](../../doc/controllers/customers.md#get-cards)
* [Renew Card](../../doc/controllers/customers.md#renew-card)
* [Get Address](../../doc/controllers/customers.md#get-address)
* [Delete Address](../../doc/controllers/customers.md#delete-address)
* [Get Access Token](../../doc/controllers/customers.md#get-access-token)
* [Update Customer Metadata](../../doc/controllers/customers.md#update-customer-metadata)
* [Get Card](../../doc/controllers/customers.md#get-card)
* [Delete Access Tokens](../../doc/controllers/customers.md#delete-access-tokens)
* [Create Access Token](../../doc/controllers/customers.md#create-access-token)
* [Get Access Tokens](../../doc/controllers/customers.md#get-access-tokens)
* [Get Customers](../../doc/controllers/customers.md#get-customers)
* [Update Customer](../../doc/controllers/customers.md#update-customer)
* [Delete Card](../../doc/controllers/customers.md#delete-card)
* [Get Addresses](../../doc/controllers/customers.md#get-addresses)
* [Get Customer](../../doc/controllers/customers.md#get-customer)


# Update Card

Updates a card

```java
GetCardResponse updateCard(
    final String customerId,
    final String cardId,
    final UpdateCardRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `cardId` | `String` | Template, Required | Card id |
| `request` | [`UpdateCardRequest`](../../doc/models/update-card-request.md) | Body, Required | Request for updating a card |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetCardResponse`](../../doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String cardId = "card_id4";
UpdateCardRequest request = new UpdateCardRequest.Builder(
    "holder_name2",
    10,
    30,
    new CreateAddressRequest.Builder(
        "street8",
        "number4",
        "zip_code2",
        "neighborhood4",
        "city8",
        "state4",
        "country2",
        "complement6",
        "line_18",
        "line_26"
    )
    .build(),
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }},
    "label6"
)
.build();


try {
    GetCardResponse result = customersController.updateCard(customerId, cardId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Address

Updates an address

```java
GetAddressResponse updateAddress(
    final String customerId,
    final String addressId,
    final UpdateAddressRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `addressId` | `String` | Template, Required | Address Id |
| `request` | [`UpdateAddressRequest`](../../doc/models/update-address-request.md) | Body, Required | Request for updating an address |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

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


try {
    GetAddressResponse result = customersController.updateAddress(customerId, addressId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Access Token

Delete a customer's access token

```java
GetAccessTokenResponse deleteAccessToken(
    final String customerId,
    final String tokenId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `tokenId` | `String` | Template, Required | Token Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetAccessTokenResponse`](../../doc/models/get-access-token-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String tokenId = "token_id6";

try {
    GetAccessTokenResponse result = customersController.deleteAccessToken(customerId, tokenId, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Address

Creates a new address for a customer

```java
GetAddressResponse createAddress(
    final String customerId,
    final CreateAddressRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `request` | [`CreateAddressRequest`](../../doc/models/create-address-request.md) | Body, Required | Request for creating an address |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

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


try {
    GetAddressResponse result = customersController.createAddress(customerId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Customer

Creates a new customer

```java
GetCustomerResponse createCustomer(
    final CreateCustomerRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `request` | [`CreateCustomerRequest`](../../doc/models/create-customer-request.md) | Body, Required | Request for creating a customer |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetCustomerResponse`](../../doc/models/get-customer-response.md)

## Example Usage

```java
CreateCustomerRequest request = new CreateCustomerRequest.Builder(
    "{\\n    \"name\": \"Tony Stark\"\\n}",
    "email0",
    "document0",
    "type4",
    new CreateAddressRequest.Builder(
        "street2",
        "number0",
        "zip_code6",
        "neighborhood8",
        "city2",
        "state8",
        "country6",
        "complement8",
        "line_16",
        "line_20"
    )
    .build(),
    new LinkedHashMap<String, String>() {{
        put("key0", "metadata3");
    }},
    new CreatePhonesRequest.Builder()
        .build(),
    "code4"
)
.build();


try {
    GetCustomerResponse result = customersController.createCustomer(request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Card

Creates a new card for a customer

```java
GetCardResponse createCard(
    final String customerId,
    final CreateCardRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `request` | [`CreateCardRequest`](../../doc/models/create-card-request.md) | Body, Required | Request for creating a card |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetCardResponse`](../../doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
CreateCardRequest request = new CreateCardRequest.Builder()
    .type("credit")
    .build();


try {
    GetCardResponse result = customersController.createCard(customerId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Cards

Get all cards from a customer

```java
ListCardsResponse getCards(
    final String customerId,
    final Integer page,
    final Integer size)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |

## Response Type

[`ListCardsResponse`](../../doc/models/list-cards-response.md)

## Example Usage

```java
String customerId = "customer_id8";

try {
    ListCardsResponse result = customersController.getCards(customerId, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Renew Card

Renew a card

```java
GetCardResponse renewCard(
    final String customerId,
    final String cardId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `cardId` | `String` | Template, Required | Card Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetCardResponse`](../../doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String cardId = "card_id4";

try {
    GetCardResponse result = customersController.renewCard(customerId, cardId, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Address

Get a customer's address

```java
GetAddressResponse getAddress(
    final String customerId,
    final String addressId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `addressId` | `String` | Template, Required | Address Id |

## Response Type

[`GetAddressResponse`](../../doc/models/get-address-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String addressId = "address_id0";

try {
    GetAddressResponse result = customersController.getAddress(customerId, addressId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Address

Delete a Customer's address

```java
GetAddressResponse deleteAddress(
    final String customerId,
    final String addressId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `addressId` | `String` | Template, Required | Address Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetAddressResponse`](../../doc/models/get-address-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String addressId = "address_id0";

try {
    GetAddressResponse result = customersController.deleteAddress(customerId, addressId, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Access Token

Get a Customer's access token

```java
GetAccessTokenResponse getAccessToken(
    final String customerId,
    final String tokenId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `tokenId` | `String` | Template, Required | Token Id |

## Response Type

[`GetAccessTokenResponse`](../../doc/models/get-access-token-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String tokenId = "token_id6";

try {
    GetAccessTokenResponse result = customersController.getAccessToken(customerId, tokenId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Customer Metadata

Updates the metadata a customer

```java
GetCustomerResponse updateCustomerMetadata(
    final String customerId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | The customer id |
| `request` | [`UpdateMetadataRequest`](../../doc/models/update-metadata-request.md) | Body, Required | Request for updating the customer metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

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


try {
    GetCustomerResponse result = customersController.updateCustomerMetadata(customerId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Card

Get a customer's card

```java
GetCardResponse getCard(
    final String customerId,
    final String cardId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `cardId` | `String` | Template, Required | Card id |

## Response Type

[`GetCardResponse`](../../doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String cardId = "card_id4";

try {
    GetCardResponse result = customersController.getCard(customerId, cardId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Access Tokens

Delete a Customer's access tokens

```java
ListAccessTokensResponse deleteAccessTokens(
    final String customerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |

## Response Type

[`ListAccessTokensResponse`](../../doc/models/list-access-tokens-response.md)

## Example Usage

```java
String customerId = "customer_id8";

try {
    ListAccessTokensResponse result = customersController.deleteAccessTokens(customerId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Access Token

Creates a access token for a customer

```java
GetAccessTokenResponse createAccessToken(
    final String customerId,
    final CreateAccessTokenRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `request` | [`CreateAccessTokenRequest`](../../doc/models/create-access-token-request.md) | Body, Required | Request for creating a access token |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetAccessTokenResponse`](../../doc/models/get-access-token-response.md)

## Example Usage

```java
String customerId = "customer_id8";
CreateAccessTokenRequest request = new CreateAccessTokenRequest.Builder()
    .build();


try {
    GetAccessTokenResponse result = customersController.createAccessToken(customerId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Access Tokens

Get all access tokens from a customer

```java
ListAccessTokensResponse getAccessTokens(
    final String customerId,
    final Integer page,
    final Integer size)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |

## Response Type

[`ListAccessTokensResponse`](../../doc/models/list-access-tokens-response.md)

## Example Usage

```java
String customerId = "customer_id8";

try {
    ListAccessTokensResponse result = customersController.getAccessTokens(customerId, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Customers

Get all Customers

```java
ListCustomersResponse getCustomers(
    final String name,
    final String document,
    final Integer page,
    final Integer size,
    final String email,
    final String code)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Query, Optional | Name of the Customer |
| `document` | `String` | Query, Optional | Document of the Customer |
| `page` | `Integer` | Query, Optional | Current page the the search<br>**Default**: `1` |
| `size` | `Integer` | Query, Optional | Quantity pages of the search<br>**Default**: `10` |
| `email` | `String` | Query, Optional | Customer's email |
| `code` | `String` | Query, Optional | Customer's code |

## Response Type

[`ListCustomersResponse`](../../doc/models/list-customers-response.md)

## Example Usage

```java
Integer page = 1;
Integer size = 10;

try {
    ListCustomersResponse result = customersController.getCustomers(null, null, page, size, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Customer

Updates a customer

```java
GetCustomerResponse updateCustomer(
    final String customerId,
    final UpdateCustomerRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `request` | [`UpdateCustomerRequest`](../../doc/models/update-customer-request.md) | Body, Required | Request for updating a customer |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetCustomerResponse`](../../doc/models/get-customer-response.md)

## Example Usage

```java
String customerId = "customer_id8";
UpdateCustomerRequest request = new UpdateCustomerRequest.Builder()
    .build();


try {
    GetCustomerResponse result = customersController.updateCustomer(customerId, request, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Card

Delete a customer's card

```java
GetCardResponse deleteCard(
    final String customerId,
    final String cardId,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `cardId` | `String` | Template, Required | Card Id |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetCardResponse`](../../doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String cardId = "card_id4";

try {
    GetCardResponse result = customersController.deleteCard(customerId, cardId, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Addresses

Gets all adressess from a customer

```java
ListAddressesResponse getAddresses(
    final String customerId,
    final Integer page,
    final Integer size)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `page` | `Integer` | Query, Optional | Page number |
| `size` | `Integer` | Query, Optional | Page size |

## Response Type

[`ListAddressesResponse`](../../doc/models/list-addresses-response.md)

## Example Usage

```java
String customerId = "customer_id8";

try {
    ListAddressesResponse result = customersController.getAddresses(customerId, null, null);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Customer

Get a customer

```java
GetCustomerResponse getCustomer(
    final String customerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |

## Response Type

[`GetCustomerResponse`](../../doc/models/get-customer-response.md)

## Example Usage

```java
String customerId = "customer_id8";

try {
    GetCustomerResponse result = customersController.getCustomer(customerId);
    System.out.println(result);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

