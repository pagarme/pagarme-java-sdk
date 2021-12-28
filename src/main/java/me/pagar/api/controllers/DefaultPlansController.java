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
import me.pagar.api.models.CreatePlanItemRequest;
import me.pagar.api.models.CreatePlanRequest;
import me.pagar.api.models.GetPlanItemResponse;
import me.pagar.api.models.GetPlanResponse;
import me.pagar.api.models.ListPlansResponse;
import me.pagar.api.models.UpdateMetadataRequest;
import me.pagar.api.models.UpdatePlanItemRequest;
import me.pagar.api.models.UpdatePlanRequest;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultPlansController extends BaseController implements PlansController {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DefaultPlansController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }


    /**
     * Gets a plan.
     * @param  planId  Required parameter: Plan id
     * @return    Returns the GetPlanResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetPlanResponse getPlan(
            final String planId) throws ApiException, IOException {
        HttpRequest request = buildGetPlanRequest(planId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetPlanResponse(context);
    }

    /**
     * Builds the HttpRequest object for getPlan.
     */
    private HttpRequest buildGetPlanRequest(
            final String planId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/plans/{plan_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("plan_id",
                new SimpleEntry<Object, Boolean>(planId, true));
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
     * Processes the response for getPlan.
     * @return An object of type GetPlanResponse
     */
    private GetPlanResponse handleGetPlanResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetPlanResponse result = ApiHelper.deserialize(responseBody,
                GetPlanResponse.class);

        return result;
    }

    /**
     * Deletes a plan.
     * @param  planId  Required parameter: Plan id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetPlanResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetPlanResponse deletePlan(
            final String planId,
            final String idempotencyKey) throws ApiException, IOException {
        HttpRequest request = buildDeletePlanRequest(planId, idempotencyKey);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDeletePlanResponse(context);
    }

    /**
     * Builds the HttpRequest object for deletePlan.
     */
    private HttpRequest buildDeletePlanRequest(
            final String planId,
            final String idempotencyKey) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/plans/{plan_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("plan_id",
                new SimpleEntry<Object, Boolean>(planId, true));
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
     * Processes the response for deletePlan.
     * @return An object of type GetPlanResponse
     */
    private GetPlanResponse handleDeletePlanResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetPlanResponse result = ApiHelper.deserialize(responseBody,
                GetPlanResponse.class);

        return result;
    }

    /**
     * Updates the metadata from a plan.
     * @param  planId  Required parameter: The plan id
     * @param  request  Required parameter: Request for updating the plan metadata
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetPlanResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetPlanResponse updatePlanMetadata(
            final String planId,
            final UpdateMetadataRequest request,
            final String idempotencyKey) throws ApiException, IOException {
        HttpRequest internalRequest = buildUpdatePlanMetadataRequest(planId, request,
                idempotencyKey);
        authManagers.get("global").apply(internalRequest);

        HttpResponse response = getClientInstance().execute(internalRequest, false);
        HttpContext context = new HttpContext(internalRequest, response);

        return handleUpdatePlanMetadataResponse(context);
    }

    /**
     * Builds the HttpRequest object for updatePlanMetadata.
     */
    private HttpRequest buildUpdatePlanMetadataRequest(
            final String planId,
            final UpdateMetadataRequest request,
            final String idempotencyKey) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/Plans/{plan_id}/metadata");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("plan_id",
                new SimpleEntry<Object, Boolean>(planId, true));
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
     * Processes the response for updatePlanMetadata.
     * @return An object of type GetPlanResponse
     */
    private GetPlanResponse handleUpdatePlanMetadataResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetPlanResponse result = ApiHelper.deserialize(responseBody,
                GetPlanResponse.class);

        return result;
    }

    /**
     * Updates a plan item.
     * @param  planId  Required parameter: Plan id
     * @param  planItemId  Required parameter: Plan item id
     * @param  body  Required parameter: Request for updating the plan item
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetPlanItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetPlanItemResponse updatePlanItem(
            final String planId,
            final String planItemId,
            final UpdatePlanItemRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        HttpRequest request = buildUpdatePlanItemRequest(planId, planItemId, body, idempotencyKey);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleUpdatePlanItemResponse(context);
    }

    /**
     * Builds the HttpRequest object for updatePlanItem.
     */
    private HttpRequest buildUpdatePlanItemRequest(
            final String planId,
            final String planItemId,
            final UpdatePlanItemRequest body,
            final String idempotencyKey) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/plans/{plan_id}/items/{plan_item_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("plan_id",
                new SimpleEntry<Object, Boolean>(planId, true));
        templateParameters.put("plan_item_id",
                new SimpleEntry<Object, Boolean>(planItemId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("idempotency-key", idempotencyKey);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().putBody(queryBuilder, headers, null, bodyJson);

        return request;
    }

    /**
     * Processes the response for updatePlanItem.
     * @return An object of type GetPlanItemResponse
     */
    private GetPlanItemResponse handleUpdatePlanItemResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetPlanItemResponse result = ApiHelper.deserialize(responseBody,
                GetPlanItemResponse.class);

        return result;
    }

    /**
     * Adds a new item to a plan.
     * @param  planId  Required parameter: Plan id
     * @param  request  Required parameter: Request for creating a plan item
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetPlanItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetPlanItemResponse createPlanItem(
            final String planId,
            final CreatePlanItemRequest request,
            final String idempotencyKey) throws ApiException, IOException {
        HttpRequest internalRequest = buildCreatePlanItemRequest(planId, request, idempotencyKey);
        authManagers.get("global").apply(internalRequest);

        HttpResponse response = getClientInstance().execute(internalRequest, false);
        HttpContext context = new HttpContext(internalRequest, response);

        return handleCreatePlanItemResponse(context);
    }

    /**
     * Builds the HttpRequest object for createPlanItem.
     */
    private HttpRequest buildCreatePlanItemRequest(
            final String planId,
            final CreatePlanItemRequest request,
            final String idempotencyKey) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/plans/{plan_id}/items");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("plan_id",
                new SimpleEntry<Object, Boolean>(planId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

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
     * Processes the response for createPlanItem.
     * @return An object of type GetPlanItemResponse
     */
    private GetPlanItemResponse handleCreatePlanItemResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetPlanItemResponse result = ApiHelper.deserialize(responseBody,
                GetPlanItemResponse.class);

        return result;
    }

    /**
     * Gets a plan item.
     * @param  planId  Required parameter: Plan id
     * @param  planItemId  Required parameter: Plan item id
     * @return    Returns the GetPlanItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetPlanItemResponse getPlanItem(
            final String planId,
            final String planItemId) throws ApiException, IOException {
        HttpRequest request = buildGetPlanItemRequest(planId, planItemId);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetPlanItemResponse(context);
    }

    /**
     * Builds the HttpRequest object for getPlanItem.
     */
    private HttpRequest buildGetPlanItemRequest(
            final String planId,
            final String planItemId) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/plans/{plan_id}/items/{plan_item_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("plan_id",
                new SimpleEntry<Object, Boolean>(planId, true));
        templateParameters.put("plan_item_id",
                new SimpleEntry<Object, Boolean>(planItemId, true));
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
     * Processes the response for getPlanItem.
     * @return An object of type GetPlanItemResponse
     */
    private GetPlanItemResponse handleGetPlanItemResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetPlanItemResponse result = ApiHelper.deserialize(responseBody,
                GetPlanItemResponse.class);

        return result;
    }

    /**
     * Creates a new plan.
     * @param  body  Required parameter: Request for creating a plan
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetPlanResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetPlanResponse createPlan(
            final CreatePlanRequest body,
            final String idempotencyKey) throws ApiException, IOException {
        HttpRequest request = buildCreatePlanRequest(body, idempotencyKey);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleCreatePlanResponse(context);
    }

    /**
     * Builds the HttpRequest object for createPlan.
     */
    private HttpRequest buildCreatePlanRequest(
            final CreatePlanRequest body,
            final String idempotencyKey) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/plans");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("idempotency-key", idempotencyKey);
        headers.add("user-agent", BaseController.userAgent);
        headers.add("accept", "application/json");
        headers.add("content-type", "application/json");

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        return request;
    }

    /**
     * Processes the response for createPlan.
     * @return An object of type GetPlanResponse
     */
    private GetPlanResponse handleCreatePlanResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetPlanResponse result = ApiHelper.deserialize(responseBody,
                GetPlanResponse.class);

        return result;
    }

    /**
     * Removes an item from a plan.
     * @param  planId  Required parameter: Plan id
     * @param  planItemId  Required parameter: Plan item id
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetPlanItemResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetPlanItemResponse deletePlanItem(
            final String planId,
            final String planItemId,
            final String idempotencyKey) throws ApiException, IOException {
        HttpRequest request = buildDeletePlanItemRequest(planId, planItemId, idempotencyKey);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleDeletePlanItemResponse(context);
    }

    /**
     * Builds the HttpRequest object for deletePlanItem.
     */
    private HttpRequest buildDeletePlanItemRequest(
            final String planId,
            final String planItemId,
            final String idempotencyKey) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/plans/{plan_id}/items/{plan_item_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("plan_id",
                new SimpleEntry<Object, Boolean>(planId, true));
        templateParameters.put("plan_item_id",
                new SimpleEntry<Object, Boolean>(planItemId, true));
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
     * Processes the response for deletePlanItem.
     * @return An object of type GetPlanItemResponse
     */
    private GetPlanItemResponse handleDeletePlanItemResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetPlanItemResponse result = ApiHelper.deserialize(responseBody,
                GetPlanItemResponse.class);

        return result;
    }

    /**
     * Gets all plans.
     * @param  page  Optional parameter: Page number
     * @param  size  Optional parameter: Page size
     * @param  name  Optional parameter: Filter for Plan's name
     * @param  status  Optional parameter: Filter for Plan's status
     * @param  billingType  Optional parameter: Filter for plan's billing type
     * @param  createdSince  Optional parameter: Filter for plan's creation date start range
     * @param  createdUntil  Optional parameter: Filter for plan's creation date end range
     * @return    Returns the ListPlansResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListPlansResponse getPlans(
            final Integer page,
            final Integer size,
            final String name,
            final String status,
            final String billingType,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil) throws ApiException, IOException {
        HttpRequest request = buildGetPlansRequest(page, size, name, status, billingType,
                createdSince, createdUntil);
        authManagers.get("global").apply(request);

        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleGetPlansResponse(context);
    }

    /**
     * Builds the HttpRequest object for getPlans.
     */
    private HttpRequest buildGetPlansRequest(
            final Integer page,
            final Integer size,
            final String name,
            final String status,
            final String billingType,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil) {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/plans");

        //load all query parameters
        Map<String, Object> queryParameters = new HashMap<>();
        queryParameters.put("page", page);
        queryParameters.put("size", size);
        queryParameters.put("name", name);
        queryParameters.put("status", status);
        queryParameters.put("billing_type", billingType);
        queryParameters.put("created_since", DateTimeHelper.toRfc8601DateTime(createdSince));
        queryParameters.put("created_until", DateTimeHelper.toRfc8601DateTime(createdUntil));

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
     * Processes the response for getPlans.
     * @return An object of type ListPlansResponse
     */
    private ListPlansResponse handleGetPlansResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        ListPlansResponse result = ApiHelper.deserialize(responseBody,
                ListPlansResponse.class);

        return result;
    }

    /**
     * Updates a plan.
     * @param  planId  Required parameter: Plan id
     * @param  request  Required parameter: Request for updating a plan
     * @param  idempotencyKey  Optional parameter: Example:
     * @return    Returns the GetPlanResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetPlanResponse updatePlan(
            final String planId,
            final UpdatePlanRequest request,
            final String idempotencyKey) throws ApiException, IOException {
        HttpRequest internalRequest = buildUpdatePlanRequest(planId, request, idempotencyKey);
        authManagers.get("global").apply(internalRequest);

        HttpResponse response = getClientInstance().execute(internalRequest, false);
        HttpContext context = new HttpContext(internalRequest, response);

        return handleUpdatePlanResponse(context);
    }

    /**
     * Builds the HttpRequest object for updatePlan.
     */
    private HttpRequest buildUpdatePlanRequest(
            final String planId,
            final UpdatePlanRequest request,
            final String idempotencyKey) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/plans/{plan_id}");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("plan_id",
                new SimpleEntry<Object, Boolean>(planId, true));
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
     * Processes the response for updatePlan.
     * @return An object of type GetPlanResponse
     */
    private GetPlanResponse handleUpdatePlanResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        GetPlanResponse result = ApiHelper.deserialize(responseBody,
                GetPlanResponse.class);

        return result;
    }

}