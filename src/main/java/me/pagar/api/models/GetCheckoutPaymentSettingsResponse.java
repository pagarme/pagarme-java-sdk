/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for GetCheckoutPaymentSettingsResponse type.
 */
public class GetCheckoutPaymentSettingsResponse {
    private OptionalNullable<String> successUrl;
    private OptionalNullable<String> paymentUrl;
    private OptionalNullable<List<String>> acceptedPaymentMethods;
    private OptionalNullable<String> status;
    private OptionalNullable<GetCustomerResponse> customer;
    private OptionalNullable<Integer> amount;
    private OptionalNullable<String> defaultPaymentMethod;
    private OptionalNullable<String> gatewayAffiliationId;

    /**
     * Default constructor.
     */
    public GetCheckoutPaymentSettingsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  successUrl  String value for successUrl.
     * @param  paymentUrl  String value for paymentUrl.
     * @param  acceptedPaymentMethods  List of String value for acceptedPaymentMethods.
     * @param  status  String value for status.
     * @param  customer  GetCustomerResponse value for customer.
     * @param  amount  Integer value for amount.
     * @param  defaultPaymentMethod  String value for defaultPaymentMethod.
     * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
     */
    public GetCheckoutPaymentSettingsResponse(
            String successUrl,
            String paymentUrl,
            List<String> acceptedPaymentMethods,
            String status,
            GetCustomerResponse customer,
            Integer amount,
            String defaultPaymentMethod,
            String gatewayAffiliationId) {
        this.successUrl = OptionalNullable.of(successUrl);
        this.paymentUrl = OptionalNullable.of(paymentUrl);
        this.acceptedPaymentMethods = OptionalNullable.of(acceptedPaymentMethods);
        this.status = OptionalNullable.of(status);
        this.customer = OptionalNullable.of(customer);
        this.amount = OptionalNullable.of(amount);
        this.defaultPaymentMethod = OptionalNullable.of(defaultPaymentMethod);
        this.gatewayAffiliationId = OptionalNullable.of(gatewayAffiliationId);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetCheckoutPaymentSettingsResponse(OptionalNullable<String> successUrl,
            OptionalNullable<String> paymentUrl,
            OptionalNullable<List<String>> acceptedPaymentMethods, OptionalNullable<String> status,
            OptionalNullable<GetCustomerResponse> customer, OptionalNullable<Integer> amount,
            OptionalNullable<String> defaultPaymentMethod,
            OptionalNullable<String> gatewayAffiliationId) {
        this.successUrl = successUrl;
        this.paymentUrl = paymentUrl;
        this.acceptedPaymentMethods = acceptedPaymentMethods;
        this.status = status;
        this.customer = customer;
        this.amount = amount;
        this.defaultPaymentMethod = defaultPaymentMethod;
        this.gatewayAffiliationId = gatewayAffiliationId;
    }

    /**
     * Internal Getter for SuccessUrl.
     * Success Url
     * @return Returns the Internal String
     */
    @JsonGetter("success_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSuccessUrl() {
        return this.successUrl;
    }

    /**
     * Getter for SuccessUrl.
     * Success Url
     * @return Returns the String
     */
    public String getSuccessUrl() {
        return OptionalNullable.getFrom(successUrl);
    }

    /**
     * Setter for SuccessUrl.
     * Success Url
     * @param successUrl Value for String
     */
    @JsonSetter("success_url")
    public void setSuccessUrl(String successUrl) {
        this.successUrl = OptionalNullable.of(successUrl);
    }

    /**
     * UnSetter for SuccessUrl.
     * Success Url
     */
    public void unsetSuccessUrl() {
        successUrl = null;
    }

    /**
     * Internal Getter for PaymentUrl.
     * Payment Url
     * @return Returns the Internal String
     */
    @JsonGetter("payment_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPaymentUrl() {
        return this.paymentUrl;
    }

    /**
     * Getter for PaymentUrl.
     * Payment Url
     * @return Returns the String
     */
    public String getPaymentUrl() {
        return OptionalNullable.getFrom(paymentUrl);
    }

    /**
     * Setter for PaymentUrl.
     * Payment Url
     * @param paymentUrl Value for String
     */
    @JsonSetter("payment_url")
    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = OptionalNullable.of(paymentUrl);
    }

    /**
     * UnSetter for PaymentUrl.
     * Payment Url
     */
    public void unsetPaymentUrl() {
        paymentUrl = null;
    }

    /**
     * Internal Getter for AcceptedPaymentMethods.
     * Accepted Payment Methods
     * @return Returns the Internal List of String
     */
    @JsonGetter("accepted_payment_methods")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetAcceptedPaymentMethods() {
        return this.acceptedPaymentMethods;
    }

    /**
     * Getter for AcceptedPaymentMethods.
     * Accepted Payment Methods
     * @return Returns the List of String
     */
    public List<String> getAcceptedPaymentMethods() {
        return OptionalNullable.getFrom(acceptedPaymentMethods);
    }

    /**
     * Setter for AcceptedPaymentMethods.
     * Accepted Payment Methods
     * @param acceptedPaymentMethods Value for List of String
     */
    @JsonSetter("accepted_payment_methods")
    public void setAcceptedPaymentMethods(List<String> acceptedPaymentMethods) {
        this.acceptedPaymentMethods = OptionalNullable.of(acceptedPaymentMethods);
    }

    /**
     * UnSetter for AcceptedPaymentMethods.
     * Accepted Payment Methods
     */
    public void unsetAcceptedPaymentMethods() {
        acceptedPaymentMethods = null;
    }

    /**
     * Internal Getter for Status.
     * Status
     * @return Returns the Internal String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetStatus() {
        return this.status;
    }

    /**
     * Getter for Status.
     * Status
     * @return Returns the String
     */
    public String getStatus() {
        return OptionalNullable.getFrom(status);
    }

    /**
     * Setter for Status.
     * Status
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = OptionalNullable.of(status);
    }

    /**
     * UnSetter for Status.
     * Status
     */
    public void unsetStatus() {
        status = null;
    }

    /**
     * Internal Getter for Customer.
     * Customer
     * @return Returns the Internal GetCustomerResponse
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetCustomerResponse> internalGetCustomer() {
        return this.customer;
    }

    /**
     * Getter for Customer.
     * Customer
     * @return Returns the GetCustomerResponse
     */
    public GetCustomerResponse getCustomer() {
        return OptionalNullable.getFrom(customer);
    }

    /**
     * Setter for Customer.
     * Customer
     * @param customer Value for GetCustomerResponse
     */
    @JsonSetter("customer")
    public void setCustomer(GetCustomerResponse customer) {
        this.customer = OptionalNullable.of(customer);
    }

    /**
     * UnSetter for Customer.
     * Customer
     */
    public void unsetCustomer() {
        customer = null;
    }

    /**
     * Internal Getter for Amount.
     * Payment amount
     * @return Returns the Internal Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetAmount() {
        return this.amount;
    }

    /**
     * Getter for Amount.
     * Payment amount
     * @return Returns the Integer
     */
    public Integer getAmount() {
        return OptionalNullable.getFrom(amount);
    }

    /**
     * Setter for Amount.
     * Payment amount
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = OptionalNullable.of(amount);
    }

    /**
     * UnSetter for Amount.
     * Payment amount
     */
    public void unsetAmount() {
        amount = null;
    }

    /**
     * Internal Getter for DefaultPaymentMethod.
     * Default Payment Method
     * @return Returns the Internal String
     */
    @JsonGetter("default_payment_method")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDefaultPaymentMethod() {
        return this.defaultPaymentMethod;
    }

    /**
     * Getter for DefaultPaymentMethod.
     * Default Payment Method
     * @return Returns the String
     */
    public String getDefaultPaymentMethod() {
        return OptionalNullable.getFrom(defaultPaymentMethod);
    }

    /**
     * Setter for DefaultPaymentMethod.
     * Default Payment Method
     * @param defaultPaymentMethod Value for String
     */
    @JsonSetter("default_payment_method")
    public void setDefaultPaymentMethod(String defaultPaymentMethod) {
        this.defaultPaymentMethod = OptionalNullable.of(defaultPaymentMethod);
    }

    /**
     * UnSetter for DefaultPaymentMethod.
     * Default Payment Method
     */
    public void unsetDefaultPaymentMethod() {
        defaultPaymentMethod = null;
    }

    /**
     * Internal Getter for GatewayAffiliationId.
     * Gateway Affiliation Id
     * @return Returns the Internal String
     */
    @JsonGetter("gateway_affiliation_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetGatewayAffiliationId() {
        return this.gatewayAffiliationId;
    }

    /**
     * Getter for GatewayAffiliationId.
     * Gateway Affiliation Id
     * @return Returns the String
     */
    public String getGatewayAffiliationId() {
        return OptionalNullable.getFrom(gatewayAffiliationId);
    }

    /**
     * Setter for GatewayAffiliationId.
     * Gateway Affiliation Id
     * @param gatewayAffiliationId Value for String
     */
    @JsonSetter("gateway_affiliation_id")
    public void setGatewayAffiliationId(String gatewayAffiliationId) {
        this.gatewayAffiliationId = OptionalNullable.of(gatewayAffiliationId);
    }

    /**
     * UnSetter for GatewayAffiliationId.
     * Gateway Affiliation Id
     */
    public void unsetGatewayAffiliationId() {
        gatewayAffiliationId = null;
    }

    /**
     * Converts this GetCheckoutPaymentSettingsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCheckoutPaymentSettingsResponse [" + "successUrl=" + successUrl + ", paymentUrl="
                + paymentUrl + ", acceptedPaymentMethods=" + acceptedPaymentMethods + ", status="
                + status + ", customer=" + customer + ", amount=" + amount
                + ", defaultPaymentMethod=" + defaultPaymentMethod + ", gatewayAffiliationId="
                + gatewayAffiliationId + "]";
    }

    /**
     * Builds a new {@link GetCheckoutPaymentSettingsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCheckoutPaymentSettingsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.successUrl = internalGetSuccessUrl();
        builder.paymentUrl = internalGetPaymentUrl();
        builder.acceptedPaymentMethods = internalGetAcceptedPaymentMethods();
        builder.status = internalGetStatus();
        builder.customer = internalGetCustomer();
        builder.amount = internalGetAmount();
        builder.defaultPaymentMethod = internalGetDefaultPaymentMethod();
        builder.gatewayAffiliationId = internalGetGatewayAffiliationId();
        return builder;
    }

    /**
     * Class to build instances of {@link GetCheckoutPaymentSettingsResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> successUrl;
        private OptionalNullable<String> paymentUrl;
        private OptionalNullable<List<String>> acceptedPaymentMethods;
        private OptionalNullable<String> status;
        private OptionalNullable<GetCustomerResponse> customer;
        private OptionalNullable<Integer> amount;
        private OptionalNullable<String> defaultPaymentMethod;
        private OptionalNullable<String> gatewayAffiliationId;



        /**
         * Setter for successUrl.
         * @param  successUrl  String value for successUrl.
         * @return Builder
         */
        public Builder successUrl(String successUrl) {
            this.successUrl = OptionalNullable.of(successUrl);
            return this;
        }

        /**
         * UnSetter for successUrl.
         * @return Builder
         */
        public Builder unsetSuccessUrl() {
            successUrl = null;
            return this;
        }

        /**
         * Setter for paymentUrl.
         * @param  paymentUrl  String value for paymentUrl.
         * @return Builder
         */
        public Builder paymentUrl(String paymentUrl) {
            this.paymentUrl = OptionalNullable.of(paymentUrl);
            return this;
        }

        /**
         * UnSetter for paymentUrl.
         * @return Builder
         */
        public Builder unsetPaymentUrl() {
            paymentUrl = null;
            return this;
        }

        /**
         * Setter for acceptedPaymentMethods.
         * @param  acceptedPaymentMethods  List of String value for acceptedPaymentMethods.
         * @return Builder
         */
        public Builder acceptedPaymentMethods(List<String> acceptedPaymentMethods) {
            this.acceptedPaymentMethods = OptionalNullable.of(acceptedPaymentMethods);
            return this;
        }

        /**
         * UnSetter for acceptedPaymentMethods.
         * @return Builder
         */
        public Builder unsetAcceptedPaymentMethods() {
            acceptedPaymentMethods = null;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = OptionalNullable.of(status);
            return this;
        }

        /**
         * UnSetter for status.
         * @return Builder
         */
        public Builder unsetStatus() {
            status = null;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  GetCustomerResponse value for customer.
         * @return Builder
         */
        public Builder customer(GetCustomerResponse customer) {
            this.customer = OptionalNullable.of(customer);
            return this;
        }

        /**
         * UnSetter for customer.
         * @return Builder
         */
        public Builder unsetCustomer() {
            customer = null;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = OptionalNullable.of(amount);
            return this;
        }

        /**
         * UnSetter for amount.
         * @return Builder
         */
        public Builder unsetAmount() {
            amount = null;
            return this;
        }

        /**
         * Setter for defaultPaymentMethod.
         * @param  defaultPaymentMethod  String value for defaultPaymentMethod.
         * @return Builder
         */
        public Builder defaultPaymentMethod(String defaultPaymentMethod) {
            this.defaultPaymentMethod = OptionalNullable.of(defaultPaymentMethod);
            return this;
        }

        /**
         * UnSetter for defaultPaymentMethod.
         * @return Builder
         */
        public Builder unsetDefaultPaymentMethod() {
            defaultPaymentMethod = null;
            return this;
        }

        /**
         * Setter for gatewayAffiliationId.
         * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
         * @return Builder
         */
        public Builder gatewayAffiliationId(String gatewayAffiliationId) {
            this.gatewayAffiliationId = OptionalNullable.of(gatewayAffiliationId);
            return this;
        }

        /**
         * UnSetter for gatewayAffiliationId.
         * @return Builder
         */
        public Builder unsetGatewayAffiliationId() {
            gatewayAffiliationId = null;
            return this;
        }

        /**
         * Builds a new {@link GetCheckoutPaymentSettingsResponse} object using the set fields.
         * @return {@link GetCheckoutPaymentSettingsResponse}
         */
        public GetCheckoutPaymentSettingsResponse build() {
            return new GetCheckoutPaymentSettingsResponse(successUrl, paymentUrl,
                    acceptedPaymentMethods, status, customer, amount, defaultPaymentMethod,
                    gatewayAffiliationId);
        }
    }
}
