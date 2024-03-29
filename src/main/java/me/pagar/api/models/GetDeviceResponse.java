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
 * This is a model class for GetDeviceResponse type.
 */
public class GetDeviceResponse {
    private OptionalNullable<String> platform;

    /**
     * Default constructor.
     */
    public GetDeviceResponse() {
    }

    /**
     * Initialization constructor.
     * @param  platform  String value for platform.
     */
    public GetDeviceResponse(
            String platform) {
        this.platform = OptionalNullable.of(platform);
    }

    /**
     * Initialization constructor.
     * @param  platform  String value for platform.
     */

    protected GetDeviceResponse(OptionalNullable<String> platform) {
        this.platform = platform;
    }

    /**
     * Internal Getter for Platform.
     * Device's platform name
     * @return Returns the Internal String
     */
    @JsonGetter("platform")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetPlatform() {
        return this.platform;
    }

    /**
     * Getter for Platform.
     * Device's platform name
     * @return Returns the String
     */
    public String getPlatform() {
        return OptionalNullable.getFrom(platform);
    }

    /**
     * Setter for Platform.
     * Device's platform name
     * @param platform Value for String
     */
    @JsonSetter("platform")
    public void setPlatform(String platform) {
        this.platform = OptionalNullable.of(platform);
    }

    /**
     * UnSetter for Platform.
     * Device's platform name
     */
    public void unsetPlatform() {
        platform = null;
    }

    /**
     * Converts this GetDeviceResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetDeviceResponse [" + "platform=" + platform + "]";
    }

    /**
     * Builds a new {@link GetDeviceResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetDeviceResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.platform = internalGetPlatform();
        return builder;
    }

    /**
     * Class to build instances of {@link GetDeviceResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> platform;



        /**
         * Setter for platform.
         * @param  platform  String value for platform.
         * @return Builder
         */
        public Builder platform(String platform) {
            this.platform = OptionalNullable.of(platform);
            return this;
        }

        /**
         * UnSetter for platform.
         * @return Builder
         */
        public Builder unsetPlatform() {
            platform = null;
            return this;
        }

        /**
         * Builds a new {@link GetDeviceResponse} object using the set fields.
         * @return {@link GetDeviceResponse}
         */
        public GetDeviceResponse build() {
            return new GetDeviceResponse(platform);
        }
    }
}
