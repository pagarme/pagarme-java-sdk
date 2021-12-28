/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for CreateCancelChargeSplitRulesRequest type.
 */
public class CreateCancelChargeSplitRulesRequest {
    private String id;
    private int amount;
    private String type;

    /**
     * Default constructor.
     */
    public CreateCancelChargeSplitRulesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  amount  int value for amount.
     * @param  type  String value for type.
     */
    public CreateCancelChargeSplitRulesRequest(
            String id,
            int amount,
            String type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    /**
     * Getter for Id.
     * The split rule gateway id
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * The split rule gateway id
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Amount.
     * The split rule amount
     * @return Returns the int
     */
    @JsonGetter("Amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The split rule amount
     * @param amount Value for int
     */
    @JsonSetter("Amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter for Type.
     * The amount type (flat ou percentage)
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The amount type (flat ou percentage)
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Converts this CreateCancelChargeSplitRulesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCancelChargeSplitRulesRequest [" + "id=" + id + ", amount=" + amount
                + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link CreateCancelChargeSplitRulesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCancelChargeSplitRulesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, amount, type);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCancelChargeSplitRulesRequest}.
     */
    public static class Builder {
        private String id;
        private int amount;
        private String type;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  amount  int value for amount.
         * @param  type  String value for type.
         */
        public Builder(String id, int amount, String type) {
            this.id = id;
            this.amount = amount;
            this.type = type;
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
         * Setter for amount.
         * @param  amount  int value for amount.
         * @return Builder
         */
        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Builds a new {@link CreateCancelChargeSplitRulesRequest} object using the set fields.
         * @return {@link CreateCancelChargeSplitRulesRequest}
         */
        public CreateCancelChargeSplitRulesRequest build() {
            return new CreateCancelChargeSplitRulesRequest(id, amount, type);
        }
    }
}
