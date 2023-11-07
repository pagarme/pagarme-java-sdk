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
 * This is a model class for CreateCardPayloadRequest type.
 */
public class CreateCardPayloadRequest {
    private OptionalNullable<String> type;
    private OptionalNullable<CreateGooglePayRequest> googlePay;

    /**
     * Default constructor.
     */
    public CreateCardPayloadRequest() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  googlePay  CreateGooglePayRequest value for googlePay.
     */
    public CreateCardPayloadRequest(
            String type,
            CreateGooglePayRequest googlePay) {
        this.type = OptionalNullable.of(type);
        this.googlePay = OptionalNullable.of(googlePay);
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  googlePay  CreateGooglePayRequest value for googlePay.
     */

    protected CreateCardPayloadRequest(OptionalNullable<String> type,
            OptionalNullable<CreateGooglePayRequest> googlePay) {
        this.type = type;
        this.googlePay = googlePay;
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
     * Internal Getter for GooglePay.
     * @return Returns the Internal CreateGooglePayRequest
     */
    @JsonGetter("google_pay")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CreateGooglePayRequest> internalGetGooglePay() {
        return this.googlePay;
    }

    /**
     * Getter for GooglePay.
     * @return Returns the CreateGooglePayRequest
     */
    public CreateGooglePayRequest getGooglePay() {
        return OptionalNullable.getFrom(googlePay);
    }

    /**
     * Setter for GooglePay.
     * @param googlePay Value for CreateGooglePayRequest
     */
    @JsonSetter("google_pay")
    public void setGooglePay(CreateGooglePayRequest googlePay) {
        this.googlePay = OptionalNullable.of(googlePay);
    }

    /**
     * UnSetter for GooglePay.
     */
    public void unsetGooglePay() {
        googlePay = null;
    }

    /**
     * Converts this CreateCardPayloadRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCardPayloadRequest [" + "type=" + type + ", googlePay=" + googlePay + "]";
    }

    /**
     * Builds a new {@link CreateCardPayloadRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCardPayloadRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.type = internalGetType();
        builder.googlePay = internalGetGooglePay();
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCardPayloadRequest}.
     */
    public static class Builder {
        private OptionalNullable<String> type;
        private OptionalNullable<CreateGooglePayRequest> googlePay;



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
         * Setter for googlePay.
         * @param  googlePay  CreateGooglePayRequest value for googlePay.
         * @return Builder
         */
        public Builder googlePay(CreateGooglePayRequest googlePay) {
            this.googlePay = OptionalNullable.of(googlePay);
            return this;
        }

        /**
         * UnSetter for googlePay.
         * @return Builder
         */
        public Builder unsetGooglePay() {
            googlePay = null;
            return this;
        }

        /**
         * Builds a new {@link CreateCardPayloadRequest} object using the set fields.
         * @return {@link CreateCardPayloadRequest}
         */
        public CreateCardPayloadRequest build() {
            return new CreateCardPayloadRequest(type, googlePay);
        }
    }
}
