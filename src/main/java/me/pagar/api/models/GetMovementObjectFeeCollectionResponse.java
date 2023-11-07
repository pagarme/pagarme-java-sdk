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
 * This is a model class for GetMovementObjectFeeCollectionResponse type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "object",
        defaultImpl = GetMovementObjectFeeCollectionResponse.class,
        visible = true)
@JsonInclude(Include.ALWAYS)
public class GetMovementObjectFeeCollectionResponse
        extends GetMovementObjectBaseResponse {
    private OptionalNullable<String> description;
    private OptionalNullable<String> paymentDate;
    private OptionalNullable<String> recipientId;

    /**
     * Default constructor.
     */
    public GetMovementObjectFeeCollectionResponse() {
        super();
        setObject("feeCollection");
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
     * @param  description  String value for description.
     * @param  paymentDate  String value for paymentDate.
     * @param  recipientId  String value for recipientId.
     */
    public GetMovementObjectFeeCollectionResponse(
            String object,
            String id,
            String status,
            String amount,
            String createdAt,
            String type,
            String chargeId,
            String gatewayId,
            String description,
            String paymentDate,
            String recipientId) {
        super(object, id, status, amount, createdAt, type, chargeId, gatewayId);
        this.description = OptionalNullable.of(description);
        this.paymentDate = OptionalNullable.of(paymentDate);
        this.recipientId = OptionalNullable.of(recipientId);
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
     * @param  description  String value for description.
     * @param  paymentDate  String value for paymentDate.
     * @param  recipientId  String value for recipientId.
     */

    protected GetMovementObjectFeeCollectionResponse(String object, OptionalNullable<String> id,
            OptionalNullable<String> status, OptionalNullable<String> amount,
            OptionalNullable<String> createdAt, OptionalNullable<String> type,
            OptionalNullable<String> chargeId, OptionalNullable<String> gatewayId,
            OptionalNullable<String> description, OptionalNullable<String> paymentDate,
            OptionalNullable<String> recipientId) {
        super(object, id, status, amount, createdAt, type, chargeId, gatewayId);
        this.description = description;
        this.paymentDate = paymentDate;
        this.recipientId = recipientId;
    }

    /**
     * Internal Getter for Description.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     */
    public void unsetDescription() {
        description = null;
    }

    /**
     * Internal Getter for PaymentDate.
     * @return Returns the Internal String
     */
    @JsonGetter("payment_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPaymentDate() {
        return this.paymentDate;
    }

    /**
     * Getter for PaymentDate.
     * @return Returns the String
     */
    public String getPaymentDate() {
        return OptionalNullable.getFrom(paymentDate);
    }

    /**
     * Setter for PaymentDate.
     * @param paymentDate Value for String
     */
    @JsonSetter("payment_date")
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = OptionalNullable.of(paymentDate);
    }

    /**
     * UnSetter for PaymentDate.
     */
    public void unsetPaymentDate() {
        paymentDate = null;
    }

    /**
     * Internal Getter for RecipientId.
     * @return Returns the Internal String
     */
    @JsonGetter("recipient_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRecipientId() {
        return this.recipientId;
    }

    /**
     * Getter for RecipientId.
     * @return Returns the String
     */
    public String getRecipientId() {
        return OptionalNullable.getFrom(recipientId);
    }

    /**
     * Setter for RecipientId.
     * @param recipientId Value for String
     */
    @JsonSetter("recipient_id")
    public void setRecipientId(String recipientId) {
        this.recipientId = OptionalNullable.of(recipientId);
    }

    /**
     * UnSetter for RecipientId.
     */
    public void unsetRecipientId() {
        recipientId = null;
    }

    /**
     * Converts this GetMovementObjectFeeCollectionResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetMovementObjectFeeCollectionResponse [" + "description=" + description
                + ", paymentDate=" + paymentDate + ", recipientId=" + recipientId + ", object="
                + getObject() + ", id=" + getId() + ", status=" + getStatus() + ", amount="
                + getAmount() + ", createdAt=" + getCreatedAt() + ", type=" + getType()
                + ", chargeId=" + getChargeId() + ", gatewayId=" + getGatewayId() + "]";
    }

    /**
     * Builds a new {@link GetMovementObjectFeeCollectionResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetMovementObjectFeeCollectionResponse.Builder} object
     */
    public Builder toGetMovementObjectFeeCollectionResponseBuilder() {
        Builder builder = new Builder()
                .object(getObject());
        builder.description = internalGetDescription();
        builder.paymentDate = internalGetPaymentDate();
        builder.recipientId = internalGetRecipientId();
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
     * Class to build instances of {@link GetMovementObjectFeeCollectionResponse}.
     */
    public static class Builder {
        private String object = "feeCollection";
        private OptionalNullable<String> id;
        private OptionalNullable<String> status;
        private OptionalNullable<String> amount;
        private OptionalNullable<String> createdAt;
        private OptionalNullable<String> type;
        private OptionalNullable<String> chargeId;
        private OptionalNullable<String> gatewayId;
        private OptionalNullable<String> description;
        private OptionalNullable<String> paymentDate;
        private OptionalNullable<String> recipientId;



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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
            return this;
        }

        /**
         * Setter for paymentDate.
         * @param  paymentDate  String value for paymentDate.
         * @return Builder
         */
        public Builder paymentDate(String paymentDate) {
            this.paymentDate = OptionalNullable.of(paymentDate);
            return this;
        }

        /**
         * UnSetter for paymentDate.
         * @return Builder
         */
        public Builder unsetPaymentDate() {
            paymentDate = null;
            return this;
        }

        /**
         * Setter for recipientId.
         * @param  recipientId  String value for recipientId.
         * @return Builder
         */
        public Builder recipientId(String recipientId) {
            this.recipientId = OptionalNullable.of(recipientId);
            return this;
        }

        /**
         * UnSetter for recipientId.
         * @return Builder
         */
        public Builder unsetRecipientId() {
            recipientId = null;
            return this;
        }

        /**
         * Builds a new {@link GetMovementObjectFeeCollectionResponse} object using the set fields.
         * @return {@link GetMovementObjectFeeCollectionResponse}
         */
        public GetMovementObjectFeeCollectionResponse build() {
            return new GetMovementObjectFeeCollectionResponse(object, id, status, amount, createdAt,
                    type, chargeId, gatewayId, description, paymentDate, recipientId);
        }
    }
}
