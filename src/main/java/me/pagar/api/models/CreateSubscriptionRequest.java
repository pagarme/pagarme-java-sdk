/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for CreateSubscriptionRequest type.
 */
public class CreateSubscriptionRequest {
    private CreateCustomerRequest customer;
    private CreateCardRequest card;
    private String code;
    private String paymentMethod;
    private String billingType;
    private String statementDescriptor;
    private String description;
    private String currency;
    private String interval;
    private int intervalCount;
    private CreatePricingSchemeRequest pricingScheme;
    private List<CreateSubscriptionItemRequest> items;
    private CreateShippingRequest shipping;
    private List<CreateDiscountRequest> discounts;
    private Map<String, String> metadata;
    private CreateSetupRequest setup;
    private String planId;
    private String customerId;
    private String cardId;
    private Integer billingDay;
    private Integer installments;
    private LocalDateTime startAt;
    private Integer minimumPrice;
    private Integer cycles;
    private String cardToken;
    private String gatewayAffiliationId;
    private Integer quantity;
    private Integer boletoDueDays;
    private List<CreateIncrementRequest> increments;
    private CreatePeriodRequest period;
    private CreateSubMerchantRequest submerchant;
    private CreateSubscriptionSplitRequest split;

    /**
     * Default constructor.
     */
    public CreateSubscriptionRequest() {
    }

    /**
     * Initialization constructor.
     * @param  customer  CreateCustomerRequest value for customer.
     * @param  card  CreateCardRequest value for card.
     * @param  code  String value for code.
     * @param  paymentMethod  String value for paymentMethod.
     * @param  billingType  String value for billingType.
     * @param  statementDescriptor  String value for statementDescriptor.
     * @param  description  String value for description.
     * @param  currency  String value for currency.
     * @param  interval  String value for interval.
     * @param  intervalCount  int value for intervalCount.
     * @param  pricingScheme  CreatePricingSchemeRequest value for pricingScheme.
     * @param  items  List of CreateSubscriptionItemRequest value for items.
     * @param  shipping  CreateShippingRequest value for shipping.
     * @param  discounts  List of CreateDiscountRequest value for discounts.
     * @param  metadata  Map of String, value for metadata.
     * @param  setup  CreateSetupRequest value for setup.
     * @param  increments  List of CreateIncrementRequest value for increments.
     * @param  planId  String value for planId.
     * @param  customerId  String value for customerId.
     * @param  cardId  String value for cardId.
     * @param  billingDay  Integer value for billingDay.
     * @param  installments  Integer value for installments.
     * @param  startAt  LocalDateTime value for startAt.
     * @param  minimumPrice  Integer value for minimumPrice.
     * @param  cycles  Integer value for cycles.
     * @param  cardToken  String value for cardToken.
     * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
     * @param  quantity  Integer value for quantity.
     * @param  boletoDueDays  Integer value for boletoDueDays.
     * @param  period  CreatePeriodRequest value for period.
     * @param  submerchant  CreateSubMerchantRequest value for submerchant.
     * @param  split  CreateSubscriptionSplitRequest value for split.
     */
    public CreateSubscriptionRequest(
            CreateCustomerRequest customer,
            CreateCardRequest card,
            String code,
            String paymentMethod,
            String billingType,
            String statementDescriptor,
            String description,
            String currency,
            String interval,
            int intervalCount,
            CreatePricingSchemeRequest pricingScheme,
            List<CreateSubscriptionItemRequest> items,
            CreateShippingRequest shipping,
            List<CreateDiscountRequest> discounts,
            Map<String, String> metadata,
            CreateSetupRequest setup,
            List<CreateIncrementRequest> increments,
            String planId,
            String customerId,
            String cardId,
            Integer billingDay,
            Integer installments,
            LocalDateTime startAt,
            Integer minimumPrice,
            Integer cycles,
            String cardToken,
            String gatewayAffiliationId,
            Integer quantity,
            Integer boletoDueDays,
            CreatePeriodRequest period,
            CreateSubMerchantRequest submerchant,
            CreateSubscriptionSplitRequest split) {
        this.customer = customer;
        this.card = card;
        this.code = code;
        this.paymentMethod = paymentMethod;
        this.billingType = billingType;
        this.statementDescriptor = statementDescriptor;
        this.description = description;
        this.currency = currency;
        this.interval = interval;
        this.intervalCount = intervalCount;
        this.pricingScheme = pricingScheme;
        this.items = items;
        this.shipping = shipping;
        this.discounts = discounts;
        this.metadata = metadata;
        this.setup = setup;
        this.planId = planId;
        this.customerId = customerId;
        this.cardId = cardId;
        this.billingDay = billingDay;
        this.installments = installments;
        this.startAt = startAt;
        this.minimumPrice = minimumPrice;
        this.cycles = cycles;
        this.cardToken = cardToken;
        this.gatewayAffiliationId = gatewayAffiliationId;
        this.quantity = quantity;
        this.boletoDueDays = boletoDueDays;
        this.increments = increments;
        this.period = period;
        this.submerchant = submerchant;
        this.split = split;
    }

    /**
     * Getter for Customer.
     * Customer
     * @return Returns the CreateCustomerRequest
     */
    @JsonGetter("customer")
    public CreateCustomerRequest getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * Customer
     * @param customer Value for CreateCustomerRequest
     */
    @JsonSetter("customer")
    public void setCustomer(CreateCustomerRequest customer) {
        this.customer = customer;
    }

    /**
     * Getter for Card.
     * Card
     * @return Returns the CreateCardRequest
     */
    @JsonGetter("card")
    public CreateCardRequest getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * Card
     * @param card Value for CreateCardRequest
     */
    @JsonSetter("card")
    public void setCard(CreateCardRequest card) {
        this.card = card;
    }

    /**
     * Getter for Code.
     * Subscription code
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Subscription code
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for PaymentMethod.
     * Payment method
     * @return Returns the String
     */
    @JsonGetter("payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * Payment method
     * @param paymentMethod Value for String
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for BillingType.
     * Billing type
     * @return Returns the String
     */
    @JsonGetter("billing_type")
    public String getBillingType() {
        return billingType;
    }

    /**
     * Setter for BillingType.
     * Billing type
     * @param billingType Value for String
     */
    @JsonSetter("billing_type")
    public void setBillingType(String billingType) {
        this.billingType = billingType;
    }

    /**
     * Getter for StatementDescriptor.
     * Statement descriptor for credit card subscriptions
     * @return Returns the String
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    /**
     * Setter for StatementDescriptor.
     * Statement descriptor for credit card subscriptions
     * @param statementDescriptor Value for String
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Getter for Description.
     * Subscription description
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Subscription description
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Currency.
     * Currency
     * @return Returns the String
     */
    @JsonGetter("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * Currency
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for Interval.
     * Interval
     * @return Returns the String
     */
    @JsonGetter("interval")
    public String getInterval() {
        return interval;
    }

    /**
     * Setter for Interval.
     * Interval
     * @param interval Value for String
     */
    @JsonSetter("interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * Getter for IntervalCount.
     * Interval count
     * @return Returns the int
     */
    @JsonGetter("interval_count")
    public int getIntervalCount() {
        return intervalCount;
    }

    /**
     * Setter for IntervalCount.
     * Interval count
     * @param intervalCount Value for int
     */
    @JsonSetter("interval_count")
    public void setIntervalCount(int intervalCount) {
        this.intervalCount = intervalCount;
    }

    /**
     * Getter for PricingScheme.
     * Subscription pricing scheme
     * @return Returns the CreatePricingSchemeRequest
     */
    @JsonGetter("pricing_scheme")
    public CreatePricingSchemeRequest getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * Subscription pricing scheme
     * @param pricingScheme Value for CreatePricingSchemeRequest
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(CreatePricingSchemeRequest pricingScheme) {
        this.pricingScheme = pricingScheme;
    }

    /**
     * Getter for Items.
     * Subscription items
     * @return Returns the List of CreateSubscriptionItemRequest
     */
    @JsonGetter("items")
    public List<CreateSubscriptionItemRequest> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * Subscription items
     * @param items Value for List of CreateSubscriptionItemRequest
     */
    @JsonSetter("items")
    public void setItems(List<CreateSubscriptionItemRequest> items) {
        this.items = items;
    }

    /**
     * Getter for Shipping.
     * Shipping
     * @return Returns the CreateShippingRequest
     */
    @JsonGetter("shipping")
    public CreateShippingRequest getShipping() {
        return shipping;
    }

    /**
     * Setter for Shipping.
     * Shipping
     * @param shipping Value for CreateShippingRequest
     */
    @JsonSetter("shipping")
    public void setShipping(CreateShippingRequest shipping) {
        this.shipping = shipping;
    }

    /**
     * Getter for Discounts.
     * Discounts
     * @return Returns the List of CreateDiscountRequest
     */
    @JsonGetter("discounts")
    public List<CreateDiscountRequest> getDiscounts() {
        return discounts;
    }

    /**
     * Setter for Discounts.
     * Discounts
     * @param discounts Value for List of CreateDiscountRequest
     */
    @JsonSetter("discounts")
    public void setDiscounts(List<CreateDiscountRequest> discounts) {
        this.discounts = discounts;
    }

    /**
     * Getter for Metadata.
     * Metadata
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * Metadata
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for Setup.
     * Setup data
     * @return Returns the CreateSetupRequest
     */
    @JsonGetter("setup")
    public CreateSetupRequest getSetup() {
        return setup;
    }

    /**
     * Setter for Setup.
     * Setup data
     * @param setup Value for CreateSetupRequest
     */
    @JsonSetter("setup")
    public void setSetup(CreateSetupRequest setup) {
        this.setup = setup;
    }

    /**
     * Getter for PlanId.
     * Plan id
     * @return Returns the String
     */
    @JsonGetter("plan_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPlanId() {
        return planId;
    }

    /**
     * Setter for PlanId.
     * Plan id
     * @param planId Value for String
     */
    @JsonSetter("plan_id")
    public void setPlanId(String planId) {
        this.planId = planId;
    }

    /**
     * Getter for CustomerId.
     * Customer id
     * @return Returns the String
     */
    @JsonGetter("customer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Setter for CustomerId.
     * Customer id
     * @param customerId Value for String
     */
    @JsonSetter("customer_id")
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * Getter for CardId.
     * Card id
     * @return Returns the String
     */
    @JsonGetter("card_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardId() {
        return cardId;
    }

    /**
     * Setter for CardId.
     * Card id
     * @param cardId Value for String
     */
    @JsonSetter("card_id")
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * Getter for BillingDay.
     * Billing day
     * @return Returns the Integer
     */
    @JsonGetter("billing_day")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBillingDay() {
        return billingDay;
    }

    /**
     * Setter for BillingDay.
     * Billing day
     * @param billingDay Value for Integer
     */
    @JsonSetter("billing_day")
    public void setBillingDay(Integer billingDay) {
        this.billingDay = billingDay;
    }

    /**
     * Getter for Installments.
     * Number of installments
     * @return Returns the Integer
     */
    @JsonGetter("installments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInstallments() {
        return installments;
    }

    /**
     * Setter for Installments.
     * Number of installments
     * @param installments Value for Integer
     */
    @JsonSetter("installments")
    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    /**
     * Getter for StartAt.
     * Subscription start date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("start_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getStartAt() {
        return startAt;
    }

    /**
     * Setter for StartAt.
     * Subscription start date
     * @param startAt Value for LocalDateTime
     */
    @JsonSetter("start_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    /**
     * Getter for MinimumPrice.
     * Subscription minimum price
     * @return Returns the Integer
     */
    @JsonGetter("minimum_price")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMinimumPrice() {
        return minimumPrice;
    }

    /**
     * Setter for MinimumPrice.
     * Subscription minimum price
     * @param minimumPrice Value for Integer
     */
    @JsonSetter("minimum_price")
    public void setMinimumPrice(Integer minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    /**
     * Getter for Cycles.
     * Number of cycles
     * @return Returns the Integer
     */
    @JsonGetter("cycles")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCycles() {
        return cycles;
    }

    /**
     * Setter for Cycles.
     * Number of cycles
     * @param cycles Value for Integer
     */
    @JsonSetter("cycles")
    public void setCycles(Integer cycles) {
        this.cycles = cycles;
    }

    /**
     * Getter for CardToken.
     * Card token
     * @return Returns the String
     */
    @JsonGetter("card_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardToken() {
        return cardToken;
    }

    /**
     * Setter for CardToken.
     * Card token
     * @param cardToken Value for String
     */
    @JsonSetter("card_token")
    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    /**
     * Getter for GatewayAffiliationId.
     * Gateway Affiliation code
     * @return Returns the String
     */
    @JsonGetter("gateway_affiliation_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGatewayAffiliationId() {
        return gatewayAffiliationId;
    }

    /**
     * Setter for GatewayAffiliationId.
     * Gateway Affiliation code
     * @param gatewayAffiliationId Value for String
     */
    @JsonSetter("gateway_affiliation_id")
    public void setGatewayAffiliationId(String gatewayAffiliationId) {
        this.gatewayAffiliationId = gatewayAffiliationId;
    }

    /**
     * Getter for Quantity.
     * Quantity
     * @return Returns the Integer
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setter for Quantity.
     * Quantity
     * @param quantity Value for Integer
     */
    @JsonSetter("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Getter for BoletoDueDays.
     * Days until boleto expires
     * @return Returns the Integer
     */
    @JsonGetter("boleto_due_days")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getBoletoDueDays() {
        return boletoDueDays;
    }

    /**
     * Setter for BoletoDueDays.
     * Days until boleto expires
     * @param boletoDueDays Value for Integer
     */
    @JsonSetter("boleto_due_days")
    public void setBoletoDueDays(Integer boletoDueDays) {
        this.boletoDueDays = boletoDueDays;
    }

    /**
     * Getter for Increments.
     * Increments
     * @return Returns the List of CreateIncrementRequest
     */
    @JsonGetter("increments")
    public List<CreateIncrementRequest> getIncrements() {
        return increments;
    }

    /**
     * Setter for Increments.
     * Increments
     * @param increments Value for List of CreateIncrementRequest
     */
    @JsonSetter("increments")
    public void setIncrements(List<CreateIncrementRequest> increments) {
        this.increments = increments;
    }

    /**
     * Getter for Period.
     * @return Returns the CreatePeriodRequest
     */
    @JsonGetter("period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreatePeriodRequest getPeriod() {
        return period;
    }

    /**
     * Setter for Period.
     * @param period Value for CreatePeriodRequest
     */
    @JsonSetter("period")
    public void setPeriod(CreatePeriodRequest period) {
        this.period = period;
    }

    /**
     * Getter for Submerchant.
     * SubMerchant
     * @return Returns the CreateSubMerchantRequest
     */
    @JsonGetter("submerchant")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateSubMerchantRequest getSubmerchant() {
        return submerchant;
    }

    /**
     * Setter for Submerchant.
     * SubMerchant
     * @param submerchant Value for CreateSubMerchantRequest
     */
    @JsonSetter("submerchant")
    public void setSubmerchant(CreateSubMerchantRequest submerchant) {
        this.submerchant = submerchant;
    }

    /**
     * Getter for Split.
     * Subscription's split
     * @return Returns the CreateSubscriptionSplitRequest
     */
    @JsonGetter("split")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateSubscriptionSplitRequest getSplit() {
        return split;
    }

    /**
     * Setter for Split.
     * Subscription's split
     * @param split Value for CreateSubscriptionSplitRequest
     */
    @JsonSetter("split")
    public void setSplit(CreateSubscriptionSplitRequest split) {
        this.split = split;
    }

    /**
     * Converts this CreateSubscriptionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateSubscriptionRequest [" + "customer=" + customer + ", card=" + card + ", code="
                + code + ", paymentMethod=" + paymentMethod + ", billingType=" + billingType
                + ", statementDescriptor=" + statementDescriptor + ", description=" + description
                + ", currency=" + currency + ", interval=" + interval + ", intervalCount="
                + intervalCount + ", pricingScheme=" + pricingScheme + ", items=" + items
                + ", shipping=" + shipping + ", discounts=" + discounts + ", metadata=" + metadata
                + ", setup=" + setup + ", increments=" + increments + ", planId=" + planId
                + ", customerId=" + customerId + ", cardId=" + cardId + ", billingDay=" + billingDay
                + ", installments=" + installments + ", startAt=" + startAt + ", minimumPrice="
                + minimumPrice + ", cycles=" + cycles + ", cardToken=" + cardToken
                + ", gatewayAffiliationId=" + gatewayAffiliationId + ", quantity=" + quantity
                + ", boletoDueDays=" + boletoDueDays + ", period=" + period + ", submerchant="
                + submerchant + ", split=" + split + "]";
    }

    /**
     * Builds a new {@link CreateSubscriptionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateSubscriptionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(customer, card, code, paymentMethod, billingType,
                statementDescriptor, description, currency, interval, intervalCount, pricingScheme,
                items, shipping, discounts, metadata, setup, increments)
                .planId(getPlanId())
                .customerId(getCustomerId())
                .cardId(getCardId())
                .billingDay(getBillingDay())
                .installments(getInstallments())
                .startAt(getStartAt())
                .minimumPrice(getMinimumPrice())
                .cycles(getCycles())
                .cardToken(getCardToken())
                .gatewayAffiliationId(getGatewayAffiliationId())
                .quantity(getQuantity())
                .boletoDueDays(getBoletoDueDays())
                .period(getPeriod())
                .submerchant(getSubmerchant())
                .split(getSplit());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateSubscriptionRequest}.
     */
    public static class Builder {
        private CreateCustomerRequest customer;
        private CreateCardRequest card;
        private String code;
        private String paymentMethod;
        private String billingType;
        private String statementDescriptor;
        private String description;
        private String currency;
        private String interval;
        private int intervalCount;
        private CreatePricingSchemeRequest pricingScheme;
        private List<CreateSubscriptionItemRequest> items;
        private CreateShippingRequest shipping;
        private List<CreateDiscountRequest> discounts;
        private Map<String, String> metadata;
        private CreateSetupRequest setup;
        private List<CreateIncrementRequest> increments;
        private String planId;
        private String customerId;
        private String cardId;
        private Integer billingDay;
        private Integer installments;
        private LocalDateTime startAt;
        private Integer minimumPrice;
        private Integer cycles;
        private String cardToken;
        private String gatewayAffiliationId;
        private Integer quantity;
        private Integer boletoDueDays;
        private CreatePeriodRequest period;
        private CreateSubMerchantRequest submerchant;
        private CreateSubscriptionSplitRequest split;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  customer  CreateCustomerRequest value for customer.
         * @param  card  CreateCardRequest value for card.
         * @param  code  String value for code.
         * @param  paymentMethod  String value for paymentMethod.
         * @param  billingType  String value for billingType.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @param  description  String value for description.
         * @param  currency  String value for currency.
         * @param  interval  String value for interval.
         * @param  intervalCount  int value for intervalCount.
         * @param  pricingScheme  CreatePricingSchemeRequest value for pricingScheme.
         * @param  items  List of CreateSubscriptionItemRequest value for items.
         * @param  shipping  CreateShippingRequest value for shipping.
         * @param  discounts  List of CreateDiscountRequest value for discounts.
         * @param  metadata  Map of String, value for metadata.
         * @param  setup  CreateSetupRequest value for setup.
         * @param  increments  List of CreateIncrementRequest value for increments.
         */
        public Builder(CreateCustomerRequest customer, CreateCardRequest card, String code,
                String paymentMethod, String billingType, String statementDescriptor,
                String description, String currency, String interval, int intervalCount,
                CreatePricingSchemeRequest pricingScheme, List<CreateSubscriptionItemRequest> items,
                CreateShippingRequest shipping, List<CreateDiscountRequest> discounts,
                Map<String, String> metadata, CreateSetupRequest setup,
                List<CreateIncrementRequest> increments) {
            this.customer = customer;
            this.card = card;
            this.code = code;
            this.paymentMethod = paymentMethod;
            this.billingType = billingType;
            this.statementDescriptor = statementDescriptor;
            this.description = description;
            this.currency = currency;
            this.interval = interval;
            this.intervalCount = intervalCount;
            this.pricingScheme = pricingScheme;
            this.items = items;
            this.shipping = shipping;
            this.discounts = discounts;
            this.metadata = metadata;
            this.setup = setup;
            this.increments = increments;
        }

        /**
         * Setter for customer.
         * @param  customer  CreateCustomerRequest value for customer.
         * @return Builder
         */
        public Builder customer(CreateCustomerRequest customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for card.
         * @param  card  CreateCardRequest value for card.
         * @return Builder
         */
        public Builder card(CreateCardRequest card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for paymentMethod.
         * @param  paymentMethod  String value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Setter for billingType.
         * @param  billingType  String value for billingType.
         * @return Builder
         */
        public Builder billingType(String billingType) {
            this.billingType = billingType;
            return this;
        }

        /**
         * Setter for statementDescriptor.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @return Builder
         */
        public Builder statementDescriptor(String statementDescriptor) {
            this.statementDescriptor = statementDescriptor;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for interval.
         * @param  interval  String value for interval.
         * @return Builder
         */
        public Builder interval(String interval) {
            this.interval = interval;
            return this;
        }

        /**
         * Setter for intervalCount.
         * @param  intervalCount  int value for intervalCount.
         * @return Builder
         */
        public Builder intervalCount(int intervalCount) {
            this.intervalCount = intervalCount;
            return this;
        }

        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  CreatePricingSchemeRequest value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(CreatePricingSchemeRequest pricingScheme) {
            this.pricingScheme = pricingScheme;
            return this;
        }

        /**
         * Setter for items.
         * @param  items  List of CreateSubscriptionItemRequest value for items.
         * @return Builder
         */
        public Builder items(List<CreateSubscriptionItemRequest> items) {
            this.items = items;
            return this;
        }

        /**
         * Setter for shipping.
         * @param  shipping  CreateShippingRequest value for shipping.
         * @return Builder
         */
        public Builder shipping(CreateShippingRequest shipping) {
            this.shipping = shipping;
            return this;
        }

        /**
         * Setter for discounts.
         * @param  discounts  List of CreateDiscountRequest value for discounts.
         * @return Builder
         */
        public Builder discounts(List<CreateDiscountRequest> discounts) {
            this.discounts = discounts;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for setup.
         * @param  setup  CreateSetupRequest value for setup.
         * @return Builder
         */
        public Builder setup(CreateSetupRequest setup) {
            this.setup = setup;
            return this;
        }

        /**
         * Setter for increments.
         * @param  increments  List of CreateIncrementRequest value for increments.
         * @return Builder
         */
        public Builder increments(List<CreateIncrementRequest> increments) {
            this.increments = increments;
            return this;
        }

        /**
         * Setter for planId.
         * @param  planId  String value for planId.
         * @return Builder
         */
        public Builder planId(String planId) {
            this.planId = planId;
            return this;
        }

        /**
         * Setter for customerId.
         * @param  customerId  String value for customerId.
         * @return Builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * Setter for cardId.
         * @param  cardId  String value for cardId.
         * @return Builder
         */
        public Builder cardId(String cardId) {
            this.cardId = cardId;
            return this;
        }

        /**
         * Setter for billingDay.
         * @param  billingDay  Integer value for billingDay.
         * @return Builder
         */
        public Builder billingDay(Integer billingDay) {
            this.billingDay = billingDay;
            return this;
        }

        /**
         * Setter for installments.
         * @param  installments  Integer value for installments.
         * @return Builder
         */
        public Builder installments(Integer installments) {
            this.installments = installments;
            return this;
        }

        /**
         * Setter for startAt.
         * @param  startAt  LocalDateTime value for startAt.
         * @return Builder
         */
        public Builder startAt(LocalDateTime startAt) {
            this.startAt = startAt;
            return this;
        }

        /**
         * Setter for minimumPrice.
         * @param  minimumPrice  Integer value for minimumPrice.
         * @return Builder
         */
        public Builder minimumPrice(Integer minimumPrice) {
            this.minimumPrice = minimumPrice;
            return this;
        }

        /**
         * Setter for cycles.
         * @param  cycles  Integer value for cycles.
         * @return Builder
         */
        public Builder cycles(Integer cycles) {
            this.cycles = cycles;
            return this;
        }

        /**
         * Setter for cardToken.
         * @param  cardToken  String value for cardToken.
         * @return Builder
         */
        public Builder cardToken(String cardToken) {
            this.cardToken = cardToken;
            return this;
        }

        /**
         * Setter for gatewayAffiliationId.
         * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
         * @return Builder
         */
        public Builder gatewayAffiliationId(String gatewayAffiliationId) {
            this.gatewayAffiliationId = gatewayAffiliationId;
            return this;
        }

        /**
         * Setter for quantity.
         * @param  quantity  Integer value for quantity.
         * @return Builder
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * Setter for boletoDueDays.
         * @param  boletoDueDays  Integer value for boletoDueDays.
         * @return Builder
         */
        public Builder boletoDueDays(Integer boletoDueDays) {
            this.boletoDueDays = boletoDueDays;
            return this;
        }

        /**
         * Setter for period.
         * @param  period  CreatePeriodRequest value for period.
         * @return Builder
         */
        public Builder period(CreatePeriodRequest period) {
            this.period = period;
            return this;
        }

        /**
         * Setter for submerchant.
         * @param  submerchant  CreateSubMerchantRequest value for submerchant.
         * @return Builder
         */
        public Builder submerchant(CreateSubMerchantRequest submerchant) {
            this.submerchant = submerchant;
            return this;
        }

        /**
         * Setter for split.
         * @param  split  CreateSubscriptionSplitRequest value for split.
         * @return Builder
         */
        public Builder split(CreateSubscriptionSplitRequest split) {
            this.split = split;
            return this;
        }

        /**
         * Builds a new {@link CreateSubscriptionRequest} object using the set fields.
         * @return {@link CreateSubscriptionRequest}
         */
        public CreateSubscriptionRequest build() {
            return new CreateSubscriptionRequest(customer, card, code, paymentMethod, billingType,
                    statementDescriptor, description, currency, interval, intervalCount,
                    pricingScheme, items, shipping, discounts, metadata, setup, increments, planId,
                    customerId, cardId, billingDay, installments, startAt, minimumPrice, cycles,
                    cardToken, gatewayAffiliationId, quantity, boletoDueDays, period, submerchant,
                    split);
        }
    }
}
