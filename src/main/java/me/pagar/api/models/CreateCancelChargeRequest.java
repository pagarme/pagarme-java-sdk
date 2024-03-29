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
 * This is a model class for CreateCancelChargeRequest type.
 */
public class CreateCancelChargeRequest {
    private Integer amount;
    private List<CreateCancelChargeSplitRulesRequest> splitRules;
    private List<CreateSplitRequest> split;
    private String operationReference;
    private CreateBankAccountRefundingDTO bankAccount;

    /**
     * Default constructor.
     */
    public CreateCancelChargeRequest() {
    }

    /**
     * Initialization constructor.
     * @param  operationReference  String value for operationReference.
     * @param  amount  Integer value for amount.
     * @param  splitRules  List of CreateCancelChargeSplitRulesRequest value for splitRules.
     * @param  split  List of CreateSplitRequest value for split.
     * @param  bankAccount  CreateBankAccountRefundingDTO value for bankAccount.
     */
    public CreateCancelChargeRequest(
            String operationReference,
            Integer amount,
            List<CreateCancelChargeSplitRulesRequest> splitRules,
            List<CreateSplitRequest> split,
            CreateBankAccountRefundingDTO bankAccount) {
        this.amount = amount;
        this.splitRules = splitRules;
        this.split = split;
        this.operationReference = operationReference;
        this.bankAccount = bankAccount;
    }

    /**
     * Getter for Amount.
     * The amount that will be canceled.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The amount that will be canceled.
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for SplitRules.
     * The split rules request
     * @return Returns the List of CreateCancelChargeSplitRulesRequest
     */
    @JsonGetter("split_rules")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CreateCancelChargeSplitRulesRequest> getSplitRules() {
        return splitRules;
    }

    /**
     * Setter for SplitRules.
     * The split rules request
     * @param splitRules Value for List of CreateCancelChargeSplitRulesRequest
     */
    @JsonSetter("split_rules")
    public void setSplitRules(List<CreateCancelChargeSplitRulesRequest> splitRules) {
        this.splitRules = splitRules;
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
     * Getter for BankAccount.
     * @return Returns the CreateBankAccountRefundingDTO
     */
    @JsonGetter("bank_account")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateBankAccountRefundingDTO getBankAccount() {
        return bankAccount;
    }

    /**
     * Setter for BankAccount.
     * @param bankAccount Value for CreateBankAccountRefundingDTO
     */
    @JsonSetter("bank_account")
    public void setBankAccount(CreateBankAccountRefundingDTO bankAccount) {
        this.bankAccount = bankAccount;
    }

    /**
     * Converts this CreateCancelChargeRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCancelChargeRequest [" + "operationReference=" + operationReference
                + ", amount=" + amount + ", splitRules=" + splitRules + ", split=" + split
                + ", bankAccount=" + bankAccount + "]";
    }

    /**
     * Builds a new {@link CreateCancelChargeRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCancelChargeRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(operationReference)
                .amount(getAmount())
                .splitRules(getSplitRules())
                .split(getSplit())
                .bankAccount(getBankAccount());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCancelChargeRequest}.
     */
    public static class Builder {
        private String operationReference;
        private Integer amount;
        private List<CreateCancelChargeSplitRulesRequest> splitRules;
        private List<CreateSplitRequest> split;
        private CreateBankAccountRefundingDTO bankAccount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  operationReference  String value for operationReference.
         */
        public Builder(String operationReference) {
            this.operationReference = operationReference;
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
         * Setter for splitRules.
         * @param  splitRules  List of CreateCancelChargeSplitRulesRequest value for splitRules.
         * @return Builder
         */
        public Builder splitRules(List<CreateCancelChargeSplitRulesRequest> splitRules) {
            this.splitRules = splitRules;
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
         * Setter for bankAccount.
         * @param  bankAccount  CreateBankAccountRefundingDTO value for bankAccount.
         * @return Builder
         */
        public Builder bankAccount(CreateBankAccountRefundingDTO bankAccount) {
            this.bankAccount = bankAccount;
            return this;
        }

        /**
         * Builds a new {@link CreateCancelChargeRequest} object using the set fields.
         * @return {@link CreateCancelChargeRequest}
         */
        public CreateCancelChargeRequest build() {
            return new CreateCancelChargeRequest(operationReference, amount, splitRules, split,
                    bankAccount);
        }
    }
}
