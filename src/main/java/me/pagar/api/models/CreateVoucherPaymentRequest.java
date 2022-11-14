/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for CreateVoucherPaymentRequest type.
 */
public class CreateVoucherPaymentRequest {
    private String statementDescriptor;
    private String cardId;
    private String cardToken;
    private CreateCardRequest card;
    private String recurrencyCycle;

    /**
     * Default constructor.
     */
    public CreateVoucherPaymentRequest() {
    }

    /**
     * Initialization constructor.
     * @param  statementDescriptor  String value for statementDescriptor.
     * @param  cardId  String value for cardId.
     * @param  cardToken  String value for cardToken.
     * @param  card  CreateCardRequest value for card.
     * @param  recurrencyCycle  String value for recurrencyCycle.
     */
    public CreateVoucherPaymentRequest(
            String statementDescriptor,
            String cardId,
            String cardToken,
            CreateCardRequest card,
            String recurrencyCycle) {
        this.statementDescriptor = statementDescriptor;
        this.cardId = cardId;
        this.cardToken = cardToken;
        this.card = card;
        this.recurrencyCycle = recurrencyCycle;
    }

    /**
     * Getter for StatementDescriptor.
     * The text that will be shown on the voucher's statement
     * @return Returns the String
     */
    @JsonGetter("statement_descriptor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    /**
     * Setter for StatementDescriptor.
     * The text that will be shown on the voucher's statement
     * @param statementDescriptor Value for String
     */
    @JsonSetter("statement_descriptor")
    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    /**
     * Getter for CardId.
     * Card id
     * @return Returns the String
     */
    @JsonGetter("card_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for CardToken.
     * Card token
     * @return Returns the String
     */
    @JsonGetter("card_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCardToken() {
        return cardToken;
    }

    /**
     * Setter for CardToken.
     * Card token
     * @param cardToken Value for String
     */
    @JsonSetter("card_token")
    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    /**
     * Getter for Card.
     * Card info
     * @return Returns the CreateCardRequest
     */
    @JsonGetter("Card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CreateCardRequest getCard() {
        return card;
    }

    /**
     * Setter for Card.
     * Card info
     * @param card Value for CreateCardRequest
     */
    @JsonSetter("Card")
    public void setCard(CreateCardRequest card) {
        this.card = card;
    }

    /**
     * Getter for RecurrencyCycle.
     * Defines whether the card has been used one or more times.
     * @return Returns the String
     */
    @JsonGetter("recurrency_cycle")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRecurrencyCycle() {
        return recurrencyCycle;
    }

    /**
     * Setter for RecurrencyCycle.
     * Defines whether the card has been used one or more times.
     * @param recurrencyCycle Value for String
     */
    @JsonSetter("recurrency_cycle")
    public void setRecurrencyCycle(String recurrencyCycle) {
        this.recurrencyCycle = recurrencyCycle;
    }

    /**
     * Converts this CreateVoucherPaymentRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateVoucherPaymentRequest [" + "statementDescriptor=" + statementDescriptor
                + ", cardId=" + cardId + ", cardToken=" + cardToken + ", card=" + card
                + ", recurrencyCycle=" + recurrencyCycle + "]";
    }

    /**
     * Builds a new {@link CreateVoucherPaymentRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateVoucherPaymentRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .statementDescriptor(getStatementDescriptor())
                .cardId(getCardId())
                .cardToken(getCardToken())
                .card(getCard())
                .recurrencyCycle(getRecurrencyCycle());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateVoucherPaymentRequest}.
     */
    public static class Builder {
        private String statementDescriptor;
        private String cardId;
        private String cardToken;
        private CreateCardRequest card;
        private String recurrencyCycle;



        /**
         * Setter for statementDescriptor.
         * @param  statementDescriptor  String value for statementDescriptor.
         * @return Builder
         */
        public Builder statementDescriptor(String statementDescriptor) {
            this.statementDescriptor = statementDescriptor;
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
         * Setter for cardToken.
         * @param  cardToken  String value for cardToken.
         * @return Builder
         */
        public Builder cardToken(String cardToken) {
            this.cardToken = cardToken;
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
         * Setter for recurrencyCycle.
         * @param  recurrencyCycle  String value for recurrencyCycle.
         * @return Builder
         */
        public Builder recurrencyCycle(String recurrencyCycle) {
            this.recurrencyCycle = recurrencyCycle;
            return this;
        }

        /**
         * Builds a new {@link CreateVoucherPaymentRequest} object using the set fields.
         * @return {@link CreateVoucherPaymentRequest}
         */
        public CreateVoucherPaymentRequest build() {
            return new CreateVoucherPaymentRequest(statementDescriptor, cardId, cardToken, card,
                    recurrencyCycle);
        }
    }
}
