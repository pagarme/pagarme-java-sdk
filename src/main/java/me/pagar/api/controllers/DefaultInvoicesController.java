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
import me.pagar.api.models.CreateInvoiceRequest;
import me.pagar.api.models.GetInvoiceResponse;
import me.pagar.api.models.ListInvoicesResponse;
import me.pagar.api.models.UpdateInvoiceStatusRequest;
import me.pagar.api.models.UpdateMetadataRequest;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultInvoicesController extends BaseController implements InvoicesController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultInvoicesController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Updates the metadata from an invoice.
     * @param  invoiceId  Required parameter: The invoice id
     * @param  request  Required parameter: Request for updating the invoice metadata
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetInvoiceResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetInvoiceResponse updateInvoiceMetadata(
            final String invoiceId,
            final UpdateMetadataRequest request,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareUpdateInvoiceMetadataRequest(invoiceId, request, idempotencyKey).execute();
    }

    /**
     * Builds the ApiCall object for updateInvoiceMetadata.
     */
    private ApiCall<GetInvoiceResponse, ApiException> prepareUpdateInvoiceMetadataRequest(
            final String invoiceId,
            final UpdateMetadataRequest request,
            final String idempotencyKey) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<GetInvoiceResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/{invoice_id}/metadata")
                        .bodyParam(param -> param.value(request))
                        .bodySerializer(() ->  ApiHelper.serialize(request))
                        .templateParam(param -> param.key("invoice_id").value(invoiceId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("idempotency-key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param ->param.key("content-type").value("application/json"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PATCH))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetInvoiceResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  subscriptionId  Required parameter: Subscription Id
     * @return    Returns the GetInvoiceResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetInvoiceResponse getPartialInvoice(
            final String subscriptionId) throws ApiException, IOException {
        return prepareGetPartialInvoiceRequest(subscriptionId).execute();
    }

    /**
     * Builds the ApiCall object for getPartialInvoice.
     */
    private ApiCall<GetInvoiceResponse, ApiException> prepareGetPartialInvoiceRequest(
            final String subscriptionId) throws IOException {
        return new ApiCall.Builder<GetInvoiceResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/partial-invoice")
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetInvoiceResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Cancels an invoice.
     * @param  invoiceId  Required parameter: Invoice id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetInvoiceResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetInvoiceResponse cancelInvoice(
            final String invoiceId,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareCancelInvoiceRequest(invoiceId, idempotencyKey).execute();
    }

    /**
     * Builds the ApiCall object for cancelInvoice.
     */
    private ApiCall<GetInvoiceResponse, ApiException> prepareCancelInvoiceRequest(
            final String invoiceId,
            final String idempotencyKey) throws IOException {
        return new ApiCall.Builder<GetInvoiceResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/{invoice_id}")
                        .templateParam(param -> param.key("invoice_id").value(invoiceId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("idempotency-key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetInvoiceResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Create an Invoice.
     * @param  subscriptionId  Required parameter: Subscription Id
     * @param  cycleId  Required parameter: Cycle Id
     * @param  request  Optional parameter: Example:
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetInvoiceResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetInvoiceResponse createInvoice(
            final String subscriptionId,
            final String cycleId,
            final CreateInvoiceRequest request,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareCreateInvoiceRequest(subscriptionId, cycleId, request,
                idempotencyKey).execute();
    }

    /**
     * Builds the ApiCall object for createInvoice.
     */
    private ApiCall<GetInvoiceResponse, ApiException> prepareCreateInvoiceRequest(
            final String subscriptionId,
            final String cycleId,
            final CreateInvoiceRequest request,
            final String idempotencyKey) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<GetInvoiceResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/subscriptions/{subscription_id}/cycles/{cycle_id}/pay")
                        .bodyParam(param -> param.value(request).isRequired(false))
                        .bodySerializer(() ->  ApiHelper.serialize(request))
                        .templateParam(param -> param.key("subscription_id").value(subscriptionId)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("cycle_id").value(cycleId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("idempotency-key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param ->param.key("content-type").value("application/json"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetInvoiceResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Gets all invoices.
     * @param  page  Optional parameter: Page number
     * @param  size  Optional parameter: Page size
     * @param  code  Optional parameter: Filter for Invoice's code
     * @param  customerId  Optional parameter: Filter for Invoice's customer id
     * @param  subscriptionId  Optional parameter: Filter for Invoice's subscription id
     * @param  createdSince  Optional parameter: Filter for Invoice's creation date start range
     * @param  createdUntil  Optional parameter: Filter for Invoices creation date end range
     * @param  status  Optional parameter: Filter for Invoice's status
     * @param  dueSince  Optional parameter: Filter for Invoice's due date start range
     * @param  dueUntil  Optional parameter: Filter for Invoice's due date end range
     * @param  customerDocument  Optional parameter: Example:
     * @return    Returns the ListInvoicesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListInvoicesResponse getInvoices(
            final Integer page,
            final Integer size,
            final String code,
            final String customerId,
            final String subscriptionId,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil,
            final String status,
            final LocalDateTime dueSince,
            final LocalDateTime dueUntil,
            final String customerDocument) throws ApiException, IOException {
        return prepareGetInvoicesRequest(page, size, code, customerId, subscriptionId, createdSince,
                createdUntil, status, dueSince, dueUntil, customerDocument).execute();
    }

    /**
     * Builds the ApiCall object for getInvoices.
     */
    private ApiCall<ListInvoicesResponse, ApiException> prepareGetInvoicesRequest(
            final Integer page,
            final Integer size,
            final String code,
            final String customerId,
            final String subscriptionId,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil,
            final String status,
            final LocalDateTime dueSince,
            final LocalDateTime dueUntil,
            final String customerDocument) throws IOException {
        return new ApiCall.Builder<ListInvoicesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices")
                        .queryParam(param -> param.key("page")
                                .value(page).isRequired(false))
                        .queryParam(param -> param.key("size")
                                .value(size).isRequired(false))
                        .queryParam(param -> param.key("code")
                                .value(code).isRequired(false))
                        .queryParam(param -> param.key("customer_id")
                                .value(customerId).isRequired(false))
                        .queryParam(param -> param.key("subscription_id")
                                .value(subscriptionId).isRequired(false))
                        .queryParam(param -> param.key("created_since")
                                .value(DateTimeHelper.toRfc8601DateTime(createdSince)).isRequired(false))
                        .queryParam(param -> param.key("created_until")
                                .value(DateTimeHelper.toRfc8601DateTime(createdUntil)).isRequired(false))
                        .queryParam(param -> param.key("status")
                                .value(status).isRequired(false))
                        .queryParam(param -> param.key("due_since")
                                .value(DateTimeHelper.toRfc8601DateTime(dueSince)).isRequired(false))
                        .queryParam(param -> param.key("due_until")
                                .value(DateTimeHelper.toRfc8601DateTime(dueUntil)).isRequired(false))
                        .queryParam(param -> param.key("customer_document")
                                .value(customerDocument).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListInvoicesResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Gets an invoice.
     * @param  invoiceId  Required parameter: Invoice Id
     * @return    Returns the GetInvoiceResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetInvoiceResponse getInvoice(
            final String invoiceId) throws ApiException, IOException {
        return prepareGetInvoiceRequest(invoiceId).execute();
    }

    /**
     * Builds the ApiCall object for getInvoice.
     */
    private ApiCall<GetInvoiceResponse, ApiException> prepareGetInvoiceRequest(
            final String invoiceId) throws IOException {
        return new ApiCall.Builder<GetInvoiceResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/{invoice_id}")
                        .templateParam(param -> param.key("invoice_id").value(invoiceId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetInvoiceResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Updates the status from an invoice.
     * @param  invoiceId  Required parameter: Invoice Id
     * @param  request  Required parameter: Request for updating an invoice's status
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetInvoiceResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetInvoiceResponse updateInvoiceStatus(
            final String invoiceId,
            final UpdateInvoiceStatusRequest request,
            final String idempotencyKey) throws ApiException, IOException {
        return prepareUpdateInvoiceStatusRequest(invoiceId, request, idempotencyKey).execute();
    }

    /**
     * Builds the ApiCall object for updateInvoiceStatus.
     */
    private ApiCall<GetInvoiceResponse, ApiException> prepareUpdateInvoiceStatusRequest(
            final String invoiceId,
            final UpdateInvoiceStatusRequest request,
            final String idempotencyKey) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<GetInvoiceResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/invoices/{invoice_id}/status")
                        .bodyParam(param -> param.value(request))
                        .bodySerializer(() ->  ApiHelper.serialize(request))
                        .templateParam(param -> param.key("invoice_id").value(invoiceId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("idempotency-key")
                                .value(idempotencyKey).isRequired(false))
                        .headerParam(param ->param.key("content-type").value("application/json"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.PATCH))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetInvoiceResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}