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
import me.pagar.api.ApiHelper;
import me.pagar.api.Server;
import me.pagar.api.exceptions.ApiException;
import me.pagar.api.http.request.HttpMethod;
import me.pagar.api.models.CreateTransfer;
import me.pagar.api.models.GetTransfer;
import me.pagar.api.models.ListTransfers;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultTransfersController extends BaseController implements TransfersController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DefaultTransfersController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @param  transferId  Required parameter: Example:
     * @return    Returns the GetTransfer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetTransfer getTransferById(
            final String transferId) throws ApiException, IOException {
        return prepareGetTransferByIdRequest(transferId).execute();
    }

    /**
     * Builds the ApiCall object for getTransferById.
     */
    private ApiCall<GetTransfer, ApiException> prepareGetTransferByIdRequest(
            final String transferId) throws IOException {
        return new ApiCall.Builder<GetTransfer, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/transfers/{transfer_id}")
                        .templateParam(param -> param.key("transfer_id").value(transferId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("httpBasic"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetTransfer.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  request  Required parameter: Example:
     * @return    Returns the GetTransfer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public GetTransfer createTransfer(
            final CreateTransfer request) throws ApiException, IOException {
        return prepareCreateTransferRequest(request).execute();
    }

    /**
     * Builds the ApiCall object for createTransfer.
     */
    private ApiCall<GetTransfer, ApiException> prepareCreateTransferRequest(
            final CreateTransfer request) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<GetTransfer, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/transfers/recipients")
                        .bodyParam(param -> param.value(request))
                        .bodySerializer(() ->  ApiHelper.serialize(request))
                        .headerParam(param ->param.key("content-type").value("application/json"))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("httpBasic"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, GetTransfer.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Gets all transfers.
     * @return    Returns the ListTransfers response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ListTransfers getTransfers() throws ApiException, IOException {
        return prepareGetTransfersRequest().execute();
    }

    /**
     * Builds the ApiCall object for getTransfers.
     */
    private ApiCall<ListTransfers, ApiException> prepareGetTransfersRequest() throws IOException {
        return new ApiCall.Builder<ListTransfers, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/transfers")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("httpBasic"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, ListTransfers.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}