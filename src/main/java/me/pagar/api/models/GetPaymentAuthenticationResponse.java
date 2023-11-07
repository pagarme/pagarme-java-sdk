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
 * This is a model class for GetPaymentAuthenticationResponse type.
 */
public class GetPaymentAuthenticationResponse {
    private OptionalNullable<String> type;
    private OptionalNullable<GetThreeDSecureResponse> threedSecure;

    /**
     * Default constructor.
     */
    public GetPaymentAuthenticationResponse() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  threedSecure  GetThreeDSecureResponse value for threedSecure.
     */
    public GetPaymentAuthenticationResponse(
            String type,
            GetThreeDSecureResponse threedSecure) {
        this.type = OptionalNullable.of(type);
        this.threedSecure = OptionalNullable.of(threedSecure);
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  threedSecure  GetThreeDSecureResponse value for threedSecure.
     */

    protected GetPaymentAuthenticationResponse(OptionalNullable<String> type,
            OptionalNullable<GetThreeDSecureResponse> threedSecure) {
        this.type = type;
        this.threedSecure = threedSecure;
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
     * Internal Getter for ThreedSecure.
     * 3D-S payment authentication response
     * @return Returns the Internal GetThreeDSecureResponse
     */
    @JsonGetter("threed_secure")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetThreeDSecureResponse> internalGetThreedSecure() {
        return this.threedSecure;
    }

    /**
     * Getter for ThreedSecure.
     * 3D-S payment authentication response
     * @return Returns the GetThreeDSecureResponse
     */
    public GetThreeDSecureResponse getThreedSecure() {
        return OptionalNullable.getFrom(threedSecure);
    }

    /**
     * Setter for ThreedSecure.
     * 3D-S payment authentication response
     * @param threedSecure Value for GetThreeDSecureResponse
     */
    @JsonSetter("threed_secure")
    public void setThreedSecure(GetThreeDSecureResponse threedSecure) {
        this.threedSecure = OptionalNullable.of(threedSecure);
    }

    /**
     * UnSetter for ThreedSecure.
     * 3D-S payment authentication response
     */
    public void unsetThreedSecure() {
        threedSecure = null;
    }

    /**
     * Converts this GetPaymentAuthenticationResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetPaymentAuthenticationResponse [" + "type=" + type + ", threedSecure="
                + threedSecure + "]";
    }

    /**
     * Builds a new {@link GetPaymentAuthenticationResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetPaymentAuthenticationResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.type = internalGetType();
        builder.threedSecure = internalGetThreedSecure();
        return builder;
    }

    /**
     * Class to build instances of {@link GetPaymentAuthenticationResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> type;
        private OptionalNullable<GetThreeDSecureResponse> threedSecure;



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
         * Setter for threedSecure.
         * @param  threedSecure  GetThreeDSecureResponse value for threedSecure.
         * @return Builder
         */
        public Builder threedSecure(GetThreeDSecureResponse threedSecure) {
            this.threedSecure = OptionalNullable.of(threedSecure);
            return this;
        }

        /**
         * UnSetter for threedSecure.
         * @return Builder
         */
        public Builder unsetThreedSecure() {
            threedSecure = null;
            return this;
        }

        /**
         * Builds a new {@link GetPaymentAuthenticationResponse} object using the set fields.
         * @return {@link GetPaymentAuthenticationResponse}
         */
        public GetPaymentAuthenticationResponse build() {
            return new GetPaymentAuthenticationResponse(type, threedSecure);
        }
    }
}
