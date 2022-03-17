/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for CreateCaptureChargeRequest type.
 */
public class CreateCaptureChargeRequest {
    private String code;
    private Integer amount;
    private List<CreateSplitRequest> split;
    private String operationReference;

    /**
     * Default constructor.
     */
    public CreateCaptureChargeRequest() {
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     * @param  operationReference  String value for operationReference.
     * @param  amount  Integer value for amount.
     * @param  split  List of CreateSplitRequest value for split.
     */
    public CreateCaptureChargeRequest(
            String code,
            String operationReference,
            Integer amount,
            List<CreateSplitRequest> split) {
        this.code = code;
        this.amount = amount;
        this.split = split;
        this.operationReference = operationReference;
    }

    /**
     * Getter for Code.
     * Code for the charge. Sending this field will update the code send on the charge and order
     * creation.
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Code for the charge. Sending this field will update the code send on the charge and order
     * creation.
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Amount.
     * The amount that will be captured
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The amount that will be captured
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for Split.
     * Splits
     * @return Returns the List of CreateSplitRequest
     */
    @JsonGetter("split")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreateSplitRequest> getSplit() {
        return split;
    }

    /**
     * Setter for Split.
     * Splits
     * @param split Value for List of CreateSplitRequest
     */
    @JsonSetter("split")
    public void setSplit(List<CreateSplitRequest> split) {
        this.split = split;
    }

    /**
     * Getter for OperationReference.
     * @return Returns the String
     */
    @JsonGetter("operation_reference")
    public String getOperationReference() {
        return operationReference;
    }

    /**
     * Setter for OperationReference.
     * @param operationReference Value for String
     */
    @JsonSetter("operation_reference")
    public void setOperationReference(String operationReference) {
        this.operationReference = operationReference;
    }

    /**
     * Converts this CreateCaptureChargeRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCaptureChargeRequest [" + "code=" + code + ", operationReference="
                + operationReference + ", amount=" + amount + ", split=" + split + "]";
    }

    /**
     * Builds a new {@link CreateCaptureChargeRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCaptureChargeRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(code, operationReference)
                .amount(getAmount())
                .split(getSplit());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCaptureChargeRequest}.
     */
    public static class Builder {
        private String code;
        private String operationReference;
        private Integer amount;
        private List<CreateSplitRequest> split;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  code  String value for code.
         * @param  operationReference  String value for operationReference.
         */
        public Builder(String code, String operationReference) {
            this.code = code;
            this.operationReference = operationReference;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for operationReference.
         * @param  operationReference  String value for operationReference.
         * @return Builder
         */
        public Builder operationReference(String operationReference) {
            this.operationReference = operationReference;
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
         * Setter for split.
         * @param  split  List of CreateSplitRequest value for split.
         * @return Builder
         */
        public Builder split(List<CreateSplitRequest> split) {
            this.split = split;
            return this;
        }

        /**
         * Builds a new {@link CreateCaptureChargeRequest} object using the set fields.
         * @return {@link CreateCaptureChargeRequest}
         */
        public CreateCaptureChargeRequest build() {
            return new CreateCaptureChargeRequest(code, operationReference, amount, split);
        }
    }
}
