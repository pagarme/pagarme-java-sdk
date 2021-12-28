/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GetSplitResponse type.
 */
public class GetSplitResponse {
    private String type;
    private int amount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private GetRecipientResponse recipient;
    private String gatewayId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private GetSplitOptionsResponse options;
    private String id;

    /**
     * Default constructor.
     */
    public GetSplitResponse() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  amount  int value for amount.
     * @param  gatewayId  String value for gatewayId.
     * @param  id  String value for id.
     * @param  recipient  GetRecipientResponse value for recipient.
     * @param  options  GetSplitOptionsResponse value for options.
     */
    public GetSplitResponse(
            String type,
            int amount,
            String gatewayId,
            String id,
            GetRecipientResponse recipient,
            GetSplitOptionsResponse options) {
        this.type = type;
        this.amount = amount;
        this.recipient = recipient;
        this.gatewayId = gatewayId;
        this.options = options;
        this.id = id;
    }

    /**
     * Getter for Type.
     * Type
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Type
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Amount.
     * Amount
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter for Recipient.
     * Recipient
     * @return Returns the GetRecipientResponse
     */
    @JsonGetter("recipient")
    public GetRecipientResponse getRecipient() {
        return recipient;
    }

    /**
     * Setter for Recipient.
     * Recipient
     * @param recipient Value for GetRecipientResponse
     */
    @JsonSetter("recipient")
    public void setRecipient(GetRecipientResponse recipient) {
        this.recipient = recipient;
    }

    /**
     * Getter for GatewayId.
     * The split rule gateway id
     * @return Returns the String
     */
    @JsonGetter("gateway_id")
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * Setter for GatewayId.
     * The split rule gateway id
     * @param gatewayId Value for String
     */
    @JsonSetter("gateway_id")
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * Getter for Options.
     * @return Returns the GetSplitOptionsResponse
     */
    @JsonGetter("options")
    public GetSplitOptionsResponse getOptions() {
        return options;
    }

    /**
     * Setter for Options.
     * @param options Value for GetSplitOptionsResponse
     */
    @JsonSetter("options")
    public void setOptions(GetSplitOptionsResponse options) {
        this.options = options;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Converts this GetSplitResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetSplitResponse [" + "type=" + type + ", amount=" + amount + ", gatewayId="
                + gatewayId + ", id=" + id + ", recipient=" + recipient + ", options=" + options
                + "]";
    }

    /**
     * Builds a new {@link GetSplitResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetSplitResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, amount, gatewayId, id)
                .recipient(getRecipient())
                .options(getOptions());
        return builder;
    }

    /**
     * Class to build instances of {@link GetSplitResponse}.
     */
    public static class Builder {
        private String type;
        private int amount;
        private String gatewayId;
        private String id;
        private GetRecipientResponse recipient;
        private GetSplitOptionsResponse options;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  String value for type.
         * @param  amount  int value for amount.
         * @param  gatewayId  String value for gatewayId.
         * @param  id  String value for id.
         */
        public Builder(String type, int amount, String gatewayId, String id) {
            this.type = type;
            this.amount = amount;
            this.gatewayId = gatewayId;
            this.id = id;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  int value for amount.
         * @return Builder
         */
        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for gatewayId.
         * @param  gatewayId  String value for gatewayId.
         * @return Builder
         */
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for recipient.
         * @param  recipient  GetRecipientResponse value for recipient.
         * @return Builder
         */
        public Builder recipient(GetRecipientResponse recipient) {
            this.recipient = recipient;
            return this;
        }

        /**
         * Setter for options.
         * @param  options  GetSplitOptionsResponse value for options.
         * @return Builder
         */
        public Builder options(GetSplitOptionsResponse options) {
            this.options = options;
            return this;
        }

        /**
         * Builds a new {@link GetSplitResponse} object using the set fields.
         * @return {@link GetSplitResponse}
         */
        public GetSplitResponse build() {
            return new GetSplitResponse(type, amount, gatewayId, id, recipient, options);
        }
    }
}