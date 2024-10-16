/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.controllers;

import java.io.IOException;
import me.pagar.api.exceptions.ApiException;
import me.pagar.api.models.CreateTransfer;
import me.pagar.api.models.GetTransfer;
import me.pagar.api.models.ListTransfers;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface TransfersController {
    /**
     * @param  transferId  Required parameter: Example:
     * @return    Returns the GetTransfer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetTransfer getTransferById(
            final String transferId) throws ApiException, IOException;

    /**
     * @param  request  Required parameter: Example:
     * @return    Returns the GetTransfer response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    GetTransfer createTransfer(
            final CreateTransfer request) throws ApiException, IOException;

    /**
     * Gets all transfers.
     * @return    Returns the ListTransfers response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListTransfers getTransfers() throws ApiException, IOException;

}