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
 * This is a model class for CreateFineRequest type.
 */
public class CreateFineRequest {
    private int days;
    private String type;
    private int amount;

    /**
     * Default constructor.
     */
    public CreateFineRequest() {
    }

    /**
     * Initialization constructor.
     * @param  days  int value for days.
     * @param  type  String value for type.
     * @param  amount  int value for amount.
     */
    public CreateFineRequest(
            int days,
            String type,
            int amount) {
        this.days = days;
        this.type = type;
        this.amount = amount;
    }

    /**
     * Getter for Days.
     * Days
     * @return Returns the int
     */
    @JsonGetter("days")
    public int getDays() {
        return days;
    }

    /**
     * Setter for Days.
     * Days
     * @param days Value for int
     */
    @JsonSetter("days")
    public void setDays(int days) {
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
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Converts this CreateFineRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateFineRequest [" + "days=" + days + ", type=" + type + ", amount=" + amount
                + "]";
    }

    /**
     * Builds a new {@link CreateFineRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateFineRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(days, type, amount);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateFineRequest}.
     */
    public static class Builder {
        private int days;
        private String type;
        private int amount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  days  int value for days.
         * @param  type  String value for type.
         * @param  amount  int value for amount.
         */
        public Builder(int days, String type, int amount) {
            this.days = days;
            this.type = type;
            this.amount = amount;
        }

        /**
         * Setter for days.
         * @param  days  int value for days.
         * @return Builder
         */
        public Builder days(int days) {
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
         * @param  amount  int value for amount.
         * @return Builder
         */
        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Builds a new {@link CreateFineRequest} object using the set fields.
         * @return {@link CreateFineRequest}
         */
        public CreateFineRequest build() {
            return new CreateFineRequest(days, type, amount);
        }
    }
}
