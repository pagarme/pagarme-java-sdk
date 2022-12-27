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
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetInvoiceResponse type.
 */
public class GetInvoiceResponse {
    private String id;
    private String code;
    private String url;
    private Integer amount;
    private String status;
    private String paymentMethod;
    private LocalDateTime createdAt;
    private List<GetInvoiceItemResponse> items;
    private OptionalNullable<GetCustomerResponse> customer;
    private GetChargeResponse charge;
    private Integer installments;
    private GetBillingAddressResponse billingAddress;
    private GetSubscriptionResponse subscription;
    private OptionalNullable<GetPeriodResponse> cycle;
    private GetShippingResponse shipping;
    private Map<String, String> metadata;
    private OptionalNullable<LocalDateTime> dueAt;
    private OptionalNullable<LocalDateTime> canceledAt;
    private OptionalNullable<LocalDateTime> billingAt;
    private OptionalNullable<LocalDateTime> seenAt;
    private OptionalNullable<Integer> totalDiscount;
    private OptionalNullable<Integer> totalIncrement;
    private String subscriptionId;

    /**
     * Default constructor.
     */
    public GetInvoiceResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  code  String value for code.
     * @param  url  String value for url.
     * @param  amount  Integer value for amount.
     * @param  status  String value for status.
     * @param  paymentMethod  String value for paymentMethod.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  items  List of GetInvoiceItemResponse value for items.
     * @param  charge  GetChargeResponse value for charge.
     * @param  installments  Integer value for installments.
     * @param  billingAddress  GetBillingAddressResponse value for billingAddress.
     * @param  subscription  GetSubscriptionResponse value for subscription.
     * @param  shipping  GetShippingResponse value for shipping.
     * @param  metadata  Map of String, value for metadata.
     * @param  subscriptionId  String value for subscriptionId.
     * @param  customer  GetCustomerResponse value for customer.
     * @param  cycle  GetPeriodResponse value for cycle.
     * @param  dueAt  LocalDateTime value for dueAt.
     * @param  canceledAt  LocalDateTime value for canceledAt.
     * @param  billingAt  LocalDateTime value for billingAt.
     * @param  seenAt  LocalDateTime value for seenAt.
     * @param  totalDiscount  Integer value for totalDiscount.
     * @param  totalIncrement  Integer value for totalIncrement.
     */
    public GetInvoiceResponse(
            String id,
            String code,
            String url,
            Integer amount,
            String status,
            String paymentMethod,
            LocalDateTime createdAt,
            List<GetInvoiceItemResponse> items,
            GetChargeResponse charge,
            Integer installments,
            GetBillingAddressResponse billingAddress,
            GetSubscriptionResponse subscription,
            GetShippingResponse shipping,
            Map<String, String> metadata,
            String subscriptionId,
            GetCustomerResponse customer,
            GetPeriodResponse cycle,
            LocalDateTime dueAt,
            LocalDateTime canceledAt,
            LocalDateTime billingAt,
            LocalDateTime seenAt,
            Integer totalDiscount,
            Integer totalIncrement) {
        this.id = id;
        this.code = code;
        this.url = url;
        this.amount = amount;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.createdAt = createdAt;
        this.items = items;
        this.customer = OptionalNullable.of(customer);
        this.charge = charge;
        this.installments = installments;
        this.billingAddress = billingAddress;
        this.subscription = subscription;
        this.cycle = OptionalNullable.of(cycle);
        this.shipping = shipping;
        this.metadata = metadata;
        this.dueAt = OptionalNullable.of(dueAt);
        this.canceledAt = OptionalNullable.of(canceledAt);
        this.billingAt = OptionalNullable.of(billingAt);
        this.seenAt = OptionalNullable.of(seenAt);
        this.totalDiscount = OptionalNullable.of(totalDiscount);
        this.totalIncrement = OptionalNullable.of(totalIncrement);
        this.subscriptionId = subscriptionId;
    }

    /**
     * Internal initialization constructor.
     */
    protected GetInvoiceResponse(String id, String code, String url, Integer amount, String status,
            String paymentMethod, LocalDateTime createdAt, List<GetInvoiceItemResponse> items,
            GetChargeResponse charge, Integer installments,
            GetBillingAddressResponse billingAddress, GetSubscriptionResponse subscription,
            GetShippingResponse shipping, Map<String, String> metadata, String subscriptionId,
            OptionalNullable<GetCustomerResponse> customer,
            OptionalNullable<GetPeriodResponse> cycle, OptionalNullable<LocalDateTime> dueAt,
            OptionalNullable<LocalDateTime> canceledAt, OptionalNullable<LocalDateTime> billingAt,
            OptionalNullable<LocalDateTime> seenAt, OptionalNullable<Integer> totalDiscount,
            OptionalNullable<Integer> totalIncrement) {
        this.id = id;
        this.code = code;
        this.url = url;
        this.amount = amount;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.createdAt = createdAt;
        this.items = items;
        this.customer = customer;
        this.charge = charge;
        this.installments = installments;
        this.billingAddress = billingAddress;
        this.subscription = subscription;
        this.cycle = cycle;
        this.shipping = shipping;
        this.metadata = metadata;
        this.dueAt = dueAt;
        this.canceledAt = canceledAt;
        this.billingAt = billingAt;
        this.seenAt = seenAt;
        this.totalDiscount = totalDiscount;
        this.totalIncrement = totalIncrement;
        this.subscriptionId = subscriptionId;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Code.
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Amount.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for PaymentMethod.
     * @return Returns the String
     */
    @JsonGetter("payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * @param paymentMethod Value for String
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for Items.
     * @return Returns the List of GetInvoiceItemResponse
     */
    @JsonGetter("items")
    public List<GetInvoiceItemResponse> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * @param items Value for List of GetInvoiceItemResponse
     */
    @JsonSetter("items")
    public void setItems(List<GetInvoiceItemResponse> items) {
        this.items = items;
    }

    /**
     * Internal Getter for Customer.
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
     * @return Returns the GetCustomerResponse
     */
    public GetCustomerResponse getCustomer() {
        return OptionalNullable.getFrom(customer);
    }

    /**
     * Setter for Customer.
     * @param customer Value for GetCustomerResponse
     */
    @JsonSetter("customer")
    public void setCustomer(GetCustomerResponse customer) {
        this.customer = OptionalNullable.of(customer);
    }

    /**
     * UnSetter for Customer.
     */
    public void unsetCustomer() {
        customer = null;
    }

    /**
     * Getter for Charge.
     * @return Returns the GetChargeResponse
     */
    @JsonGetter("charge")
    public GetChargeResponse getCharge() {
        return charge;
    }

    /**
     * Setter for Charge.
     * @param charge Value for GetChargeResponse
     */
    @JsonSetter("charge")
    public void setCharge(GetChargeResponse charge) {
        this.charge = charge;
    }

    /**
     * Getter for Installments.
     * @return Returns the Integer
     */
    @JsonGetter("installments")
    public Integer getInstallments() {
        return installments;
    }

    /**
     * Setter for Installments.
     * @param installments Value for Integer
     */
    @JsonSetter("installments")
    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    /**
     * Getter for BillingAddress.
     * @return Returns the GetBillingAddressResponse
     */
    @JsonGetter("billing_address")
    public GetBillingAddressResponse getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * @param billingAddress Value for GetBillingAddressResponse
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(GetBillingAddressResponse billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for Subscription.
     * @return Returns the GetSubscriptionResponse
     */
    @JsonGetter("subscription")
    public GetSubscriptionResponse getSubscription() {
        return subscription;
    }

    /**
     * Setter for Subscription.
     * @param subscription Value for GetSubscriptionResponse
     */
    @JsonSetter("subscription")
    public void setSubscription(GetSubscriptionResponse subscription) {
        this.subscription = subscription;
    }

    /**
     * Internal Getter for Cycle.
     * @return Returns the Internal GetPeriodResponse
     */
    @JsonGetter("cycle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetPeriodResponse> internalGetCycle() {
        return this.cycle;
    }

    /**
     * Getter for Cycle.
     * @return Returns the GetPeriodResponse
     */
    public GetPeriodResponse getCycle() {
        return OptionalNullable.getFrom(cycle);
    }

    /**
     * Setter for Cycle.
     * @param cycle Value for GetPeriodResponse
     */
    @JsonSetter("cycle")
    public void setCycle(GetPeriodResponse cycle) {
        this.cycle = OptionalNullable.of(cycle);
    }

    /**
     * UnSetter for Cycle.
     */
    public void unsetCycle() {
        cycle = null;
    }

    /**
     * Getter for Shipping.
     * @return Returns the GetShippingResponse
     */
    @JsonGetter("shipping")
    public GetShippingResponse getShipping() {
        return shipping;
    }

    /**
     * Setter for Shipping.
     * @param shipping Value for GetShippingResponse
     */
    @JsonSetter("shipping")
    public void setShipping(GetShippingResponse shipping) {
        this.shipping = shipping;
    }

    /**
     * Getter for Metadata.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Internal Getter for DueAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("due_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetDueAt() {
        return this.dueAt;
    }

    /**
     * Getter for DueAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getDueAt() {
        return OptionalNullable.getFrom(dueAt);
    }

    /**
     * Setter for DueAt.
     * @param dueAt Value for LocalDateTime
     */
    @JsonSetter("due_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueAt(LocalDateTime dueAt) {
        this.dueAt = OptionalNullable.of(dueAt);
    }

    /**
     * UnSetter for DueAt.
     */
    public void unsetDueAt() {
        dueAt = null;
    }

    /**
     * Internal Getter for CanceledAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("canceled_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetCanceledAt() {
        return this.canceledAt;
    }

    /**
     * Getter for CanceledAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getCanceledAt() {
        return OptionalNullable.getFrom(canceledAt);
    }

    /**
     * Setter for CanceledAt.
     * @param canceledAt Value for LocalDateTime
     */
    @JsonSetter("canceled_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCanceledAt(LocalDateTime canceledAt) {
        this.canceledAt = OptionalNullable.of(canceledAt);
    }

    /**
     * UnSetter for CanceledAt.
     */
    public void unsetCanceledAt() {
        canceledAt = null;
    }

    /**
     * Internal Getter for BillingAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("billing_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetBillingAt() {
        return this.billingAt;
    }

    /**
     * Getter for BillingAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getBillingAt() {
        return OptionalNullable.getFrom(billingAt);
    }

    /**
     * Setter for BillingAt.
     * @param billingAt Value for LocalDateTime
     */
    @JsonSetter("billing_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setBillingAt(LocalDateTime billingAt) {
        this.billingAt = OptionalNullable.of(billingAt);
    }

    /**
     * UnSetter for BillingAt.
     */
    public void unsetBillingAt() {
        billingAt = null;
    }

    /**
     * Internal Getter for SeenAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("seen_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetSeenAt() {
        return this.seenAt;
    }

    /**
     * Getter for SeenAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getSeenAt() {
        return OptionalNullable.getFrom(seenAt);
    }

    /**
     * Setter for SeenAt.
     * @param seenAt Value for LocalDateTime
     */
    @JsonSetter("seen_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setSeenAt(LocalDateTime seenAt) {
        this.seenAt = OptionalNullable.of(seenAt);
    }

    /**
     * UnSetter for SeenAt.
     */
    public void unsetSeenAt() {
        seenAt = null;
    }

    /**
     * Internal Getter for TotalDiscount.
     * Total discounted value
     * @return Returns the Internal Integer
     */
    @JsonGetter("total_discount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetTotalDiscount() {
        return this.totalDiscount;
    }

    /**
     * Getter for TotalDiscount.
     * Total discounted value
     * @return Returns the Integer
     */
    public Integer getTotalDiscount() {
        return OptionalNullable.getFrom(totalDiscount);
    }

    /**
     * Setter for TotalDiscount.
     * Total discounted value
     * @param totalDiscount Value for Integer
     */
    @JsonSetter("total_discount")
    public void setTotalDiscount(Integer totalDiscount) {
        this.totalDiscount = OptionalNullable.of(totalDiscount);
    }

    /**
     * UnSetter for TotalDiscount.
     * Total discounted value
     */
    public void unsetTotalDiscount() {
        totalDiscount = null;
    }

    /**
     * Internal Getter for TotalIncrement.
     * Total discounted value
     * @return Returns the Internal Integer
     */
    @JsonGetter("total_increment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetTotalIncrement() {
        return this.totalIncrement;
    }

    /**
     * Getter for TotalIncrement.
     * Total discounted value
     * @return Returns the Integer
     */
    public Integer getTotalIncrement() {
        return OptionalNullable.getFrom(totalIncrement);
    }

    /**
     * Setter for TotalIncrement.
     * Total discounted value
     * @param totalIncrement Value for Integer
     */
    @JsonSetter("total_increment")
    public void setTotalIncrement(Integer totalIncrement) {
        this.totalIncrement = OptionalNullable.of(totalIncrement);
    }

    /**
     * UnSetter for TotalIncrement.
     * Total discounted value
     */
    public void unsetTotalIncrement() {
        totalIncrement = null;
    }

    /**
     * Getter for SubscriptionId.
     * Subscription Id
     * @return Returns the String
     */
    @JsonGetter("subscription_id")
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Setter for SubscriptionId.
     * Subscription Id
     * @param subscriptionId Value for String
     */
    @JsonSetter("subscription_id")
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * Converts this GetInvoiceResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetInvoiceResponse [" + "id=" + id + ", code=" + code + ", url=" + url + ", amount="
                + amount + ", status=" + status + ", paymentMethod=" + paymentMethod
                + ", createdAt=" + createdAt + ", items=" + items + ", charge=" + charge
                + ", installments=" + installments + ", billingAddress=" + billingAddress
                + ", subscription=" + subscription + ", shipping=" + shipping + ", metadata="
                + metadata + ", subscriptionId=" + subscriptionId + ", customer=" + customer
                + ", cycle=" + cycle + ", dueAt=" + dueAt + ", canceledAt=" + canceledAt
                + ", billingAt=" + billingAt + ", seenAt=" + seenAt + ", totalDiscount="
                + totalDiscount + ", totalIncrement=" + totalIncrement + "]";
    }

    /**
     * Builds a new {@link GetInvoiceResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetInvoiceResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, code, url, amount, status, paymentMethod, createdAt,
                items, charge, installments, billingAddress, subscription, shipping, metadata,
                subscriptionId);
        builder.customer = internalGetCustomer();
        builder.cycle = internalGetCycle();
        builder.dueAt = internalGetDueAt();
        builder.canceledAt = internalGetCanceledAt();
        builder.billingAt = internalGetBillingAt();
        builder.seenAt = internalGetSeenAt();
        builder.totalDiscount = internalGetTotalDiscount();
        builder.totalIncrement = internalGetTotalIncrement();
        return builder;
    }

    /**
     * Class to build instances of {@link GetInvoiceResponse}.
     */
    public static class Builder {
        private String id;
        private String code;
        private String url;
        private Integer amount;
        private String status;
        private String paymentMethod;
        private LocalDateTime createdAt;
        private List<GetInvoiceItemResponse> items;
        private GetChargeResponse charge;
        private Integer installments;
        private GetBillingAddressResponse billingAddress;
        private GetSubscriptionResponse subscription;
        private GetShippingResponse shipping;
        private Map<String, String> metadata;
        private String subscriptionId;
        private OptionalNullable<GetCustomerResponse> customer;
        private OptionalNullable<GetPeriodResponse> cycle;
        private OptionalNullable<LocalDateTime> dueAt;
        private OptionalNullable<LocalDateTime> canceledAt;
        private OptionalNullable<LocalDateTime> billingAt;
        private OptionalNullable<LocalDateTime> seenAt;
        private OptionalNullable<Integer> totalDiscount;
        private OptionalNullable<Integer> totalIncrement;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  code  String value for code.
         * @param  url  String value for url.
         * @param  amount  Integer value for amount.
         * @param  status  String value for status.
         * @param  paymentMethod  String value for paymentMethod.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  items  List of GetInvoiceItemResponse value for items.
         * @param  charge  GetChargeResponse value for charge.
         * @param  installments  Integer value for installments.
         * @param  billingAddress  GetBillingAddressResponse value for billingAddress.
         * @param  subscription  GetSubscriptionResponse value for subscription.
         * @param  shipping  GetShippingResponse value for shipping.
         * @param  metadata  Map of String, value for metadata.
         * @param  subscriptionId  String value for subscriptionId.
         */
        public Builder(String id, String code, String url, Integer amount, String status,
                String paymentMethod, LocalDateTime createdAt, List<GetInvoiceItemResponse> items,
                GetChargeResponse charge, Integer installments,
                GetBillingAddressResponse billingAddress, GetSubscriptionResponse subscription,
                GetShippingResponse shipping, Map<String, String> metadata, String subscriptionId) {
            this.id = id;
            this.code = code;
            this.url = url;
            this.amount = amount;
            this.status = status;
            this.paymentMethod = paymentMethod;
            this.createdAt = createdAt;
            this.items = items;
            this.charge = charge;
            this.installments = installments;
            this.billingAddress = billingAddress;
            this.subscription = subscription;
            this.shipping = shipping;
            this.metadata = metadata;
            this.subscriptionId = subscriptionId;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
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
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for items.
         * @param  items  List of GetInvoiceItemResponse value for items.
         * @return Builder
         */
        public Builder items(List<GetInvoiceItemResponse> items) {
            this.items = items;
            return this;
        }

        /**
         * Setter for charge.
         * @param  charge  GetChargeResponse value for charge.
         * @return Builder
         */
        public Builder charge(GetChargeResponse charge) {
            this.charge = charge;
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
         * Setter for billingAddress.
         * @param  billingAddress  GetBillingAddressResponse value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(GetBillingAddressResponse billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for subscription.
         * @param  subscription  GetSubscriptionResponse value for subscription.
         * @return Builder
         */
        public Builder subscription(GetSubscriptionResponse subscription) {
            this.subscription = subscription;
            return this;
        }

        /**
         * Setter for shipping.
         * @param  shipping  GetShippingResponse value for shipping.
         * @return Builder
         */
        public Builder shipping(GetShippingResponse shipping) {
            this.shipping = shipping;
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
         * Setter for subscriptionId.
         * @param  subscriptionId  String value for subscriptionId.
         * @return Builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
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
         * Setter for cycle.
         * @param  cycle  GetPeriodResponse value for cycle.
         * @return Builder
         */
        public Builder cycle(GetPeriodResponse cycle) {
            this.cycle = OptionalNullable.of(cycle);
            return this;
        }

        /**
         * UnSetter for cycle.
         * @return Builder
         */
        public Builder unsetCycle() {
            cycle = null;
            return this;
        }

        /**
         * Setter for dueAt.
         * @param  dueAt  LocalDateTime value for dueAt.
         * @return Builder
         */
        public Builder dueAt(LocalDateTime dueAt) {
            this.dueAt = OptionalNullable.of(dueAt);
            return this;
        }

        /**
         * UnSetter for dueAt.
         * @return Builder
         */
        public Builder unsetDueAt() {
            dueAt = null;
            return this;
        }

        /**
         * Setter for canceledAt.
         * @param  canceledAt  LocalDateTime value for canceledAt.
         * @return Builder
         */
        public Builder canceledAt(LocalDateTime canceledAt) {
            this.canceledAt = OptionalNullable.of(canceledAt);
            return this;
        }

        /**
         * UnSetter for canceledAt.
         * @return Builder
         */
        public Builder unsetCanceledAt() {
            canceledAt = null;
            return this;
        }

        /**
         * Setter for billingAt.
         * @param  billingAt  LocalDateTime value for billingAt.
         * @return Builder
         */
        public Builder billingAt(LocalDateTime billingAt) {
            this.billingAt = OptionalNullable.of(billingAt);
            return this;
        }

        /**
         * UnSetter for billingAt.
         * @return Builder
         */
        public Builder unsetBillingAt() {
            billingAt = null;
            return this;
        }

        /**
         * Setter for seenAt.
         * @param  seenAt  LocalDateTime value for seenAt.
         * @return Builder
         */
        public Builder seenAt(LocalDateTime seenAt) {
            this.seenAt = OptionalNullable.of(seenAt);
            return this;
        }

        /**
         * UnSetter for seenAt.
         * @return Builder
         */
        public Builder unsetSeenAt() {
            seenAt = null;
            return this;
        }

        /**
         * Setter for totalDiscount.
         * @param  totalDiscount  Integer value for totalDiscount.
         * @return Builder
         */
        public Builder totalDiscount(Integer totalDiscount) {
            this.totalDiscount = OptionalNullable.of(totalDiscount);
            return this;
        }

        /**
         * UnSetter for totalDiscount.
         * @return Builder
         */
        public Builder unsetTotalDiscount() {
            totalDiscount = null;
            return this;
        }

        /**
         * Setter for totalIncrement.
         * @param  totalIncrement  Integer value for totalIncrement.
         * @return Builder
         */
        public Builder totalIncrement(Integer totalIncrement) {
            this.totalIncrement = OptionalNullable.of(totalIncrement);
            return this;
        }

        /**
         * UnSetter for totalIncrement.
         * @return Builder
         */
        public Builder unsetTotalIncrement() {
            totalIncrement = null;
            return this;
        }

        /**
         * Builds a new {@link GetInvoiceResponse} object using the set fields.
         * @return {@link GetInvoiceResponse}
         */
        public GetInvoiceResponse build() {
            return new GetInvoiceResponse(id, code, url, amount, status, paymentMethod, createdAt,
                    items, charge, installments, billingAddress, subscription, shipping, metadata,
                    subscriptionId, customer, cycle, dueAt, canceledAt, billingAt, seenAt,
                    totalDiscount, totalIncrement);
        }
    }
}
