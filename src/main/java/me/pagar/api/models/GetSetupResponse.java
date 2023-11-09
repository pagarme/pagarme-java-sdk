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

/**
 * This is a model class for GetSetupResponse type.
 */
public class GetSetupResponse {
    private OptionalNullable<String> id;
    private OptionalNullable<String> description;
    private OptionalNullable<Integer> amount;
    private OptionalNullable<String> status;

    /**
     * Default constructor.
     */
    public GetSetupResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  description  String value for description.
     * @param  amount  Integer value for amount.
     * @param  status  String value for status.
     */
    public GetSetupResponse(
            String id,
            String description,
            Integer amount,
            String status) {
        this.id = OptionalNullable.of(id);
        this.description = OptionalNullable.of(description);
        this.amount = OptionalNullable.of(amount);
        this.status = OptionalNullable.of(status);
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  description  String value for description.
     * @param  amount  Integer value for amount.
     * @param  status  String value for status.
     */

    protected GetSetupResponse(OptionalNullable<String> id, OptionalNullable<String> description,
            OptionalNullable<Integer> amount, OptionalNullable<String> status) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.status = status;
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
     * Internal Getter for Amount.
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
     * @return Returns the Integer
     */
    public Integer getAmount() {
        return OptionalNullable.getFrom(amount);
    }

    /**
     * Setter for Amount.
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = OptionalNullable.of(amount);
    }

    /**
     * UnSetter for Amount.
     */
    public void unsetAmount() {
        amount = null;
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
     * Converts this GetSetupResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetSetupResponse [" + "id=" + id + ", description=" + description + ", amount="
                + amount + ", status=" + status + "]";
    }

    /**
     * Builds a new {@link GetSetupResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetSetupResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id = internalGetId();
        builder.description = internalGetDescription();
        builder.amount = internalGetAmount();
        builder.status = internalGetStatus();
        return builder;
    }

    /**
     * Class to build instances of {@link GetSetupResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> id;
        private OptionalNullable<String> description;
        private OptionalNullable<Integer> amount;
        private OptionalNullable<String> status;



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
         * Builds a new {@link GetSetupResponse} object using the set fields.
         * @return {@link GetSetupResponse}
         */
        public GetSetupResponse build() {
            return new GetSetupResponse(id, description, amount, status);
        }
    }
}
