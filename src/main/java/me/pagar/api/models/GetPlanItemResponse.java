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
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetPlanItemResponse type.
 */
public class GetPlanItemResponse {
    private OptionalNullable<String> id;
    private OptionalNullable<String> name;
    private OptionalNullable<String> status;
    private OptionalNullable<LocalDateTime> createdAt;
    private OptionalNullable<LocalDateTime> updatedAt;
    private OptionalNullable<GetPricingSchemeResponse> pricingScheme;
    private OptionalNullable<String> description;
    private OptionalNullable<GetPlanResponse> plan;
    private OptionalNullable<Integer> quantity;
    private OptionalNullable<Integer> cycles;
    private OptionalNullable<LocalDateTime> deletedAt;

    /**
     * Default constructor.
     */
    public GetPlanItemResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  name  String value for name.
     * @param  status  String value for status.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  pricingScheme  GetPricingSchemeResponse value for pricingScheme.
     * @param  description  String value for description.
     * @param  plan  GetPlanResponse value for plan.
     * @param  quantity  Integer value for quantity.
     * @param  cycles  Integer value for cycles.
     * @param  deletedAt  LocalDateTime value for deletedAt.
     */
    public GetPlanItemResponse(
            String id,
            String name,
            String status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            GetPricingSchemeResponse pricingScheme,
            String description,
            GetPlanResponse plan,
            Integer quantity,
            Integer cycles,
            LocalDateTime deletedAt) {
        this.id = OptionalNullable.of(id);
        this.name = OptionalNullable.of(name);
        this.status = OptionalNullable.of(status);
        this.createdAt = OptionalNullable.of(createdAt);
        this.updatedAt = OptionalNullable.of(updatedAt);
        this.pricingScheme = OptionalNullable.of(pricingScheme);
        this.description = OptionalNullable.of(description);
        this.plan = OptionalNullable.of(plan);
        this.quantity = OptionalNullable.of(quantity);
        this.cycles = OptionalNullable.of(cycles);
        this.deletedAt = OptionalNullable.of(deletedAt);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetPlanItemResponse(OptionalNullable<String> id, OptionalNullable<String> name,
            OptionalNullable<String> status, OptionalNullable<LocalDateTime> createdAt,
            OptionalNullable<LocalDateTime> updatedAt,
            OptionalNullable<GetPricingSchemeResponse> pricingScheme,
            OptionalNullable<String> description, OptionalNullable<GetPlanResponse> plan,
            OptionalNullable<Integer> quantity, OptionalNullable<Integer> cycles,
            OptionalNullable<LocalDateTime> deletedAt) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pricingScheme = pricingScheme;
        this.description = description;
        this.plan = plan;
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
     * Internal Getter for Name.
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
     * @return Returns the String
     */
    public String getName() {
        return OptionalNullable.getFrom(name);
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = OptionalNullable.of(name);
    }

    /**
     * UnSetter for Name.
     */
    public void unsetName() {
        name = null;
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
     * Internal Getter for Plan.
     * @return Returns the Internal GetPlanResponse
     */
    @JsonGetter("plan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetPlanResponse> internalGetPlan() {
        return this.plan;
    }

    /**
     * Getter for Plan.
     * @return Returns the GetPlanResponse
     */
    public GetPlanResponse getPlan() {
        return OptionalNullable.getFrom(plan);
    }

    /**
     * Setter for Plan.
     * @param plan Value for GetPlanResponse
     */
    @JsonSetter("plan")
    public void setPlan(GetPlanResponse plan) {
        this.plan = OptionalNullable.of(plan);
    }

    /**
     * UnSetter for Plan.
     */
    public void unsetPlan() {
        plan = null;
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
     * Converts this GetPlanItemResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPlanItemResponse [" + "id=" + id + ", name=" + name + ", status=" + status
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", pricingScheme="
                + pricingScheme + ", description=" + description + ", plan=" + plan + ", quantity="
                + quantity + ", cycles=" + cycles + ", deletedAt=" + deletedAt + "]";
    }

    /**
     * Builds a new {@link GetPlanItemResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPlanItemResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = internalGetId();
        builder.name = internalGetName();
        builder.status = internalGetStatus();
        builder.createdAt = internalGetCreatedAt();
        builder.updatedAt = internalGetUpdatedAt();
        builder.pricingScheme = internalGetPricingScheme();
        builder.description = internalGetDescription();
        builder.plan = internalGetPlan();
        builder.quantity = internalGetQuantity();
        builder.cycles = internalGetCycles();
        builder.deletedAt = internalGetDeletedAt();
        return builder;
    }

    /**
     * Class to build instances of {@link GetPlanItemResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> id;
        private OptionalNullable<String> name;
        private OptionalNullable<String> status;
        private OptionalNullable<LocalDateTime> createdAt;
        private OptionalNullable<LocalDateTime> updatedAt;
        private OptionalNullable<GetPricingSchemeResponse> pricingScheme;
        private OptionalNullable<String> description;
        private OptionalNullable<GetPlanResponse> plan;
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
         * Setter for plan.
         * @param  plan  GetPlanResponse value for plan.
         * @return Builder
         */
        public Builder plan(GetPlanResponse plan) {
            this.plan = OptionalNullable.of(plan);
            return this;
        }

        /**
         * UnSetter for plan.
         * @return Builder
         */
        public Builder unsetPlan() {
            plan = null;
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
         * Builds a new {@link GetPlanItemResponse} object using the set fields.
         * @return {@link GetPlanItemResponse}
         */
        public GetPlanItemResponse build() {
            return new GetPlanItemResponse(id, name, status, createdAt, updatedAt, pricingScheme,
                    description, plan, quantity, cycles, deletedAt);
        }
    }
}
