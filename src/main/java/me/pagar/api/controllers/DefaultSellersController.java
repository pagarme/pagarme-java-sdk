/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import me.pagar.api.ApiHelper;
import me.pagar.api.AuthManager;
import me.pagar.api.Configuration;
import me.pagar.api.DateTimeHelper;
import me.pagar.api.exceptions.ApiException;
import me.pagar.api.http.Headers;
import me.pagar.api.http.client.HttpClient;
import me.pagar.api.http.client.HttpContext;
import me.pagar.api.http.request.HttpRequest;
import me.pagar.api.http.response.HttpResponse;
import me.pagar.api.http.response.HttpStringResponse;
import me.pagar.api.models.CreateSellerRequest;
import me.pagar.api.models.GetSellerResponse;
import me.pagar.api.models.ListSellerResponse;
import me.pagar.api.models.UpdateMetadataRequest;
import me.pagar.api.models.UpdateSellerRequest;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultSellersController extends BaseController implements SellersController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DefaultSellersController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }


    /**
     * @param  request  Required parameter: Seller Model
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSellerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetSellerResponse createSeller(
            final CreateSellerRequest request,
            final String idempotencyKey) throws ApiException, IOException {
        HttpRequest internalRequest = buildCreateSellerRequest(request, idempotencyKey);
        authManagers.get("global").apply(internalRequest);

        HttpResponse response = getClientInstance().execute(internalRequest, false);
        HttpContext context = new HttpContext(internalRequest, response);

        return handleCreateSellerResponse(context);
    }

    /**
     * Builds the HttpRequest object for createSeller.
     */
    private HttpRequest buildCreateSellerRequest(
            final CreateSellerRequest request,
            final String idempotencyKey) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/sellers/");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("idempotency-key", idempotencyKey);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(request);
        HttpRequest internalRequest = getClientInstance().postBody(queryBuilder, headers, null,
                bodyJson);

        return internalRequest;
    }

    /**
     * Processes the response for createSeller.
     * @return An object of type GetSellerResponse
     */
    private GetSellerResponse handleCreateSellerResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetSellerResponse result = ApiHelper.deserialize(responseBody,
                GetSellerResponse.class);

        return result;
    }

    /**
     * @param  sellerId  Required parameter: Seller Id
     * @param  request  Required parameter: Request for updating the charge metadata
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSellerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetSellerResponse updateSellerMetadata(
            final String sellerId,
            final UpdateMetadataRequest request,
            final String idempotencyKey) throws ApiException, IOException {
        HttpRequest internalRequest = buildUpdateSellerMetadataRequest(sellerId, request,
                idempotencyKey);
        authManagers.get("global").apply(internalRequest);

        HttpResponse response = getClientInstance().execute(internalRequest, false);
        HttpContext context = new HttpContext(internalRequest, response);

        return handleUpdateSellerMetadataResponse(context);
    }

    /**
     * Builds the HttpRequest object for updateSellerMetadata.
     */
    private HttpRequest buildUpdateSellerMetadataRequest(
            final String sellerId,
            final UpdateMetadataRequest request,
            final String idempotencyKey) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/sellers/{seller_id}/metadata");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("seller_id",
                new SimpleEntry<Object, Boolean>(sellerId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("idempotency-key", idempotencyKey);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(request);
        HttpRequest internalRequest = getClientInstance().patchBody(queryBuilder, headers, null,
                bodyJson);

        return internalRequest;
    }

    /**
     * Processes the response for updateSellerMetadata.
     * @return An object of type GetSellerResponse
     */
    private GetSellerResponse handleUpdateSellerMetadataResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetSellerResponse result = ApiHelper.deserialize(responseBody,
                GetSellerResponse.class);

        return result;
    }

    /**
     * @param  id  Required parameter: Example:
     * @param  request  Required parameter: Update Seller model
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSellerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetSellerResponse updateSeller(
            final String id,
            final UpdateSellerRequest request,
            final String idempotencyKey) throws ApiException, IOException {
        HttpRequest internalRequest = buildUpdateSellerRequest(id, request, idempotencyKey);
        authManagers.get("global").apply(internalRequest);

        HttpResponse response = getClientInstance().execute(internalRequest, false);
        HttpContext context = new HttpContext(internalRequest, response);

        return handleUpdateSellerResponse(context);
    }

    /**
     * Builds the HttpRequest object for updateSeller.
     */
    private HttpRequest buildUpdateSellerRequest(
            final String id,
            final UpdateSellerRequest request,
            final String idempotencyKey) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/sellers/{id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("id",
                new SimpleEntry<Object, Boolean>(id, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("idempotency-key", idempotencyKey);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(request);
        HttpRequest internalRequest = getClientInstance().putBody(queryBuilder, headers, null,
                bodyJson);

        return internalRequest;
    }

    /**
     * Processes the response for updateSeller.
     * @return An object of type GetSellerResponse
     */
    private GetSellerResponse handleUpdateSellerResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetSellerResponse result = ApiHelper.deserialize(responseBody,
                GetSellerResponse.class);

        return result;
    }

    /**
     * @param  sellerId  Required parameter: Seller Id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetSellerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetSellerResponse deleteSeller(
            final String sellerId,
            final String idempotencyKey) throws ApiException, IOException {
        HttpRequest request = buildDeleteSellerRequest(sellerId, idempotencyKey);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDeleteSellerResponse(context);
    }

    /**
     * Builds the HttpRequest object for deleteSeller.
     */
    private HttpRequest buildDeleteSellerRequest(
            final String sellerId,
            final String idempotencyKey) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/sellers/{sellerId}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("sellerId",
                new SimpleEntry<Object, Boolean>(sellerId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("idempotency-key", idempotencyKey);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().delete(queryBuilder, headers, null, null);

        return request;
    }

    /**
     * Processes the response for deleteSeller.
     * @return An object of type GetSellerResponse
     */
    private GetSellerResponse handleDeleteSellerResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetSellerResponse result = ApiHelper.deserialize(responseBody,
                GetSellerResponse.class);

        return result;
    }

    /**
     * @param  id  Required parameter: Seller Id
     * @return    Returns the GetSellerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetSellerResponse getSellerById(
            final String id) throws ApiException, IOException {
        HttpRequest request = buildGetSellerByIdRequest(id);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetSellerByIdResponse(context);
    }

    /**
     * Builds the HttpRequest object for getSellerById.
     */
    private HttpRequest buildGetSellerByIdRequest(
            final String id) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/sellers/{id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("id",
                new SimpleEntry<Object, Boolean>(id, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, null, null);

        return request;
    }

    /**
     * Processes the response for getSellerById.
     * @return An object of type GetSellerResponse
     */
    private GetSellerResponse handleGetSellerByIdResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetSellerResponse result = ApiHelper.deserialize(responseBody,
                GetSellerResponse.class);

        return result;
    }

    /**
     * @param  page  Optional parameter: Page number
     * @param  size  Optional parameter: Page size
     * @param  name  Optional parameter: Example:
     * @param  document  Optional parameter: Example:
     * @param  code  Optional parameter: Example:
     * @param  status  Optional parameter: Example:
     * @param  type  Optional parameter: Example:
     * @param  createdSince  Optional parameter: Example:
     * @param  createdUntil  Optional parameter: Example:
     * @return    Returns the ListSellerResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListSellerResponse getSellers(
            final Integer page,
            final Integer size,
            final String name,
            final String document,
            final String code,
            final String status,
            final String type,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil) throws ApiException, IOException {
        HttpRequest request = buildGetSellersRequest(page, size, name, document, code, status, type,
                createdSince, createdUntil);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetSellersResponse(context);
    }

    /**
     * Builds the HttpRequest object for getSellers.
     */
    private HttpRequest buildGetSellersRequest(
            final Integer page,
            final Integer size,
            final String name,
            final String document,
            final String code,
            final String status,
            final String type,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/sellers");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("page", page);
        queryParameters.put("size", size);
        queryParameters.put("name", name);
        queryParameters.put("document", document);
        queryParameters.put("code", code);
        queryParameters.put("status", status);
        queryParameters.put("type", type);
        queryParameters.put("created_Since", DateTimeHelper.toRfc8601DateTime(createdSince));
        queryParameters.put("created_Until", DateTimeHelper.toRfc8601DateTime(createdUntil));

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");

        //prepare and invoke the API call request to fetch the response
        HttpRequest request = getClientInstance().get(queryBuilder, headers, queryParameters,
                null);

        return request;
    }

    /**
     * Processes the response for getSellers.
     * @return An object of type ListSellerResponse
     */
    private ListSellerResponse handleGetSellersResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        ListSellerResponse result = ApiHelper.deserialize(responseBody,
                ListSellerResponse.class);

        return result;
    }

}