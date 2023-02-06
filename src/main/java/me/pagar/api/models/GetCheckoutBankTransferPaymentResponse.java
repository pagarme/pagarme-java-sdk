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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for GetCheckoutBankTransferPaymentResponse type.
 */
public class GetCheckoutBankTransferPaymentResponse {
    private OptionalNullable<List<String>> bank;

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
        this.bank = OptionalNullable.of(bank);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetCheckoutBankTransferPaymentResponse(OptionalNullable<List<String>> bank) {
        this.bank = bank;
    }

    /**
     * Internal Getter for Bank.
     * bank list response
     * @return Returns the Internal List of String
     */
    @JsonGetter("bank")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetBank() {
        return this.bank;
    }

    /**
     * Getter for Bank.
     * bank list response
     * @return Returns the List of String
     */
    public List<String> getBank() {
        return OptionalNullable.getFrom(bank);
    }

    /**
     * Setter for Bank.
     * bank list response
     * @param bank Value for List of String
     */
    @JsonSetter("bank")
    public void setBank(List<String> bank) {
        this.bank = OptionalNullable.of(bank);
    }

    /**
     * UnSetter for Bank.
     * bank list response
     */
    public void unsetBank() {
        bank = null;
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
        Builder builder = new Builder();
        builder.bank = internalGetBank();
        return builder;
    }

    /**
     * Class to build instances of {@link GetCheckoutBankTransferPaymentResponse}.
     */
    public static class Builder {
        private OptionalNullable<List<String>> bank;



        /**
         * Setter for bank.
         * @param  bank  List of String value for bank.
         * @return Builder
         */
        public Builder bank(List<String> bank) {
            this.bank = OptionalNullable.of(bank);
            return this;
        }

        /**
         * UnSetter for bank.
         * @return Builder
         */
        public Builder unsetBank() {
            bank = null;
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
