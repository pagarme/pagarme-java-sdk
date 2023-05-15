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
 * This is a model class for GetSubscriptionSplitResponse type.
 */
public class GetSubscriptionSplitResponse {
    private OptionalNullable<Boolean> enabled;
    private OptionalNullable<List<GetSplitResponse>> rules;

    /**
     * Default constructor.
     */
    public GetSubscriptionSplitResponse() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  rules  List of GetSplitResponse value for rules.
     */
    public GetSubscriptionSplitResponse(
            Boolean enabled,
            List<GetSplitResponse> rules) {
        this.enabled = OptionalNullable.of(enabled);
        this.rules = OptionalNullable.of(rules);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetSubscriptionSplitResponse(OptionalNullable<Boolean> enabled,
            OptionalNullable<List<GetSplitResponse>> rules) {
        this.enabled = enabled;
        this.rules = rules;
    }

    /**
     * Internal Getter for Enabled.
     * Defines if the split is enabled
     * @return Returns the Internal Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetEnabled() {
        return this.enabled;
    }

    /**
     * Getter for Enabled.
     * Defines if the split is enabled
     * @return Returns the Boolean
     */
    public Boolean getEnabled() {
        return OptionalNullable.getFrom(enabled);
    }

    /**
     * Setter for Enabled.
     * Defines if the split is enabled
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = OptionalNullable.of(enabled);
    }

    /**
     * UnSetter for Enabled.
     * Defines if the split is enabled
     */
    public void unsetEnabled() {
        enabled = null;
    }

    /**
     * Internal Getter for Rules.
     * Split
     * @return Returns the Internal List of GetSplitResponse
     */
    @JsonGetter("rules")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<GetSplitResponse>> internalGetRules() {
        return this.rules;
    }

    /**
     * Getter for Rules.
     * Split
     * @return Returns the List of GetSplitResponse
     */
    public List<GetSplitResponse> getRules() {
        return OptionalNullable.getFrom(rules);
    }

    /**
     * Setter for Rules.
     * Split
     * @param rules Value for List of GetSplitResponse
     */
    @JsonSetter("rules")
    public void setRules(List<GetSplitResponse> rules) {
        this.rules = OptionalNullable.of(rules);
    }

    /**
     * UnSetter for Rules.
     * Split
     */
    public void unsetRules() {
        rules = null;
    }

    /**
     * Converts this GetSubscriptionSplitResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetSubscriptionSplitResponse [" + "enabled=" + enabled + ", rules=" + rules + "]";
    }

    /**
     * Builds a new {@link GetSubscriptionSplitResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetSubscriptionSplitResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.enabled = internalGetEnabled();
        builder.rules = internalGetRules();
        return builder;
    }

    /**
     * Class to build instances of {@link GetSubscriptionSplitResponse}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> enabled;
        private OptionalNullable<List<GetSplitResponse>> rules;



        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = OptionalNullable.of(enabled);
            return this;
        }

        /**
         * UnSetter for enabled.
         * @return Builder
         */
        public Builder unsetEnabled() {
            enabled = null;
            return this;
        }

        /**
         * Setter for rules.
         * @param  rules  List of GetSplitResponse value for rules.
         * @return Builder
         */
        public Builder rules(List<GetSplitResponse> rules) {
            this.rules = OptionalNullable.of(rules);
            return this;
        }

        /**
         * UnSetter for rules.
         * @return Builder
         */
        public Builder unsetRules() {
            rules = null;
            return this;
        }

        /**
         * Builds a new {@link GetSubscriptionSplitResponse} object using the set fields.
         * @return {@link GetSubscriptionSplitResponse}
         */
        public GetSubscriptionSplitResponse build() {
            return new GetSubscriptionSplitResponse(enabled, rules);
        }
    }
}
