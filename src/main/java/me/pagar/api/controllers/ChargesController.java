/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.controllers;

import java.io.IOException;
import java.time.LocalDateTime;
import me.pagar.api.exceptions.ApiException;
import me.pagar.api.models.CreateCancelChargeRequest;
import me.pagar.api.models.CreateCaptureChargeRequest;
import me.pagar.api.models.CreateChargeRequest;
import me.pagar.api.models.CreateConfirmPaymentRequest;
import me.pagar.api.models.GetChargeResponse;
import me.pagar.api.models.GetChargesSummaryResponse;
import me.pagar.api.models.ListChargeTransactionsResponse;
import me.pagar.api.models.ListChargesResponse;
import me.pagar.api.models.UpdateChargeCardRequest;
import me.pagar.api.models.UpdateChargeDueDateRequest;
import me.pagar.api.models.UpdateChargePaymentMethodRequest;
import me.pagar.api.models.UpdateMetadataRequest;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface ChargesController {
    /**
     * Updates the metadata from a charge.
     * @param  chargeId  Required parameter: The charge id
     * @param  request  Required parameter: Request for updating the charge metadata
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetChargeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetChargeResponse updateChargeMetadata(
            final String chargeId,
            final UpdateMetadataRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Updates a charge's payment method.
     * @param  chargeId  Required parameter: Charge id
     * @param  request  Required parameter: Request for updating the payment method from a charge
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetChargeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetChargeResponse updateChargePaymentMethod(
            final String chargeId,
            final UpdateChargePaymentMethodRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  chargeId  Required parameter: Charge Id
     * @param  page  Optional parameter: Page number
     * @param  size  Optional parameter: Page size
     * @return    Returns the ListChargeTransactionsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListChargeTransactionsResponse getChargeTransactions(
            final String chargeId,
            final Integer page,
            final Integer size) throws ApiException, IOException;

    /**
     * Updates the due date from a charge.
     * @param  chargeId  Required parameter: Charge Id
     * @param  request  Required parameter: Request for updating the due date
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetChargeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetChargeResponse updateChargeDueDate(
            final String chargeId,
            final UpdateChargeDueDateRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Lists all charges.
     * @param  page  Optional parameter: Page number
     * @param  size  Optional parameter: Page size
     * @param  code  Optional parameter: Filter for charge's code
     * @param  status  Optional parameter: Filter for charge's status
     * @param  paymentMethod  Optional parameter: Filter for charge's payment method
     * @param  customerId  Optional parameter: Filter for charge's customer id
     * @param  orderId  Optional parameter: Filter for charge's order id
     * @param  createdSince  Optional parameter: Filter for the beginning of the range for charge's
     *         creation
     * @param  createdUntil  Optional parameter: Filter for the end of the range for charge's
     *         creation
     * @return    Returns the ListChargesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListChargesResponse getCharges(
            final Integer page,
            final Integer size,
            final String code,
            final String status,
            final String paymentMethod,
            final String customerId,
            final String orderId,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil) throws ApiException, IOException;

    /**
     * Captures a charge.
     * @param  chargeId  Required parameter: Charge id
     * @param  request  Optional parameter: Request for capturing a charge
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetChargeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetChargeResponse captureCharge(
            final String chargeId,
            final CreateCaptureChargeRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Updates the card from a charge.
     * @param  chargeId  Required parameter: Charge id
     * @param  request  Required parameter: Request for updating a charge's card
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetChargeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetChargeResponse updateChargeCard(
            final String chargeId,
            final UpdateChargeCardRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Get a charge from its id.
     * @param  chargeId  Required parameter: Charge id
     * @return    Returns the GetChargeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetChargeResponse getCharge(
            final String chargeId) throws ApiException, IOException;

    /**
     * @param  status  Required parameter: Example:
     * @param  createdSince  Optional parameter: Example:
     * @param  createdUntil  Optional parameter: Example:
     * @return    Returns the GetChargesSummaryResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetChargesSummaryResponse getChargesSummary(
            final String status,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil) throws ApiException, IOException;

    /**
     * Retries a charge.
     * @param  chargeId  Required parameter: Charge id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetChargeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetChargeResponse retryCharge(
            final String chargeId,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Cancel a charge.
     * @param  chargeId  Required parameter: Charge id
     * @param  request  Optional parameter: Request for cancelling a charge
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetChargeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetChargeResponse cancelCharge(
            final String chargeId,
            final CreateCancelChargeRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Creates a new charge.
     * @param  request  Required parameter: Request for creating a charge
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetChargeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetChargeResponse createCharge(
            final CreateChargeRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  chargeId  Required parameter: Example:
     * @param  request  Optional parameter: Request for confirm payment
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetChargeResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetChargeResponse confirmPayment(
            final String chargeId,
            final CreateConfirmPaymentRequest request,
            final String idempotencyKey) throws ApiException, IOException;

}