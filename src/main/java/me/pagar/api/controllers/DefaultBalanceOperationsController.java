/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.controllers;

import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.time.LocalDateTime;
import me.pagar.api.ApiHelper;
import me.pagar.api.DateTimeHelper;
import me.pagar.api.Server;
import me.pagar.api.exceptions.ApiException;
import me.pagar.api.http.request.HttpMethod;
import me.pagar.api.models.GetBalanceOperationResponse;
import me.pagar.api.models.ListBalanceOperationResponse;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultBalanceOperationsController extends BaseController implements BalanceOperationsController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultBalanceOperationsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @param  status  Optional parameter: Example:
     * @param  createdSince  Optional parameter: Example:
     * @param  createdUntil  Optional parameter: Example:
     * @return    Returns the ListBalanceOperationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListBalanceOperationResponse getBalanceOperations(
            final String status,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil) throws ApiException, IOException {
        return prepareGetBalanceOperationsRequest(status, createdSince, createdUntil).execute();
    }

    /**
     * Builds the ApiCall object for getBalanceOperations.
     */
    private ApiCall<ListBalanceOperationResponse, ApiException> prepareGetBalanceOperationsRequest(
            final String status,
            final LocalDateTime createdSince,
            final LocalDateTime createdUntil) throws IOException {
        return new ApiCall.Builder<ListBalanceOperationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/balance/operations")
                        .queryParam(param -> param.key("status")
                                .value(status).isRequired(false))
                        .queryParam(param -> param.key("created_since")
                                .value(DateTimeHelper.toRfc8601DateTime(createdSince)).isRequired(false))
                        .queryParam(param -> param.key("created_until")
                                .value(DateTimeHelper.toRfc8601DateTime(createdUntil)).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListBalanceOperationResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  id  Required parameter: Example:
     * @return    Returns the GetBalanceOperationResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetBalanceOperationResponse getBalanceOperationById(
            final long id) throws ApiException, IOException {
        return prepareGetBalanceOperationByIdRequest(id).execute();
    }

    /**
     * Builds the ApiCall object for getBalanceOperationById.
     */
    private ApiCall<GetBalanceOperationResponse, ApiException> prepareGetBalanceOperationByIdRequest(
            final long id) throws IOException {
        return new ApiCall.Builder<GetBalanceOperationResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/balance/operations/{id}")
                        .templateParam(param -> param.key("id").value(id).isRequired(false)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetBalanceOperationResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}