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
 * This is a model class for ListTransferResponse type.
 */
public class ListTransferResponse {
    private OptionalNullable<List<GetTransferResponse>> data;
    private OptionalNullable<PagingResponse> paging;

    /**
     * Default constructor.
     */
    public ListTransferResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetTransferResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListTransferResponse(
            List<GetTransferResponse> data,
            PagingResponse paging) {
        this.data = OptionalNullable.of(data);
        this.paging = OptionalNullable.of(paging);
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetTransferResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */

    protected ListTransferResponse(OptionalNullable<List<GetTransferResponse>> data,
            OptionalNullable<PagingResponse> paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Internal Getter for Data.
     * Transfers
     * @return Returns the Internal List of GetTransferResponse
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<GetTransferResponse>> internalGetData() {
        return this.data;
    }

    /**
     * Getter for Data.
     * Transfers
     * @return Returns the List of GetTransferResponse
     */
    public List<GetTransferResponse> getData() {
        return OptionalNullable.getFrom(data);
    }

    /**
     * Setter for Data.
     * Transfers
     * @param data Value for List of GetTransferResponse
     */
    @JsonSetter("data")
    public void setData(List<GetTransferResponse> data) {
        this.data = OptionalNullable.of(data);
    }

    /**
     * UnSetter for Data.
     * Transfers
     */
    public void unsetData() {
        data = null;
    }

    /**
     * Internal Getter for Paging.
     * Paging
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
     * Paging
     * @return Returns the PagingResponse
     */
    public PagingResponse getPaging() {
        return OptionalNullable.getFrom(paging);
    }

    /**
     * Setter for Paging.
     * Paging
     * @param paging Value for PagingResponse
     */
    @JsonSetter("paging")
    public void setPaging(PagingResponse paging) {
        this.paging = OptionalNullable.of(paging);
    }

    /**
     * UnSetter for Paging.
     * Paging
     */
    public void unsetPaging() {
        paging = null;
    }

    /**
     * Converts this ListTransferResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListTransferResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListTransferResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListTransferResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.data = internalGetData();
        builder.paging = internalGetPaging();
        return builder;
    }

    /**
     * Class to build instances of {@link ListTransferResponse}.
     */
    public static class Builder {
        private OptionalNullable<List<GetTransferResponse>> data;
        private OptionalNullable<PagingResponse> paging;



        /**
         * Setter for data.
         * @param  data  List of GetTransferResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetTransferResponse> data) {
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
         * Builds a new {@link ListTransferResponse} object using the set fields.
         * @return {@link ListTransferResponse}
         */
        public ListTransferResponse build() {
            return new ListTransferResponse(data, paging);
        }
    }
}
