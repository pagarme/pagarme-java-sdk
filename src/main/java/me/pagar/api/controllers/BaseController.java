/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.controllers;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import me.pagar.api.AuthManager;
import me.pagar.api.Configuration;
import me.pagar.api.exceptions.ApiException;
import me.pagar.api.exceptions.ErrorException;
import me.pagar.api.http.client.HttpClient;
import me.pagar.api.http.client.HttpContext;
import me.pagar.api.http.request.HttpRequest;
import me.pagar.api.http.response.HttpResponse;

/**
 * Base class for all Controllers.
 */
public abstract class BaseController {
    protected static String userAgent = "PagarmeCoreApi - Java 6.5.0";

    /**
     * Protected variables to hold an instance of Configuration.
     */
    protected final Configuration config;

    protected Map<String, AuthManager> authManagers;

    private HttpClient httpClient;
    
    protected BaseController(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        this.config = config;
        this.httpClient = httpClient;
        this.authManagers = authManagers;
    }
    
    
    /**
     * Shared instance of the Http client.
     * @return The shared instance of the http client 
     */
    public HttpClient getClientInstance() {
        return httpClient;
    }

    /**
     * Validates the response against HTTP errors defined at the API level.
     * @param   response    The response recieved
     * @param   context     Context of the request and the recieved response
     * @throws    ApiException    Represents error response from the server.
     */
    protected void validateResponse(HttpResponse response, HttpContext context) 
            throws ApiException {
        //get response status code to validate
        int responseCode = response.getStatusCode();
        if (responseCode == 400) {
            throw new ErrorException("Invalid request", context);
        }

        if (responseCode == 401) {
            throw new ErrorException("Invalid API key", context);
        }

        if (responseCode == 404) {
            throw new ErrorException("An informed resource was not found", context);
        }

        if (responseCode == 412) {
            throw new ErrorException("Business validation error", context);
        }

        if (responseCode == 422) {
            throw new ErrorException("Contract validation error", context);
        }

        if (responseCode == 500) {
            throw new ErrorException("Internal server error", context);
        }

        if ((responseCode < 200) || (responseCode > 208)) { //[200,208] = HTTP OK
            throw new ApiException("HTTP Response Not OK", context);
        }

    }

    /**
     * RequestSupplier.
     */
    protected interface RequestSupplier {
        
        /**
         * Supplies the HttpRequest object.
         * @return    An object of type HttpRequest
         * @throws    ApiException    Represents error response from the server.
         * @throws    IOException    Signals that an I/O exception of some sort has occurred.
        */
        HttpRequest supply() throws ApiException, IOException;
    }

    /**
     * RequestExecutor.
     */
    protected interface RequestExecutor {

        /**
         * Execute a given HttpRequest to get the response back.
         * @param   request    The given HttpRequest to execute
         * @return  CompletableFuture of HttpResponse after execution
         */
        CompletableFuture<HttpResponse> execute(HttpRequest request);
    }

    /**
     * ResponseHandler.
     */
    protected interface ResponseHandler<T> {
        
        /**
         * Handles the response for an endpoint.
         * @param   context    HttpContext of the request and the received response
         * @return   An object of type T .
         * @throws    ApiException    Represents error response from the server.
         * @throws    IOException    Signals that an I/O exception of some sort has occurred.
         */
        T handle(HttpContext context) throws ApiException, IOException;
    }
    
    /**
     * Make an asynchronous HTTP endpoint call.
     * @param   <T>    The type of the object for response
     * @param   requestSupplier    An object of RequestSupplier to supply an instance of HttpRequest
     * @param   requestExecutor    An object of RequestExecutor to execute the given request
     * @param   responseHandler    An object of ResponseHandler to handle the endpoint response
     * @return  An object of type CompletableFuture of T
     */
    public <T> CompletableFuture<T> makeHttpCallAsync(RequestSupplier requestSupplier,
            RequestExecutor requestExecutor, ResponseHandler<T> responseHandler) {
        final HttpRequest request;
        try {
            request = requestSupplier.supply();
        } catch (Exception e) {
            CompletableFuture<T> futureResponse = new CompletableFuture<>();
            futureResponse.completeExceptionally(e);
            return futureResponse;
        }

        // Invoke request and get response
        return requestExecutor.execute(request).thenApplyAsync(response -> {
            HttpContext context = new HttpContext(request, response);
            try {
                return responseHandler.handle(context);
            } catch (Exception e) {
                throw new CompletionException(e);
            }
        });
    }
}
