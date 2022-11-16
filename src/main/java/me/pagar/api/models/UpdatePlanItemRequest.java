/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for UpdatePlanItemRequest type.
 */
public class UpdatePlanItemRequest {
    private String name;
    private String description;
    private String status;
    private UpdatePricingSchemeRequest pricingScheme;
    private Integer quantity;
    private Integer cycles;

    /**
     * Default constructor.
     */
    public UpdatePlanItemRequest() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  status  String value for status.
     * @param  pricingScheme  UpdatePricingSchemeRequest value for pricingScheme.
     * @param  quantity  Integer value for quantity.
     * @param  cycles  Integer value for cycles.
     */
    public UpdatePlanItemRequest(
            String name,
            String description,
            String status,
            UpdatePricingSchemeRequest pricingScheme,
            Integer quantity,
            Integer cycles) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.pricingScheme = pricingScheme;
        this.quantity = quantity;
        this.cycles = cycles;
    }

    /**
     * Getter for Name.
     * Item name
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Item name
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Description.
     * Description
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Description
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for Status.
     * Item status
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Item status
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for PricingScheme.
     * Pricing scheme
     * @return Returns the UpdatePricingSchemeRequest
     */
    @JsonGetter("pricing_scheme")
    public UpdatePricingSchemeRequest getPricingScheme() {
        return pricingScheme;
    }

    /**
     * Setter for PricingScheme.
     * Pricing scheme
     * @param pricingScheme Value for UpdatePricingSchemeRequest
     */
    @JsonSetter("pricing_scheme")
    public void setPricingScheme(UpdatePricingSchemeRequest pricingScheme) {
        this.pricingScheme = pricingScheme;
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
     * Getter for Cycles.
     * Number of cycles that the item will be charged
     * @return Returns the Integer
     */
    @JsonGetter("cycles")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCycles() {
        return cycles;
    }

    /**
     * Setter for Cycles.
     * Number of cycles that the item will be charged
     * @param cycles Value for Integer
     */
    @JsonSetter("cycles")
    public void setCycles(Integer cycles) {
        this.cycles = cycles;
    }

    /**
     * Converts this UpdatePlanItemRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdatePlanItemRequest [" + "name=" + name + ", description=" + description
                + ", status=" + status + ", pricingScheme=" + pricingScheme + ", quantity="
                + quantity + ", cycles=" + cycles + "]";
    }

    /**
     * Builds a new {@link UpdatePlanItemRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdatePlanItemRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, description, status, pricingScheme)
                .quantity(getQuantity())
                .cycles(getCycles());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdatePlanItemRequest}.
     */
    public static class Builder {
        private String name;
        private String description;
        private String status;
        private UpdatePricingSchemeRequest pricingScheme;
        private Integer quantity;
        private Integer cycles;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  description  String value for description.
         * @param  status  String value for status.
         * @param  pricingScheme  UpdatePricingSchemeRequest value for pricingScheme.
         */
        public Builder(String name, String description, String status,
                UpdatePricingSchemeRequest pricingScheme) {
            this.name = name;
            this.description = description;
            this.status = status;
            this.pricingScheme = pricingScheme;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
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
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for pricingScheme.
         * @param  pricingScheme  UpdatePricingSchemeRequest value for pricingScheme.
         * @return Builder
         */
        public Builder pricingScheme(UpdatePricingSchemeRequest pricingScheme) {
            this.pricingScheme = pricingScheme;
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
         * Setter for cycles.
         * @param  cycles  Integer value for cycles.
         * @return Builder
         */
        public Builder cycles(Integer cycles) {
            this.cycles = cycles;
            return this;
        }

        /**
         * Builds a new {@link UpdatePlanItemRequest} object using the set fields.
         * @return {@link UpdatePlanItemRequest}
         */
        public UpdatePlanItemRequest build() {
            return new UpdatePlanItemRequest(name, description, status, pricingScheme, quantity,
                    cycles);
        }
    }
}
