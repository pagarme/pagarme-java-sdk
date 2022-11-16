/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetAccessTokenResponse type.
 */
public class GetAccessTokenResponse {
    private String id;
    private String code;
    private String status;
    private LocalDateTime createdAt;
    private GetCustomerResponse customer;

    /**
     * Default constructor.
     */
    public GetAccessTokenResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  code  String value for code.
     * @param  status  String value for status.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  customer  GetCustomerResponse value for customer.
     */
    public GetAccessTokenResponse(
            String id,
            String code,
            String status,
            LocalDateTime createdAt,
            GetCustomerResponse customer) {
        this.id = id;
        this.code = code;
        this.status = status;
        this.createdAt = createdAt;
        this.customer = customer;
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
     * Getter for Code.
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for Customer.
     * @return Returns the GetCustomerResponse
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GetCustomerResponse getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * @param customer Value for GetCustomerResponse
     */
    @JsonSetter("customer")
    public void setCustomer(GetCustomerResponse customer) {
        this.customer = customer;
    }

    /**
     * Converts this GetAccessTokenResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetAccessTokenResponse [" + "id=" + id + ", code=" + code + ", status=" + status
                + ", createdAt=" + createdAt + ", customer=" + customer + "]";
    }

    /**
     * Builds a new {@link GetAccessTokenResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetAccessTokenResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, code, status, createdAt)
                .customer(getCustomer());
        return builder;
    }

    /**
     * Class to build instances of {@link GetAccessTokenResponse}.
     */
    public static class Builder {
        private String id;
        private String code;
        private String status;
        private LocalDateTime createdAt;
        private GetCustomerResponse customer;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  code  String value for code.
         * @param  status  String value for status.
         * @param  createdAt  LocalDateTime value for createdAt.
         */
        public Builder(String id, String code, String status, LocalDateTime createdAt) {
            this.id = id;
            this.code = code;
            this.status = status;
            this.createdAt = createdAt;
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
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  GetCustomerResponse value for customer.
         * @return Builder
         */
        public Builder customer(GetCustomerResponse customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Builds a new {@link GetAccessTokenResponse} object using the set fields.
         * @return {@link GetAccessTokenResponse}
         */
        public GetAccessTokenResponse build() {
            return new GetAccessTokenResponse(id, code, status, createdAt, customer);
        }
    }
}
