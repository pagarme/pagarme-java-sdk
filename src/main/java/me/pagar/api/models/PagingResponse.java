/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PagingResponse type.
 */
public class PagingResponse {
    private int total;
    private String previous;
    private String next;

    /**
     * Default constructor.
     */
    public PagingResponse() {
    }

    /**
     * Initialization constructor.
     * @param  total  int value for total.
     * @param  previous  String value for previous.
     * @param  next  String value for next.
     */
    public PagingResponse(
            int total,
            String previous,
            String next) {
        this.total = total;
        this.previous = previous;
        this.next = next;
    }

    /**
     * Getter for Total.
     * Total number of pages
     * @return Returns the int
     */
    @JsonGetter("total")
    public int getTotal() {
        return total;
    }

    /**
     * Setter for Total.
     * Total number of pages
     * @param total Value for int
     */
    @JsonSetter("total")
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Getter for Previous.
     * Previous page
     * @return Returns the String
     */
    @JsonGetter("previous")
    public String getPrevious() {
        return previous;
    }

    /**
     * Setter for Previous.
     * Previous page
     * @param previous Value for String
     */
    @JsonSetter("previous")
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    /**
     * Getter for Next.
     * Next page
     * @return Returns the String
     */
    @JsonGetter("next")
    public String getNext() {
        return next;
    }

    /**
     * Setter for Next.
     * Next page
     * @param next Value for String
     */
    @JsonSetter("next")
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * Converts this PagingResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PagingResponse [" + "total=" + total + ", previous=" + previous + ", next=" + next
                + "]";
    }

    /**
     * Builds a new {@link PagingResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PagingResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(total, previous, next);
        return builder;
    }

    /**
     * Class to build instances of {@link PagingResponse}.
     */
    public static class Builder {
        private int total;
        private String previous;
        private String next;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  total  int value for total.
         * @param  previous  String value for previous.
         * @param  next  String value for next.
         */
        public Builder(int total, String previous, String next) {
            this.total = total;
            this.previous = previous;
            this.next = next;
        }

        /**
         * Setter for total.
         * @param  total  int value for total.
         * @return Builder
         */
        public Builder total(int total) {
            this.total = total;
            return this;
        }

        /**
         * Setter for previous.
         * @param  previous  String value for previous.
         * @return Builder
         */
        public Builder previous(String previous) {
            this.previous = previous;
            return this;
        }

        /**
         * Setter for next.
         * @param  next  String value for next.
         * @return Builder
         */
        public Builder next(String next) {
            this.next = next;
            return this;
        }

        /**
         * Builds a new {@link PagingResponse} object using the set fields.
         * @return {@link PagingResponse}
         */
        public PagingResponse build() {
            return new PagingResponse(total, previous, next);
        }
    }
}