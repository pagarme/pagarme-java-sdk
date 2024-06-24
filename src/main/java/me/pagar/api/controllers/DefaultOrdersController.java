/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.time.LocalDateTime;
import me.pagar.api.ApiHelper;
import me.pagar.api.DateTimeHelper;
import me.pagar.api.Server;
import me.pagar.api.exceptions.ApiException;
import me.pagar.api.http.request.HttpMethod;
import me.pagar.api.models.CreateOrderItemRequest;
import me.pagar.api.models.CreateOrderRequest;
import me.pagar.api.models.GetOrderItemResponse;
import me.pagar.api.models.GetOrderResponse;
import me.pagar.api.models.ListOrderResponse;
import me.pagar.api.models.UpdateMetadataRequest;
import me.pagar.api.models.UpdateOrderItemRequest;
import me.pagar.api.models.UpdateOrderStatusRequest;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultOrdersController extends BaseController implements OrdersController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultOrdersController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @param  orderId  Required parameter: Order Id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetOrderResponse deleteAllOrderItems(
            final String orderId,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareDeleteAllOrderItemsRequest(orderId, idempotencyKey).execute();
    }

    /**
     * Builds the ApiCall object for deleteAllOrderItems.
     */
    private ApiCall<GetOrderResponse, ApiException> prepareDeleteAllOrderItemsRequest(
            final String orderId,
            final String idempotencyKey) throws IOException {
        return new ApiCall.Builder<GetOrderResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orders/{orderId}/items")
                        .templateParam(param -> param.key("orderId").value(orderId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("idempotency-key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("httpBasic"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetOrderResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  orderId  Required parameter: Order Id
     * @param  itemId  Required parameter: Item Id
     * @return    Returns the GetOrderItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetOrderItemResponse getOrderItem(
            final String orderId,
            final String itemId) throws ApiException, IOException {
        return prepareGetOrderItemRequest(orderId, itemId).execute();
    }

    /**
     * Builds the ApiCall object for getOrderItem.
     */
    private ApiCall<GetOrderItemResponse, ApiException> prepareGetOrderItemRequest(
            final String orderId,
            final String itemId) throws IOException {
        return new ApiCall.Builder<GetOrderItemResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orders/{orderId}/items/{itemId}")
                        .templateParam(param -> param.key("orderId").value(orderId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("itemId").value(itemId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("httpBasic"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetOrderItemResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates the metadata from an order.
     * @param  orderId  Required parameter: The order id
     * @param  request  Required parameter: Request for updating the order metadata
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetOrderResponse updateOrderMetadata(
            final String orderId,
            final UpdateMetadataRequest request,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareUpdateOrderMetadataRequest(orderId, request, idempotencyKey).execute();
    }

    /**
     * Builds the ApiCall object for updateOrderMetadata.
     */
    private ApiCall<GetOrderResponse, ApiException> prepareUpdateOrderMetadataRequest(
            final String orderId,
            final UpdateMetadataRequest request,
            final String idempotencyKey) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<GetOrderResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/Orders/{order_id}/metadata")
                        .bodyParam(param -> param.value(request))
                        .bodySerializer(() ->  ApiHelper.serialize(request))
                        .templateParam(param -> param.key("order_id").value(orderId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("idempotency-key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param ->param.key("content-type").value("application/json"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("httpBasic"))
                        .httpMethod(HttpMethod.PATCH))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetOrderResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  orderId  Required parameter: Order Id
     * @param  itemId  Required parameter: Item Id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetOrderItemResponse deleteOrderItem(
            final String orderId,
            final String itemId,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareDeleteOrderItemRequest(orderId, itemId, idempotencyKey).execute();
    }

    /**
     * Builds the ApiCall object for deleteOrderItem.
     */
    private ApiCall<GetOrderItemResponse, ApiException> prepareDeleteOrderItemRequest(
            final String orderId,
            final String itemId,
            final String idempotencyKey) throws IOException {
        return new ApiCall.Builder<GetOrderItemResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orders/{orderId}/items/{itemId}")
                        .templateParam(param -> param.key("orderId").value(orderId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("itemId").value(itemId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("idempotency-key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("httpBasic"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetOrderItemResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Gets an order.
     * @param  orderId  Required parameter: Order id
     * @return    Returns the GetOrderResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetOrderResponse getOrder(
            final String orderId) throws ApiException, IOException {
        return prepareGetOrderRequest(orderId).execute();
    }

    /**
     * Builds the ApiCall object for getOrder.
     */
    private ApiCall<GetOrderResponse, ApiException> prepareGetOrderRequest(
            final String orderId) throws IOException {
        return new ApiCall.Builder<GetOrderResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orders/{order_id}")
                        .templateParam(param -> param.key("order_id").value(orderId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("httpBasic"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetOrderResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Gets all orders.
     * @param  page  Optional parameter: Page number
     * @param  size  Optional parameter: Page size
     * @param  code  Optional parameter: Filter for order's code
     * @param  status  Optional parameter: Filter for order's status
     * @param  createdSince  Optional parameter: Filter for order's creation date start range
     * @param  createdUntil  Optional parameter: Filter for order's creation date end range
     * @param  customerId  Optional parameter: Filter for order's customer id
     * @return    Returns the ListOrderResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListOrderResponse getOrders(
            final Integer page,
            final Integer size,
            final String code,
            final String status,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil,
            final String customerId) throws ApiException, IOException {
        return prepareGetOrdersRequest(page, size, code, status, createdSince, createdUntil,
                customerId).execute();
    }

    /**
     * Builds the ApiCall object for getOrders.
     */
    private ApiCall<ListOrderResponse, ApiException> prepareGetOrdersRequest(
            final Integer page,
            final Integer size,
            final String code,
            final String status,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil,
            final String customerId) throws IOException {
        return new ApiCall.Builder<ListOrderResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orders")
                        .queryParam(param -> param.key("page")
                                .value(page).isRequired(false))
                        .queryParam(param -> param.key("size")
                                .value(size).isRequired(false))
                        .queryParam(param -> param.key("code")
                                .value(code).isRequired(false))
                        .queryParam(param -> param.key("status")
                                .value(status).isRequired(false))
                        .queryParam(param -> param.key("created_since")
                                .value(DateTimeHelper.toRfc8601DateTime(createdSince)).isRequired(false))
                        .queryParam(param -> param.key("created_until")
                                .value(DateTimeHelper.toRfc8601DateTime(createdUntil)).isRequired(false))
                        .queryParam(param -> param.key("customer_id")
                                .value(customerId).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("httpBasic"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListOrderResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  orderId  Required parameter: Order Id
     * @param  itemId  Required parameter: Item Id
     * @param  request  Required parameter: Item Model
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetOrderItemResponse updateOrderItem(
            final String orderId,
            final String itemId,
            final UpdateOrderItemRequest request,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareUpdateOrderItemRequest(orderId, itemId, request, idempotencyKey).execute();
    }

    /**
     * Builds the ApiCall object for updateOrderItem.
     */
    private ApiCall<GetOrderItemResponse, ApiException> prepareUpdateOrderItemRequest(
            final String orderId,
            final String itemId,
            final UpdateOrderItemRequest request,
            final String idempotencyKey) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<GetOrderItemResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orders/{orderId}/items/{itemId}")
                        .bodyParam(param -> param.value(request))
                        .bodySerializer(() ->  ApiHelper.serialize(request))
                        .templateParam(param -> param.key("orderId").value(orderId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("itemId").value(itemId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("idempotency-key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param ->param.key("content-type").value("application/json"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("httpBasic"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetOrderItemResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  id  Required parameter: Order Id
     * @param  request  Required parameter: Update Order Model
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetOrderResponse closeOrder(
            final String id,
            final UpdateOrderStatusRequest request,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareCloseOrderRequest(id, request, idempotencyKey).execute();
    }

    /**
     * Builds the ApiCall object for closeOrder.
     */
    private ApiCall<GetOrderResponse, ApiException> prepareCloseOrderRequest(
            final String id,
            final UpdateOrderStatusRequest request,
            final String idempotencyKey) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<GetOrderResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orders/{id}/closed")
                        .bodyParam(param -> param.value(request))
                        .bodySerializer(() ->  ApiHelper.serialize(request))
                        .templateParam(param -> param.key("id").value(id)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("idempotency-key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param ->param.key("content-type").value("application/json"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("httpBasic"))
                        .httpMethod(HttpMethod.PATCH))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetOrderResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Creates a new Order.
     * @param  body  Required parameter: Request for creating an order
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetOrderResponse createOrder(
            final CreateOrderRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareCreateOrderRequest(body, idempotencyKey).execute();
    }

    /**
     * Builds the ApiCall object for createOrder.
     */
    private ApiCall<GetOrderResponse, ApiException> prepareCreateOrderRequest(
            final CreateOrderRequest body,
            final String idempotencyKey) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<GetOrderResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orders")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("idempotency-key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param ->param.key("content-type").value("application/json"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("httpBasic"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetOrderResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  orderId  Required parameter: Order Id
     * @param  request  Required parameter: Order Item Model
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetOrderItemResponse createOrderItem(
            final String orderId,
            final CreateOrderItemRequest request,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareCreateOrderItemRequest(orderId, request, idempotencyKey).execute();
    }

    /**
     * Builds the ApiCall object for createOrderItem.
     */
    private ApiCall<GetOrderItemResponse, ApiException> prepareCreateOrderItemRequest(
            final String orderId,
            final CreateOrderItemRequest request,
            final String idempotencyKey) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<GetOrderItemResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/orders/{orderId}/items")
                        .bodyParam(param -> param.value(request))
                        .bodySerializer(() ->  ApiHelper.serialize(request))
                        .templateParam(param -> param.key("orderId").value(orderId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("idempotency-key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param ->param.key("content-type").value("application/json"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("httpBasic"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetOrderItemResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}