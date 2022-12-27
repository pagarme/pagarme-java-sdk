/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for GetInterestResponse type.
 */
public class GetInterestResponse {
    private Integer days;
    private String type;
    private Integer amount;

    /**
     * Default constructor.
     */
    public GetInterestResponse() {
    }

    /**
     * Initialization constructor.
     * @param  days  Integer value for days.
     * @param  type  String value for type.
     * @param  amount  Integer value for amount.
     */
    public GetInterestResponse(
            Integer days,
            String type,
            Integer amount) {
        this.days = days;
        this.type = type;
        this.amount = amount;
    }

    /**
     * Getter for Days.
     * Days
     * @return Returns the Integer
     */
    @JsonGetter("days")
    public Integer getDays() {
        return days;
    }

    /**
     * Setter for Days.
     * Days
     * @param days Value for Integer
     */
    @JsonSetter("days")
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * Getter for Type.
     * Type
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Amount.
     * Amount
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Converts this GetInterestResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetInterestResponse [" + "days=" + days + ", type=" + type + ", amount=" + amount
                + "]";
    }

    /**
     * Builds a new {@link GetInterestResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetInterestResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(days, type, amount);
        return builder;
    }

    /**
     * Class to build instances of {@link GetInterestResponse}.
     */
    public static class Builder {
        private Integer days;
        private String type;
        private Integer amount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  days  Integer value for days.
         * @param  type  String value for type.
         * @param  amount  Integer value for amount.
         */
        public Builder(Integer days, String type, Integer amount) {
            this.days = days;
            this.type = type;
            this.amount = amount;
        }

        /**
         * Setter for days.
         * @param  days  Integer value for days.
         * @return Builder
         */
        public Builder days(Integer days) {
            this.days = days;
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
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Builds a new {@link GetInterestResponse} object using the set fields.
         * @return {@link GetInterestResponse}
         */
        public GetInterestResponse build() {
            return new GetInterestResponse(days, type, amount);
        }
    }
}
