/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.controllers;

import java.io.IOException;
import java.time.LocalDateTime;
import me.pagar.api.exceptions.ApiException;
import me.pagar.api.models.CreateAnticipationRequest;
import me.pagar.api.models.CreateKYCLinkResponse;
import me.pagar.api.models.CreateRecipientRequest;
import me.pagar.api.models.CreateTransferRequest;
import me.pagar.api.models.CreateWithdrawRequest;
import me.pagar.api.models.GetAnticipationLimitResponse;
import me.pagar.api.models.GetAnticipationResponse;
import me.pagar.api.models.GetBalanceResponse;
import me.pagar.api.models.GetRecipientResponse;
import me.pagar.api.models.GetTransferResponse;
import me.pagar.api.models.GetWithdrawResponse;
import me.pagar.api.models.ListAnticipationResponse;
import me.pagar.api.models.ListRecipientResponse;
import me.pagar.api.models.ListTransferResponse;
import me.pagar.api.models.ListWithdrawals;
import me.pagar.api.models.UpdateAutomaticAnticipationSettingsRequest;
import me.pagar.api.models.UpdateMetadataRequest;
import me.pagar.api.models.UpdateRecipientBankAccountRequest;
import me.pagar.api.models.UpdateRecipientCodeRequest;
import me.pagar.api.models.UpdateRecipientRequest;
import me.pagar.api.models.UpdateTransferSettingsRequest;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface RecipientsController {
    /**
     * Updates a recipient.
     * @param  recipientId  Required parameter: Recipient id
     * @param  request  Required parameter: Recipient data
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetRecipientResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetRecipientResponse updateRecipient(
            final String recipientId,
            final UpdateRecipientRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @param  recipientId  Required parameter: Example:
     * @param  withdrawalId  Required parameter: Example:
     * @return    Returns the GetWithdrawResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetWithdrawResponse getWithdrawById(
            final String recipientId,
            final String withdrawalId) throws ApiException, IOException;

    /**
     * Retrieves recipient information.
     * @param  recipientId  Required parameter: Recipiend id
     * @return    Returns the GetRecipientResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetRecipientResponse getRecipient(
            final String recipientId) throws ApiException, IOException;

    /**
     * Get balance information for a recipient.
     * @param  recipientId  Required parameter: Recipient id
     * @return    Returns the GetBalanceResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetBalanceResponse getBalance(
            final String recipientId) throws ApiException, IOException;

    /**
     * Retrieves paginated recipients information.
     * @param  page  Optional parameter: Page number
     * @param  size  Optional parameter: Page size
     * @return    Returns the ListRecipientResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListRecipientResponse getRecipients(
            final Integer page,
            final Integer size) throws ApiException, IOException;

    /**
     * Updates the default bank account from a recipient.
     * @param  recipientId  Required parameter: Recipient id
     * @param  request  Required parameter: Bank account data
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetRecipientResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetRecipientResponse updateRecipientDefaultBankAccount(
            final String recipientId,
            final UpdateRecipientBankAccountRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Gets a paginated list of transfers for the recipient.
     * @param  recipientId  Required parameter: Recipient id
     * @param  page  Optional parameter: Page number
     * @param  size  Optional parameter: Page size
     * @param  status  Optional parameter: Filter for transfer status
     * @param  createdSince  Optional parameter: Filter for start range of transfer creation date
     * @param  createdUntil  Optional parameter: Filter for end range of transfer creation date
     * @return    Returns the ListTransferResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListTransferResponse getTransfers(
            final String recipientId,
            final Integer page,
            final Integer size,
            final String status,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil) throws ApiException, IOException;

    /**
     * Gets a transfer.
     * @param  recipientId  Required parameter: Recipient id
     * @param  transferId  Required parameter: Transfer id
     * @return    Returns the GetTransferResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetTransferResponse getTransfer(
            final String recipientId,
            final String transferId) throws ApiException, IOException;

    /**
     * @param  recipientId  Required parameter: Example:
     * @param  request  Required parameter: Example:
     * @return    Returns the GetWithdrawResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetWithdrawResponse createWithdraw(
            final String recipientId,
            final CreateWithdrawRequest request) throws ApiException, IOException;

    /**
     * Gets an anticipation.
     * @param  recipientId  Required parameter: Recipient id
     * @param  anticipationId  Required parameter: Anticipation id
     * @return    Returns the GetAnticipationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetAnticipationResponse getAnticipation(
            final String recipientId,
            final String anticipationId) throws ApiException, IOException;

    /**
     * @param  recipientId  Required parameter: Recipient Identificator
     * @param  request  Required parameter: Example:
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetRecipientResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetRecipientResponse updateRecipientTransferSettings(
            final String recipientId,
            final UpdateTransferSettingsRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Retrieves recipient information.
     * @param  code  Required parameter: Recipient code
     * @return    Returns the GetRecipientResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetRecipientResponse getRecipientByCode(
            final String code) throws ApiException, IOException;

    /**
     * Updates recipient metadata.
     * @param  recipientId  Required parameter: Recipient id
     * @param  request  Required parameter: Metadata
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetRecipientResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetRecipientResponse updateAutomaticAnticipationSettings(
            final String recipientId,
            final UpdateAutomaticAnticipationSettingsRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Creates a transfer for a recipient.
     * @param  recipientId  Required parameter: Recipient Id
     * @param  request  Required parameter: Transfer data
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetTransferResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetTransferResponse createTransfer(
            final String recipientId,
            final CreateTransferRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Creates a new recipient.
     * @param  request  Required parameter: Recipient data
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetRecipientResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetRecipientResponse createRecipient(
            final CreateRecipientRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * @return    Returns the GetRecipientResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetRecipientResponse getDefaultRecipient() throws ApiException, IOException;

    /**
     * Creates an anticipation.
     * @param  recipientId  Required parameter: Recipient id
     * @param  request  Required parameter: Anticipation data
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetAnticipationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetAnticipationResponse createAnticipation(
            final String recipientId,
            final CreateAnticipationRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Gets the anticipation limits for a recipient.
     * @param  recipientId  Required parameter: Recipient id
     * @param  timeframe  Required parameter: Timeframe
     * @param  paymentDate  Required parameter: Anticipation payment date
     * @return    Returns the GetAnticipationLimitResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetAnticipationLimitResponse getAnticipationLimits(
            final String recipientId,
            final String timeframe,
            final LocalDateTime paymentDate) throws ApiException, IOException;

    /**
     * Updates recipient metadata.
     * @param  recipientId  Required parameter: Recipient id
     * @param  request  Required parameter: Metadata
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetRecipientResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetRecipientResponse updateRecipientMetadata(
            final String recipientId,
            final UpdateMetadataRequest request,
            final String idempotencyKey) throws ApiException, IOException;

    /**
     * Retrieves a paginated list of anticipations from a recipient.
     * @param  recipientId  Required parameter: Recipient id
     * @param  page  Optional parameter: Page number
     * @param  size  Optional parameter: Page size
     * @param  status  Optional parameter: Filter for anticipation status
     * @param  timeframe  Optional parameter: Filter for anticipation timeframe
     * @param  paymentDateSince  Optional parameter: Filter for start range for anticipation payment
     *         date
     * @param  paymentDateUntil  Optional parameter: Filter for end range for anticipation payment
     *         date
     * @param  createdSince  Optional parameter: Filter for start range for anticipation creation
     *         date
     * @param  createdUntil  Optional parameter: Filter for end range for anticipation creation date
     * @return    Returns the ListAnticipationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListAnticipationResponse getAnticipations(
            final String recipientId,
            final Integer page,
            final Integer size,
            final String status,
            final String timeframe,
            final LocalDateTime paymentDateSince,
            final LocalDateTime paymentDateUntil,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil) throws ApiException, IOException;

    /**
     * Gets a paginated list of transfers for the recipient.
     * @param  recipientId  Required parameter: Example:
     * @param  page  Optional parameter: Example:
     * @param  size  Optional parameter: Example:
     * @param  status  Optional parameter: Example:
     * @param  createdSince  Optional parameter: Example:
     * @param  createdUntil  Optional parameter: Example:
     * @return    Returns the ListWithdrawals response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListWithdrawals getWithdrawals(
            final String recipientId,
            final Integer page,
            final Integer size,
            final String status,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil) throws ApiException, IOException;

    /**
     * Create a KYC link.
     * @param  recipientId  Required parameter: Recipient id
     * @return    Returns the CreateKYCLinkResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    CreateKYCLinkResponse createKYCLink(
            final String recipientId) throws ApiException, IOException;

    /**
     * Updates recipient code.
     * @param  recipientId  Required parameter: Recipient id
     * @param  request  Required parameter: UpdateRecipientCodeRequest
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetRecipientResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetRecipientResponse updateRecipientCode(
            final String recipientId,
            final UpdateRecipientCodeRequest request,
            final String idempotencyKey) throws ApiException, IOException;

}