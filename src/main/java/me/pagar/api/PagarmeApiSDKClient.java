/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api;

import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.authentication.Authentication;
import io.apimatic.coreinterfaces.compatibility.CompatibilityFactory;
import io.apimatic.coreinterfaces.http.HttpClient;
import io.apimatic.okhttpclient.adapter.OkClient;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import me.pagar.api.authentication.BasicAuthManager;
import me.pagar.api.authentication.BasicAuthModel;
import me.pagar.api.controllers.BalanceOperationsController;
import me.pagar.api.controllers.ChargesController;
import me.pagar.api.controllers.CustomersController;
import me.pagar.api.controllers.DefaultBalanceOperationsController;
import me.pagar.api.controllers.DefaultChargesController;
import me.pagar.api.controllers.DefaultCustomersController;
import me.pagar.api.controllers.DefaultInvoicesController;
import me.pagar.api.controllers.DefaultOrdersController;
import me.pagar.api.controllers.DefaultPayablesController;
import me.pagar.api.controllers.DefaultPlansController;
import me.pagar.api.controllers.DefaultRecipientsController;
import me.pagar.api.controllers.DefaultSubscriptionsController;
import me.pagar.api.controllers.DefaultTokensController;
import me.pagar.api.controllers.DefaultTransactionsController;
import me.pagar.api.controllers.DefaultTransfersController;
import me.pagar.api.controllers.InvoicesController;
import me.pagar.api.controllers.OrdersController;
import me.pagar.api.controllers.PayablesController;
import me.pagar.api.controllers.PlansController;
import me.pagar.api.controllers.RecipientsController;
import me.pagar.api.controllers.SubscriptionsController;
import me.pagar.api.controllers.TokensController;
import me.pagar.api.controllers.TransactionsController;
import me.pagar.api.controllers.TransfersController;
import me.pagar.api.http.client.HttpCallback;
import me.pagar.api.http.client.HttpClientConfiguration;
import me.pagar.api.http.client.ReadonlyHttpClientConfiguration;

/**
 * Gateway class for the library.
 * This class acts as a factory for Controllers.
 * It holds the state of the SDK.
 */
public final class PagarmeApiSDKClient implements PagarmeApiSDKClientInterface {

    /**
     * Private store for controllers.
     */
    private SubscriptionsController subscriptions;
    private OrdersController orders;
    private PlansController plans;
    private InvoicesController invoices;
    private CustomersController customers;
    private ChargesController charges;
    private RecipientsController recipients;
    private TokensController tokens;
    private TransactionsController transactions;
    private TransfersController transfers;
    private PayablesController payables;
    private BalanceOperationsController balanceOperations;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "PagarmeApiSDK - Java 6.8.12";

    /**
     * Current API environment.
     */
    private final Environment environment;

    /**
     * .
     */
    private final String serviceRefererName;

    /**
     * The HTTP Client instance to use for making HTTP requests.
     */
    private final HttpClient httpClient;

    /**
     * Http Client Configuration instance.
     */
    private final ReadonlyHttpClientConfiguration httpClientConfig;

    /**
     * BasicAuthManager.
     */
    private BasicAuthManager basicAuthManager;

    /**
     * The instance of BasicAuthModel.
     */
    private BasicAuthModel basicAuthModel;

    /**
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications = new HashMap<String, Authentication>();

    /**
     * Callback to be called before and after the HTTP call for an endpoint is made.
     */
    private final HttpCallback httpCallback;

    private PagarmeApiSDKClient(Environment environment, String serviceRefererName,
            HttpClient httpClient, ReadonlyHttpClientConfiguration httpClientConfig,
            BasicAuthModel basicAuthModel, HttpCallback httpCallback) {
        this.environment = environment;
        this.serviceRefererName = serviceRefererName;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.httpCallback = httpCallback;

        this.basicAuthModel = basicAuthModel;

        this.basicAuthManager = new BasicAuthManager(basicAuthModel);
        this.authentications.put("httpBasic", basicAuthManager);

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .compatibilityFactory(compatibilityFactory)
                .authentication(this.authentications)
                .callback(httpCallback)
                .userAgent(userAgent)
                .globalHeader("ServiceRefererName", serviceRefererName)
                .build();
        subscriptions = new DefaultSubscriptionsController(globalConfig);
        orders = new DefaultOrdersController(globalConfig);
        plans = new DefaultPlansController(globalConfig);
        invoices = new DefaultInvoicesController(globalConfig);
        customers = new DefaultCustomersController(globalConfig);
        charges = new DefaultChargesController(globalConfig);
        recipients = new DefaultRecipientsController(globalConfig);
        tokens = new DefaultTokensController(globalConfig);
        transactions = new DefaultTransactionsController(globalConfig);
        transfers = new DefaultTransfersController(globalConfig);
        payables = new DefaultPayablesController(globalConfig);
        balanceOperations = new DefaultBalanceOperationsController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of SubscriptionsController.
     * @return subscriptions
     */
    public SubscriptionsController getSubscriptionsController() {
        return subscriptions;
    }

    /**
     * Get the instance of OrdersController.
     * @return orders
     */
    public OrdersController getOrdersController() {
        return orders;
    }

    /**
     * Get the instance of PlansController.
     * @return plans
     */
    public PlansController getPlansController() {
        return plans;
    }

    /**
     * Get the instance of InvoicesController.
     * @return invoices
     */
    public InvoicesController getInvoicesController() {
        return invoices;
    }

    /**
     * Get the instance of CustomersController.
     * @return customers
     */
    public CustomersController getCustomersController() {
        return customers;
    }

    /**
     * Get the instance of ChargesController.
     * @return charges
     */
    public ChargesController getChargesController() {
        return charges;
    }

    /**
     * Get the instance of RecipientsController.
     * @return recipients
     */
    public RecipientsController getRecipientsController() {
        return recipients;
    }

    /**
     * Get the instance of TokensController.
     * @return tokens
     */
    public TokensController getTokensController() {
        return tokens;
    }

    /**
     * Get the instance of TransactionsController.
     * @return transactions
     */
    public TransactionsController getTransactionsController() {
        return transactions;
    }

    /**
     * Get the instance of TransfersController.
     * @return transfers
     */
    public TransfersController getTransfersController() {
        return transfers;
    }

    /**
     * Get the instance of PayablesController.
     * @return payables
     */
    public PayablesController getPayablesController() {
        return payables;
    }

    /**
     * Get the instance of BalanceOperationsController.
     * @return balanceOperations
     */
    public BalanceOperationsController getBalanceOperationsController() {
        return balanceOperations;
    }

    /**
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * .
     * @return serviceRefererName
     */
    public String getServiceRefererName() {
        return serviceRefererName;
    }

    /**
     * The HTTP Client instance to use for making HTTP requests.
     * @return httpClient
     */
    private HttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Http Client Configuration instance.
     * @return httpClientConfig
     */
    public ReadonlyHttpClientConfiguration getHttpClientConfig() {
        return httpClientConfig;
    }

    /**
     * The credentials to use with BasicAuth.
     * @return basicAuthCredentials
     */
    public BasicAuthCredentials getBasicAuthCredentials() {
        return basicAuthManager;
    }

    /**
     * The auth credential model for BasicAuth.
     * @return the instance of BasicAuthModel
     */
    public BasicAuthModel getBasicAuthModel() {
        return basicAuthModel;
    }
    /**
     * The timeout to use for making HTTP requests.
     * @deprecated This method will be removed in a future version. Use
     *             {@link #getHttpClientConfig()} instead.
     *
     * @return timeout
     */
    @Deprecated
    public long timeout() {
        return httpClientConfig.getTimeout();
    }

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(Server server) {
        return environmentMapper(environment, server);
    }

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    public String getBaseUri() {
        return getBaseUri(Server.ENUM_DEFAULT);
    }


    /**
     * Get base URI by current environment.
     * 
     * @param server string for which to get the base URI
     * @return Processed base URI
     */
    public String getBaseUri(String server) {
        return getBaseUri(Server.fromString(server));
    }


    /**
     * Base URLs by environment and server aliases.
     * @param environment Environment for which to get the base URI
     * @param server Server for which to get the base URI
     * @return base URL
     */
    private static String environmentMapper(Environment environment, Server server) {
        if (environment.equals(Environment.PRODUCTION)) {
            if (server.equals(Server.ENUM_DEFAULT)) {
                return "https://api.pagar.me/core/v5";
            }
        }
        return "https://api.pagar.me/core/v5";
    }

    /**
     * Converts this PagarmeApiSDKClient into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PagarmeApiSDKClient [" + "environment=" + environment + ", serviceRefererName="
                + serviceRefererName + ", httpClientConfig=" + httpClientConfig
                + ", authentications=" + authentications + "]";
    }

    /**
     * Builds a new {@link PagarmeApiSDKClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link PagarmeApiSDKClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.serviceRefererName = getServiceRefererName();
        builder.httpClient = getHttpClient();
        builder.basicAuthCredentials(getBasicAuthModel()
                .toBuilder().build());
        builder.httpCallback = httpCallback;
        builder.httpClientConfig(() -> ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link PagarmeApiSDKClient}.
     */
    public static class Builder {

        private Environment environment = Environment.PRODUCTION;
        private String serviceRefererName = "";
        private HttpClient httpClient;
        private BasicAuthModel basicAuthModel = new BasicAuthModel.Builder("", "").build();
        private HttpCallback httpCallback = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Credentials setter for BasicAuth.
         * @param basicAuthUserName String value for basicAuthUserName.
         * @param basicAuthPassword String value for basicAuthPassword.
         * @deprecated This builder method is deprecated.
         * Use {@link #basicAuthCredentials(BasicAuthModel) basicAuthCredentials} instead.
         * @return The current instance of builder.
         */
        @Deprecated
        public Builder basicAuthCredentials(String basicAuthUserName, String basicAuthPassword) {
            basicAuthModel = basicAuthModel.toBuilder()
                .username(basicAuthUserName)
                .password(basicAuthPassword)
                .build();
            return this;
        }

        /**
         * Credentials setter for BasicAuthCredentials.
         * @param basicAuthModel The instance of BasicAuthModel.
         * @return The current instance of builder.
         */
        public Builder basicAuthCredentials(BasicAuthModel basicAuthModel) {
            this.basicAuthModel = basicAuthModel;
            return this;
        }

        /**
         * Current API environment.
         * @param environment The environment for client.
         * @return Builder
         */
        public Builder environment(Environment environment) {
            this.environment = environment;
            return this;
        }

        /**
         * .
         * @param serviceRefererName The serviceRefererName for client.
         * @return Builder
         */
        public Builder serviceRefererName(String serviceRefererName) {
            if (serviceRefererName == null) {
                throw new NullPointerException("serviceRefererName cannot be null");
            }
            this.serviceRefererName = serviceRefererName;
            return this;
        }

        /**
         * The timeout to use for making HTTP requests.
         * @deprecated This method will be removed in a future version. Use
         *             {@link #httpClientConfig(Consumer) httpClientConfig} instead.
         * @param timeout must be greater then 0.
         * @return Builder
         */
        @Deprecated
        public Builder timeout(long timeout) {
            this.httpClientConfigBuilder.timeout(timeout);
            return this;
        }

        /**
         * HttpCallback.
         * @param httpCallback Callback to be called before and after the HTTP call.
         * @return Builder
         */
        public Builder httpCallback(HttpCallback httpCallback) {
            this.httpCallback = httpCallback;
            return this;
        }

        /**
         * Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param action Consumer for the builder of httpClientConfiguration.
         * @return Builder
         */
        public Builder httpClientConfig(Consumer<HttpClientConfiguration.Builder> action) {
            action.accept(httpClientConfigBuilder);
            return this;
        }

        /**
         * Private Setter for the Builder of httpClientConfiguration, takes in an operation to be performed
         * on the builder instance of HTTP client configuration.
         * 
         * @param supplier Supplier for the builder of httpClientConfiguration.
         * @return Builder
         */
        private Builder httpClientConfig(Supplier<HttpClientConfiguration.Builder> supplier) {
            httpClientConfigBuilder = supplier.get();
            return this;
        }

        /**
         * Builds a new PagarmeApiSDKClient object using the set fields.
         * @return PagarmeApiSDKClient
         */
        public PagarmeApiSDKClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new PagarmeApiSDKClient(environment, serviceRefererName, httpClient,
                    httpClientConfig, basicAuthModel, httpCallback);
        }
    }
}