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
 * This is a model class for ListCustomersResponse type.
 */
public class ListCustomersResponse {
    private OptionalNullable<List<GetCustomerResponse>> data;
    private OptionalNullable<PagingResponse> paging;

    /**
     * Default constructor.
     */
    public ListCustomersResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetCustomerResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListCustomersResponse(
            List<GetCustomerResponse> data,
            PagingResponse paging) {
        this.data = OptionalNullable.of(data);
        this.paging = OptionalNullable.of(paging);
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetCustomerResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */

    protected ListCustomersResponse(OptionalNullable<List<GetCustomerResponse>> data,
            OptionalNullable<PagingResponse> paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Internal Getter for Data.
     * The customer object
     * @return Returns the Internal List of GetCustomerResponse
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<GetCustomerResponse>> internalGetData() {
        return this.data;
    }

    /**
     * Getter for Data.
     * The customer object
     * @return Returns the List of GetCustomerResponse
     */
    public List<GetCustomerResponse> getData() {
        return OptionalNullable.getFrom(data);
    }

    /**
     * Setter for Data.
     * The customer object
     * @param data Value for List of GetCustomerResponse
     */
    @JsonSetter("data")
    public void setData(List<GetCustomerResponse> data) {
        this.data = OptionalNullable.of(data);
    }

    /**
     * UnSetter for Data.
     * The customer object
     */
    public void unsetData() {
        data = null;
    }

    /**
     * Internal Getter for Paging.
     * Paging object
     * @return Returns the Internal PagingResponse
     */
    @JsonGetter("paging")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<PagingResponse> internalGetPaging() {
        return this.paging;
    }

    /**
     * Getter for Paging.
     * Paging object
     * @return Returns the PagingResponse
     */
    public PagingResponse getPaging() {
        return OptionalNullable.getFrom(paging);
    }

    /**
     * Setter for Paging.
     * Paging object
     * @param paging Value for PagingResponse
     */
    @JsonSetter("paging")
    public void setPaging(PagingResponse paging) {
        this.paging = OptionalNullable.of(paging);
    }

    /**
     * UnSetter for Paging.
     * Paging object
     */
    public void unsetPaging() {
        paging = null;
    }

    /**
     * Converts this ListCustomersResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCustomersResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListCustomersResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListCustomersResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.data = internalGetData();
        builder.paging = internalGetPaging();
        return builder;
    }

    /**
     * Class to build instances of {@link ListCustomersResponse}.
     */
    public static class Builder {
        private OptionalNullable<List<GetCustomerResponse>> data;
        private OptionalNullable<PagingResponse> paging;



        /**
         * Setter for data.
         * @param  data  List of GetCustomerResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetCustomerResponse> data) {
            this.data = OptionalNullable.of(data);
            return this;
        }

        /**
         * UnSetter for data.
         * @return Builder
         */
        public Builder unsetData() {
            data = null;
            return this;
        }

        /**
         * Setter for paging.
         * @param  paging  PagingResponse value for paging.
         * @return Builder
         */
        public Builder paging(PagingResponse paging) {
            this.paging = OptionalNullable.of(paging);
            return this;
        }

        /**
         * UnSetter for paging.
         * @return Builder
         */
        public Builder unsetPaging() {
            paging = null;
            return this;
        }

        /**
         * Builds a new {@link ListCustomersResponse} object using the set fields.
         * @return {@link ListCustomersResponse}
         */
        public ListCustomersResponse build() {
            return new ListCustomersResponse(data, paging);
        }
    }
}
