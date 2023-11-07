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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for GetMovementObjectBaseResponse type.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "object",
        defaultImpl = GetMovementObjectBaseResponse.class,
        visible = true)
@JsonSubTypes({
    @Type(value = GetMovementObjectRefundResponse.class, name = "refund"),
    @Type(value = GetMovementObjectFeeCollectionResponse.class, name = "feeCollection"),
    @Type(value = GetMovementObjectPayableResponse.class, name = "payable"),
    @Type(value = GetMovementObjectTransferResponse.class, name = "transfer")
})
@JsonInclude(Include.ALWAYS)
public class GetMovementObjectBaseResponse {
    private String object;
    private OptionalNullable<String> id;
    private OptionalNullable<String> status;
    private OptionalNullable<String> amount;
    private OptionalNullable<String> createdAt;
    private OptionalNullable<String> type;
    private OptionalNullable<String> chargeId;
    private OptionalNullable<String> gatewayId;

    /**
     * Default constructor.
     */
    public GetMovementObjectBaseResponse() {
        setObject("MovementObject");
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
     */
    public GetMovementObjectBaseResponse(
            String object,
            String id,
            String status,
            String amount,
            String createdAt,
            String type,
            String chargeId,
            String gatewayId) {
        this.object = object;
        this.id = OptionalNullable.of(id);
        this.status = OptionalNullable.of(status);
        this.amount = OptionalNullable.of(amount);
        this.createdAt = OptionalNullable.of(createdAt);
        this.type = OptionalNullable.of(type);
        this.chargeId = OptionalNullable.of(chargeId);
        this.gatewayId = OptionalNullable.of(gatewayId);
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
     */

    protected GetMovementObjectBaseResponse(String object, OptionalNullable<String> id,
            OptionalNullable<String> status, OptionalNullable<String> amount,
            OptionalNullable<String> createdAt, OptionalNullable<String> type,
            OptionalNullable<String> chargeId, OptionalNullable<String> gatewayId) {
        this.object = object;
        this.id = id;
        this.status = status;
        this.amount = amount;
        this.createdAt = createdAt;
        this.type = type;
        this.chargeId = chargeId;
        this.gatewayId = gatewayId;
    }

    /**
     * Getter for Object.
     * @return Returns the String
     */
    @JsonGetter("object")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getObject() {
        return object;
    }

    /**
     * Setter for Object.
     * @param object Value for String
     */
    @JsonSetter("object")
    public void setObject(String object) {
        this.object = object;
    }

    /**
     * Internal Getter for Id.
     * @return Returns the Internal String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetId() {
        return this.id;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    public String getId() {
        return OptionalNullable.getFrom(id);
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = OptionalNullable.of(id);
    }

    /**
     * UnSetter for Id.
     */
    public void unsetId() {
        id = null;
    }

    /**
     * Internal Getter for Status.
     * @return Returns the Internal String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetStatus() {
        return this.status;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    public String getStatus() {
        return OptionalNullable.getFrom(status);
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = OptionalNullable.of(status);
    }

    /**
     * UnSetter for Status.
     */
    public void unsetStatus() {
        status = null;
    }

    /**
     * Internal Getter for Amount.
     * @return Returns the Internal String
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetAmount() {
        return this.amount;
    }

    /**
     * Getter for Amount.
     * @return Returns the String
     */
    public String getAmount() {
        return OptionalNullable.getFrom(amount);
    }

    /**
     * Setter for Amount.
     * @param amount Value for String
     */
    @JsonSetter("amount")
    public void setAmount(String amount) {
        this.amount = OptionalNullable.of(amount);
    }

    /**
     * UnSetter for Amount.
     */
    public void unsetAmount() {
        amount = null;
    }

    /**
     * Internal Getter for CreatedAt.
     * @return Returns the Internal String
     */
    @JsonGetter("created_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCreatedAt() {
        return this.createdAt;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    public String getCreatedAt() {
        return OptionalNullable.getFrom(createdAt);
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = OptionalNullable.of(createdAt);
    }

    /**
     * UnSetter for CreatedAt.
     */
    public void unsetCreatedAt() {
        createdAt = null;
    }

    /**
     * Internal Getter for Type.
     * @return Returns the Internal String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetType() {
        return this.type;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    public String getType() {
        return OptionalNullable.getFrom(type);
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = OptionalNullable.of(type);
    }

    /**
     * UnSetter for Type.
     */
    public void unsetType() {
        type = null;
    }

    /**
     * Internal Getter for ChargeId.
     * @return Returns the Internal String
     */
    @JsonGetter("charge_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetChargeId() {
        return this.chargeId;
    }

    /**
     * Getter for ChargeId.
     * @return Returns the String
     */
    public String getChargeId() {
        return OptionalNullable.getFrom(chargeId);
    }

    /**
     * Setter for ChargeId.
     * @param chargeId Value for String
     */
    @JsonSetter("charge_id")
    public void setChargeId(String chargeId) {
        this.chargeId = OptionalNullable.of(chargeId);
    }

    /**
     * UnSetter for ChargeId.
     */
    public void unsetChargeId() {
        chargeId = null;
    }

    /**
     * Internal Getter for GatewayId.
     * @return Returns the Internal String
     */
    @JsonGetter("gateway_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetGatewayId() {
        return this.gatewayId;
    }

    /**
     * Getter for GatewayId.
     * @return Returns the String
     */
    public String getGatewayId() {
        return OptionalNullable.getFrom(gatewayId);
    }

    /**
     * Setter for GatewayId.
     * @param gatewayId Value for String
     */
    @JsonSetter("gateway_id")
    public void setGatewayId(String gatewayId) {
        this.gatewayId = OptionalNullable.of(gatewayId);
    }

    /**
     * UnSetter for GatewayId.
     */
    public void unsetGatewayId() {
        gatewayId = null;
    }

    /**
     * Converts this GetMovementObjectBaseResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetMovementObjectBaseResponse [" + "object=" + object + ", id=" + id + ", status="
                + status + ", amount=" + amount + ", createdAt=" + createdAt + ", type=" + type
                + ", chargeId=" + chargeId + ", gatewayId=" + gatewayId + "]";
    }

    /**
     * Builds a new {@link GetMovementObjectBaseResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetMovementObjectBaseResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .object(getObject());
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
     * Class to build instances of {@link GetMovementObjectBaseResponse}.
     */
    public static class Builder {
        private String object = "MovementObject";
        private OptionalNullable<String> id;
        private OptionalNullable<String> status;
        private OptionalNullable<String> amount;
        private OptionalNullable<String> createdAt;
        private OptionalNullable<String> type;
        private OptionalNullable<String> chargeId;
        private OptionalNullable<String> gatewayId;



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
         * Builds a new {@link GetMovementObjectBaseResponse} object using the set fields.
         * @return {@link GetMovementObjectBaseResponse}
         */
        public GetMovementObjectBaseResponse build() {
            return new GetMovementObjectBaseResponse(object, id, status, amount, createdAt, type,
                    chargeId, gatewayId);
        }
    }
}
