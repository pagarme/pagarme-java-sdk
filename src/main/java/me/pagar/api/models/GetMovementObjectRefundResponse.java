/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for GetMovementObjectRefundResponse type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "object",
        defaultImpl = GetMovementObjectRefundResponse.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class GetMovementObjectRefundResponse
        extends GetMovementObjectBaseResponse {
    private OptionalNullable<String> fraudCoverageFee;
    private OptionalNullable<String> chargeFeeRecipientId;
    private OptionalNullable<String> bankAccountId;
    private OptionalNullable<String> localTransactionId;
    private OptionalNullable<String> updatedAt;

    /**
     * Default constructor.
     */
    public GetMovementObjectRefundResponse() {
        super();
        setObject("refund");
    }

    /**
     * Initialization constructor.
     * @param  object  String value for object.
     * @param  id  String value for id.
     * @param  status  String value for status.
     * @param  amount  String value for amount.
     * @param  createdAt  String value for createdAt.
     * @param  type  String value for type.
     * @param  chargeId  String value for chargeId.
     * @param  gatewayId  String value for gatewayId.
     * @param  fraudCoverageFee  String value for fraudCoverageFee.
     * @param  chargeFeeRecipientId  String value for chargeFeeRecipientId.
     * @param  bankAccountId  String value for bankAccountId.
     * @param  localTransactionId  String value for localTransactionId.
     * @param  updatedAt  String value for updatedAt.
     */
    public GetMovementObjectRefundResponse(
            String object,
            String id,
            String status,
            String amount,
            String createdAt,
            String type,
            String chargeId,
            String gatewayId,
            String fraudCoverageFee,
            String chargeFeeRecipientId,
            String bankAccountId,
            String localTransactionId,
            String updatedAt) {
        super(object, id, status, amount, createdAt, type, chargeId, gatewayId);
        this.fraudCoverageFee = OptionalNullable.of(fraudCoverageFee);
        this.chargeFeeRecipientId = OptionalNullable.of(chargeFeeRecipientId);
        this.bankAccountId = OptionalNullable.of(bankAccountId);
        this.localTransactionId = OptionalNullable.of(localTransactionId);
        this.updatedAt = OptionalNullable.of(updatedAt);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetMovementObjectRefundResponse(String object, OptionalNullable<String> id,
            OptionalNullable<String> status, OptionalNullable<String> amount,
            OptionalNullable<String> createdAt, OptionalNullable<String> type,
            OptionalNullable<String> chargeId, OptionalNullable<String> gatewayId,
            OptionalNullable<String> fraudCoverageFee,
            OptionalNullable<String> chargeFeeRecipientId, OptionalNullable<String> bankAccountId,
            OptionalNullable<String> localTransactionId, OptionalNullable<String> updatedAt) {
        super(object, id, status, amount, createdAt, type, chargeId, gatewayId);
        this.fraudCoverageFee = fraudCoverageFee;
        this.chargeFeeRecipientId = chargeFeeRecipientId;
        this.bankAccountId = bankAccountId;
        this.localTransactionId = localTransactionId;
        this.updatedAt = updatedAt;
    }

    /**
     * Internal Getter for FraudCoverageFee.
     * @return Returns the Internal String
     */
    @JsonGetter("fraud_coverage_fee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFraudCoverageFee() {
        return this.fraudCoverageFee;
    }

    /**
     * Getter for FraudCoverageFee.
     * @return Returns the String
     */
    public String getFraudCoverageFee() {
        return OptionalNullable.getFrom(fraudCoverageFee);
    }

    /**
     * Setter for FraudCoverageFee.
     * @param fraudCoverageFee Value for String
     */
    @JsonSetter("fraud_coverage_fee")
    public void setFraudCoverageFee(String fraudCoverageFee) {
        this.fraudCoverageFee = OptionalNullable.of(fraudCoverageFee);
    }

    /**
     * UnSetter for FraudCoverageFee.
     */
    public void unsetFraudCoverageFee() {
        fraudCoverageFee = null;
    }

    /**
     * Internal Getter for ChargeFeeRecipientId.
     * @return Returns the Internal String
     */
    @JsonGetter("charge_fee_recipient_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetChargeFeeRecipientId() {
        return this.chargeFeeRecipientId;
    }

    /**
     * Getter for ChargeFeeRecipientId.
     * @return Returns the String
     */
    public String getChargeFeeRecipientId() {
        return OptionalNullable.getFrom(chargeFeeRecipientId);
    }

    /**
     * Setter for ChargeFeeRecipientId.
     * @param chargeFeeRecipientId Value for String
     */
    @JsonSetter("charge_fee_recipient_id")
    public void setChargeFeeRecipientId(String chargeFeeRecipientId) {
        this.chargeFeeRecipientId = OptionalNullable.of(chargeFeeRecipientId);
    }

    /**
     * UnSetter for ChargeFeeRecipientId.
     */
    public void unsetChargeFeeRecipientId() {
        chargeFeeRecipientId = null;
    }

    /**
     * Internal Getter for BankAccountId.
     * @return Returns the Internal String
     */
    @JsonGetter("bank_account_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBankAccountId() {
        return this.bankAccountId;
    }

    /**
     * Getter for BankAccountId.
     * @return Returns the String
     */
    public String getBankAccountId() {
        return OptionalNullable.getFrom(bankAccountId);
    }

    /**
     * Setter for BankAccountId.
     * @param bankAccountId Value for String
     */
    @JsonSetter("bank_account_id")
    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = OptionalNullable.of(bankAccountId);
    }

    /**
     * UnSetter for BankAccountId.
     */
    public void unsetBankAccountId() {
        bankAccountId = null;
    }

    /**
     * Internal Getter for LocalTransactionId.
     * @return Returns the Internal String
     */
    @JsonGetter("local_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetLocalTransactionId() {
        return this.localTransactionId;
    }

    /**
     * Getter for LocalTransactionId.
     * @return Returns the String
     */
    public String getLocalTransactionId() {
        return OptionalNullable.getFrom(localTransactionId);
    }

    /**
     * Setter for LocalTransactionId.
     * @param localTransactionId Value for String
     */
    @JsonSetter("local_transaction_id")
    public void setLocalTransactionId(String localTransactionId) {
        this.localTransactionId = OptionalNullable.of(localTransactionId);
    }

    /**
     * UnSetter for LocalTransactionId.
     */
    public void unsetLocalTransactionId() {
        localTransactionId = null;
    }

    /**
     * Internal Getter for UpdatedAt.
     * @return Returns the Internal String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    public String getUpdatedAt() {
        return OptionalNullable.getFrom(updatedAt);
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = OptionalNullable.of(updatedAt);
    }

    /**
     * UnSetter for UpdatedAt.
     */
    public void unsetUpdatedAt() {
        updatedAt = null;
    }

    /**
     * Converts this GetMovementObjectRefundResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetMovementObjectRefundResponse [" + "fraudCoverageFee=" + fraudCoverageFee
                + ", chargeFeeRecipientId=" + chargeFeeRecipientId + ", bankAccountId="
                + bankAccountId + ", localTransactionId=" + localTransactionId + ", updatedAt="
                + updatedAt + ", object=" + getObject() + ", id=" + getId() + ", status="
                + getStatus() + ", amount=" + getAmount() + ", createdAt=" + getCreatedAt()
                + ", type=" + getType() + ", chargeId=" + getChargeId() + ", gatewayId="
                + getGatewayId() + "]";
    }

    /**
     * Builds a new {@link GetMovementObjectRefundResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetMovementObjectRefundResponse.Builder} object
     */
    public Builder toGetMovementObjectRefundResponseBuilder() {
        Builder builder = new Builder()
                .object(getObject());
        builder.fraudCoverageFee = internalGetFraudCoverageFee();
        builder.chargeFeeRecipientId = internalGetChargeFeeRecipientId();
        builder.bankAccountId = internalGetBankAccountId();
        builder.localTransactionId = internalGetLocalTransactionId();
        builder.updatedAt = internalGetUpdatedAt();
        builder.id = internalGetId();
        builder.status = internalGetStatus();
        builder.amount = internalGetAmount();
        builder.createdAt = internalGetCreatedAt();
        builder.type = internalGetType();
        builder.chargeId = internalGetChargeId();
        builder.gatewayId = internalGetGatewayId();
        return builder;
    }

    /**
     * Class to build instances of {@link GetMovementObjectRefundResponse}.
     */
    public static class Builder {
        private String object = "refund";
        private OptionalNullable<String> id;
        private OptionalNullable<String> status;
        private OptionalNullable<String> amount;
        private OptionalNullable<String> createdAt;
        private OptionalNullable<String> type;
        private OptionalNullable<String> chargeId;
        private OptionalNullable<String> gatewayId;
        private OptionalNullable<String> fraudCoverageFee;
        private OptionalNullable<String> chargeFeeRecipientId;
        private OptionalNullable<String> bankAccountId;
        private OptionalNullable<String> localTransactionId;
        private OptionalNullable<String> updatedAt;



        /**
         * Setter for object.
         * @param  object  String value for object.
         * @return Builder
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = OptionalNullable.of(id);
            return this;
        }

        /**
         * UnSetter for id.
         * @return Builder
         */
        public Builder unsetId() {
            id = null;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = OptionalNullable.of(status);
            return this;
        }

        /**
         * UnSetter for status.
         * @return Builder
         */
        public Builder unsetStatus() {
            status = null;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  String value for amount.
         * @return Builder
         */
        public Builder amount(String amount) {
            this.amount = OptionalNullable.of(amount);
            return this;
        }

        /**
         * UnSetter for amount.
         * @return Builder
         */
        public Builder unsetAmount() {
            amount = null;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = OptionalNullable.of(createdAt);
            return this;
        }

        /**
         * UnSetter for createdAt.
         * @return Builder
         */
        public Builder unsetCreatedAt() {
            createdAt = null;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = OptionalNullable.of(type);
            return this;
        }

        /**
         * UnSetter for type.
         * @return Builder
         */
        public Builder unsetType() {
            type = null;
            return this;
        }

        /**
         * Setter for chargeId.
         * @param  chargeId  String value for chargeId.
         * @return Builder
         */
        public Builder chargeId(String chargeId) {
            this.chargeId = OptionalNullable.of(chargeId);
            return this;
        }

        /**
         * UnSetter for chargeId.
         * @return Builder
         */
        public Builder unsetChargeId() {
            chargeId = null;
            return this;
        }

        /**
         * Setter for gatewayId.
         * @param  gatewayId  String value for gatewayId.
         * @return Builder
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = OptionalNullable.of(gatewayId);
            return this;
        }

        /**
         * UnSetter for gatewayId.
         * @return Builder
         */
        public Builder unsetGatewayId() {
            gatewayId = null;
            return this;
        }

        /**
         * Setter for fraudCoverageFee.
         * @param  fraudCoverageFee  String value for fraudCoverageFee.
         * @return Builder
         */
        public Builder fraudCoverageFee(String fraudCoverageFee) {
            this.fraudCoverageFee = OptionalNullable.of(fraudCoverageFee);
            return this;
        }

        /**
         * UnSetter for fraudCoverageFee.
         * @return Builder
         */
        public Builder unsetFraudCoverageFee() {
            fraudCoverageFee = null;
            return this;
        }

        /**
         * Setter for chargeFeeRecipientId.
         * @param  chargeFeeRecipientId  String value for chargeFeeRecipientId.
         * @return Builder
         */
        public Builder chargeFeeRecipientId(String chargeFeeRecipientId) {
            this.chargeFeeRecipientId = OptionalNullable.of(chargeFeeRecipientId);
            return this;
        }

        /**
         * UnSetter for chargeFeeRecipientId.
         * @return Builder
         */
        public Builder unsetChargeFeeRecipientId() {
            chargeFeeRecipientId = null;
            return this;
        }

        /**
         * Setter for bankAccountId.
         * @param  bankAccountId  String value for bankAccountId.
         * @return Builder
         */
        public Builder bankAccountId(String bankAccountId) {
            this.bankAccountId = OptionalNullable.of(bankAccountId);
            return this;
        }

        /**
         * UnSetter for bankAccountId.
         * @return Builder
         */
        public Builder unsetBankAccountId() {
            bankAccountId = null;
            return this;
        }

        /**
         * Setter for localTransactionId.
         * @param  localTransactionId  String value for localTransactionId.
         * @return Builder
         */
        public Builder localTransactionId(String localTransactionId) {
            this.localTransactionId = OptionalNullable.of(localTransactionId);
            return this;
        }

        /**
         * UnSetter for localTransactionId.
         * @return Builder
         */
        public Builder unsetLocalTransactionId() {
            localTransactionId = null;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = OptionalNullable.of(updatedAt);
            return this;
        }

        /**
         * UnSetter for updatedAt.
         * @return Builder
         */
        public Builder unsetUpdatedAt() {
            updatedAt = null;
            return this;
        }

        /**
         * Builds a new {@link GetMovementObjectRefundResponse} object using the set fields.
         * @return {@link GetMovementObjectRefundResponse}
         */
        public GetMovementObjectRefundResponse build() {
            return new GetMovementObjectRefundResponse(object, id, status, amount, createdAt, type,
                    chargeId, gatewayId, fraudCoverageFee, chargeFeeRecipientId, bankAccountId,
                    localTransactionId, updatedAt);
        }
    }
}
