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
 * This is a model class for GetSplitResponse type.
 */
public class GetSplitResponse {
    private OptionalNullable<String> type;
    private OptionalNullable<Integer> amount;
    private OptionalNullable<GetRecipientResponse> recipient;
    private OptionalNullable<String> gatewayId;
    private OptionalNullable<GetSplitOptionsResponse> options;
    private OptionalNullable<String> id;

    /**
     * Default constructor.
     */
    public GetSplitResponse() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  amount  Integer value for amount.
     * @param  recipient  GetRecipientResponse value for recipient.
     * @param  gatewayId  String value for gatewayId.
     * @param  options  GetSplitOptionsResponse value for options.
     * @param  id  String value for id.
     */
    public GetSplitResponse(
            String type,
            Integer amount,
            GetRecipientResponse recipient,
            String gatewayId,
            GetSplitOptionsResponse options,
            String id) {
        this.type = OptionalNullable.of(type);
        this.amount = OptionalNullable.of(amount);
        this.recipient = OptionalNullable.of(recipient);
        this.gatewayId = OptionalNullable.of(gatewayId);
        this.options = OptionalNullable.of(options);
        this.id = OptionalNullable.of(id);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetSplitResponse(OptionalNullable<String> type, OptionalNullable<Integer> amount,
            OptionalNullable<GetRecipientResponse> recipient, OptionalNullable<String> gatewayId,
            OptionalNullable<GetSplitOptionsResponse> options, OptionalNullable<String> id) {
        this.type = type;
        this.amount = amount;
        this.recipient = recipient;
        this.gatewayId = gatewayId;
        this.options = options;
        this.id = id;
    }

    /**
     * Internal Getter for Type.
     * Type
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
     * Type
     * @return Returns the String
     */
    public String getType() {
        return OptionalNullable.getFrom(type);
    }

    /**
     * Setter for Type.
     * Type
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = OptionalNullable.of(type);
    }

    /**
     * UnSetter for Type.
     * Type
     */
    public void unsetType() {
        type = null;
    }

    /**
     * Internal Getter for Amount.
     * Amount
     * @return Returns the Internal Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetAmount() {
        return this.amount;
    }

    /**
     * Getter for Amount.
     * Amount
     * @return Returns the Integer
     */
    public Integer getAmount() {
        return OptionalNullable.getFrom(amount);
    }

    /**
     * Setter for Amount.
     * Amount
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = OptionalNullable.of(amount);
    }

    /**
     * UnSetter for Amount.
     * Amount
     */
    public void unsetAmount() {
        amount = null;
    }

    /**
     * Internal Getter for Recipient.
     * Recipient
     * @return Returns the Internal GetRecipientResponse
     */
    @JsonGetter("recipient")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetRecipientResponse> internalGetRecipient() {
        return this.recipient;
    }

    /**
     * Getter for Recipient.
     * Recipient
     * @return Returns the GetRecipientResponse
     */
    public GetRecipientResponse getRecipient() {
        return OptionalNullable.getFrom(recipient);
    }

    /**
     * Setter for Recipient.
     * Recipient
     * @param recipient Value for GetRecipientResponse
     */
    @JsonSetter("recipient")
    public void setRecipient(GetRecipientResponse recipient) {
        this.recipient = OptionalNullable.of(recipient);
    }

    /**
     * UnSetter for Recipient.
     * Recipient
     */
    public void unsetRecipient() {
        recipient = null;
    }

    /**
     * Internal Getter for GatewayId.
     * The split rule gateway id
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
     * The split rule gateway id
     * @return Returns the String
     */
    public String getGatewayId() {
        return OptionalNullable.getFrom(gatewayId);
    }

    /**
     * Setter for GatewayId.
     * The split rule gateway id
     * @param gatewayId Value for String
     */
    @JsonSetter("gateway_id")
    public void setGatewayId(String gatewayId) {
        this.gatewayId = OptionalNullable.of(gatewayId);
    }

    /**
     * UnSetter for GatewayId.
     * The split rule gateway id
     */
    public void unsetGatewayId() {
        gatewayId = null;
    }

    /**
     * Internal Getter for Options.
     * @return Returns the Internal GetSplitOptionsResponse
     */
    @JsonGetter("options")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetSplitOptionsResponse> internalGetOptions() {
        return this.options;
    }

    /**
     * Getter for Options.
     * @return Returns the GetSplitOptionsResponse
     */
    public GetSplitOptionsResponse getOptions() {
        return OptionalNullable.getFrom(options);
    }

    /**
     * Setter for Options.
     * @param options Value for GetSplitOptionsResponse
     */
    @JsonSetter("options")
    public void setOptions(GetSplitOptionsResponse options) {
        this.options = OptionalNullable.of(options);
    }

    /**
     * UnSetter for Options.
     */
    public void unsetOptions() {
        options = null;
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
     * Converts this GetSplitResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetSplitResponse [" + "type=" + type + ", amount=" + amount + ", recipient="
                + recipient + ", gatewayId=" + gatewayId + ", options=" + options + ", id=" + id
                + "]";
    }

    /**
     * Builds a new {@link GetSplitResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetSplitResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.type = internalGetType();
        builder.amount = internalGetAmount();
        builder.recipient = internalGetRecipient();
        builder.gatewayId = internalGetGatewayId();
        builder.options = internalGetOptions();
        builder.id = internalGetId();
        return builder;
    }

    /**
     * Class to build instances of {@link GetSplitResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> type;
        private OptionalNullable<Integer> amount;
        private OptionalNullable<GetRecipientResponse> recipient;
        private OptionalNullable<String> gatewayId;
        private OptionalNullable<GetSplitOptionsResponse> options;
        private OptionalNullable<String> id;



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
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
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
         * Setter for recipient.
         * @param  recipient  GetRecipientResponse value for recipient.
         * @return Builder
         */
        public Builder recipient(GetRecipientResponse recipient) {
            this.recipient = OptionalNullable.of(recipient);
            return this;
        }

        /**
         * UnSetter for recipient.
         * @return Builder
         */
        public Builder unsetRecipient() {
            recipient = null;
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
         * Setter for options.
         * @param  options  GetSplitOptionsResponse value for options.
         * @return Builder
         */
        public Builder options(GetSplitOptionsResponse options) {
            this.options = OptionalNullable.of(options);
            return this;
        }

        /**
         * UnSetter for options.
         * @return Builder
         */
        public Builder unsetOptions() {
            options = null;
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
         * Builds a new {@link GetSplitResponse} object using the set fields.
         * @return {@link GetSplitResponse}
         */
        public GetSplitResponse build() {
            return new GetSplitResponse(type, amount, recipient, gatewayId, options, id);
        }
    }
}
