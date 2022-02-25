/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.controllers;

import java.io.IOException;
import java.time.LocalDateTime;
import me.pagar.api.exceptions.ApiException;
import me.pagar.api.models.CreateCancelSubscriptionRequest;
import me.pagar.api.models.CreateDiscountRequest;
import me.pagar.api.models.CreateIncrementRequest;
import me.pagar.api.models.CreateSubscriptionItemRequest;
import me.pagar.api.models.CreateSubscriptionRequest;
import me.pagar.api.models.CreateUsageRequest;
import me.pagar.api.models.GetDiscountResponse;
import me.pagar.api.models.GetIncrementResponse;
import me.pagar.api.models.GetPeriodResponse;
import me.pagar.api.models.GetSubscriptionItemResponse;
import me.pagar.api.models.GetSubscriptionResponse;
import me.pagar.api.models.GetUsageReportResponse;
import me.pagar.api.models.GetUsageResponse;
import me.pagar.api.models.ListCyclesResponse;
import me.pagar.api.models.ListDiscountsResponse;
import me.pagar.api.models.ListIncrementsResponse;
import me.pagar.api.models.ListSubscriptionItemsResponse;
import me.pagar.api.models.ListSubscriptionsResponse;
import me.pagar.api.models.ListUsagesResponse;
import me.pagar.api.models.UpdateCurrentCycleEndDateRequest;
import me.pagar.api.models.UpdateCurrentCycleStatusRequest;
import me.pagar.api.models.UpdateMetadataRequest;
import me.pagar.api.models.UpdateSubscriptionAffiliationIdRequest;
import me.pagar.api.models.UpdateSubscriptionBillingDateRequest;
import me.pagar.api.models.UpdateSubscriptionCardRequest;
import me.pagar.api.models.UpdateSubscriptionDueDaysRequest;
import me.pagar.api.models.UpdateSubscriptionItemRequest;
import me.pagar.api.models.UpdateSubscriptionMinimumPriceRequest;
import me.pagar.api.models.UpdateSubscriptionPaymentMethodRequest;
import me.pagar.api.models.UpdateSubscriptionSplitRequest;
import me.pagar.api.models.UpdateSubscriptionStartAtRequest;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface SubscriptionsController {
    /**
     * @param  subscriptionId  Required parameter: Example:
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetPeriodResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetPeriodResponse renewSubscription(
            final String subscriptionId,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Deletes a discount.
     * @param  subscriptionId  Required parameter: Subscription id
     * @param  discountId  Required parameter: Discount Id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetDiscountResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetDiscountResponse deleteDiscount(
            final String subscriptionId,
            final String discountId,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Gets all subscriptions.
     * @param  page  Optional parameter: Page number
     * @param  size  Optional parameter: Page size
     * @param  code  Optional parameter: Filter for subscription's code
     * @param  billingType  Optional parameter: Filter for subscription's billing type
     * @param  customerId  Optional parameter: Filter for subscription's customer id
     * @param  planId  Optional parameter: Filter for subscription's plan id
     * @param  cardId  Optional parameter: Filter for subscription's card id
     * @param  status  Optional parameter: Filter for subscription's status
     * @param  nextBillingSince  Optional parameter: Filter for subscription's next billing date
     *         start range
     * @param  nextBillingUntil  Optional parameter: Filter for subscription's next billing date end
     *         range
     * @param  createdSince  Optional parameter: Filter for subscription's creation date start range
     * @param  createdUntil  Optional parameter: Filter for subscriptions creation date end range
     * @return    Returns the ListSubscriptionsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListSubscriptionsResponse getSubscriptions(
            final Integer page,
            final Integer size,
            final String code,
            final String billingType,
            final String customerId,
            final String planId,
            final String cardId,
            final String status,
            final LocalDateTime nextBillingSince,
            final LocalDateTime nextBillingUntil,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil) throws ApiException, IOException;

    /**
     * @param  subscriptionId  Required parameter: The subscription id
     * @param  discountId  Required parameter: Example:
     * @return    Returns the GetDiscountResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetDiscountResponse getDiscountById(
            final String subscriptionId,
            final String discountId) throws ApiException, IOException;

    /**
     * Creates a new subscription.
     * @param  body  Required parameter: Request for creating a subscription
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionResponse createSubscription(
            final CreateSubscriptionRequest body,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  subscriptionId  Required parameter: The subscription Id
     * @param  incrementId  Required parameter: The increment Id
     * @return    Returns the GetIncrementResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetIncrementResponse getIncrementById(
            final String subscriptionId,
            final String incrementId) throws ApiException, IOException;

    /**
     * Updates the metadata from a subscription.
     * @param  subscriptionId  Required parameter: The subscription id
     * @param  request  Required parameter: Request for updating the subscrption metadata
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionResponse updateSubscriptionMetadata(
            final String subscriptionId,
            final UpdateMetadataRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Deletes a increment.
     * @param  subscriptionId  Required parameter: Subscription id
     * @param  incrementId  Required parameter: Increment id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetIncrementResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetIncrementResponse deleteIncrement(
            final String subscriptionId,
            final String incrementId,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Gets a subscription.
     * @param  subscriptionId  Required parameter: Subscription id
     * @return    Returns the GetSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionResponse getSubscription(
            final String subscriptionId) throws ApiException, IOException;

    /**
     * @param  subscriptionId  Required parameter: Example:
     * @param  request  Required parameter: Request for updating the end date of the current
     *         signature cycle
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionResponse updateLatestPeriodEndAt(
            final String subscriptionId,
            final UpdateCurrentCycleEndDateRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  subscriptionId  Required parameter: Subscription Id
     * @param  request  Required parameter: Request for updating the end date of the subscription
     *         current status
     * @param  idempotencyKey  Optional parameter: Example:
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    void updateCurrentCycleStatus(
            final String subscriptionId,
            final UpdateCurrentCycleStatusRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Get Subscription Items.
     * @param  subscriptionId  Required parameter: The subscription id
     * @param  page  Optional parameter: Page number
     * @param  size  Optional parameter: Page size
     * @param  name  Optional parameter: The item name
     * @param  code  Optional parameter: Identification code in the client system
     * @param  status  Optional parameter: The item statis
     * @param  description  Optional parameter: The item description
     * @param  createdSince  Optional parameter: Filter for item's creation date start range
     * @param  createdUntil  Optional parameter: Filter for item's creation date end range
     * @return    Returns the ListSubscriptionItemsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListSubscriptionItemsResponse getSubscriptionItems(
            final String subscriptionId,
            final Integer page,
            final Integer size,
            final String name,
            final String code,
            final String status,
            final String description,
            final String createdSince,
            final String createdUntil) throws ApiException, IOException;

    /**
     * Get Subscription Item.
     * @param  subscriptionId  Required parameter: Subscription Id
     * @param  itemId  Required parameter: Item id
     * @return    Returns the GetSubscriptionItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionItemResponse getSubscriptionItem(
            final String subscriptionId,
            final String itemId) throws ApiException, IOException;

    /**
     * @param  subscriptionId  Required parameter: Example:
     * @param  request  Required parameter: Request for updating a subscription affiliation id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionResponse updateSubscriptionAffiliationId(
            final String subscriptionId,
            final UpdateSubscriptionAffiliationIdRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  subscriptionId  Required parameter: The subscription id
     * @param  page  Required parameter: Page number
     * @param  size  Required parameter: Page size
     * @return    Returns the ListDiscountsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListDiscountsResponse getDiscounts(
            final String subscriptionId,
            final int page,
            final int size) throws ApiException, IOException;

    /**
     * Updates a subscription item.
     * @param  subscriptionId  Required parameter: Subscription Id
     * @param  itemId  Required parameter: Item id
     * @param  body  Required parameter: Request for updating a subscription item
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionItemResponse updateSubscriptionItem(
            final String subscriptionId,
            final String itemId,
            final UpdateSubscriptionItemRequest body,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Creates a new Subscription item.
     * @param  subscriptionId  Required parameter: Subscription id
     * @param  request  Required parameter: Request for creating a subscription item
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionItemResponse createSubscriptionItem(
            final String subscriptionId,
            final CreateSubscriptionItemRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Lists all usages from a subscription item.
     * @param  subscriptionId  Required parameter: The subscription id
     * @param  itemId  Required parameter: The subscription item id
     * @param  page  Optional parameter: Page number
     * @param  size  Optional parameter: Page size
     * @param  code  Optional parameter: Identification code in the client system
     * @param  group  Optional parameter: Identification group in the client system
     * @param  usedSince  Optional parameter: Example:
     * @param  usedUntil  Optional parameter: Example:
     * @return    Returns the ListUsagesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListUsagesResponse getUsages(
            final String subscriptionId,
            final String itemId,
            final Integer page,
            final Integer size,
            final String code,
            final String group,
            final LocalDateTime usedSince,
            final LocalDateTime usedUntil) throws ApiException, IOException;

    /**
     * Atualização do valor mínimo da assinatura.
     * @param  subscriptionId  Required parameter: Subscription Id
     * @param  request  Required parameter: Request da requisição com o valor mínimo que será
     *         configurado
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionResponse updateSubscriptionMiniumPrice(
            final String subscriptionId,
            final UpdateSubscriptionMinimumPriceRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  subscriptionId  Required parameter: The subscription id
     * @param  cycleId  Required parameter: Example:
     * @return    Returns the GetPeriodResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetPeriodResponse getSubscriptionCycleById(
            final String subscriptionId,
            final String cycleId) throws ApiException, IOException;

    /**
     * Create Usage.
     * @param  subscriptionId  Required parameter: Subscription id
     * @param  itemId  Required parameter: Item id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetUsageResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetUsageResponse createAnUsage(
            final String subscriptionId,
            final String itemId,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Cancels a subscription.
     * @param  subscriptionId  Required parameter: Subscription id
     * @param  request  Optional parameter: Request for cancelling a subscription
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionResponse cancelSubscription(
            final String subscriptionId,
            final CreateCancelSubscriptionRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Deletes a subscription item.
     * @param  subscriptionId  Required parameter: Subscription id
     * @param  subscriptionItemId  Required parameter: Subscription item id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionItemResponse deleteSubscriptionItem(
            final String subscriptionId,
            final String subscriptionItemId,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  subscriptionId  Required parameter: The subscription id
     * @param  page  Optional parameter: Page number
     * @param  size  Optional parameter: Page size
     * @return    Returns the ListIncrementsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListIncrementsResponse getIncrements(
            final String subscriptionId,
            final Integer page,
            final Integer size) throws ApiException, IOException;

    /**
     * Updates the boleto due days from a subscription.
     * @param  subscriptionId  Required parameter: Subscription Id
     * @param  request  Required parameter: Example:
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionResponse updateSubscriptionDueDays(
            final String subscriptionId,
            final UpdateSubscriptionDueDaysRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Updates the credit card from a subscription.
     * @param  subscriptionId  Required parameter: Subscription id
     * @param  request  Required parameter: Request for updating a card
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionResponse updateSubscriptionCard(
            final String subscriptionId,
            final UpdateSubscriptionCardRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Deletes a usage.
     * @param  subscriptionId  Required parameter: The subscription id
     * @param  itemId  Required parameter: The subscription item id
     * @param  usageId  Required parameter: The usage id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetUsageResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetUsageResponse deleteUsage(
            final String subscriptionId,
            final String itemId,
            final String usageId,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Creates a discount.
     * @param  subscriptionId  Required parameter: Subscription id
     * @param  request  Required parameter: Request for creating a discount
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetDiscountResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetDiscountResponse createDiscount(
            final String subscriptionId,
            final CreateDiscountRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Updates the payment method from a subscription.
     * @param  subscriptionId  Required parameter: Subscription id
     * @param  request  Required parameter: Request for updating the paymentmethod from a
     *         subscription
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionResponse updateSubscriptionPaymentMethod(
            final String subscriptionId,
            final UpdateSubscriptionPaymentMethodRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Creates a increment.
     * @param  subscriptionId  Required parameter: Subscription id
     * @param  request  Required parameter: Request for creating a increment
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetIncrementResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetIncrementResponse createIncrement(
            final String subscriptionId,
            final CreateIncrementRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Creates a usage.
     * @param  subscriptionId  Required parameter: Subscription Id
     * @param  itemId  Required parameter: Item id
     * @param  body  Required parameter: Request for creating a usage
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetUsageResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetUsageResponse createUsage(
            final String subscriptionId,
            final String itemId,
            final CreateUsageRequest body,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  subscriptionId  Required parameter: Subscription Id
     * @param  page  Required parameter: Page number
     * @param  size  Required parameter: Page size
     * @return    Returns the ListCyclesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListCyclesResponse getSubscriptionCycles(
            final String subscriptionId,
            final String page,
            final String size) throws ApiException, IOException;

    /**
     * Updates the billing date from a subscription.
     * @param  subscriptionId  Required parameter: The subscription id
     * @param  request  Required parameter: Request for updating the subscription billing date
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionResponse updateSubscriptionBillingDate(
            final String subscriptionId,
            final UpdateSubscriptionBillingDateRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Updates the start at date from a subscription.
     * @param  subscriptionId  Required parameter: The subscription id
     * @param  request  Required parameter: Request for updating the subscription start date
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionResponse updateSubscriptionStartAt(
            final String subscriptionId,
            final UpdateSubscriptionStartAtRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  subscriptionId  Required parameter: The subscription Id
     * @param  periodId  Required parameter: The period Id
     * @return    Returns the GetUsageReportResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetUsageReportResponse getUsageReport(
            final String subscriptionId,
            final String periodId) throws ApiException, IOException;

    /**
     * @param  id  Required parameter: Subscription's id
     * @param  request  Required parameter: Example:
     * @return    Returns the GetSubscriptionResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetSubscriptionResponse updateSplitSubscription(
            final String id,
            final UpdateSubscriptionSplitRequest request) throws ApiException, IOException;

}