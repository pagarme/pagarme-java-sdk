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
import java.util.List;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetSubscriptionItemResponse type.
 */
public class GetSubscriptionItemResponse {
    private OptionalNullable<String> id;
    private OptionalNullable<String> description;
    private OptionalNullable<String> status;
    private OptionalNullable<LocalDateTime> createdAt;
    private OptionalNullable<LocalDateTime> updatedAt;
    private OptionalNullable<GetPricingSchemeResponse> pricingScheme;
    private OptionalNullable<List<GetDiscountResponse>> discounts;
    private OptionalNullable<List<GetIncrementResponse>> increments;
    private OptionalNullable<GetSubscriptionResponse> subscription;
    private OptionalNullable<String> name;
    private OptionalNullable<Integer> quantity;
    private OptionalNullable<Integer> cycles;
    private OptionalNullable<LocalDateTime> deletedAt;

    /**
     * Default constructor.
     */
    public GetSubscriptionItemResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  description  String value for description.
     * @param  status  String value for status.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  pricingScheme  GetPricingSchemeResponse value for pricingScheme.
     * @param  discounts  List of GetDiscountResponse value for discounts.
     * @param  increments  List of GetIncrementResponse value for increments.
     * @param  subscription  GetSubscriptionResponse value for subscription.
     * @param  name  String value for name.
     * @param  quantity  Integer value for quantity.
     * @param  cycles  Integer value for cycles.
     * @param  deletedAt  LocalDateTime value for deletedAt.
     */
    public GetSubscriptionItemResponse(
            String id,
            String description,
            String status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            GetPricingSchemeResponse pricingScheme,
            List<GetDiscountResponse> discounts,
            List<GetIncrementResponse> increments,
            GetSubscriptionResponse subscription,
            String name,
            Integer quantity,
            Integer cycles,
            LocalDateTime deletedAt) {
        this.id = OptionalNullable.of(id);
        this.description = OptionalNullable.of(description);
        this.status = OptionalNullable.of(status);
        this.createdAt = OptionalNullable.of(createdAt);
        this.updatedAt = OptionalNullable.of(updatedAt);
        this.pricingScheme = OptionalNullable.of(pricingScheme);
        this.discounts = OptionalNullable.of(discounts);
        this.increments = OptionalNullable.of(increments);
        this.subscription = OptionalNullable.of(subscription);
        this.name = OptionalNullable.of(name);
        this.quantity = OptionalNullable.of(quantity);
        this.cycles = OptionalNullable.of(cycles);
        this.deletedAt = OptionalNullable.of(deletedAt);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetSubscriptionItemResponse(OptionalNullable<String> id,
            OptionalNullable<String> description, OptionalNullable<String> status,
            OptionalNullable<LocalDateTime> createdAt, OptionalNullable<LocalDateTime> updatedAt,
            OptionalNullable<GetPricingSchemeResponse> pricingScheme,
            OptionalNullable<List<GetDiscountResponse>> discounts,
            OptionalNullable<List<GetIncrementResponse>> increments,
            OptionalNullable<GetSubscriptionResponse> subscription, OptionalNullable<String> name,
            OptionalNullable<Integer> quantity, OptionalNullable<Integer> cycles,
            OptionalNullable<LocalDateTime> deletedAt) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pricingScheme = pricingScheme;
        this.discounts = discounts;
        this.increments = increments;
        this.subscription = subscription;
        this.name = name;
        this.quantity = quantity;
        this.cycles = cycles;
        this.deletedAt = deletedAt;
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
     * Internal Getter for Description.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     */
    public void unsetDescription() {
        description = null;
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
     * Internal Getter for PricingScheme.
     * @return Returns the Internal GetPricingSchemeResponse
     */
    @JsonGetter("pricing_scheme")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetPricingSchemeResponse> internalGetPricingScheme() {
        return this.pricingScheme;
    }

    /**
     * Getter for PricingScheme.
     * @return Returns the GetPricingSchemeResponse
     */
    public GetPricingSchemeResponse getPricingScheme() {
        return OptionalNullable.getFrom(pricingScheme);
    }

    /**
     * Setter for PricingScheme.
     * @param pricingScheme Value for GetPricingSchemeResponse
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(GetPricingSchemeResponse pricingScheme) {
        this.pricingScheme = OptionalNullable.of(pricingScheme);
    }

    /**
     * UnSetter for PricingScheme.
     */
    public void unsetPricingScheme() {
        pricingScheme = null;
    }

    /**
     * Internal Getter for Discounts.
     * @return Returns the Internal List of GetDiscountResponse
     */
    @JsonGetter("discounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<GetDiscountResponse>> internalGetDiscounts() {
        return this.discounts;
    }

    /**
     * Getter for Discounts.
     * @return Returns the List of GetDiscountResponse
     */
    public List<GetDiscountResponse> getDiscounts() {
        return OptionalNullable.getFrom(discounts);
    }

    /**
     * Setter for Discounts.
     * @param discounts Value for List of GetDiscountResponse
     */
    @JsonSetter("discounts")
    public void setDiscounts(List<GetDiscountResponse> discounts) {
        this.discounts = OptionalNullable.of(discounts);
    }

    /**
     * UnSetter for Discounts.
     */
    public void unsetDiscounts() {
        discounts = null;
    }

    /**
     * Internal Getter for Increments.
     * @return Returns the Internal List of GetIncrementResponse
     */
    @JsonGetter("increments")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<GetIncrementResponse>> internalGetIncrements() {
        return this.increments;
    }

    /**
     * Getter for Increments.
     * @return Returns the List of GetIncrementResponse
     */
    public List<GetIncrementResponse> getIncrements() {
        return OptionalNullable.getFrom(increments);
    }

    /**
     * Setter for Increments.
     * @param increments Value for List of GetIncrementResponse
     */
    @JsonSetter("increments")
    public void setIncrements(List<GetIncrementResponse> increments) {
        this.increments = OptionalNullable.of(increments);
    }

    /**
     * UnSetter for Increments.
     */
    public void unsetIncrements() {
        increments = null;
    }

    /**
     * Internal Getter for Subscription.
     * @return Returns the Internal GetSubscriptionResponse
     */
    @JsonGetter("subscription")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetSubscriptionResponse> internalGetSubscription() {
        return this.subscription;
    }

    /**
     * Getter for Subscription.
     * @return Returns the GetSubscriptionResponse
     */
    public GetSubscriptionResponse getSubscription() {
        return OptionalNullable.getFrom(subscription);
    }

    /**
     * Setter for Subscription.
     * @param subscription Value for GetSubscriptionResponse
     */
    @JsonSetter("subscription")
    public void setSubscription(GetSubscriptionResponse subscription) {
        this.subscription = OptionalNullable.of(subscription);
    }

    /**
     * UnSetter for Subscription.
     */
    public void unsetSubscription() {
        subscription = null;
    }

    /**
     * Internal Getter for Name.
     * Item name
     * @return Returns the Internal String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetName() {
        return this.name;
    }

    /**
     * Getter for Name.
     * Item name
     * @return Returns the String
     */
    public String getName() {
        return OptionalNullable.getFrom(name);
    }

    /**
     * Setter for Name.
     * Item name
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = OptionalNullable.of(name);
    }

    /**
     * UnSetter for Name.
     * Item name
     */
    public void unsetName() {
        name = null;
    }

    /**
     * Internal Getter for Quantity.
     * @return Returns the Internal Integer
     */
    @JsonGetter("quantity")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetQuantity() {
        return this.quantity;
    }

    /**
     * Getter for Quantity.
     * @return Returns the Integer
     */
    public Integer getQuantity() {
        return OptionalNullable.getFrom(quantity);
    }

    /**
     * Setter for Quantity.
     * @param quantity Value for Integer
     */
    @JsonSetter("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = OptionalNullable.of(quantity);
    }

    /**
     * UnSetter for Quantity.
     */
    public void unsetQuantity() {
        quantity = null;
    }

    /**
     * Internal Getter for Cycles.
     * @return Returns the Internal Integer
     */
    @JsonGetter("cycles")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetCycles() {
        return this.cycles;
    }

    /**
     * Getter for Cycles.
     * @return Returns the Integer
     */
    public Integer getCycles() {
        return OptionalNullable.getFrom(cycles);
    }

    /**
     * Setter for Cycles.
     * @param cycles Value for Integer
     */
    @JsonSetter("cycles")
    public void setCycles(Integer cycles) {
        this.cycles = OptionalNullable.of(cycles);
    }

    /**
     * UnSetter for Cycles.
     */
    public void unsetCycles() {
        cycles = null;
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
     * Converts this GetSubscriptionItemResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetSubscriptionItemResponse [" + "id=" + id + ", description=" + description
                + ", status=" + status + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", pricingScheme=" + pricingScheme + ", discounts=" + discounts + ", increments="
                + increments + ", subscription=" + subscription + ", name=" + name + ", quantity="
                + quantity + ", cycles=" + cycles + ", deletedAt=" + deletedAt + "]";
    }

    /**
     * Builds a new {@link GetSubscriptionItemResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetSubscriptionItemResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = internalGetId();
        builder.description = internalGetDescription();
        builder.status = internalGetStatus();
        builder.createdAt = internalGetCreatedAt();
        builder.updatedAt = internalGetUpdatedAt();
        builder.pricingScheme = internalGetPricingScheme();
        builder.discounts = internalGetDiscounts();
        builder.increments = internalGetIncrements();
        builder.subscription = internalGetSubscription();
        builder.name = internalGetName();
        builder.quantity = internalGetQuantity();
        builder.cycles = internalGetCycles();
        builder.deletedAt = internalGetDeletedAt();
        return builder;
    }

    /**
     * Class to build instances of {@link GetSubscriptionItemResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> id;
        private OptionalNullable<String> description;
        private OptionalNullable<String> status;
        private OptionalNullable<LocalDateTime> createdAt;
        private OptionalNullable<LocalDateTime> updatedAt;
        private OptionalNullable<GetPricingSchemeResponse> pricingScheme;
        private OptionalNullable<List<GetDiscountResponse>> discounts;
        private OptionalNullable<List<GetIncrementResponse>> increments;
        private OptionalNullable<GetSubscriptionResponse> subscription;
        private OptionalNullable<String> name;
        private OptionalNullable<Integer> quantity;
        private OptionalNullable<Integer> cycles;
        private OptionalNullable<LocalDateTime> deletedAt;



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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
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
         * Setter for pricingScheme.
         * @param  pricingScheme  GetPricingSchemeResponse value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(GetPricingSchemeResponse pricingScheme) {
            this.pricingScheme = OptionalNullable.of(pricingScheme);
            return this;
        }

        /**
         * UnSetter for pricingScheme.
         * @return Builder
         */
        public Builder unsetPricingScheme() {
            pricingScheme = null;
            return this;
        }

        /**
         * Setter for discounts.
         * @param  discounts  List of GetDiscountResponse value for discounts.
         * @return Builder
         */
        public Builder discounts(List<GetDiscountResponse> discounts) {
            this.discounts = OptionalNullable.of(discounts);
            return this;
        }

        /**
         * UnSetter for discounts.
         * @return Builder
         */
        public Builder unsetDiscounts() {
            discounts = null;
            return this;
        }

        /**
         * Setter for increments.
         * @param  increments  List of GetIncrementResponse value for increments.
         * @return Builder
         */
        public Builder increments(List<GetIncrementResponse> increments) {
            this.increments = OptionalNullable.of(increments);
            return this;
        }

        /**
         * UnSetter for increments.
         * @return Builder
         */
        public Builder unsetIncrements() {
            increments = null;
            return this;
        }

        /**
         * Setter for subscription.
         * @param  subscription  GetSubscriptionResponse value for subscription.
         * @return Builder
         */
        public Builder subscription(GetSubscriptionResponse subscription) {
            this.subscription = OptionalNullable.of(subscription);
            return this;
        }

        /**
         * UnSetter for subscription.
         * @return Builder
         */
        public Builder unsetSubscription() {
            subscription = null;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = OptionalNullable.of(name);
            return this;
        }

        /**
         * UnSetter for name.
         * @return Builder
         */
        public Builder unsetName() {
            name = null;
            return this;
        }

        /**
         * Setter for quantity.
         * @param  quantity  Integer value for quantity.
         * @return Builder
         */
        public Builder quantity(Integer quantity) {
            this.quantity = OptionalNullable.of(quantity);
            return this;
        }

        /**
         * UnSetter for quantity.
         * @return Builder
         */
        public Builder unsetQuantity() {
            quantity = null;
            return this;
        }

        /**
         * Setter for cycles.
         * @param  cycles  Integer value for cycles.
         * @return Builder
         */
        public Builder cycles(Integer cycles) {
            this.cycles = OptionalNullable.of(cycles);
            return this;
        }

        /**
         * UnSetter for cycles.
         * @return Builder
         */
        public Builder unsetCycles() {
            cycles = null;
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
         * Builds a new {@link GetSubscriptionItemResponse} object using the set fields.
         * @return {@link GetSubscriptionItemResponse}
         */
        public GetSubscriptionItemResponse build() {
            return new GetSubscriptionItemResponse(id, description, status, createdAt, updatedAt,
                    pricingScheme, discounts, increments, subscription, name, quantity, cycles,
                    deletedAt);
        }
    }
}
