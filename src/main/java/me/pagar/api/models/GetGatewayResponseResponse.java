/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for GetGatewayResponseResponse type.
 */
public class GetGatewayResponseResponse {
    private String code;
    private List<GetGatewayErrorResponse> errors;

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
        this.code = code;
        this.errors = errors;
    }

    /**
     * Getter for Code.
     * The error code
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * The error code
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Errors.
     * The gateway response errors list
     * @return Returns the List of GetGatewayErrorResponse
     */
    @JsonGetter("errors")
    public List<GetGatewayErrorResponse> getErrors() {
        return errors;
    }

    /**
     * Setter for Errors.
     * The gateway response errors list
     * @param errors Value for List of GetGatewayErrorResponse
     */
    @JsonSetter("errors")
    public void setErrors(List<GetGatewayErrorResponse> errors) {
        this.errors = errors;
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
        Builder builder = new Builder(code, errors);
        return builder;
    }

    /**
     * Class to build instances of {@link GetGatewayResponseResponse}.
     */
    public static class Builder {
        private String code;
        private List<GetGatewayErrorResponse> errors;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  code  String value for code.
         * @param  errors  List of GetGatewayErrorResponse value for errors.
         */
        public Builder(String code, List<GetGatewayErrorResponse> errors) {
            this.code = code;
            this.errors = errors;
        }

        /**
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for errors.
         * @param  errors  List of GetGatewayErrorResponse value for errors.
         * @return Builder
         */
        public Builder errors(List<GetGatewayErrorResponse> errors) {
            this.errors = errors;
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
