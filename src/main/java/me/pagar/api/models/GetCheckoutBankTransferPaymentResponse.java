/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for GetCheckoutBankTransferPaymentResponse type.
 */
public class GetCheckoutBankTransferPaymentResponse {
    private List<String> bank;

    /**
     * Default constructor.
     */
    public GetCheckoutBankTransferPaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  bank  List of String value for bank.
     */
    public GetCheckoutBankTransferPaymentResponse(
            List<String> bank) {
        this.bank = bank;
    }

    /**
     * Getter for Bank.
     * bank list response
     * @return Returns the List of String
     */
    @JsonGetter("bank")
    public List<String> getBank() {
        return bank;
    }

    /**
     * Setter for Bank.
     * bank list response
     * @param bank Value for List of String
     */
    @JsonSetter("bank")
    public void setBank(List<String> bank) {
        this.bank = bank;
    }

    /**
     * Converts this GetCheckoutBankTransferPaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCheckoutBankTransferPaymentResponse [" + "bank=" + bank + "]";
    }

    /**
     * Builds a new {@link GetCheckoutBankTransferPaymentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCheckoutBankTransferPaymentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(bank);
        return builder;
    }

    /**
     * Class to build instances of {@link GetCheckoutBankTransferPaymentResponse}.
     */
    public static class Builder {
        private List<String> bank;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  bank  List of String value for bank.
         */
        public Builder(List<String> bank) {
            this.bank = bank;
        }

        /**
         * Setter for bank.
         * @param  bank  List of String value for bank.
         * @return Builder
         */
        public Builder bank(List<String> bank) {
            this.bank = bank;
            return this;
        }

        /**
         * Builds a new {@link GetCheckoutBankTransferPaymentResponse} object using the set fields.
         * @return {@link GetCheckoutBankTransferPaymentResponse}
         */
        public GetCheckoutBankTransferPaymentResponse build() {
            return new GetCheckoutBankTransferPaymentResponse(bank);
        }
    }
}
