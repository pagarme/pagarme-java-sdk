/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for CreateBoletoPaymentRequest type.
 */
public class CreateBoletoPaymentRequest {
    private int retries;
    private String bank;
    private String instructions;
    private LocalDateTime dueAt;
    private CreateAddressRequest billingAddress;
    private String billingAddressId;
    private String nossoNumero;
    private String documentNumber;
    private String statementDescriptor;
    private CreateInterestRequest interest;
    private CreateFineRequest fine;
    private Integer maxDaysToPayPastDue;

    /**
     * Default constructor.
     */
    public CreateBoletoPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  retries  int value for retries.
     * @param  bank  String value for bank.
     * @param  instructions  String value for instructions.
     * @param  billingAddress  CreateAddressRequest value for billingAddress.
     * @param  billingAddressId  String value for billingAddressId.
     * @param  documentNumber  String value for documentNumber.
     * @param  statementDescriptor  String value for statementDescriptor.
     * @param  dueAt  LocalDateTime value for dueAt.
     * @param  nossoNumero  String value for nossoNumero.
     * @param  interest  CreateInterestRequest value for interest.
     * @param  fine  CreateFineRequest value for fine.
     * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
     */
    public CreateBoletoPaymentRequest(
            int retries,
            String bank,
            String instructions,
            CreateAddressRequest billingAddress,
            String billingAddressId,
            String documentNumber,
            String statementDescriptor,
            LocalDateTime dueAt,
            String nossoNumero,
            CreateInterestRequest interest,
            CreateFineRequest fine,
            Integer maxDaysToPayPastDue) {
        this.retries = retries;
        this.bank = bank;
        this.instructions = instructions;
        this.dueAt = dueAt;
        this.billingAddress = billingAddress;
        this.billingAddressId = billingAddressId;
        this.nossoNumero = nossoNumero;
        this.documentNumber = documentNumber;
        this.statementDescriptor = statementDescriptor;
        this.interest = interest;
        this.fine = fine;
        this.maxDaysToPayPastDue = maxDaysToPayPastDue;
    }

    /**
     * Getter for Retries.
     * Number of retries
     * @return Returns the int
     */
    @JsonGetter("retries")
    public int getRetries() {
        return retries;
    }

    /**
     * Setter for Retries.
     * Number of retries
     * @param retries Value for int
     */
    @JsonSetter("retries")
    public void setRetries(int retries) {
        this.retries = retries;
    }

    /**
     * Getter for Bank.
     * The bank code, containing three characters. The available codes are on the API specification
     * @return Returns the String
     */
    @JsonGetter("bank")
    public String getBank() {
        return bank;
    }

    /**
     * Setter for Bank.
     * The bank code, containing three characters. The available codes are on the API specification
     * @param bank Value for String
     */
    @JsonSetter("bank")
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * Getter for Instructions.
     * The instructions field that will be printed on the boleto.
     * @return Returns the String
     */
    @JsonGetter("instructions")
    public String getInstructions() {
        return instructions;
    }

    /**
     * Setter for Instructions.
     * The instructions field that will be printed on the boleto.
     * @param instructions Value for String
     */
    @JsonSetter("instructions")
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * Getter for DueAt.
     * Boleto due date
     * @return Returns the LocalDateTime
     */
    @JsonGetter("due_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDueAt() {
        return dueAt;
    }

    /**
     * Setter for DueAt.
     * Boleto due date
     * @param dueAt Value for LocalDateTime
     */
    @JsonSetter("due_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueAt(LocalDateTime dueAt) {
        this.dueAt = dueAt;
    }

    /**
     * Getter for BillingAddress.
     * Card's billing address
     * @return Returns the CreateAddressRequest
     */
    @JsonGetter("billing_address")
    public CreateAddressRequest getBillingAddress() {
        return billingAddress;
    }

    /**
     * Setter for BillingAddress.
     * Card's billing address
     * @param billingAddress Value for CreateAddressRequest
     */
    @JsonSetter("billing_address")
    public void setBillingAddress(CreateAddressRequest billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * Getter for BillingAddressId.
     * The address id for the billing address
     * @return Returns the String
     */
    @JsonGetter("billing_address_id")
    public String getBillingAddressId() {
        return billingAddressId;
    }

    /**
     * Setter for BillingAddressId.
     * The address id for the billing address
     * @param billingAddressId Value for String
     */
    @JsonSetter("billing_address_id")
    public void setBillingAddressId(String billingAddressId) {
        this.billingAddressId = billingAddressId;
    }

    /**
     * Getter for NossoNumero.
     * Customer identification number with the bank
     * @return Returns the String
     */
    @JsonGetter("nosso_numero")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNossoNumero() {
        return nossoNumero;
    }

    /**
     * Setter for NossoNumero.
     * Customer identification number with the bank
     * @param nossoNumero Value for String
     */
    @JsonSetter("nosso_numero")
    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    /**
     * Getter for DocumentNumber.
     * Boleto identification
     * @return Returns the String
     */
    @JsonGetter("document_number")
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Setter for DocumentNumber.
     * Boleto identification
     * @param documentNumber Value for String
     */
    @JsonSetter("document_number")
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /**
     * Getter for StatementDescriptor.
     * Soft Descriptor
     * @return Returns the String
     */
    @JsonGetter("statement_descriptor")
    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    /**
     * Setter for StatementDescriptor.
     * Soft Descriptor
     * @param statementDescriptor Value for String
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Getter for Interest.
     * @return Returns the CreateInterestRequest
     */
    @JsonGetter("interest")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateInterestRequest getInterest() {
        return interest;
    }

    /**
     * Setter for Interest.
     * @param interest Value for CreateInterestRequest
     */
    @JsonSetter("interest")
    public void setInterest(CreateInterestRequest interest) {
        this.interest = interest;
    }

    /**
     * Getter for Fine.
     * @return Returns the CreateFineRequest
     */
    @JsonGetter("fine")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateFineRequest getFine() {
        return fine;
    }

    /**
     * Setter for Fine.
     * @param fine Value for CreateFineRequest
     */
    @JsonSetter("fine")
    public void setFine(CreateFineRequest fine) {
        this.fine = fine;
    }

    /**
     * Getter for MaxDaysToPayPastDue.
     * @return Returns the Integer
     */
    @JsonGetter("max_days_to_pay_past_due")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMaxDaysToPayPastDue() {
        return maxDaysToPayPastDue;
    }

    /**
     * Setter for MaxDaysToPayPastDue.
     * @param maxDaysToPayPastDue Value for Integer
     */
    @JsonSetter("max_days_to_pay_past_due")
    public void setMaxDaysToPayPastDue(Integer maxDaysToPayPastDue) {
        this.maxDaysToPayPastDue = maxDaysToPayPastDue;
    }

    /**
     * Converts this CreateBoletoPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateBoletoPaymentRequest [" + "retries=" + retries + ", bank=" + bank
                + ", instructions=" + instructions + ", billingAddress=" + billingAddress
                + ", billingAddressId=" + billingAddressId + ", documentNumber=" + documentNumber
                + ", statementDescriptor=" + statementDescriptor + ", dueAt=" + dueAt
                + ", nossoNumero=" + nossoNumero + ", interest=" + interest + ", fine=" + fine
                + ", maxDaysToPayPastDue=" + maxDaysToPayPastDue + "]";
    }

    /**
     * Builds a new {@link CreateBoletoPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateBoletoPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(retries, bank, instructions, billingAddress, billingAddressId,
                documentNumber, statementDescriptor)
                .dueAt(getDueAt())
                .nossoNumero(getNossoNumero())
                .interest(getInterest())
                .fine(getFine())
                .maxDaysToPayPastDue(getMaxDaysToPayPastDue());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateBoletoPaymentRequest}.
     */
    public static class Builder {
        private int retries;
        private String bank;
        private String instructions;
        private CreateAddressRequest billingAddress;
        private String billingAddressId;
        private String documentNumber;
        private String statementDescriptor;
        private LocalDateTime dueAt;
        private String nossoNumero;
        private CreateInterestRequest interest;
        private CreateFineRequest fine;
        private Integer maxDaysToPayPastDue;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  retries  int value for retries.
         * @param  bank  String value for bank.
         * @param  instructions  String value for instructions.
         * @param  billingAddress  CreateAddressRequest value for billingAddress.
         * @param  billingAddressId  String value for billingAddressId.
         * @param  documentNumber  String value for documentNumber.
         * @param  statementDescriptor  String value for statementDescriptor.
         */
        public Builder(int retries, String bank, String instructions,
                CreateAddressRequest billingAddress, String billingAddressId, String documentNumber,
                String statementDescriptor) {
            this.retries = retries;
            this.bank = bank;
            this.instructions = instructions;
            this.billingAddress = billingAddress;
            this.billingAddressId = billingAddressId;
            this.documentNumber = documentNumber;
            this.statementDescriptor = statementDescriptor;
        }

        /**
         * Setter for retries.
         * @param  retries  int value for retries.
         * @return Builder
         */
        public Builder retries(int retries) {
            this.retries = retries;
            return this;
        }

        /**
         * Setter for bank.
         * @param  bank  String value for bank.
         * @return Builder
         */
        public Builder bank(String bank) {
            this.bank = bank;
            return this;
        }

        /**
         * Setter for instructions.
         * @param  instructions  String value for instructions.
         * @return Builder
         */
        public Builder instructions(String instructions) {
            this.instructions = instructions;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  CreateAddressRequest value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(CreateAddressRequest billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for billingAddressId.
         * @param  billingAddressId  String value for billingAddressId.
         * @return Builder
         */
        public Builder billingAddressId(String billingAddressId) {
            this.billingAddressId = billingAddressId;
            return this;
        }

        /**
         * Setter for documentNumber.
         * @param  documentNumber  String value for documentNumber.
         * @return Builder
         */
        public Builder documentNumber(String documentNumber) {
            this.documentNumber = documentNumber;
            return this;
        }

        /**
         * Setter for statementDescriptor.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @return Builder
         */
        public Builder statementDescriptor(String statementDescriptor) {
            this.statementDescriptor = statementDescriptor;
            return this;
        }

        /**
         * Setter for dueAt.
         * @param  dueAt  LocalDateTime value for dueAt.
         * @return Builder
         */
        public Builder dueAt(LocalDateTime dueAt) {
            this.dueAt = dueAt;
            return this;
        }

        /**
         * Setter for nossoNumero.
         * @param  nossoNumero  String value for nossoNumero.
         * @return Builder
         */
        public Builder nossoNumero(String nossoNumero) {
            this.nossoNumero = nossoNumero;
            return this;
        }

        /**
         * Setter for interest.
         * @param  interest  CreateInterestRequest value for interest.
         * @return Builder
         */
        public Builder interest(CreateInterestRequest interest) {
            this.interest = interest;
            return this;
        }

        /**
         * Setter for fine.
         * @param  fine  CreateFineRequest value for fine.
         * @return Builder
         */
        public Builder fine(CreateFineRequest fine) {
            this.fine = fine;
            return this;
        }

        /**
         * Setter for maxDaysToPayPastDue.
         * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
         * @return Builder
         */
        public Builder maxDaysToPayPastDue(Integer maxDaysToPayPastDue) {
            this.maxDaysToPayPastDue = maxDaysToPayPastDue;
            return this;
        }

        /**
         * Builds a new {@link CreateBoletoPaymentRequest} object using the set fields.
         * @return {@link CreateBoletoPaymentRequest}
         */
        public CreateBoletoPaymentRequest build() {
            return new CreateBoletoPaymentRequest(retries, bank, instructions, billingAddress,
                    billingAddressId, documentNumber, statementDescriptor, dueAt, nossoNumero,
                    interest, fine, maxDaysToPayPastDue);
        }
    }
}
