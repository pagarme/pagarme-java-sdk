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
import me.pagar.api.controllers.ChargesController;
import me.pagar.api.controllers.CustomersController;
import me.pagar.api.controllers.DefaultChargesController;
import me.pagar.api.controllers.DefaultCustomersController;
import me.pagar.api.controllers.DefaultInvoicesController;
import me.pagar.api.controllers.DefaultOrdersController;
import me.pagar.api.controllers.DefaultPlansController;
import me.pagar.api.controllers.DefaultRecipientsController;
import me.pagar.api.controllers.DefaultSubscriptionsController;
import me.pagar.api.controllers.DefaultTokensController;
import me.pagar.api.controllers.DefaultTransactionsController;
import me.pagar.api.controllers.DefaultTransfersController;
import me.pagar.api.controllers.InvoicesController;
import me.pagar.api.controllers.OrdersController;
import me.pagar.api.controllers.PlansController;
import me.pagar.api.controllers.RecipientsController;
import me.pagar.api.controllers.SubscriptionsController;
import me.pagar.api.controllers.TokensController;
import me.pagar.api.controllers.TransactionsController;
import me.pagar.api.controllers.TransfersController;
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
    private PlansController plans;
    private SubscriptionsController subscriptions;
    private InvoicesController invoices;
    private OrdersController orders;
    private CustomersController customers;
    private RecipientsController recipients;
    private ChargesController charges;
    private TransfersController transfers;
    private TokensController tokens;
    private TransactionsController transactions;

    private static final CompatibilityFactory compatibilityFactory = new CompatibilityFactoryImpl();

    private static String userAgent = "PagarmeApiSDK - Java 6.7.1";

    /**
     * Current API environment.
     */
    private final Environment environment;

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
     * Map of authentication Managers.
     */
    private Map<String, Authentication> authentications;


    private PagarmeApiSDKClient(Environment environment, HttpClient httpClient,
            ReadonlyHttpClientConfiguration httpClientConfig, String basicAuthUserName,
            String basicAuthPassword, Map<String, Authentication> authentications) {
        this.environment = environment;
        this.httpClient = httpClient;
        this.httpClientConfig = httpClientConfig;
        this.authentications = 
                (authentications == null) ? new HashMap<>() : new HashMap<>(authentications);
        if (this.authentications.containsKey("global")) {
            this.basicAuthManager = (BasicAuthManager) this.authentications.get("global");
        }

        if (!this.authentications.containsKey("global")
                || !getBasicAuthCredentials().equals(basicAuthUserName, basicAuthPassword)) {
            this.basicAuthManager = new BasicAuthManager(basicAuthUserName, basicAuthPassword);
            this.authentications.put("global", basicAuthManager);
        }

        GlobalConfiguration globalConfig = new GlobalConfiguration.Builder()
                .authentication(this.authentications).compatibilityFactory(compatibilityFactory)
                .httpClient(httpClient).baseUri(server -> getBaseUri(server))
                .userAgent(userAgent)
                .build();
        plans = new DefaultPlansController(globalConfig);
        subscriptions = new DefaultSubscriptionsController(globalConfig);
        invoices = new DefaultInvoicesController(globalConfig);
        orders = new DefaultOrdersController(globalConfig);
        customers = new DefaultCustomersController(globalConfig);
        recipients = new DefaultRecipientsController(globalConfig);
        charges = new DefaultChargesController(globalConfig);
        transfers = new DefaultTransfersController(globalConfig);
        tokens = new DefaultTokensController(globalConfig);
        transactions = new DefaultTransactionsController(globalConfig);
    }

    /**
     * Shutdown the underlying HttpClient instance.
     */
    public static void shutdown() {
        OkClient.shutdown();
    }

    /**
     * Get the instance of PlansController.
     * @return plans
     */
    public PlansController getPlansController() {
        return plans;
    }

    /**
     * Get the instance of SubscriptionsController.
     * @return subscriptions
     */
    public SubscriptionsController getSubscriptionsController() {
        return subscriptions;
    }

    /**
     * Get the instance of InvoicesController.
     * @return invoices
     */
    public InvoicesController getInvoicesController() {
        return invoices;
    }

    /**
     * Get the instance of OrdersController.
     * @return orders
     */
    public OrdersController getOrdersController() {
        return orders;
    }

    /**
     * Get the instance of CustomersController.
     * @return customers
     */
    public CustomersController getCustomersController() {
        return customers;
    }

    /**
     * Get the instance of RecipientsController.
     * @return recipients
     */
    public RecipientsController getRecipientsController() {
        return recipients;
    }

    /**
     * Get the instance of ChargesController.
     * @return charges
     */
    public ChargesController getChargesController() {
        return charges;
    }

    /**
     * Get the instance of TransfersController.
     * @return transfers
     */
    public TransfersController getTransfersController() {
        return transfers;
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
     * Current API environment.
     * @return environment
     */
    public Environment getEnvironment() {
        return environment;
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
        return "PagarmeApiSDKClient [" + "environment=" + environment + ", httpClientConfig="
                + httpClientConfig + ", authentications=" + authentications + "]";
    }

    /**
     * Builds a new {@link PagarmeApiSDKClient.Builder} object.
     * Creates the instance with the state of the current client.
     * @return a new {@link PagarmeApiSDKClient.Builder} object
     */
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.environment = getEnvironment();
        builder.httpClient = getHttpClient();
        builder.basicAuthUserName = getBasicAuthCredentials().getBasicAuthUserName();
        builder.basicAuthPassword = getBasicAuthCredentials().getBasicAuthPassword();
        builder.authentications = authentications;
        builder.httpClientConfig(configBldr -> configBldr =
                ((HttpClientConfiguration) httpClientConfig).newBuilder());
        return builder;
    }

    /**
     * Class to build instances of {@link PagarmeApiSDKClient}.
     */
    public static class Builder {

        private Environment environment = Environment.PRODUCTION;
        private HttpClient httpClient;
        private String basicAuthUserName = "TODO: Replace";
        private String basicAuthPassword = "TODO: Replace";
        private Map<String, Authentication> authentications = null;
        private HttpClientConfiguration.Builder httpClientConfigBuilder =
                new HttpClientConfiguration.Builder();


        /**
         * Credentials setter for BasicAuth.
         * @param basicAuthUserName String value for basicAuthUserName.
         * @param basicAuthPassword String value for basicAuthPassword.
         * @return Builder
         */
        public Builder basicAuthCredentials(String basicAuthUserName, String basicAuthPassword) {
            if (basicAuthUserName == null) {
                throw new NullPointerException("BasicAuthUserName cannot be null.");
            }
            if (basicAuthPassword == null) {
                throw new NullPointerException("BasicAuthPassword cannot be null.");
            }
            this.basicAuthUserName = basicAuthUserName;
            this.basicAuthPassword = basicAuthPassword;
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
         * Builds a new PagarmeApiSDKClient object using the set fields.
         * @return PagarmeApiSDKClient
         */
        public PagarmeApiSDKClient build() {
            HttpClientConfiguration httpClientConfig = httpClientConfigBuilder.build();
            httpClient = new OkClient(httpClientConfig.getConfiguration(), compatibilityFactory);

            return new PagarmeApiSDKClient(environment, httpClient, httpClientConfig,
                    basicAuthUserName, basicAuthPassword, authentications);
        }
    }
}