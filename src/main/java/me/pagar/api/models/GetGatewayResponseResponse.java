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
import java.util.List;

/**
 * This is a model class for GetGatewayResponseResponse type.
 */
public class GetGatewayResponseResponse {
    private OptionalNullable<String> code;
    private OptionalNullable<List<GetGatewayErrorResponse>> errors;

    /**
     * Default constructor.
     */
    public GetGatewayResponseResponse() {
    }

    /**
     * Initialization constructor.
     * @param  code  String value for code.
     * @param  errors  List of GetGatewayErrorResponse value for errors.
     */
    public GetGatewayResponseResponse(
            String code,
            List<GetGatewayErrorResponse> errors) {
        this.code = OptionalNullable.of(code);
        this.errors = OptionalNullable.of(errors);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetGatewayResponseResponse(OptionalNullable<String> code,
            OptionalNullable<List<GetGatewayErrorResponse>> errors) {
        this.code = code;
        this.errors = errors;
    }

    /**
     * Internal Getter for Code.
     * The error code
     * @return Returns the Internal String
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCode() {
        return this.code;
    }

    /**
     * Getter for Code.
     * The error code
     * @return Returns the String
     */
    public String getCode() {
        return OptionalNullable.getFrom(code);
    }

    /**
     * Setter for Code.
     * The error code
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = OptionalNullable.of(code);
    }

    /**
     * UnSetter for Code.
     * The error code
     */
    public void unsetCode() {
        code = null;
    }

    /**
     * Internal Getter for Errors.
     * The gateway response errors list
     * @return Returns the Internal List of GetGatewayErrorResponse
     */
    @JsonGetter("errors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<GetGatewayErrorResponse>> internalGetErrors() {
        return this.errors;
    }

    /**
     * Getter for Errors.
     * The gateway response errors list
     * @return Returns the List of GetGatewayErrorResponse
     */
    public List<GetGatewayErrorResponse> getErrors() {
        return OptionalNullable.getFrom(errors);
    }

    /**
     * Setter for Errors.
     * The gateway response errors list
     * @param errors Value for List of GetGatewayErrorResponse
     */
    @JsonSetter("errors")
    public void setErrors(List<GetGatewayErrorResponse> errors) {
        this.errors = OptionalNullable.of(errors);
    }

    /**
     * UnSetter for Errors.
     * The gateway response errors list
     */
    public void unsetErrors() {
        errors = null;
    }

    /**
     * Converts this GetGatewayResponseResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetGatewayResponseResponse [" + "code=" + code + ", errors=" + errors + "]";
    }

    /**
     * Builds a new {@link GetGatewayResponseResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetGatewayResponseResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.code = internalGetCode();
        builder.errors = internalGetErrors();
        return builder;
    }

    /**
     * Class to build instances of {@link GetGatewayResponseResponse}.
     */
    public static class Builder {
        private OptionalNullable<String> code;
        private OptionalNullable<List<GetGatewayErrorResponse>> errors;



        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = OptionalNullable.of(code);
            return this;
        }

        /**
         * UnSetter for code.
         * @return Builder
         */
        public Builder unsetCode() {
            code = null;
            return this;
        }

        /**
         * Setter for errors.
         * @param  errors  List of GetGatewayErrorResponse value for errors.
         * @return Builder
         */
        public Builder errors(List<GetGatewayErrorResponse> errors) {
            this.errors = OptionalNullable.of(errors);
            return this;
        }

        /**
         * UnSetter for errors.
         * @return Builder
         */
        public Builder unsetErrors() {
            errors = null;
            return this;
        }

        /**
         * Builds a new {@link GetGatewayResponseResponse} object using the set fields.
         * @return {@link GetGatewayResponseResponse}
         */
        public GetGatewayResponseResponse build() {
            return new GetGatewayResponseResponse(code, errors);
        }
    }
}
