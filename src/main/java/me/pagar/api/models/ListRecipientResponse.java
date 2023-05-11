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
 * This is a model class for ListRecipientResponse type.
 */
public class ListRecipientResponse {
    private OptionalNullable<List<GetRecipientResponse>> data;
    private OptionalNullable<PagingResponse> paging;

    /**
     * Default constructor.
     */
    public ListRecipientResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetRecipientResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListRecipientResponse(
            List<GetRecipientResponse> data,
            PagingResponse paging) {
        this.data = OptionalNullable.of(data);
        this.paging = OptionalNullable.of(paging);
    }

    /**
     * Internal initialization constructor.
     */
    protected ListRecipientResponse(OptionalNullable<List<GetRecipientResponse>> data,
            OptionalNullable<PagingResponse> paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Internal Getter for Data.
     * Recipients
     * @return Returns the Internal List of GetRecipientResponse
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<GetRecipientResponse>> internalGetData() {
        return this.data;
    }

    /**
     * Getter for Data.
     * Recipients
     * @return Returns the List of GetRecipientResponse
     */
    public List<GetRecipientResponse> getData() {
        return OptionalNullable.getFrom(data);
    }

    /**
     * Setter for Data.
     * Recipients
     * @param data Value for List of GetRecipientResponse
     */
    @JsonSetter("data")
    public void setData(List<GetRecipientResponse> data) {
        this.data = OptionalNullable.of(data);
    }

    /**
     * UnSetter for Data.
     * Recipients
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
     * Converts this ListRecipientResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListRecipientResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListRecipientResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListRecipientResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.data = internalGetData();
        builder.paging = internalGetPaging();
        return builder;
    }

    /**
     * Class to build instances of {@link ListRecipientResponse}.
     */
    public static class Builder {
        private OptionalNullable<List<GetRecipientResponse>> data;
        private OptionalNullable<PagingResponse> paging;



        /**
         * Setter for data.
         * @param  data  List of GetRecipientResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetRecipientResponse> data) {
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
         * Builds a new {@link ListRecipientResponse} object using the set fields.
         * @return {@link ListRecipientResponse}
         */
        public ListRecipientResponse build() {
            return new ListRecipientResponse(data, paging);
        }
    }
}
