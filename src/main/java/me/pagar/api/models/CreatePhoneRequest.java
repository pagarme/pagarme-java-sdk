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
 * This is a model class for CreatePhoneRequest type.
 */
public class CreatePhoneRequest {
    private String countryCode;
    private String number;
    private String areaCode;
    private OptionalNullable<String> type;

    /**
     * Default constructor.
     */
    public CreatePhoneRequest() {
    }

    /**
     * Initialization constructor.
     * @param  countryCode  String value for countryCode.
     * @param  number  String value for number.
     * @param  areaCode  String value for areaCode.
     * @param  type  String value for type.
     */
    public CreatePhoneRequest(
            String countryCode,
            String number,
            String areaCode,
            String type) {
        this.countryCode = countryCode;
        this.number = number;
        this.areaCode = areaCode;
        this.type = OptionalNullable.of(type);
    }

    /**
     * Internal initialization constructor.
     */
    protected CreatePhoneRequest(String countryCode, String number, String areaCode,
            OptionalNullable<String> type) {
        this.countryCode = countryCode;
        this.number = number;
        this.areaCode = areaCode;
        this.type = type;
    }

    /**
     * Getter for CountryCode.
     * @return Returns the String
     */
    @JsonGetter("country_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Setter for CountryCode.
     * @param countryCode Value for String
     */
    @JsonSetter("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Getter for Number.
     * @return Returns the String
     */
    @JsonGetter("number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * @param number Value for String
     */
    @JsonSetter("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter for AreaCode.
     * @return Returns the String
     */
    @JsonGetter("area_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Setter for AreaCode.
     * @param areaCode Value for String
     */
    @JsonSetter("area_code")
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * Internal Getter for Type.
     * @return Returns the Internal String
     */
    @JsonGetter("Type")
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
    @JsonSetter("Type")
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
     * Converts this CreatePhoneRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreatePhoneRequest [" + "countryCode=" + countryCode + ", number=" + number
                + ", areaCode=" + areaCode + ", type=" + type + "]";
    }

    /**
     * Builds a new {@link CreatePhoneRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreatePhoneRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .countryCode(getCountryCode())
                .number(getNumber())
                .areaCode(getAreaCode());
        builder.type = internalGetType();
        return builder;
    }

    /**
     * Class to build instances of {@link CreatePhoneRequest}.
     */
    public static class Builder {
        private String countryCode;
        private String number;
        private String areaCode;
        private OptionalNullable<String> type;



        /**
         * Setter for countryCode.
         * @param  countryCode  String value for countryCode.
         * @return Builder
         */
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Setter for number.
         * @param  number  String value for number.
         * @return Builder
         */
        public Builder number(String number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for areaCode.
         * @param  areaCode  String value for areaCode.
         * @return Builder
         */
        public Builder areaCode(String areaCode) {
            this.areaCode = areaCode;
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
         * Builds a new {@link CreatePhoneRequest} object using the set fields.
         * @return {@link CreatePhoneRequest}
         */
        public CreatePhoneRequest build() {
            return new CreatePhoneRequest(countryCode, number, areaCode, type);
        }
    }
}
