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
 * This is a model class for GetMovementObjectPayableResponse type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "object",
        defaultImpl = GetMovementObjectPayableResponse.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class GetMovementObjectPayableResponse
        extends GetMovementObjectBaseResponse {
    private OptionalNullable<String> fee;
    private String anticipationFee;
    private String fraudCoverageFee;
    private String installment;
    private String splitId;
    private String bulkAnticipationId;
    private String anticipationId;
    private String recipientId;
    private String originatorModel;
    private String originatorModelId;
    private String paymentDate;
    private String originalPaymentDate;
    private String paymentMethod;
    private String accrualAt;
    private String liquidationArrangementId;

    /**
     * Default constructor.
     */
    public GetMovementObjectPayableResponse() {
        super();
        setObject("payable");
    }

    /**
     * Initialization constructor.
     * @param  anticipationFee  String value for anticipationFee.
     * @param  fraudCoverageFee  String value for fraudCoverageFee.
     * @param  installment  String value for installment.
     * @param  splitId  String value for splitId.
     * @param  bulkAnticipationId  String value for bulkAnticipationId.
     * @param  anticipationId  String value for anticipationId.
     * @param  recipientId  String value for recipientId.
     * @param  originatorModel  String value for originatorModel.
     * @param  originatorModelId  String value for originatorModelId.
     * @param  paymentDate  String value for paymentDate.
     * @param  originalPaymentDate  String value for originalPaymentDate.
     * @param  paymentMethod  String value for paymentMethod.
     * @param  accrualAt  String value for accrualAt.
     * @param  liquidationArrangementId  String value for liquidationArrangementId.
     * @param  object  String value for object.
     * @param  id  String value for id.
     * @param  status  String value for status.
     * @param  amount  String value for amount.
     * @param  createdAt  String value for createdAt.
     * @param  type  String value for type.
     * @param  chargeId  String value for chargeId.
     * @param  gatewayId  String value for gatewayId.
     * @param  fee  String value for fee.
     */
    public GetMovementObjectPayableResponse(
            String anticipationFee,
            String fraudCoverageFee,
            String installment,
            String splitId,
            String bulkAnticipationId,
            String anticipationId,
            String recipientId,
            String originatorModel,
            String originatorModelId,
            String paymentDate,
            String originalPaymentDate,
            String paymentMethod,
            String accrualAt,
            String liquidationArrangementId,
            String object,
            String id,
            String status,
            String amount,
            String createdAt,
            String type,
            String chargeId,
            String gatewayId,
            String fee) {
        super(object, id, status, amount, createdAt, type, chargeId, gatewayId);
        this.fee = OptionalNullable.of(fee);
        this.anticipationFee = anticipationFee;
        this.fraudCoverageFee = fraudCoverageFee;
        this.installment = installment;
        this.splitId = splitId;
        this.bulkAnticipationId = bulkAnticipationId;
        this.anticipationId = anticipationId;
        this.recipientId = recipientId;
        this.originatorModel = originatorModel;
        this.originatorModelId = originatorModelId;
        this.paymentDate = paymentDate;
        this.originalPaymentDate = originalPaymentDate;
        this.paymentMethod = paymentMethod;
        this.accrualAt = accrualAt;
        this.liquidationArrangementId = liquidationArrangementId;
    }

    /**
     * Initialization constructor.
     * @param  anticipationFee  String value for anticipationFee.
     * @param  fraudCoverageFee  String value for fraudCoverageFee.
     * @param  installment  String value for installment.
     * @param  splitId  String value for splitId.
     * @param  bulkAnticipationId  String value for bulkAnticipationId.
     * @param  anticipationId  String value for anticipationId.
     * @param  recipientId  String value for recipientId.
     * @param  originatorModel  String value for originatorModel.
     * @param  originatorModelId  String value for originatorModelId.
     * @param  paymentDate  String value for paymentDate.
     * @param  originalPaymentDate  String value for originalPaymentDate.
     * @param  paymentMethod  String value for paymentMethod.
     * @param  accrualAt  String value for accrualAt.
     * @param  liquidationArrangementId  String value for liquidationArrangementId.
     * @param  object  String value for object.
     * @param  id  String value for id.
     * @param  status  String value for status.
     * @param  amount  String value for amount.
     * @param  createdAt  String value for createdAt.
     * @param  type  String value for type.
     * @param  chargeId  String value for chargeId.
     * @param  gatewayId  String value for gatewayId.
     * @param  fee  String value for fee.
     */

    protected GetMovementObjectPayableResponse(String anticipationFee, String fraudCoverageFee,
            String installment, String splitId, String bulkAnticipationId, String anticipationId,
            String recipientId, String originatorModel, String originatorModelId,
            String paymentDate, String originalPaymentDate, String paymentMethod, String accrualAt,
            String liquidationArrangementId, String object, OptionalNullable<String> id,
            OptionalNullable<String> status, OptionalNullable<String> amount,
            OptionalNullable<String> createdAt, OptionalNullable<String> type,
            OptionalNullable<String> chargeId, OptionalNullable<String> gatewayId,
            OptionalNullable<String> fee) {
        super(object, id, status, amount, createdAt, type, chargeId, gatewayId);
        this.fee = fee;
        this.anticipationFee = anticipationFee;
        this.fraudCoverageFee = fraudCoverageFee;
        this.installment = installment;
        this.splitId = splitId;
        this.bulkAnticipationId = bulkAnticipationId;
        this.anticipationId = anticipationId;
        this.recipientId = recipientId;
        this.originatorModel = originatorModel;
        this.originatorModelId = originatorModelId;
        this.paymentDate = paymentDate;
        this.originalPaymentDate = originalPaymentDate;
        this.paymentMethod = paymentMethod;
        this.accrualAt = accrualAt;
        this.liquidationArrangementId = liquidationArrangementId;
    }

    /**
     * Internal Getter for Fee.
     * @return Returns the Internal String
     */
    @JsonGetter("fee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFee() {
        return this.fee;
    }

    /**
     * Getter for Fee.
     * @return Returns the String
     */
    public String getFee() {
        return OptionalNullable.getFrom(fee);
    }

    /**
     * Setter for Fee.
     * @param fee Value for String
     */
    @JsonSetter("fee")
    public void setFee(String fee) {
        this.fee = OptionalNullable.of(fee);
    }

    /**
     * UnSetter for Fee.
     */
    public void unsetFee() {
        fee = null;
    }

    /**
     * Getter for AnticipationFee.
     * @return Returns the String
     */
    @JsonGetter("anticipation_fee")
    public String getAnticipationFee() {
        return anticipationFee;
    }

    /**
     * Setter for AnticipationFee.
     * @param anticipationFee Value for String
     */
    @JsonSetter("anticipation_fee")
    public void setAnticipationFee(String anticipationFee) {
        this.anticipationFee = anticipationFee;
    }

    /**
     * Getter for FraudCoverageFee.
     * @return Returns the String
     */
    @JsonGetter("fraud_coverage_fee")
    public String getFraudCoverageFee() {
        return fraudCoverageFee;
    }

    /**
     * Setter for FraudCoverageFee.
     * @param fraudCoverageFee Value for String
     */
    @JsonSetter("fraud_coverage_fee")
    public void setFraudCoverageFee(String fraudCoverageFee) {
        this.fraudCoverageFee = fraudCoverageFee;
    }

    /**
     * Getter for Installment.
     * @return Returns the String
     */
    @JsonGetter("installment")
    public String getInstallment() {
        return installment;
    }

    /**
     * Setter for Installment.
     * @param installment Value for String
     */
    @JsonSetter("installment")
    public void setInstallment(String installment) {
        this.installment = installment;
    }

    /**
     * Getter for SplitId.
     * @return Returns the String
     */
    @JsonGetter("split_id")
    public String getSplitId() {
        return splitId;
    }

    /**
     * Setter for SplitId.
     * @param splitId Value for String
     */
    @JsonSetter("split_id")
    public void setSplitId(String splitId) {
        this.splitId = splitId;
    }

    /**
     * Getter for BulkAnticipationId.
     * @return Returns the String
     */
    @JsonGetter("bulk_anticipation_id")
    public String getBulkAnticipationId() {
        return bulkAnticipationId;
    }

    /**
     * Setter for BulkAnticipationId.
     * @param bulkAnticipationId Value for String
     */
    @JsonSetter("bulk_anticipation_id")
    public void setBulkAnticipationId(String bulkAnticipationId) {
        this.bulkAnticipationId = bulkAnticipationId;
    }

    /**
     * Getter for AnticipationId.
     * @return Returns the String
     */
    @JsonGetter("anticipation_id")
    public String getAnticipationId() {
        return anticipationId;
    }

    /**
     * Setter for AnticipationId.
     * @param anticipationId Value for String
     */
    @JsonSetter("anticipation_id")
    public void setAnticipationId(String anticipationId) {
        this.anticipationId = anticipationId;
    }

    /**
     * Getter for RecipientId.
     * @return Returns the String
     */
    @JsonGetter("recipient_id")
    public String getRecipientId() {
        return recipientId;
    }

    /**
     * Setter for RecipientId.
     * @param recipientId Value for String
     */
    @JsonSetter("recipient_id")
    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    /**
     * Getter for OriginatorModel.
     * @return Returns the String
     */
    @JsonGetter("originator_model")
    public String getOriginatorModel() {
        return originatorModel;
    }

    /**
     * Setter for OriginatorModel.
     * @param originatorModel Value for String
     */
    @JsonSetter("originator_model")
    public void setOriginatorModel(String originatorModel) {
        this.originatorModel = originatorModel;
    }

    /**
     * Getter for OriginatorModelId.
     * @return Returns the String
     */
    @JsonGetter("originator_model_id")
    public String getOriginatorModelId() {
        return originatorModelId;
    }

    /**
     * Setter for OriginatorModelId.
     * @param originatorModelId Value for String
     */
    @JsonSetter("originator_model_id")
    public void setOriginatorModelId(String originatorModelId) {
        this.originatorModelId = originatorModelId;
    }

    /**
     * Getter for PaymentDate.
     * @return Returns the String
     */
    @JsonGetter("payment_date")
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * Setter for PaymentDate.
     * @param paymentDate Value for String
     */
    @JsonSetter("payment_date")
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * Getter for OriginalPaymentDate.
     * @return Returns the String
     */
    @JsonGetter("original_payment_date")
    public String getOriginalPaymentDate() {
        return originalPaymentDate;
    }

    /**
     * Setter for OriginalPaymentDate.
     * @param originalPaymentDate Value for String
     */
    @JsonSetter("original_payment_date")
    public void setOriginalPaymentDate(String originalPaymentDate) {
        this.originalPaymentDate = originalPaymentDate;
    }

    /**
     * Getter for PaymentMethod.
     * @return Returns the String
     */
    @JsonGetter("payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Setter for PaymentMethod.
     * @param paymentMethod Value for String
     */
    @JsonSetter("payment_method")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Getter for AccrualAt.
     * @return Returns the String
     */
    @JsonGetter("accrual_at")
    public String getAccrualAt() {
        return accrualAt;
    }

    /**
     * Setter for AccrualAt.
     * @param accrualAt Value for String
     */
    @JsonSetter("accrual_at")
    public void setAccrualAt(String accrualAt) {
        this.accrualAt = accrualAt;
    }

    /**
     * Getter for LiquidationArrangementId.
     * @return Returns the String
     */
    @JsonGetter("liquidation_arrangement_id")
    public String getLiquidationArrangementId() {
        return liquidationArrangementId;
    }

    /**
     * Setter for LiquidationArrangementId.
     * @param liquidationArrangementId Value for String
     */
    @JsonSetter("liquidation_arrangement_id")
    public void setLiquidationArrangementId(String liquidationArrangementId) {
        this.liquidationArrangementId = liquidationArrangementId;
    }

    /**
     * Converts this GetMovementObjectPayableResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetMovementObjectPayableResponse [" + "anticipationFee=" + anticipationFee
                + ", fraudCoverageFee=" + fraudCoverageFee + ", installment=" + installment
                + ", splitId=" + splitId + ", bulkAnticipationId=" + bulkAnticipationId
                + ", anticipationId=" + anticipationId + ", recipientId=" + recipientId
                + ", originatorModel=" + originatorModel + ", originatorModelId="
                + originatorModelId + ", paymentDate=" + paymentDate + ", originalPaymentDate="
                + originalPaymentDate + ", paymentMethod=" + paymentMethod + ", accrualAt="
                + accrualAt + ", liquidationArrangementId=" + liquidationArrangementId + ", fee="
                + fee + ", object=" + getObject() + ", id=" + getId() + ", status=" + getStatus()
                + ", amount=" + getAmount() + ", createdAt=" + getCreatedAt() + ", type="
                + getType() + ", chargeId=" + getChargeId() + ", gatewayId=" + getGatewayId() + "]";
    }

    /**
     * Builds a new {@link GetMovementObjectPayableResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetMovementObjectPayableResponse.Builder} object
     */
    public Builder toGetMovementObjectPayableResponseBuilder() {
        Builder builder = new Builder(anticipationFee, fraudCoverageFee, installment, splitId,
                bulkAnticipationId, anticipationId, recipientId, originatorModel, originatorModelId,
                paymentDate, originalPaymentDate, paymentMethod, accrualAt,
                liquidationArrangementId)
                .object(getObject());
        builder.fee = internalGetFee();
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
     * Class to build instances of {@link GetMovementObjectPayableResponse}.
     */
    public static class Builder {
        private String anticipationFee;
        private String fraudCoverageFee;
        private String installment;
        private String splitId;
        private String bulkAnticipationId;
        private String anticipationId;
        private String recipientId;
        private String originatorModel;
        private String originatorModelId;
        private String paymentDate;
        private String originalPaymentDate;
        private String paymentMethod;
        private String accrualAt;
        private String liquidationArrangementId;
        private String object = "payable";
        private OptionalNullable<String> id;
        private OptionalNullable<String> status;
        private OptionalNullable<String> amount;
        private OptionalNullable<String> createdAt;
        private OptionalNullable<String> type;
        private OptionalNullable<String> chargeId;
        private OptionalNullable<String> gatewayId;
        private OptionalNullable<String> fee;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  anticipationFee  String value for anticipationFee.
         * @param  fraudCoverageFee  String value for fraudCoverageFee.
         * @param  installment  String value for installment.
         * @param  splitId  String value for splitId.
         * @param  bulkAnticipationId  String value for bulkAnticipationId.
         * @param  anticipationId  String value for anticipationId.
         * @param  recipientId  String value for recipientId.
         * @param  originatorModel  String value for originatorModel.
         * @param  originatorModelId  String value for originatorModelId.
         * @param  paymentDate  String value for paymentDate.
         * @param  originalPaymentDate  String value for originalPaymentDate.
         * @param  paymentMethod  String value for paymentMethod.
         * @param  accrualAt  String value for accrualAt.
         * @param  liquidationArrangementId  String value for liquidationArrangementId.
         */
        public Builder(String anticipationFee, String fraudCoverageFee, String installment,
                String splitId, String bulkAnticipationId, String anticipationId,
                String recipientId, String originatorModel, String originatorModelId,
                String paymentDate, String originalPaymentDate, String paymentMethod,
                String accrualAt, String liquidationArrangementId) {
            this.anticipationFee = anticipationFee;
            this.fraudCoverageFee = fraudCoverageFee;
            this.installment = installment;
            this.splitId = splitId;
            this.bulkAnticipationId = bulkAnticipationId;
            this.anticipationId = anticipationId;
            this.recipientId = recipientId;
            this.originatorModel = originatorModel;
            this.originatorModelId = originatorModelId;
            this.paymentDate = paymentDate;
            this.originalPaymentDate = originalPaymentDate;
            this.paymentMethod = paymentMethod;
            this.accrualAt = accrualAt;
            this.liquidationArrangementId = liquidationArrangementId;
        }

        /**
         * Setter for anticipationFee.
         * @param  anticipationFee  String value for anticipationFee.
         * @return Builder
         */
        public Builder anticipationFee(String anticipationFee) {
            this.anticipationFee = anticipationFee;
            return this;
        }

        /**
         * Setter for fraudCoverageFee.
         * @param  fraudCoverageFee  String value for fraudCoverageFee.
         * @return Builder
         */
        public Builder fraudCoverageFee(String fraudCoverageFee) {
            this.fraudCoverageFee = fraudCoverageFee;
            return this;
        }

        /**
         * Setter for installment.
         * @param  installment  String value for installment.
         * @return Builder
         */
        public Builder installment(String installment) {
            this.installment = installment;
            return this;
        }

        /**
         * Setter for splitId.
         * @param  splitId  String value for splitId.
         * @return Builder
         */
        public Builder splitId(String splitId) {
            this.splitId = splitId;
            return this;
        }

        /**
         * Setter for bulkAnticipationId.
         * @param  bulkAnticipationId  String value for bulkAnticipationId.
         * @return Builder
         */
        public Builder bulkAnticipationId(String bulkAnticipationId) {
            this.bulkAnticipationId = bulkAnticipationId;
            return this;
        }

        /**
         * Setter for anticipationId.
         * @param  anticipationId  String value for anticipationId.
         * @return Builder
         */
        public Builder anticipationId(String anticipationId) {
            this.anticipationId = anticipationId;
            return this;
        }

        /**
         * Setter for recipientId.
         * @param  recipientId  String value for recipientId.
         * @return Builder
         */
        public Builder recipientId(String recipientId) {
            this.recipientId = recipientId;
            return this;
        }

        /**
         * Setter for originatorModel.
         * @param  originatorModel  String value for originatorModel.
         * @return Builder
         */
        public Builder originatorModel(String originatorModel) {
            this.originatorModel = originatorModel;
            return this;
        }

        /**
         * Setter for originatorModelId.
         * @param  originatorModelId  String value for originatorModelId.
         * @return Builder
         */
        public Builder originatorModelId(String originatorModelId) {
            this.originatorModelId = originatorModelId;
            return this;
        }

        /**
         * Setter for paymentDate.
         * @param  paymentDate  String value for paymentDate.
         * @return Builder
         */
        public Builder paymentDate(String paymentDate) {
            this.paymentDate = paymentDate;
            return this;
        }

        /**
         * Setter for originalPaymentDate.
         * @param  originalPaymentDate  String value for originalPaymentDate.
         * @return Builder
         */
        public Builder originalPaymentDate(String originalPaymentDate) {
            this.originalPaymentDate = originalPaymentDate;
            return this;
        }

        /**
         * Setter for paymentMethod.
         * @param  paymentMethod  String value for paymentMethod.
         * @return Builder
         */
        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * Setter for accrualAt.
         * @param  accrualAt  String value for accrualAt.
         * @return Builder
         */
        public Builder accrualAt(String accrualAt) {
            this.accrualAt = accrualAt;
            return this;
        }

        /**
         * Setter for liquidationArrangementId.
         * @param  liquidationArrangementId  String value for liquidationArrangementId.
         * @return Builder
         */
        public Builder liquidationArrangementId(String liquidationArrangementId) {
            this.liquidationArrangementId = liquidationArrangementId;
            return this;
        }

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
         * Setter for fee.
         * @param  fee  String value for fee.
         * @return Builder
         */
        public Builder fee(String fee) {
            this.fee = OptionalNullable.of(fee);
            return this;
        }

        /**
         * UnSetter for fee.
         * @return Builder
         */
        public Builder unsetFee() {
            fee = null;
            return this;
        }

        /**
         * Builds a new {@link GetMovementObjectPayableResponse} object using the set fields.
         * @return {@link GetMovementObjectPayableResponse}
         */
        public GetMovementObjectPayableResponse build() {
            return new GetMovementObjectPayableResponse(anticipationFee, fraudCoverageFee,
                    installment, splitId, bulkAnticipationId, anticipationId, recipientId,
                    originatorModel, originatorModelId, paymentDate, originalPaymentDate,
                    paymentMethod, accrualAt, liquidationArrangementId, object, id, status, amount,
                    createdAt, type, chargeId, gatewayId, fee);
        }
    }
}
