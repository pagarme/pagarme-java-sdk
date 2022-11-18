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
 * This is a model class for GetSubscriptionSplitResponse type.
 */
public class GetSubscriptionSplitResponse {
    private boolean enabled;
    private List<GetSplitResponse> rules;

    /**
     * Default constructor.
     */
    public GetSubscriptionSplitResponse() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  boolean value for enabled.
     * @param  rules  List of GetSplitResponse value for rules.
     */
    public GetSubscriptionSplitResponse(
            boolean enabled,
            List<GetSplitResponse> rules) {
        this.enabled = enabled;
        this.rules = rules;
    }

    /**
     * Getter for Enabled.
     * Defines if the split is enabled
     * @return Returns the boolean
     */
    @JsonGetter("enabled")
    public boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * Defines if the split is enabled
     * @param enabled Value for boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for Rules.
     * Split
     * @return Returns the List of GetSplitResponse
     */
    @JsonGetter("rules")
    public List<GetSplitResponse> getRules() {
        return rules;
    }

    /**
     * Setter for Rules.
     * Split
     * @param rules Value for List of GetSplitResponse
     */
    @JsonSetter("rules")
    public void setRules(List<GetSplitResponse> rules) {
        this.rules = rules;
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
        Builder builder = new Builder(enabled, rules);
        return builder;
    }

    /**
     * Class to build instances of {@link GetSubscriptionSplitResponse}.
     */
    public static class Builder {
        private boolean enabled;
        private List<GetSplitResponse> rules;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  enabled  boolean value for enabled.
         * @param  rules  List of GetSplitResponse value for rules.
         */
        public Builder(boolean enabled, List<GetSplitResponse> rules) {
            this.enabled = enabled;
            this.rules = rules;
        }

        /**
         * Setter for enabled.
         * @param  enabled  boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setter for rules.
         * @param  rules  List of GetSplitResponse value for rules.
         * @return Builder
         */
        public Builder rules(List<GetSplitResponse> rules) {
            this.rules = rules;
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
