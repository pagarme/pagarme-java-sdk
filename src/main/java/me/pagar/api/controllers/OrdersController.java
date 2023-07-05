/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.controllers;

import java.io.IOException;
import java.time.LocalDateTime;
import me.pagar.api.exceptions.ApiException;
import me.pagar.api.models.CreateOrderItemRequest;
import me.pagar.api.models.CreateOrderRequest;
import me.pagar.api.models.GetOrderItemResponse;
import me.pagar.api.models.GetOrderResponse;
import me.pagar.api.models.ListOrderResponse;
import me.pagar.api.models.UpdateMetadataRequest;
import me.pagar.api.models.UpdateOrderItemRequest;
import me.pagar.api.models.UpdateOrderStatusRequest;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface OrdersController {
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
    ListOrderResponse getOrders(
            final Integer page,
            final Integer size,
            final String code,
            final String status,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil,
            final String customerId) throws ApiException, IOException;

    /**
     * @param  orderId  Required parameter: Order Id
     * @param  itemId  Required parameter: Item Id
     * @return    Returns the GetOrderItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetOrderItemResponse getOrderItem(
            final String orderId,
            final String itemId) throws ApiException, IOException;

    /**
     * Gets an order.
     * @param  orderId  Required parameter: Order id
     * @return    Returns the GetOrderResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetOrderResponse getOrder(
            final String orderId) throws ApiException, IOException;

    /**
     * @param  id  Required parameter: Order Id
     * @param  request  Required parameter: Update Order Model
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetOrderResponse closeOrder(
            final String id,
            final UpdateOrderStatusRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Creates a new Order.
     * @param  body  Required parameter: Request for creating an order
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetOrderResponse createOrder(
            final CreateOrderRequest body,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  orderId  Required parameter: Order Id
     * @param  itemId  Required parameter: Item Id
     * @param  request  Required parameter: Item Model
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetOrderItemResponse updateOrderItem(
            final String orderId,
            final String itemId,
            final UpdateOrderItemRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  orderId  Required parameter: Order Id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetOrderResponse deleteAllOrderItems(
            final String orderId,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Updates the metadata from an order.
     * @param  orderId  Required parameter: The order id
     * @param  request  Required parameter: Request for updating the order metadata
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetOrderResponse updateOrderMetadata(
            final String orderId,
            final UpdateMetadataRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  orderId  Required parameter: Order Id
     * @param  itemId  Required parameter: Item Id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetOrderItemResponse deleteOrderItem(
            final String orderId,
            final String itemId,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  orderId  Required parameter: Order Id
     * @param  request  Required parameter: Order Item Model
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetOrderItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetOrderItemResponse createOrderItem(
            final String orderId,
            final CreateOrderItemRequest request,
            final String idempotencyKey) throws ApiException, IOException;

}