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
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;
import java.util.Map;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetCardResponse type.
 */
public class GetCardResponse {
    private OptionalNullable<String> id;
    private OptionalNullable<String> lastFourDigits;
    private OptionalNullable<String> brand;
    private OptionalNullable<String> holderName;
    private OptionalNullable<Integer> expMonth;
    private OptionalNullable<Integer> expYear;
    private OptionalNullable<String> status;
    private OptionalNullable<LocalDateTime> createdAt;
    private OptionalNullable<LocalDateTime> updatedAt;
    private OptionalNullable<GetBillingAddressResponse> billingAddress;
    private OptionalNullable<GetCustomerResponse> customer;
    private OptionalNullable<Map<String, String>> metadata;
    private OptionalNullable<String> type;
    private OptionalNullable<String> holderDocument;
    private OptionalNullable<LocalDateTime> deletedAt;
    private OptionalNullable<String> firstSixDigits;
    private OptionalNullable<String> label;

    /**
     * Default constructor.
     */
    public GetCardResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  lastFourDigits  String value for lastFourDigits.
     * @param  brand  String value for brand.
     * @param  holderName  String value for holderName.
     * @param  expMonth  Integer value for expMonth.
     * @param  expYear  Integer value for expYear.
     * @param  status  String value for status.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  billingAddress  GetBillingAddressResponse value for billingAddress.
     * @param  customer  GetCustomerResponse value for customer.
     * @param  metadata  Map of String, value for metadata.
     * @param  type  String value for type.
     * @param  holderDocument  String value for holderDocument.
     * @param  deletedAt  LocalDateTime value for deletedAt.
     * @param  firstSixDigits  String value for firstSixDigits.
     * @param  label  String value for label.
     */
    public GetCardResponse(
            String id,
            String lastFourDigits,
            String brand,
            String holderName,
            Integer expMonth,
            Integer expYear,
            String status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            GetBillingAddressResponse billingAddress,
            GetCustomerResponse customer,
            Map<String, String> metadata,
            String type,
            String holderDocument,
            LocalDateTime deletedAt,
            String firstSixDigits,
            String label) {
        this.id = OptionalNullable.of(id);
        this.lastFourDigits = OptionalNullable.of(lastFourDigits);
        this.brand = OptionalNullable.of(brand);
        this.holderName = OptionalNullable.of(holderName);
        this.expMonth = OptionalNullable.of(expMonth);
        this.expYear = OptionalNullable.of(expYear);
        this.status = OptionalNullable.of(status);
        this.createdAt = OptionalNullable.of(createdAt);
        this.updatedAt = OptionalNullable.of(updatedAt);
        this.billingAddress = OptionalNullable.of(billingAddress);
        this.customer = OptionalNullable.of(customer);
        this.metadata = OptionalNullable.of(metadata);
        this.type = OptionalNullable.of(type);
        this.holderDocument = OptionalNullable.of(holderDocument);
        this.deletedAt = OptionalNullable.of(deletedAt);
        this.firstSixDigits = OptionalNullable.of(firstSixDigits);
        this.label = OptionalNullable.of(label);
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  lastFourDigits  String value for lastFourDigits.
     * @param  brand  String value for brand.
     * @param  holderName  String value for holderName.
     * @param  expMonth  Integer value for expMonth.
     * @param  expYear  Integer value for expYear.
     * @param  status  String value for status.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  billingAddress  GetBillingAddressResponse value for billingAddress.
     * @param  customer  GetCustomerResponse value for customer.
     * @param  metadata  Map of String, value for metadata.
     * @param  type  String value for type.
     * @param  holderDocument  String value for holderDocument.
     * @param  deletedAt  LocalDateTime value for deletedAt.
     * @param  firstSixDigits  String value for firstSixDigits.
     * @param  label  String value for label.
     */

    protected GetCardResponse(OptionalNullable<String> id, OptionalNullable<String> lastFourDigits,
            OptionalNullable<String> brand, OptionalNullable<String> holderName,
            OptionalNullable<Integer> expMonth, OptionalNullable<Integer> expYear,
            OptionalNullable<String> status, OptionalNullable<LocalDateTime> createdAt,
            OptionalNullable<LocalDateTime> updatedAt,
            OptionalNullable<GetBillingAddressResponse> billingAddress,
            OptionalNullable<GetCustomerResponse> customer,
            OptionalNullable<Map<String, String>> metadata, OptionalNullable<String> type,
            OptionalNullable<String> holderDocument, OptionalNullable<LocalDateTime> deletedAt,
            OptionalNullable<String> firstSixDigits, OptionalNullable<String> label) {
        this.id = id;
        this.lastFourDigits = lastFourDigits;
        this.brand = brand;
        this.holderName = holderName;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.billingAddress = billingAddress;
        this.customer = customer;
        this.metadata = metadata;
        this.type = type;
        this.holderDocument = holderDocument;
        this.deletedAt = deletedAt;
        this.firstSixDigits = firstSixDigits;
        this.label = label;
    }

    /**
     * Internal Getter for Id.
     * @return Returns the Internal String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetId() {
        return this.id;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    public String getId() {
        return OptionalNullable.getFrom(id);
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = OptionalNullable.of(id);
    }

    /**
     * UnSetter for Id.
     */
    public void unsetId() {
        id = null;
    }

    /**
     * Internal Getter for LastFourDigits.
     * @return Returns the Internal String
     */
    @JsonGetter("last_four_digits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLastFourDigits() {
        return this.lastFourDigits;
    }

    /**
     * Getter for LastFourDigits.
     * @return Returns the String
     */
    public String getLastFourDigits() {
        return OptionalNullable.getFrom(lastFourDigits);
    }

    /**
     * Setter for LastFourDigits.
     * @param lastFourDigits Value for String
     */
    @JsonSetter("last_four_digits")
    public void setLastFourDigits(String lastFourDigits) {
        this.lastFourDigits = OptionalNullable.of(lastFourDigits);
    }

    /**
     * UnSetter for LastFourDigits.
     */
    public void unsetLastFourDigits() {
        lastFourDigits = null;
    }

    /**
     * Internal Getter for Brand.
     * @return Returns the Internal String
     */
    @JsonGetter("brand")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBrand() {
        return this.brand;
    }

    /**
     * Getter for Brand.
     * @return Returns the String
     */
    public String getBrand() {
        return OptionalNullable.getFrom(brand);
    }

    /**
     * Setter for Brand.
     * @param brand Value for String
     */
    @JsonSetter("brand")
    public void setBrand(String brand) {
        this.brand = OptionalNullable.of(brand);
    }

    /**
     * UnSetter for Brand.
     */
    public void unsetBrand() {
        brand = null;
    }

    /**
     * Internal Getter for HolderName.
     * @return Returns the Internal String
     */
    @JsonGetter("holder_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetHolderName() {
        return this.holderName;
    }

    /**
     * Getter for HolderName.
     * @return Returns the String
     */
    public String getHolderName() {
        return OptionalNullable.getFrom(holderName);
    }

    /**
     * Setter for HolderName.
     * @param holderName Value for String
     */
    @JsonSetter("holder_name")
    public void setHolderName(String holderName) {
        this.holderName = OptionalNullable.of(holderName);
    }

    /**
     * UnSetter for HolderName.
     */
    public void unsetHolderName() {
        holderName = null;
    }

    /**
     * Internal Getter for ExpMonth.
     * @return Returns the Internal Integer
     */
    @JsonGetter("exp_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetExpMonth() {
        return this.expMonth;
    }

    /**
     * Getter for ExpMonth.
     * @return Returns the Integer
     */
    public Integer getExpMonth() {
        return OptionalNullable.getFrom(expMonth);
    }

    /**
     * Setter for ExpMonth.
     * @param expMonth Value for Integer
     */
    @JsonSetter("exp_month")
    public void setExpMonth(Integer expMonth) {
        this.expMonth = OptionalNullable.of(expMonth);
    }

    /**
     * UnSetter for ExpMonth.
     */
    public void unsetExpMonth() {
        expMonth = null;
    }

    /**
     * Internal Getter for ExpYear.
     * @return Returns the Internal Integer
     */
    @JsonGetter("exp_year")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetExpYear() {
        return this.expYear;
    }

    /**
     * Getter for ExpYear.
     * @return Returns the Integer
     */
    public Integer getExpYear() {
        return OptionalNullable.getFrom(expYear);
    }

    /**
     * Setter for ExpYear.
     * @param expYear Value for Integer
     */
    @JsonSetter("exp_year")
    public void setExpYear(Integer expYear) {
        this.expYear = OptionalNullable.of(expYear);
    }

    /**
     * UnSetter for ExpYear.
     */
    public void unsetExpYear() {
        expYear = null;
    }

    /**
     * Internal Getter for Status.
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
     * @return Returns the String
     */
    public String getStatus() {
        return OptionalNullable.getFrom(status);
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = OptionalNullable.of(status);
    }

    /**
     * UnSetter for Status.
     */
    public void unsetStatus() {
        status = null;
    }

    /**
     * Internal Getter for CreatedAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetCreatedAt() {
        return this.createdAt;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getCreatedAt() {
        return OptionalNullable.getFrom(createdAt);
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = OptionalNullable.of(createdAt);
    }

    /**
     * UnSetter for CreatedAt.
     */
    public void unsetCreatedAt() {
        createdAt = null;
    }

    /**
     * Internal Getter for UpdatedAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getUpdatedAt() {
        return OptionalNullable.getFrom(updatedAt);
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = OptionalNullable.of(updatedAt);
    }

    /**
     * UnSetter for UpdatedAt.
     */
    public void unsetUpdatedAt() {
        updatedAt = null;
    }

    /**
     * Internal Getter for BillingAddress.
     * @return Returns the Internal GetBillingAddressResponse
     */
    @JsonGetter("billing_address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetBillingAddressResponse> internalGetBillingAddress() {
        return this.billingAddress;
    }

    /**
     * Getter for BillingAddress.
     * @return Returns the GetBillingAddressResponse
     */
    public GetBillingAddressResponse getBillingAddress() {
        return OptionalNullable.getFrom(billingAddress);
    }

    /**
     * Setter for BillingAddress.
     * @param billingAddress Value for GetBillingAddressResponse
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(GetBillingAddressResponse billingAddress) {
        this.billingAddress = OptionalNullable.of(billingAddress);
    }

    /**
     * UnSetter for BillingAddress.
     */
    public void unsetBillingAddress() {
        billingAddress = null;
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
     * Internal Getter for Metadata.
     * @return Returns the Internal Map of String, String
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Map<String, String>> internalGetMetadata() {
        return this.metadata;
    }

    /**
     * Getter for Metadata.
     * @return Returns the Map of String, String
     */
    public Map<String, String> getMetadata() {
        return OptionalNullable.getFrom(metadata);
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = OptionalNullable.of(metadata);
    }

    /**
     * UnSetter for Metadata.
     */
    public void unsetMetadata() {
        metadata = null;
    }

    /**
     * Internal Getter for Type.
     * Card type
     * @return Returns the Internal String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetType() {
        return this.type;
    }

    /**
     * Getter for Type.
     * Card type
     * @return Returns the String
     */
    public String getType() {
        return OptionalNullable.getFrom(type);
    }

    /**
     * Setter for Type.
     * Card type
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = OptionalNullable.of(type);
    }

    /**
     * UnSetter for Type.
     * Card type
     */
    public void unsetType() {
        type = null;
    }

    /**
     * Internal Getter for HolderDocument.
     * Document number for the card's holder
     * @return Returns the Internal String
     */
    @JsonGetter("holder_document")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetHolderDocument() {
        return this.holderDocument;
    }

    /**
     * Getter for HolderDocument.
     * Document number for the card's holder
     * @return Returns the String
     */
    public String getHolderDocument() {
        return OptionalNullable.getFrom(holderDocument);
    }

    /**
     * Setter for HolderDocument.
     * Document number for the card's holder
     * @param holderDocument Value for String
     */
    @JsonSetter("holder_document")
    public void setHolderDocument(String holderDocument) {
        this.holderDocument = OptionalNullable.of(holderDocument);
    }

    /**
     * UnSetter for HolderDocument.
     * Document number for the card's holder
     */
    public void unsetHolderDocument() {
        holderDocument = null;
    }

    /**
     * Internal Getter for DeletedAt.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("deleted_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetDeletedAt() {
        return this.deletedAt;
    }

    /**
     * Getter for DeletedAt.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getDeletedAt() {
        return OptionalNullable.getFrom(deletedAt);
    }

    /**
     * Setter for DeletedAt.
     * @param deletedAt Value for LocalDateTime
     */
    @JsonSetter("deleted_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = OptionalNullable.of(deletedAt);
    }

    /**
     * UnSetter for DeletedAt.
     */
    public void unsetDeletedAt() {
        deletedAt = null;
    }

    /**
     * Internal Getter for FirstSixDigits.
     * First six digits
     * @return Returns the Internal String
     */
    @JsonGetter("first_six_digits")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFirstSixDigits() {
        return this.firstSixDigits;
    }

    /**
     * Getter for FirstSixDigits.
     * First six digits
     * @return Returns the String
     */
    public String getFirstSixDigits() {
        return OptionalNullable.getFrom(firstSixDigits);
    }

    /**
     * Setter for FirstSixDigits.
     * First six digits
     * @param firstSixDigits Value for String
     */
    @JsonSetter("first_six_digits")
    public void setFirstSixDigits(String firstSixDigits) {
        this.firstSixDigits = OptionalNullable.of(firstSixDigits);
    }

    /**
     * UnSetter for FirstSixDigits.
     * First six digits
     */
    public void unsetFirstSixDigits() {
        firstSixDigits = null;
    }

    /**
     * Internal Getter for Label.
     * @return Returns the Internal String
     */
    @JsonGetter("label")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLabel() {
        return this.label;
    }

    /**
     * Getter for Label.
     * @return Returns the String
     */
    public String getLabel() {
        return OptionalNullable.getFrom(label);
    }

    /**
     * Setter for Label.
     * @param label Value for String
     */
    @JsonSetter("label")
    public void setLabel(String label) {
        this.label = OptionalNullable.of(label);
    }

    /**
     * UnSetter for Label.
     */
    public void unsetLabel() {
        label = null;
    }

    /**
     * Converts this GetCardResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCardResponse [" + "id=" + id + ", lastFourDigits=" + lastFourDigits + ", brand="
                + brand + ", holderName=" + holderName + ", expMonth=" + expMonth + ", expYear="
                + expYear + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt="
                + updatedAt + ", billingAddress=" + billingAddress + ", customer=" + customer
                + ", metadata=" + metadata + ", type=" + type + ", holderDocument=" + holderDocument
                + ", deletedAt=" + deletedAt + ", firstSixDigits=" + firstSixDigits + ", label="
                + label + "]";
    }

    /**
     * Builds a new {@link GetCardResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCardResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = internalGetId();
        builder.lastFourDigits = internalGetLastFourDigits();
        builder.brand = internalGetBrand();
        builder.holderName = internalGetHolderName();
        builder.expMonth = internalGetExpMonth();
        builder.expYear = internalGetExpYear();
        builder.status = internalGetStatus();
        builder.createdAt = internalGetCreatedAt();
        builder.updatedAt = internalGetUpdatedAt();
        builder.billingAddress = internalGetBillingAddress();
        builder.customer = internalGetCustomer();
        builder.metadata = internalGetMetadata();
        builder.type = internalGetType();
        builder.holderDocument = internalGetHolderDocument();
        builder.deletedAt = internalGetDeletedAt();
        builder.firstSixDigits = internalGetFirstSixDigits();
        builder.label = internalGetLabel();
        return builder;
    }

    /**
     * Class to build instances of {@link GetCardResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> id;
        private OptionalNullable<String> lastFourDigits;
        private OptionalNullable<String> brand;
        private OptionalNullable<String> holderName;
        private OptionalNullable<Integer> expMonth;
        private OptionalNullable<Integer> expYear;
        private OptionalNullable<String> status;
        private OptionalNullable<LocalDateTime> createdAt;
        private OptionalNullable<LocalDateTime> updatedAt;
        private OptionalNullable<GetBillingAddressResponse> billingAddress;
        private OptionalNullable<GetCustomerResponse> customer;
        private OptionalNullable<Map<String, String>> metadata;
        private OptionalNullable<String> type;
        private OptionalNullable<String> holderDocument;
        private OptionalNullable<LocalDateTime> deletedAt;
        private OptionalNullable<String> firstSixDigits;
        private OptionalNullable<String> label;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = OptionalNullable.of(id);
            return this;
        }

        /**
         * UnSetter for id.
         * @return Builder
         */
        public Builder unsetId() {
            id = null;
            return this;
        }

        /**
         * Setter for lastFourDigits.
         * @param  lastFourDigits  String value for lastFourDigits.
         * @return Builder
         */
        public Builder lastFourDigits(String lastFourDigits) {
            this.lastFourDigits = OptionalNullable.of(lastFourDigits);
            return this;
        }

        /**
         * UnSetter for lastFourDigits.
         * @return Builder
         */
        public Builder unsetLastFourDigits() {
            lastFourDigits = null;
            return this;
        }

        /**
         * Setter for brand.
         * @param  brand  String value for brand.
         * @return Builder
         */
        public Builder brand(String brand) {
            this.brand = OptionalNullable.of(brand);
            return this;
        }

        /**
         * UnSetter for brand.
         * @return Builder
         */
        public Builder unsetBrand() {
            brand = null;
            return this;
        }

        /**
         * Setter for holderName.
         * @param  holderName  String value for holderName.
         * @return Builder
         */
        public Builder holderName(String holderName) {
            this.holderName = OptionalNullable.of(holderName);
            return this;
        }

        /**
         * UnSetter for holderName.
         * @return Builder
         */
        public Builder unsetHolderName() {
            holderName = null;
            return this;
        }

        /**
         * Setter for expMonth.
         * @param  expMonth  Integer value for expMonth.
         * @return Builder
         */
        public Builder expMonth(Integer expMonth) {
            this.expMonth = OptionalNullable.of(expMonth);
            return this;
        }

        /**
         * UnSetter for expMonth.
         * @return Builder
         */
        public Builder unsetExpMonth() {
            expMonth = null;
            return this;
        }

        /**
         * Setter for expYear.
         * @param  expYear  Integer value for expYear.
         * @return Builder
         */
        public Builder expYear(Integer expYear) {
            this.expYear = OptionalNullable.of(expYear);
            return this;
        }

        /**
         * UnSetter for expYear.
         * @return Builder
         */
        public Builder unsetExpYear() {
            expYear = null;
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
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = OptionalNullable.of(createdAt);
            return this;
        }

        /**
         * UnSetter for createdAt.
         * @return Builder
         */
        public Builder unsetCreatedAt() {
            createdAt = null;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = OptionalNullable.of(updatedAt);
            return this;
        }

        /**
         * UnSetter for updatedAt.
         * @return Builder
         */
        public Builder unsetUpdatedAt() {
            updatedAt = null;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  GetBillingAddressResponse value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(GetBillingAddressResponse billingAddress) {
            this.billingAddress = OptionalNullable.of(billingAddress);
            return this;
        }

        /**
         * UnSetter for billingAddress.
         * @return Builder
         */
        public Builder unsetBillingAddress() {
            billingAddress = null;
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
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = OptionalNullable.of(metadata);
            return this;
        }

        /**
         * UnSetter for metadata.
         * @return Builder
         */
        public Builder unsetMetadata() {
            metadata = null;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = OptionalNullable.of(type);
            return this;
        }

        /**
         * UnSetter for type.
         * @return Builder
         */
        public Builder unsetType() {
            type = null;
            return this;
        }

        /**
         * Setter for holderDocument.
         * @param  holderDocument  String value for holderDocument.
         * @return Builder
         */
        public Builder holderDocument(String holderDocument) {
            this.holderDocument = OptionalNullable.of(holderDocument);
            return this;
        }

        /**
         * UnSetter for holderDocument.
         * @return Builder
         */
        public Builder unsetHolderDocument() {
            holderDocument = null;
            return this;
        }

        /**
         * Setter for deletedAt.
         * @param  deletedAt  LocalDateTime value for deletedAt.
         * @return Builder
         */
        public Builder deletedAt(LocalDateTime deletedAt) {
            this.deletedAt = OptionalNullable.of(deletedAt);
            return this;
        }

        /**
         * UnSetter for deletedAt.
         * @return Builder
         */
        public Builder unsetDeletedAt() {
            deletedAt = null;
            return this;
        }

        /**
         * Setter for firstSixDigits.
         * @param  firstSixDigits  String value for firstSixDigits.
         * @return Builder
         */
        public Builder firstSixDigits(String firstSixDigits) {
            this.firstSixDigits = OptionalNullable.of(firstSixDigits);
            return this;
        }

        /**
         * UnSetter for firstSixDigits.
         * @return Builder
         */
        public Builder unsetFirstSixDigits() {
            firstSixDigits = null;
            return this;
        }

        /**
         * Setter for label.
         * @param  label  String value for label.
         * @return Builder
         */
        public Builder label(String label) {
            this.label = OptionalNullable.of(label);
            return this;
        }

        /**
         * UnSetter for label.
         * @return Builder
         */
        public Builder unsetLabel() {
            label = null;
            return this;
        }

        /**
         * Builds a new {@link GetCardResponse} object using the set fields.
         * @return {@link GetCardResponse}
         */
        public GetCardResponse build() {
            return new GetCardResponse(id, lastFourDigits, brand, holderName, expMonth, expYear,
                    status, createdAt, updatedAt, billingAddress, customer, metadata, type,
                    holderDocument, deletedAt, firstSixDigits, label);
        }
    }
}
