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
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for ListSubscriptionItemsResponse type.
 */
public class ListSubscriptionItemsResponse {
    private OptionalNullable<List<GetSubscriptionItemResponse>> data;
    private OptionalNullable<PagingResponse> paging;

    /**
     * Default constructor.
     */
    public ListSubscriptionItemsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetSubscriptionItemResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListSubscriptionItemsResponse(
            List<GetSubscriptionItemResponse> data,
            PagingResponse paging) {
        this.data = OptionalNullable.of(data);
        this.paging = OptionalNullable.of(paging);
    }

    /**
     * Internal initialization constructor.
     */
    protected ListSubscriptionItemsResponse(
            OptionalNullable<List<GetSubscriptionItemResponse>> data,
            OptionalNullable<PagingResponse> paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Internal Getter for Data.
     * The subscription items
     * @return Returns the Internal List of GetSubscriptionItemResponse
     */
    @JsonGetter("data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<GetSubscriptionItemResponse>> internalGetData() {
        return this.data;
    }

    /**
     * Getter for Data.
     * The subscription items
     * @return Returns the List of GetSubscriptionItemResponse
     */
    public List<GetSubscriptionItemResponse> getData() {
        return OptionalNullable.getFrom(data);
    }

    /**
     * Setter for Data.
     * The subscription items
     * @param data Value for List of GetSubscriptionItemResponse
     */
    @JsonSetter("data")
    public void setData(List<GetSubscriptionItemResponse> data) {
        this.data = OptionalNullable.of(data);
    }

    /**
     * UnSetter for Data.
     * The subscription items
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
     * Converts this ListSubscriptionItemsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionItemsResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListSubscriptionItemsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubscriptionItemsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.data = internalGetData();
        builder.paging = internalGetPaging();
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionItemsResponse}.
     */
    public static class Builder {
        private OptionalNullable<List<GetSubscriptionItemResponse>> data;
        private OptionalNullable<PagingResponse> paging;



        /**
         * Setter for data.
         * @param  data  List of GetSubscriptionItemResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetSubscriptionItemResponse> data) {
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
         * Builds a new {@link ListSubscriptionItemsResponse} object using the set fields.
         * @return {@link ListSubscriptionItemsResponse}
         */
        public ListSubscriptionItemsResponse build() {
            return new ListSubscriptionItemsResponse(data, paging);
        }
    }
}
