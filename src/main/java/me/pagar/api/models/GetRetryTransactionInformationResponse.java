/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDateTime;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetRetryTransactionInformationResponse type.
 */
public class GetRetryTransactionInformationResponse {
    private String brandFailureReturnCode;
    private Integer transactionLimit;
    private LocalDateTime transactionDateLimit;

    /**
     * Default constructor.
     */
    public GetRetryTransactionInformationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  brandFailureReturnCode  String value for brandFailureReturnCode.
     * @param  transactionLimit  Integer value for transactionLimit.
     * @param  transactionDateLimit  LocalDateTime value for transactionDateLimit.
     */
    public GetRetryTransactionInformationResponse(
            String brandFailureReturnCode,
            Integer transactionLimit,
            LocalDateTime transactionDateLimit) {
        this.brandFailureReturnCode = brandFailureReturnCode;
        this.transactionLimit = transactionLimit;
        this.transactionDateLimit = transactionDateLimit;
    }

    /**
     * Getter for BrandFailureReturnCode.
     * @return Returns the String
     */
    @JsonGetter("brand_failure_return_code")
    public String getBrandFailureReturnCode() {
        return brandFailureReturnCode;
    }

    /**
     * Setter for BrandFailureReturnCode.
     * @param brandFailureReturnCode Value for String
     */
    @JsonSetter("brand_failure_return_code")
    public void setBrandFailureReturnCode(String brandFailureReturnCode) {
        this.brandFailureReturnCode = brandFailureReturnCode;
    }

    /**
     * Getter for TransactionLimit.
     * @return Returns the Integer
     */
    @JsonGetter("transaction_limit")
    public Integer getTransactionLimit() {
        return transactionLimit;
    }

    /**
     * Setter for TransactionLimit.
     * @param transactionLimit Value for Integer
     */
    @JsonSetter("transaction_limit")
    public void setTransactionLimit(Integer transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    /**
     * Getter for TransactionDateLimit.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("transaction_date_limit")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getTransactionDateLimit() {
        return transactionDateLimit;
    }

    /**
     * Setter for TransactionDateLimit.
     * @param transactionDateLimit Value for LocalDateTime
     */
    @JsonSetter("transaction_date_limit")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setTransactionDateLimit(LocalDateTime transactionDateLimit) {
        this.transactionDateLimit = transactionDateLimit;
    }

    /**
     * Converts this GetRetryTransactionInformationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetRetryTransactionInformationResponse [" + "brandFailureReturnCode="
                + brandFailureReturnCode + ", transactionLimit=" + transactionLimit
                + ", transactionDateLimit=" + transactionDateLimit + "]";
    }

    /**
     * Builds a new {@link GetRetryTransactionInformationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetRetryTransactionInformationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(brandFailureReturnCode, transactionLimit,
                transactionDateLimit);
        return builder;
    }

    /**
     * Class to build instances of {@link GetRetryTransactionInformationResponse}.
     */
    public static class Builder {
        private String brandFailureReturnCode;
        private Integer transactionLimit;
        private LocalDateTime transactionDateLimit;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  brandFailureReturnCode  String value for brandFailureReturnCode.
         * @param  transactionLimit  Integer value for transactionLimit.
         * @param  transactionDateLimit  LocalDateTime value for transactionDateLimit.
         */
        public Builder(String brandFailureReturnCode, Integer transactionLimit,
                LocalDateTime transactionDateLimit) {
            this.brandFailureReturnCode = brandFailureReturnCode;
            this.transactionLimit = transactionLimit;
            this.transactionDateLimit = transactionDateLimit;
        }

        /**
         * Setter for brandFailureReturnCode.
         * @param  brandFailureReturnCode  String value for brandFailureReturnCode.
         * @return Builder
         */
        public Builder brandFailureReturnCode(String brandFailureReturnCode) {
            this.brandFailureReturnCode = brandFailureReturnCode;
            return this;
        }

        /**
         * Setter for transactionLimit.
         * @param  transactionLimit  Integer value for transactionLimit.
         * @return Builder
         */
        public Builder transactionLimit(Integer transactionLimit) {
            this.transactionLimit = transactionLimit;
            return this;
        }

        /**
         * Setter for transactionDateLimit.
         * @param  transactionDateLimit  LocalDateTime value for transactionDateLimit.
         * @return Builder
         */
        public Builder transactionDateLimit(LocalDateTime transactionDateLimit) {
            this.transactionDateLimit = transactionDateLimit;
            return this;
        }

        /**
         * Builds a new {@link GetRetryTransactionInformationResponse} object using the set fields.
         * @return {@link GetRetryTransactionInformationResponse}
         */
        public GetRetryTransactionInformationResponse build() {
            return new GetRetryTransactionInformationResponse(brandFailureReturnCode,
                    transactionLimit, transactionDateLimit);
        }
    }
}
