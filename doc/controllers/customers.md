# Customers

```java
CustomersController customersController = client.getCustomersController();
```

## Class Name

`CustomersController`

## Methods

* [Update Card](/doc/controllers/customers.md#update-card)
* [Update Address](/doc/controllers/customers.md#update-address)
* [Delete Access Token](/doc/controllers/customers.md#delete-access-token)
* [Create Address](/doc/controllers/customers.md#create-address)
* [Create Customer](/doc/controllers/customers.md#create-customer)
* [Create Card](/doc/controllers/customers.md#create-card)
* [Get Cards](/doc/controllers/customers.md#get-cards)
* [Renew Card](/doc/controllers/customers.md#renew-card)
* [Get Address](/doc/controllers/customers.md#get-address)
* [Delete Address](/doc/controllers/customers.md#delete-address)
* [Get Access Token](/doc/controllers/customers.md#get-access-token)
* [Update Customer Metadata](/doc/controllers/customers.md#update-customer-metadata)
* [Get Card](/doc/controllers/customers.md#get-card)
* [Delete Access Tokens](/doc/controllers/customers.md#delete-access-tokens)
* [Create Access Token](/doc/controllers/customers.md#create-access-token)
* [Get Access Tokens](/doc/controllers/customers.md#get-access-tokens)
* [Get Customers](/doc/controllers/customers.md#get-customers)
* [Update Customer](/doc/controllers/customers.md#update-customer)
* [Delete Card](/doc/controllers/customers.md#delete-card)
* [Get Addresses](/doc/controllers/customers.md#get-addresses)
* [Get Customer](/doc/controllers/customers.md#get-customer)


# Update Card

Updates a card

```java
CompletableFuture<GetCardResponse> updateCard(
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
| `request` | [`UpdateCardRequest`](/doc/models/update-card-request.md) | Body, Required | Request for updating a card |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetCardResponse`](/doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String cardId = "card_id4";
UpdateCardRequest request = new UpdateCardRequest();
request.setHolderName("holder_name2");
request.setExpMonth(10);
request.setExpYear(30);
request.setBillingAddressId("billing_address_id2");
request.setBillingAddress(new CreateAddressRequest());
request.getBillingAddress().setStreet("street8");
request.getBillingAddress().setNumber("number4");
request.getBillingAddress().setZipCode("zip_code2");
request.getBillingAddress().setNeighborhood("neighborhood4");
request.getBillingAddress().setCity("city8");
request.getBillingAddress().setState("state4");
request.getBillingAddress().setCountry("country2");
request.getBillingAddress().setComplement("complement6");
request.getBillingAddress().setMetadata(new LinkedHashMap<>());
request.getBillingAddress().getMetadata().put("key0", "metadata5");
request.getBillingAddress().getMetadata().put("key1", "metadata6");
request.getBillingAddress().setLine1("line_18");
request.getBillingAddress().setLine2("line_26");
request.setMetadata(new LinkedHashMap<>());
request.getMetadata().put("key0", "metadata3");
request.setLabel("label6");

try {
    GetCardResponse response = customersController.updateCard(customerId, cardId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Address

Updates an address

```java
CompletableFuture<GetAddressResponse> updateAddress(
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
| `request` | [`UpdateAddressRequest`](/doc/models/update-address-request.md) | Body, Required | Request for updating an address |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetAddressResponse`](/doc/models/get-address-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String addressId = "address_id0";
UpdateAddressRequest request = new UpdateAddressRequest();
request.setNumber("number4");
request.setComplement("complement2");
request.setMetadata(new LinkedHashMap<>());
request.getMetadata().put("key0", "metadata3");
request.setLine2("line_24");

try {
    GetAddressResponse response = customersController.updateAddress(customerId, addressId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Access Token

Delete a customer's access token

```java
CompletableFuture<GetAccessTokenResponse> deleteAccessToken(
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

[`GetAccessTokenResponse`](/doc/models/get-access-token-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String tokenId = "token_id6";

try {
    GetAccessTokenResponse response = customersController.deleteAccessToken(customerId, tokenId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Address

Creates a new address for a customer

```java
CompletableFuture<GetAddressResponse> createAddress(
    final String customerId,
    final CreateAddressRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `request` | [`CreateAddressRequest`](/doc/models/create-address-request.md) | Body, Required | Request for creating an address |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetAddressResponse`](/doc/models/get-address-response.md)

## Example Usage

```java
String customerId = "customer_id8";
CreateAddressRequest request = new CreateAddressRequest();
request.setStreet("street6");
request.setNumber("number4");
request.setZipCode("zip_code0");
request.setNeighborhood("neighborhood2");
request.setCity("city6");
request.setState("state2");
request.setCountry("country0");
request.setComplement("complement2");
request.setMetadata(new LinkedHashMap<>());
request.getMetadata().put("key0", "metadata3");
request.setLine1("line_10");
request.setLine2("line_24");

try {
    GetAddressResponse response = customersController.createAddress(customerId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Customer

Creates a new customer

```java
CompletableFuture<GetCustomerResponse> createCustomer(
    final CreateCustomerRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `request` | [`CreateCustomerRequest`](/doc/models/create-customer-request.md) | Body, Required | Request for creating a customer |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetCustomerResponse`](/doc/models/get-customer-response.md)

## Example Usage

```java
CreateCustomerRequest request = new CreateCustomerRequest();
request.setName("{\\n    \"name\": \"Tony Stark\"\\n}");
request.setEmail("email0");
request.setDocument("document0");
request.setType("type4");
request.setAddress(new CreateAddressRequest());
request.getAddress().setStreet("street2");
request.getAddress().setNumber("number0");
request.getAddress().setZipCode("zip_code6");
request.getAddress().setNeighborhood("neighborhood8");
request.getAddress().setCity("city2");
request.getAddress().setState("state8");
request.getAddress().setCountry("country6");
request.getAddress().setComplement("complement8");
request.getAddress().setMetadata(new LinkedHashMap<>());
request.getAddress().getMetadata().put("key0", "metadata7");
request.getAddress().setLine1("line_16");
request.getAddress().setLine2("line_20");
request.setMetadata(new LinkedHashMap<>());
request.getMetadata().put("key0", "metadata3");
request.setPhones(new CreatePhonesRequest());
request.setCode("code4");

try {
    GetCustomerResponse response = customersController.createCustomer(request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Card

Creates a new card for a customer

```java
CompletableFuture<GetCardResponse> createCard(
    final String customerId,
    final CreateCardRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `request` | [`CreateCardRequest`](/doc/models/create-card-request.md) | Body, Required | Request for creating a card |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetCardResponse`](/doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
CreateCardRequest request = new CreateCardRequest();
request.setNumber("number4");
request.setHolderName("holder_name2");
request.setExpMonth(10);
request.setExpYear(30);
request.setCvv("cvv4");
request.setBillingAddress(new CreateAddressRequest());
request.getBillingAddress().setStreet("street8");
request.getBillingAddress().setNumber("number4");
request.getBillingAddress().setZipCode("zip_code2");
request.getBillingAddress().setNeighborhood("neighborhood4");
request.getBillingAddress().setCity("city8");
request.getBillingAddress().setState("state4");
request.getBillingAddress().setCountry("country2");
request.getBillingAddress().setComplement("complement6");
request.getBillingAddress().setMetadata(new LinkedHashMap<>());
request.getBillingAddress().getMetadata().put("key0", "metadata5");
request.getBillingAddress().getMetadata().put("key1", "metadata6");
request.getBillingAddress().setLine1("line_18");
request.getBillingAddress().setLine2("line_26");
request.setBrand("brand0");
request.setBillingAddressId("billing_address_id2");
request.setMetadata(new LinkedHashMap<>());
request.getMetadata().put("key0", "metadata3");
request.setType("credit");
request.setOptions(new CreateCardOptionsRequest());
request.getOptions().setVerifyCard(false);
request.setPrivateLabel(false);
request.setLabel("label6");

try {
    GetCardResponse response = customersController.createCard(customerId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Cards

Get all cards from a customer

```java
CompletableFuture<ListCardsResponse> getCards(
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

[`ListCardsResponse`](/doc/models/list-cards-response.md)

## Example Usage

```java
String customerId = "customer_id8";

try {
    ListCardsResponse response = customersController.getCards(customerId, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Renew Card

Renew a card

```java
CompletableFuture<GetCardResponse> renewCard(
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

[`GetCardResponse`](/doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String cardId = "card_id4";

try {
    GetCardResponse response = customersController.renewCard(customerId, cardId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Address

Get a customer's address

```java
CompletableFuture<GetAddressResponse> getAddress(
    final String customerId,
    final String addressId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `addressId` | `String` | Template, Required | Address Id |

## Response Type

[`GetAddressResponse`](/doc/models/get-address-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String addressId = "address_id0";

try {
    GetAddressResponse response = customersController.getAddress(customerId, addressId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Address

Delete a Customer's address

```java
CompletableFuture<GetAddressResponse> deleteAddress(
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

[`GetAddressResponse`](/doc/models/get-address-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String addressId = "address_id0";

try {
    GetAddressResponse response = customersController.deleteAddress(customerId, addressId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Access Token

Get a Customer's access token

```java
CompletableFuture<GetAccessTokenResponse> getAccessToken(
    final String customerId,
    final String tokenId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `tokenId` | `String` | Template, Required | Token Id |

## Response Type

[`GetAccessTokenResponse`](/doc/models/get-access-token-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String tokenId = "token_id6";

try {
    GetAccessTokenResponse response = customersController.getAccessToken(customerId, tokenId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Customer Metadata

Updates the metadata a customer

```java
CompletableFuture<GetCustomerResponse> updateCustomerMetadata(
    final String customerId,
    final UpdateMetadataRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | The customer id |
| `request` | [`UpdateMetadataRequest`](/doc/models/update-metadata-request.md) | Body, Required | Request for updating the customer metadata |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetCustomerResponse`](/doc/models/get-customer-response.md)

## Example Usage

```java
String customerId = "customer_id8";
UpdateMetadataRequest request = new UpdateMetadataRequest();
request.setMetadata(new LinkedHashMap<>());
request.getMetadata().put("key0", "metadata3");

try {
    GetCustomerResponse response = customersController.updateCustomerMetadata(customerId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Card

Get a customer's card

```java
CompletableFuture<GetCardResponse> getCard(
    final String customerId,
    final String cardId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `cardId` | `String` | Template, Required | Card id |

## Response Type

[`GetCardResponse`](/doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String cardId = "card_id4";

try {
    GetCardResponse response = customersController.getCard(customerId, cardId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Access Tokens

Delete a Customer's access tokens

```java
CompletableFuture<ListAccessTokensResponse> deleteAccessTokens(
    final String customerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |

## Response Type

[`ListAccessTokensResponse`](/doc/models/list-access-tokens-response.md)

## Example Usage

```java
String customerId = "customer_id8";

try {
    ListAccessTokensResponse response = customersController.deleteAccessTokens(customerId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Create Access Token

Creates a access token for a customer

```java
CompletableFuture<GetAccessTokenResponse> createAccessToken(
    final String customerId,
    final CreateAccessTokenRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |
| `request` | [`CreateAccessTokenRequest`](/doc/models/create-access-token-request.md) | Body, Required | Request for creating a access token |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetAccessTokenResponse`](/doc/models/get-access-token-response.md)

## Example Usage

```java
String customerId = "customer_id8";
CreateAccessTokenRequest request = new CreateAccessTokenRequest();

try {
    GetAccessTokenResponse response = customersController.createAccessToken(customerId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Access Tokens

Get all access tokens from a customer

```java
CompletableFuture<ListAccessTokensResponse> getAccessTokens(
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

[`ListAccessTokensResponse`](/doc/models/list-access-tokens-response.md)

## Example Usage

```java
String customerId = "customer_id8";

try {
    ListAccessTokensResponse response = customersController.getAccessTokens(customerId, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Customers

Get all Customers

```java
CompletableFuture<ListCustomersResponse> getCustomers(
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

[`ListCustomersResponse`](/doc/models/list-customers-response.md)

## Example Usage

```java
Integer page = 1;
Integer size = 10;

try {
    ListCustomersResponse response = customersController.getCustomers(null, null, page, size, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Update Customer

Updates a customer

```java
CompletableFuture<GetCustomerResponse> updateCustomer(
    final String customerId,
    final UpdateCustomerRequest request,
    final String idempotencyKey)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer id |
| `request` | [`UpdateCustomerRequest`](/doc/models/update-customer-request.md) | Body, Required | Request for updating a customer |
| `idempotencyKey` | `String` | Header, Optional | - |

## Response Type

[`GetCustomerResponse`](/doc/models/get-customer-response.md)

## Example Usage

```java
String customerId = "customer_id8";
UpdateCustomerRequest request = new UpdateCustomerRequest();

try {
    GetCustomerResponse response = customersController.updateCustomer(customerId, request, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Delete Card

Delete a customer's card

```java
CompletableFuture<GetCardResponse> deleteCard(
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

[`GetCardResponse`](/doc/models/get-card-response.md)

## Example Usage

```java
String customerId = "customer_id8";
String cardId = "card_id4";

try {
    GetCardResponse response = customersController.deleteCard(customerId, cardId, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Addresses

Gets all adressess from a customer

```java
CompletableFuture<ListAddressesResponse> getAddresses(
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

[`ListAddressesResponse`](/doc/models/list-addresses-response.md)

## Example Usage

```java
String customerId = "customer_id8";

try {
    ListAddressesResponse response = customersController.getAddresses(customerId, null, null);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```


# Get Customer

Get a customer

```java
CompletableFuture<GetCustomerResponse> getCustomer(
    final String customerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `customerId` | `String` | Template, Required | Customer Id |

## Response Type

[`GetCustomerResponse`](/doc/models/get-customer-response.md)

## Example Usage

```java
String customerId = "customer_id8";

try {
    GetCustomerResponse response = customersController.getCustomer(customerId);
} catch (ApiException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
}
```

