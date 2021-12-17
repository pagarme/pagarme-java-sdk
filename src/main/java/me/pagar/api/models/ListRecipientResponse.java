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
 * This is a model class for ListRecipientResponse type.
 */
public class ListRecipientResponse {
    private List<GetRecipientResponse> data;
    private PagingResponse paging;

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
        this.data = data;
        this.paging = paging;
    }

    /**
     * Getter for Data.
     * Recipients
     * @return Returns the List of GetRecipientResponse
     */
    @JsonGetter("data")
    public List<GetRecipientResponse> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Recipients
     * @param data Value for List of GetRecipientResponse
     */
    @JsonSetter("data")
    public void setData(List<GetRecipientResponse> data) {
        this.data = data;
    }

    /**
     * Getter for Paging.
     * Paging
     * @return Returns the PagingResponse
     */
    @JsonGetter("paging")
    public PagingResponse getPaging() {
        return paging;
    }

    /**
     * Setter for Paging.
     * Paging
     * @param paging Value for PagingResponse
     */
    @JsonSetter("paging")
    public void setPaging(PagingResponse paging) {
        this.paging = paging;
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
        Builder builder = new Builder(data, paging);
        return builder;
    }

    /**
     * Class to build instances of {@link ListRecipientResponse}.
     */
    public static class Builder {
        private List<GetRecipientResponse> data;
        private PagingResponse paging;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  List of GetRecipientResponse value for data.
         * @param  paging  PagingResponse value for paging.
         */
        public Builder(List<GetRecipientResponse> data, PagingResponse paging) {
            this.data = data;
            this.paging = paging;
        }

        /**
         * Setter for data.
         * @param  data  List of GetRecipientResponse value for data.
         * @return Builder
         */
        public Builder data(List<GetRecipientResponse> data) {
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
         * Builds a new {@link ListRecipientResponse} object using the set fields.
         * @return {@link ListRecipientResponse}
         */
        public ListRecipientResponse build() {
            return new ListRecipientResponse(data, paging);
        }
    }
}
