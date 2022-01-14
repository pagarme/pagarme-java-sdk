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
 * This is a model class for UpdateSubscriptionSplitRequest type.
 */
public class UpdateSubscriptionSplitRequest {
    private boolean enabled;
    private List<CreateSplitRequest> rules;

    /**
     * Default constructor.
     */
    public UpdateSubscriptionSplitRequest() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  boolean value for enabled.
     * @param  rules  List of CreateSplitRequest value for rules.
     */
    public UpdateSubscriptionSplitRequest(
            boolean enabled,
            List<CreateSplitRequest> rules) {
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
     * @return Returns the List of CreateSplitRequest
     */
    @JsonGetter("rules")
    public List<CreateSplitRequest> getRules() {
        return rules;
    }

    /**
     * Setter for Rules.
     * Split
     * @param rules Value for List of CreateSplitRequest
     */
    @JsonSetter("rules")
    public void setRules(List<CreateSplitRequest> rules) {
        this.rules = rules;
    }

    /**
     * Converts this UpdateSubscriptionSplitRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateSubscriptionSplitRequest [" + "enabled=" + enabled + ", rules=" + rules + "]";
    }

    /**
     * Builds a new {@link UpdateSubscriptionSplitRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateSubscriptionSplitRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(enabled, rules);
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateSubscriptionSplitRequest}.
     */
    public static class Builder {
        private boolean enabled;
        private List<CreateSplitRequest> rules;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  enabled  boolean value for enabled.
         * @param  rules  List of CreateSplitRequest value for rules.
         */
        public Builder(boolean enabled, List<CreateSplitRequest> rules) {
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
         * @param  rules  List of CreateSplitRequest value for rules.
         * @return Builder
         */
        public Builder rules(List<CreateSplitRequest> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * Builds a new {@link UpdateSubscriptionSplitRequest} object using the set fields.
         * @return {@link UpdateSubscriptionSplitRequest}
         */
        public UpdateSubscriptionSplitRequest build() {
            return new UpdateSubscriptionSplitRequest(enabled, rules);
        }
    }
}
