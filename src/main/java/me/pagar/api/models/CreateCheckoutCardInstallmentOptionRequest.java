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
 * This is a model class for CreateCheckoutCardInstallmentOptionRequest type.
 */
public class CreateCheckoutCardInstallmentOptionRequest {
    private int number;
    private int total;

    /**
     * Default constructor.
     */
    public CreateCheckoutCardInstallmentOptionRequest() {
    }

    /**
     * Initialization constructor.
     * @param  number  int value for number.
     * @param  total  int value for total.
     */
    public CreateCheckoutCardInstallmentOptionRequest(
            int number,
            int total) {
        this.number = number;
        this.total = total;
    }

    /**
     * Getter for Number.
     * Installment quantity
     * @return Returns the int
     */
    @JsonGetter("number")
    public int getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * Installment quantity
     * @param number Value for int
     */
    @JsonSetter("number")
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Getter for Total.
     * Total amount
     * @return Returns the int
     */
    @JsonGetter("total")
    public int getTotal() {
        return total;
    }

    /**
     * Setter for Total.
     * Total amount
     * @param total Value for int
     */
    @JsonSetter("total")
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Converts this CreateCheckoutCardInstallmentOptionRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCheckoutCardInstallmentOptionRequest [" + "number=" + number + ", total="
                + total + "]";
    }

    /**
     * Builds a new {@link CreateCheckoutCardInstallmentOptionRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCheckoutCardInstallmentOptionRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(number, total);
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCheckoutCardInstallmentOptionRequest}.
     */
    public static class Builder {
        private int number;
        private int total;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  number  int value for number.
         * @param  total  int value for total.
         */
        public Builder(int number, int total) {
            this.number = number;
            this.total = total;
        }

        /**
         * Setter for number.
         * @param  number  int value for number.
         * @return Builder
         */
        public Builder number(int number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for total.
         * @param  total  int value for total.
         * @return Builder
         */
        public Builder total(int total) {
            this.total = total;
            return this;
        }

        /**
         * Builds a new {@link CreateCheckoutCardInstallmentOptionRequest} object using the set
         * fields.
         * @return {@link CreateCheckoutCardInstallmentOptionRequest}
         */
        public CreateCheckoutCardInstallmentOptionRequest build() {
            return new CreateCheckoutCardInstallmentOptionRequest(number, total);
        }
    }
}
