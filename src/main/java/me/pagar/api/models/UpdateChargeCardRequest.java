/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for UpdateChargeCardRequest type.
 */
public class UpdateChargeCardRequest {
    private boolean updateSubscription;
    private String cardId;
    private CreateCardRequest card;
    private boolean recurrence;
    private String initiatedType;
    private String recurrenceModel;
    private CreatePaymentOriginRequest paymentOrigin;
    private String indirectAcceptor;

    /**
     * Default constructor.
     */
    public UpdateChargeCardRequest() {
    }

    /**
     * Initialization constructor.
     * @param  updateSubscription  boolean value for updateSubscription.
     * @param  cardId  String value for cardId.
     * @param  card  CreateCardRequest value for card.
     * @param  recurrence  boolean value for recurrence.
     * @param  initiatedType  String value for initiatedType.
     * @param  recurrenceModel  String value for recurrenceModel.
     * @param  paymentOrigin  CreatePaymentOriginRequest value for paymentOrigin.
     * @param  indirectAcceptor  String value for indirectAcceptor.
     */
    public UpdateChargeCardRequest(
            boolean updateSubscription,
            String cardId,
            CreateCardRequest card,
            boolean recurrence,
            String initiatedType,
            String recurrenceModel,
            CreatePaymentOriginRequest paymentOrigin,
            String indirectAcceptor) {
        this.updateSubscription = updateSubscription;
        this.cardId = cardId;
        this.card = card;
        this.recurrence = recurrence;
        this.initiatedType = initiatedType;
        this.recurrenceModel = recurrenceModel;
        this.paymentOrigin = paymentOrigin;
        this.indirectAcceptor = indirectAcceptor;
    }

    /**
     * Getter for UpdateSubscription.
     * Indicates if the subscriptions using this card must also be updated
     * @return Returns the boolean
     */
    @JsonGetter("update_subscription")
    public boolean getUpdateSubscription() {
        return updateSubscription;
    }

    /**
     * Setter for UpdateSubscription.
     * Indicates if the subscriptions using this card must also be updated
     * @param updateSubscription Value for boolean
     */
    @JsonSetter("update_subscription")
    public void setUpdateSubscription(boolean updateSubscription) {
        this.updateSubscription = updateSubscription;
    }

    /**
     * Getter for CardId.
     * Card id
     * @return Returns the String
     */
    @JsonGetter("card_id")
    public String getCardId() {
        return cardId;
    }

    /**
     * Setter for CardId.
     * Card id
     * @param cardId Value for String
     */
    @JsonSetter("card_id")
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * Getter for Card.
     * Card data
     * @return Returns the CreateCardRequest
     */
    @JsonGetter("card")
    public CreateCardRequest getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * Card data
     * @param card Value for CreateCardRequest
     */
    @JsonSetter("card")
    public void setCard(CreateCardRequest card) {
        this.card = card;
    }

    /**
     * Getter for Recurrence.
     * Indicates a recurrence
     * @return Returns the boolean
     */
    @JsonGetter("recurrence")
    public boolean getRecurrence() {
        return recurrence;
    }

    /**
     * Setter for Recurrence.
     * Indicates a recurrence
     * @param recurrence Value for boolean
     */
    @JsonSetter("recurrence")
    public void setRecurrence(boolean recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * Getter for InitiatedType.
     * @return Returns the String
     */
    @JsonGetter("initiated_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInitiatedType() {
        return initiatedType;
    }

    /**
     * Setter for InitiatedType.
     * @param initiatedType Value for String
     */
    @JsonSetter("initiated_type")
    public void setInitiatedType(String initiatedType) {
        this.initiatedType = initiatedType;
    }

    /**
     * Getter for RecurrenceModel.
     * @return Returns the String
     */
    @JsonGetter("recurrence_model")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurrenceModel() {
        return recurrenceModel;
    }

    /**
     * Setter for RecurrenceModel.
     * @param recurrenceModel Value for String
     */
    @JsonSetter("recurrence_model")
    public void setRecurrenceModel(String recurrenceModel) {
        this.recurrenceModel = recurrenceModel;
    }

    /**
     * Getter for PaymentOrigin.
     * @return Returns the CreatePaymentOriginRequest
     */
    @JsonGetter("payment_origin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreatePaymentOriginRequest getPaymentOrigin() {
        return paymentOrigin;
    }

    /**
     * Setter for PaymentOrigin.
     * @param paymentOrigin Value for CreatePaymentOriginRequest
     */
    @JsonSetter("payment_origin")
    public void setPaymentOrigin(CreatePaymentOriginRequest paymentOrigin) {
        this.paymentOrigin = paymentOrigin;
    }

    /**
     * Getter for IndirectAcceptor.
     * Business model identifier
     * @return Returns the String
     */
    @JsonGetter("indirect_acceptor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIndirectAcceptor() {
        return indirectAcceptor;
    }

    /**
     * Setter for IndirectAcceptor.
     * Business model identifier
     * @param indirectAcceptor Value for String
     */
    @JsonSetter("indirect_acceptor")
    public void setIndirectAcceptor(String indirectAcceptor) {
        this.indirectAcceptor = indirectAcceptor;
    }

    /**
     * Converts this UpdateChargeCardRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UpdateChargeCardRequest [" + "updateSubscription=" + updateSubscription
                + ", cardId=" + cardId + ", card=" + card + ", recurrence=" + recurrence
                + ", initiatedType=" + initiatedType + ", recurrenceModel=" + recurrenceModel
                + ", paymentOrigin=" + paymentOrigin + ", indirectAcceptor=" + indirectAcceptor
                + "]";
    }

    /**
     * Builds a new {@link UpdateChargeCardRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UpdateChargeCardRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(updateSubscription, cardId, card, recurrence)
                .initiatedType(getInitiatedType())
                .recurrenceModel(getRecurrenceModel())
                .paymentOrigin(getPaymentOrigin())
                .indirectAcceptor(getIndirectAcceptor());
        return builder;
    }

    /**
     * Class to build instances of {@link UpdateChargeCardRequest}.
     */
    public static class Builder {
        private boolean updateSubscription;
        private String cardId;
        private CreateCardRequest card;
        private boolean recurrence;
        private String initiatedType;
        private String recurrenceModel;
        private CreatePaymentOriginRequest paymentOrigin;
        private String indirectAcceptor;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  updateSubscription  boolean value for updateSubscription.
         * @param  cardId  String value for cardId.
         * @param  card  CreateCardRequest value for card.
         * @param  recurrence  boolean value for recurrence.
         */
        public Builder(boolean updateSubscription, String cardId, CreateCardRequest card,
                boolean recurrence) {
            this.updateSubscription = updateSubscription;
            this.cardId = cardId;
            this.card = card;
            this.recurrence = recurrence;
        }

        /**
         * Setter for updateSubscription.
         * @param  updateSubscription  boolean value for updateSubscription.
         * @return Builder
         */
        public Builder updateSubscription(boolean updateSubscription) {
            this.updateSubscription = updateSubscription;
            return this;
        }

        /**
         * Setter for cardId.
         * @param  cardId  String value for cardId.
         * @return Builder
         */
        public Builder cardId(String cardId) {
            this.cardId = cardId;
            return this;
        }

        /**
         * Setter for card.
         * @param  card  CreateCardRequest value for card.
         * @return Builder
         */
        public Builder card(CreateCardRequest card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for recurrence.
         * @param  recurrence  boolean value for recurrence.
         * @return Builder
         */
        public Builder recurrence(boolean recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        /**
         * Setter for initiatedType.
         * @param  initiatedType  String value for initiatedType.
         * @return Builder
         */
        public Builder initiatedType(String initiatedType) {
            this.initiatedType = initiatedType;
            return this;
        }

        /**
         * Setter for recurrenceModel.
         * @param  recurrenceModel  String value for recurrenceModel.
         * @return Builder
         */
        public Builder recurrenceModel(String recurrenceModel) {
            this.recurrenceModel = recurrenceModel;
            return this;
        }

        /**
         * Setter for paymentOrigin.
         * @param  paymentOrigin  CreatePaymentOriginRequest value for paymentOrigin.
         * @return Builder
         */
        public Builder paymentOrigin(CreatePaymentOriginRequest paymentOrigin) {
            this.paymentOrigin = paymentOrigin;
            return this;
        }

        /**
         * Setter for indirectAcceptor.
         * @param  indirectAcceptor  String value for indirectAcceptor.
         * @return Builder
         */
        public Builder indirectAcceptor(String indirectAcceptor) {
            this.indirectAcceptor = indirectAcceptor;
            return this;
        }

        /**
         * Builds a new {@link UpdateChargeCardRequest} object using the set fields.
         * @return {@link UpdateChargeCardRequest}
         */
        public UpdateChargeCardRequest build() {
            return new UpdateChargeCardRequest(updateSubscription, cardId, card, recurrence,
                    initiatedType, recurrenceModel, paymentOrigin, indirectAcceptor);
        }
    }
}
