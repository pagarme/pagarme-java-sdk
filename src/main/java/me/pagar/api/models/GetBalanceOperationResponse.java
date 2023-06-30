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
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for GetBalanceOperationResponse type.
 */
public class GetBalanceOperationResponse {
    private OptionalNullable<String> id;
    private OptionalNullable<String> status;
    private OptionalNullable<String> balanceAmount;
    private OptionalNullable<String> balanceOldAmount;
    private OptionalNullable<String> type;
    private OptionalNullable<String> amount;
    private OptionalNullable<String> fee;
    private OptionalNullable<String> createdAt;
    private GetMovementObjectBaseResponse movementObject;

    /**
     * Default constructor.
     */
    public GetBalanceOperationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  status  String value for status.
     * @param  balanceAmount  String value for balanceAmount.
     * @param  balanceOldAmount  String value for balanceOldAmount.
     * @param  type  String value for type.
     * @param  amount  String value for amount.
     * @param  fee  String value for fee.
     * @param  createdAt  String value for createdAt.
     * @param  movementObject  GetMovementObjectBaseResponse value for movementObject.
     */
    public GetBalanceOperationResponse(
            String id,
            String status,
            String balanceAmount,
            String balanceOldAmount,
            String type,
            String amount,
            String fee,
            String createdAt,
            GetMovementObjectBaseResponse movementObject) {
        this.id = OptionalNullable.of(id);
        this.status = OptionalNullable.of(status);
        this.balanceAmount = OptionalNullable.of(balanceAmount);
        this.balanceOldAmount = OptionalNullable.of(balanceOldAmount);
        this.type = OptionalNullable.of(type);
        this.amount = OptionalNullable.of(amount);
        this.fee = OptionalNullable.of(fee);
        this.createdAt = OptionalNullable.of(createdAt);
        this.movementObject = movementObject;
    }

    /**
     * Internal initialization constructor.
     */
    protected GetBalanceOperationResponse(OptionalNullable<String> id,
            OptionalNullable<String> status, OptionalNullable<String> balanceAmount,
            OptionalNullable<String> balanceOldAmount, OptionalNullable<String> type,
            OptionalNullable<String> amount, OptionalNullable<String> fee,
            OptionalNullable<String> createdAt, GetMovementObjectBaseResponse movementObject) {
        this.id = id;
        this.status = status;
        this.balanceAmount = balanceAmount;
        this.balanceOldAmount = balanceOldAmount;
        this.type = type;
        this.amount = amount;
        this.fee = fee;
        this.createdAt = createdAt;
        this.movementObject = movementObject;
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
     * Internal Getter for BalanceAmount.
     * @return Returns the Internal String
     */
    @JsonGetter("balance_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBalanceAmount() {
        return this.balanceAmount;
    }

    /**
     * Getter for BalanceAmount.
     * @return Returns the String
     */
    public String getBalanceAmount() {
        return OptionalNullable.getFrom(balanceAmount);
    }

    /**
     * Setter for BalanceAmount.
     * @param balanceAmount Value for String
     */
    @JsonSetter("balance_amount")
    public void setBalanceAmount(String balanceAmount) {
        this.balanceAmount = OptionalNullable.of(balanceAmount);
    }

    /**
     * UnSetter for BalanceAmount.
     */
    public void unsetBalanceAmount() {
        balanceAmount = null;
    }

    /**
     * Internal Getter for BalanceOldAmount.
     * @return Returns the Internal String
     */
    @JsonGetter("balance_old_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBalanceOldAmount() {
        return this.balanceOldAmount;
    }

    /**
     * Getter for BalanceOldAmount.
     * @return Returns the String
     */
    public String getBalanceOldAmount() {
        return OptionalNullable.getFrom(balanceOldAmount);
    }

    /**
     * Setter for BalanceOldAmount.
     * @param balanceOldAmount Value for String
     */
    @JsonSetter("balance_old_amount")
    public void setBalanceOldAmount(String balanceOldAmount) {
        this.balanceOldAmount = OptionalNullable.of(balanceOldAmount);
    }

    /**
     * UnSetter for BalanceOldAmount.
     */
    public void unsetBalanceOldAmount() {
        balanceOldAmount = null;
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
     * Getter for MovementObject.
     * @return Returns the GetMovementObjectBaseResponse
     */
    @JsonGetter("movement_object")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GetMovementObjectBaseResponse getMovementObject() {
        return movementObject;
    }

    /**
     * Setter for MovementObject.
     * @param movementObject Value for GetMovementObjectBaseResponse
     */
    @JsonSetter("movement_object")
    public void setMovementObject(GetMovementObjectBaseResponse movementObject) {
        this.movementObject = movementObject;
    }

    /**
     * Converts this GetBalanceOperationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetBalanceOperationResponse [" + "id=" + id + ", status=" + status
                + ", balanceAmount=" + balanceAmount + ", balanceOldAmount=" + balanceOldAmount
                + ", type=" + type + ", amount=" + amount + ", fee=" + fee + ", createdAt="
                + createdAt + ", movementObject=" + movementObject + "]";
    }

    /**
     * Builds a new {@link GetBalanceOperationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetBalanceOperationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .movementObject(getMovementObject());
        builder.id = internalGetId();
        builder.status = internalGetStatus();
        builder.balanceAmount = internalGetBalanceAmount();
        builder.balanceOldAmount = internalGetBalanceOldAmount();
        builder.type = internalGetType();
        builder.amount = internalGetAmount();
        builder.fee = internalGetFee();
        builder.createdAt = internalGetCreatedAt();
        return builder;
    }

    /**
     * Class to build instances of {@link GetBalanceOperationResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> id;
        private OptionalNullable<String> status;
        private OptionalNullable<String> balanceAmount;
        private OptionalNullable<String> balanceOldAmount;
        private OptionalNullable<String> type;
        private OptionalNullable<String> amount;
        private OptionalNullable<String> fee;
        private OptionalNullable<String> createdAt;
        private GetMovementObjectBaseResponse movementObject;



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
         * Setter for balanceAmount.
         * @param  balanceAmount  String value for balanceAmount.
         * @return Builder
         */
        public Builder balanceAmount(String balanceAmount) {
            this.balanceAmount = OptionalNullable.of(balanceAmount);
            return this;
        }

        /**
         * UnSetter for balanceAmount.
         * @return Builder
         */
        public Builder unsetBalanceAmount() {
            balanceAmount = null;
            return this;
        }

        /**
         * Setter for balanceOldAmount.
         * @param  balanceOldAmount  String value for balanceOldAmount.
         * @return Builder
         */
        public Builder balanceOldAmount(String balanceOldAmount) {
            this.balanceOldAmount = OptionalNullable.of(balanceOldAmount);
            return this;
        }

        /**
         * UnSetter for balanceOldAmount.
         * @return Builder
         */
        public Builder unsetBalanceOldAmount() {
            balanceOldAmount = null;
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
         * Setter for movementObject.
         * @param  movementObject  GetMovementObjectBaseResponse value for movementObject.
         * @return Builder
         */
        public Builder movementObject(GetMovementObjectBaseResponse movementObject) {
            this.movementObject = movementObject;
            return this;
        }

        /**
         * Builds a new {@link GetBalanceOperationResponse} object using the set fields.
         * @return {@link GetBalanceOperationResponse}
         */
        public GetBalanceOperationResponse build() {
            return new GetBalanceOperationResponse(id, status, balanceAmount, balanceOldAmount,
                    type, amount, fee, createdAt, movementObject);
        }
    }
}
