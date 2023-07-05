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
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for CreateBoletoPaymentRequest type.
 */
public class CreateBoletoPaymentRequest {
    private int retries;
    private OptionalNullable<String> bank;
    private String instructions;
    private OptionalNullable<LocalDateTime> dueAt;
    private CreateAddressRequest billingAddress;
    private OptionalNullable<String> billingAddressId;
    private OptionalNullable<String> nossoNumero;
    private String documentNumber;
    private String statementDescriptor;
    private OptionalNullable<CreateInterestRequest> interest;
    private OptionalNullable<CreateFineRequest> fine;
    private OptionalNullable<Integer> maxDaysToPayPastDue;

    /**
     * Default constructor.
     */
    public CreateBoletoPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  retries  int value for retries.
     * @param  instructions  String value for instructions.
     * @param  billingAddress  CreateAddressRequest value for billingAddress.
     * @param  documentNumber  String value for documentNumber.
     * @param  statementDescriptor  String value for statementDescriptor.
     * @param  bank  String value for bank.
     * @param  dueAt  LocalDateTime value for dueAt.
     * @param  billingAddressId  String value for billingAddressId.
     * @param  nossoNumero  String value for nossoNumero.
     * @param  interest  CreateInterestRequest value for interest.
     * @param  fine  CreateFineRequest value for fine.
     * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
     */
    public CreateBoletoPaymentRequest(
            int retries,
            String instructions,
            CreateAddressRequest billingAddress,
            String documentNumber,
            String statementDescriptor,
            String bank,
            LocalDateTime dueAt,
            String billingAddressId,
            String nossoNumero,
            CreateInterestRequest interest,
            CreateFineRequest fine,
            Integer maxDaysToPayPastDue) {
        this.retries = retries;
        this.bank = OptionalNullable.of(bank);
        this.instructions = instructions;
        this.dueAt = OptionalNullable.of(dueAt);
        this.billingAddress = billingAddress;
        this.billingAddressId = OptionalNullable.of(billingAddressId);
        this.nossoNumero = OptionalNullable.of(nossoNumero);
        this.documentNumber = documentNumber;
        this.statementDescriptor = statementDescriptor;
        this.interest = OptionalNullable.of(interest);
        this.fine = OptionalNullable.of(fine);
        this.maxDaysToPayPastDue = OptionalNullable.of(maxDaysToPayPastDue);
    }

    /**
     * Internal initialization constructor.
     */
    protected CreateBoletoPaymentRequest(int retries, String instructions,
            CreateAddressRequest billingAddress, String documentNumber, String statementDescriptor,
            OptionalNullable<String> bank, OptionalNullable<LocalDateTime> dueAt,
            OptionalNullable<String> billingAddressId, OptionalNullable<String> nossoNumero,
            OptionalNullable<CreateInterestRequest> interest,
            OptionalNullable<CreateFineRequest> fine,
            OptionalNullable<Integer> maxDaysToPayPastDue) {
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
     * Internal Getter for Bank.
     * The bank code, containing three characters. The available codes are on the API specification
     * @return Returns the Internal String
     */
    @JsonGetter("bank")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBank() {
        return this.bank;
    }

    /**
     * Getter for Bank.
     * The bank code, containing three characters. The available codes are on the API specification
     * @return Returns the String
     */
    public String getBank() {
        return OptionalNullable.getFrom(bank);
    }

    /**
     * Setter for Bank.
     * The bank code, containing three characters. The available codes are on the API specification
     * @param bank Value for String
     */
    @JsonSetter("bank")
    public void setBank(String bank) {
        this.bank = OptionalNullable.of(bank);
    }

    /**
     * UnSetter for Bank.
     * The bank code, containing three characters. The available codes are on the API specification
     */
    public void unsetBank() {
        bank = null;
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
     * Internal Getter for DueAt.
     * Boleto due date
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("due_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetDueAt() {
        return this.dueAt;
    }

    /**
     * Getter for DueAt.
     * Boleto due date
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getDueAt() {
        return OptionalNullable.getFrom(dueAt);
    }

    /**
     * Setter for DueAt.
     * Boleto due date
     * @param dueAt Value for LocalDateTime
     */
    @JsonSetter("due_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueAt(LocalDateTime dueAt) {
        this.dueAt = OptionalNullable.of(dueAt);
    }

    /**
     * UnSetter for DueAt.
     * Boleto due date
     */
    public void unsetDueAt() {
        dueAt = null;
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
     * Internal Getter for BillingAddressId.
     * The address id for the billing address
     * @return Returns the Internal String
     */
    @JsonGetter("billing_address_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBillingAddressId() {
        return this.billingAddressId;
    }

    /**
     * Getter for BillingAddressId.
     * The address id for the billing address
     * @return Returns the String
     */
    public String getBillingAddressId() {
        return OptionalNullable.getFrom(billingAddressId);
    }

    /**
     * Setter for BillingAddressId.
     * The address id for the billing address
     * @param billingAddressId Value for String
     */
    @JsonSetter("billing_address_id")
    public void setBillingAddressId(String billingAddressId) {
        this.billingAddressId = OptionalNullable.of(billingAddressId);
    }

    /**
     * UnSetter for BillingAddressId.
     * The address id for the billing address
     */
    public void unsetBillingAddressId() {
        billingAddressId = null;
    }

    /**
     * Internal Getter for NossoNumero.
     * Customer identification number with the bank
     * @return Returns the Internal String
     */
    @JsonGetter("nosso_numero")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetNossoNumero() {
        return this.nossoNumero;
    }

    /**
     * Getter for NossoNumero.
     * Customer identification number with the bank
     * @return Returns the String
     */
    public String getNossoNumero() {
        return OptionalNullable.getFrom(nossoNumero);
    }

    /**
     * Setter for NossoNumero.
     * Customer identification number with the bank
     * @param nossoNumero Value for String
     */
    @JsonSetter("nosso_numero")
    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = OptionalNullable.of(nossoNumero);
    }

    /**
     * UnSetter for NossoNumero.
     * Customer identification number with the bank
     */
    public void unsetNossoNumero() {
        nossoNumero = null;
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
     * Internal Getter for Interest.
     * @return Returns the Internal CreateInterestRequest
     */
    @JsonGetter("interest")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CreateInterestRequest> internalGetInterest() {
        return this.interest;
    }

    /**
     * Getter for Interest.
     * @return Returns the CreateInterestRequest
     */
    public CreateInterestRequest getInterest() {
        return OptionalNullable.getFrom(interest);
    }

    /**
     * Setter for Interest.
     * @param interest Value for CreateInterestRequest
     */
    @JsonSetter("interest")
    public void setInterest(CreateInterestRequest interest) {
        this.interest = OptionalNullable.of(interest);
    }

    /**
     * UnSetter for Interest.
     */
    public void unsetInterest() {
        interest = null;
    }

    /**
     * Internal Getter for Fine.
     * @return Returns the Internal CreateFineRequest
     */
    @JsonGetter("fine")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CreateFineRequest> internalGetFine() {
        return this.fine;
    }

    /**
     * Getter for Fine.
     * @return Returns the CreateFineRequest
     */
    public CreateFineRequest getFine() {
        return OptionalNullable.getFrom(fine);
    }

    /**
     * Setter for Fine.
     * @param fine Value for CreateFineRequest
     */
    @JsonSetter("fine")
    public void setFine(CreateFineRequest fine) {
        this.fine = OptionalNullable.of(fine);
    }

    /**
     * UnSetter for Fine.
     */
    public void unsetFine() {
        fine = null;
    }

    /**
     * Internal Getter for MaxDaysToPayPastDue.
     * @return Returns the Internal Integer
     */
    @JsonGetter("max_days_to_pay_past_due")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetMaxDaysToPayPastDue() {
        return this.maxDaysToPayPastDue;
    }

    /**
     * Getter for MaxDaysToPayPastDue.
     * @return Returns the Integer
     */
    public Integer getMaxDaysToPayPastDue() {
        return OptionalNullable.getFrom(maxDaysToPayPastDue);
    }

    /**
     * Setter for MaxDaysToPayPastDue.
     * @param maxDaysToPayPastDue Value for Integer
     */
    @JsonSetter("max_days_to_pay_past_due")
    public void setMaxDaysToPayPastDue(Integer maxDaysToPayPastDue) {
        this.maxDaysToPayPastDue = OptionalNullable.of(maxDaysToPayPastDue);
    }

    /**
     * UnSetter for MaxDaysToPayPastDue.
     */
    public void unsetMaxDaysToPayPastDue() {
        maxDaysToPayPastDue = null;
    }

    /**
     * Converts this CreateBoletoPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateBoletoPaymentRequest [" + "retries=" + retries + ", instructions="
                + instructions + ", billingAddress=" + billingAddress + ", documentNumber="
                + documentNumber + ", statementDescriptor=" + statementDescriptor + ", bank=" + bank
                + ", dueAt=" + dueAt + ", billingAddressId=" + billingAddressId + ", nossoNumero="
                + nossoNumero + ", interest=" + interest + ", fine=" + fine
                + ", maxDaysToPayPastDue=" + maxDaysToPayPastDue + "]";
    }

    /**
     * Builds a new {@link CreateBoletoPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateBoletoPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(retries, instructions, billingAddress, documentNumber,
                statementDescriptor);
        builder.bank = internalGetBank();
        builder.dueAt = internalGetDueAt();
        builder.billingAddressId = internalGetBillingAddressId();
        builder.nossoNumero = internalGetNossoNumero();
        builder.interest = internalGetInterest();
        builder.fine = internalGetFine();
        builder.maxDaysToPayPastDue = internalGetMaxDaysToPayPastDue();
        return builder;
    }

    /**
     * Class to build instances of {@link CreateBoletoPaymentRequest}.
     */
    public static class Builder {
        private int retries;
        private String instructions;
        private CreateAddressRequest billingAddress;
        private String documentNumber;
        private String statementDescriptor;
        private OptionalNullable<String> bank;
        private OptionalNullable<LocalDateTime> dueAt;
        private OptionalNullable<String> billingAddressId;
        private OptionalNullable<String> nossoNumero;
        private OptionalNullable<CreateInterestRequest> interest;
        private OptionalNullable<CreateFineRequest> fine;
        private OptionalNullable<Integer> maxDaysToPayPastDue;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  retries  int value for retries.
         * @param  instructions  String value for instructions.
         * @param  billingAddress  CreateAddressRequest value for billingAddress.
         * @param  documentNumber  String value for documentNumber.
         * @param  statementDescriptor  String value for statementDescriptor.
         */
        public Builder(int retries, String instructions, CreateAddressRequest billingAddress,
                String documentNumber, String statementDescriptor) {
            this.retries = retries;
            this.instructions = instructions;
            this.billingAddress = billingAddress;
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
         * Setter for bank.
         * @param  bank  String value for bank.
         * @return Builder
         */
        public Builder bank(String bank) {
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
         * Setter for dueAt.
         * @param  dueAt  LocalDateTime value for dueAt.
         * @return Builder
         */
        public Builder dueAt(LocalDateTime dueAt) {
            this.dueAt = OptionalNullable.of(dueAt);
            return this;
        }

        /**
         * UnSetter for dueAt.
         * @return Builder
         */
        public Builder unsetDueAt() {
            dueAt = null;
            return this;
        }

        /**
         * Setter for billingAddressId.
         * @param  billingAddressId  String value for billingAddressId.
         * @return Builder
         */
        public Builder billingAddressId(String billingAddressId) {
            this.billingAddressId = OptionalNullable.of(billingAddressId);
            return this;
        }

        /**
         * UnSetter for billingAddressId.
         * @return Builder
         */
        public Builder unsetBillingAddressId() {
            billingAddressId = null;
            return this;
        }

        /**
         * Setter for nossoNumero.
         * @param  nossoNumero  String value for nossoNumero.
         * @return Builder
         */
        public Builder nossoNumero(String nossoNumero) {
            this.nossoNumero = OptionalNullable.of(nossoNumero);
            return this;
        }

        /**
         * UnSetter for nossoNumero.
         * @return Builder
         */
        public Builder unsetNossoNumero() {
            nossoNumero = null;
            return this;
        }

        /**
         * Setter for interest.
         * @param  interest  CreateInterestRequest value for interest.
         * @return Builder
         */
        public Builder interest(CreateInterestRequest interest) {
            this.interest = OptionalNullable.of(interest);
            return this;
        }

        /**
         * UnSetter for interest.
         * @return Builder
         */
        public Builder unsetInterest() {
            interest = null;
            return this;
        }

        /**
         * Setter for fine.
         * @param  fine  CreateFineRequest value for fine.
         * @return Builder
         */
        public Builder fine(CreateFineRequest fine) {
            this.fine = OptionalNullable.of(fine);
            return this;
        }

        /**
         * UnSetter for fine.
         * @return Builder
         */
        public Builder unsetFine() {
            fine = null;
            return this;
        }

        /**
         * Setter for maxDaysToPayPastDue.
         * @param  maxDaysToPayPastDue  Integer value for maxDaysToPayPastDue.
         * @return Builder
         */
        public Builder maxDaysToPayPastDue(Integer maxDaysToPayPastDue) {
            this.maxDaysToPayPastDue = OptionalNullable.of(maxDaysToPayPastDue);
            return this;
        }

        /**
         * UnSetter for maxDaysToPayPastDue.
         * @return Builder
         */
        public Builder unsetMaxDaysToPayPastDue() {
            maxDaysToPayPastDue = null;
            return this;
        }

        /**
         * Builds a new {@link CreateBoletoPaymentRequest} object using the set fields.
         * @return {@link CreateBoletoPaymentRequest}
         */
        public CreateBoletoPaymentRequest build() {
            return new CreateBoletoPaymentRequest(retries, instructions, billingAddress,
                    documentNumber, statementDescriptor, bank, dueAt, billingAddressId, nossoNumero,
                    interest, fine, maxDaysToPayPastDue);
        }
    }
}
