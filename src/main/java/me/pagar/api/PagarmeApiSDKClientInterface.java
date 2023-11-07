/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api;

import me.pagar.api.controllers.BalanceOperationsController;
import me.pagar.api.controllers.ChargesController;
import me.pagar.api.controllers.CustomersController;
import me.pagar.api.controllers.InvoicesController;
import me.pagar.api.controllers.OrdersController;
import me.pagar.api.controllers.PayablesController;
import me.pagar.api.controllers.PlansController;
import me.pagar.api.controllers.RecipientsController;
import me.pagar.api.controllers.SubscriptionsController;
import me.pagar.api.controllers.TokensController;
import me.pagar.api.controllers.TransactionsController;
import me.pagar.api.controllers.TransfersController;

/**
 * Gateway interface for the library.
 * This acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public interface PagarmeApiSDKClientInterface extends Configuration {
    
    /**
     * Provides access to Subscriptions controller.
     * @return Returns the SubscriptionsController instance
     */
    SubscriptionsController getSubscriptionsController();

    /**
     * Provides access to Orders controller.
     * @return Returns the OrdersController instance
     */
    OrdersController getOrdersController();

    /**
     * Provides access to Plans controller.
     * @return Returns the PlansController instance
     */
    PlansController getPlansController();

    /**
     * Provides access to Invoices controller.
     * @return Returns the InvoicesController instance
     */
    InvoicesController getInvoicesController();

    /**
     * Provides access to Customers controller.
     * @return Returns the CustomersController instance
     */
    CustomersController getCustomersController();

    /**
     * Provides access to Charges controller.
     * @return Returns the ChargesController instance
     */
    ChargesController getChargesController();

    /**
     * Provides access to Recipients controller.
     * @return Returns the RecipientsController instance
     */
    RecipientsController getRecipientsController();

    /**
     * Provides access to Tokens controller.
     * @return Returns the TokensController instance
     */
    TokensController getTokensController();

    /**
     * Provides access to Transactions controller.
     * @return Returns the TransactionsController instance
     */
    TransactionsController getTransactionsController();

    /**
     * Provides access to Transfers controller.
     * @return Returns the TransfersController instance
     */
    TransfersController getTransfersController();

    /**
     * Provides access to Payables controller.
     * @return Returns the PayablesController instance
     */
    PayablesController getPayablesController();

    /**
     * Provides access to BalanceOperations controller.
     * @return Returns the BalanceOperationsController instance
     */
    BalanceOperationsController getBalanceOperationsController();

}