/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for ListSubscriptionsResponse type.
 */
public class ListSubscriptionsResponse {
    private List<GetSubscriptionResponse> data;
    private PagingResponse paging;

    /**
     * Default constructor.
     */
    public ListSubscriptionsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of GetSubscriptionResponse value for data.
     * @param  paging  PagingResponse value for paging.
     */
    public ListSubscriptionsResponse(
            List<GetSubscriptionResponse> data,
            PagingResponse paging) {
        this.data = data;
        this.paging = paging;
    }

    /**
     * Getter for Data.
     * The subscription objects
     * @return Returns the List of GetSubscriptionResponse
     */
    @JsonGetter("data")
    public List<GetSubscriptionResponse> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * The subscription objects
     * @param data Value for List of GetSubscriptionResponse
     */
    @JsonSetter("data")
    public void setData(List<GetSubscriptionResponse> data) {
        this.data = data;
    }

    /**
     * Getter for Paging.
     * Paging object
     * @return Returns the PagingResponse
     */
    @JsonGetter("paging")
    public PagingResponse getPaging() {
        return paging;
    }

    /**
     * Setter for Paging.
     * Paging object
     * @param paging Value for PagingResponse
     */
    @JsonSetter("paging")
    public void setPaging(PagingResponse paging) {
        this.paging = paging;
    }

    /**
     * Converts this ListSubscriptionsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListSubscriptionsResponse [" + "data=" + data + ", paging=" + paging + "]";
    }

    /**
     * Builds a new {@link ListSubscriptionsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListSubscriptionsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data, paging);
        return builder;
    }

    /**
     * Class to build instances of {@link ListSubscriptionsResponse}.
     */
    public static class Builder {
        private List<GetSubscriptionResponse> data;
        private PagingResponse paging;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  List of GetSubscriptionResponse value for data.
         * @param  paging  PagingResponse value for paging.
         */
        public Builder(List<GetSubscriptionResponse> data, PagingResponse paging) {
            this.data = data;
            this.paging = paging;
        }

        /**
         * Setter for data.
         * @param  data  List of GetSubscriptionResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetSubscriptionResponse> data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for paging.
         * @param  paging  PagingResponse value for paging.
         * @return Builder
         */
        public Builder paging(PagingResponse paging) {
            this.paging = paging;
            return this;
        }

        /**
         * Builds a new {@link ListSubscriptionsResponse} object using the set fields.
         * @return {@link ListSubscriptionsResponse}
         */
        public ListSubscriptionsResponse build() {
            return new ListSubscriptionsResponse(data, paging);
        }
    }
}
