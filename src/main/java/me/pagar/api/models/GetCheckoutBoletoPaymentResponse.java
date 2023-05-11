/*
 * PagarmeApiSDKLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package me.pagar.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetCheckoutBoletoPaymentResponse type.
 */
public class GetCheckoutBoletoPaymentResponse {
    private OptionalNullable<LocalDateTime> dueAt;
    private OptionalNullable<String> instructions;

    /**
     * Default constructor.
     */
    public GetCheckoutBoletoPaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  dueAt  LocalDateTime value for dueAt.
     * @param  instructions  String value for instructions.
     */
    public GetCheckoutBoletoPaymentResponse(
            LocalDateTime dueAt,
            String instructions) {
        this.dueAt = OptionalNullable.of(dueAt);
        this.instructions = OptionalNullable.of(instructions);
    }

    /**
     * Internal initialization constructor.
     */
    protected GetCheckoutBoletoPaymentResponse(OptionalNullable<LocalDateTime> dueAt,
            OptionalNullable<String> instructions) {
        this.dueAt = dueAt;
        this.instructions = instructions;
    }

    /**
     * Internal Getter for DueAt.
     * Data de vencimento do boleto
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("due_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetDueAt() {
        return this.dueAt;
    }

    /**
     * Getter for DueAt.
     * Data de vencimento do boleto
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getDueAt() {
        return OptionalNullable.getFrom(dueAt);
    }

    /**
     * Setter for DueAt.
     * Data de vencimento do boleto
     * @param dueAt Value for LocalDateTime
     */
    @JsonSetter("due_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDueAt(LocalDateTime dueAt) {
        this.dueAt = OptionalNullable.of(dueAt);
    }

    /**
     * UnSetter for DueAt.
     * Data de vencimento do boleto
     */
    public void unsetDueAt() {
        dueAt = null;
    }

    /**
     * Internal Getter for Instructions.
     * Instruções do boleto
     * @return Returns the Internal String
     */
    @JsonGetter("instructions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetInstructions() {
        return this.instructions;
    }

    /**
     * Getter for Instructions.
     * Instruções do boleto
     * @return Returns the String
     */
    public String getInstructions() {
        return OptionalNullable.getFrom(instructions);
    }

    /**
     * Setter for Instructions.
     * Instruções do boleto
     * @param instructions Value for String
     */
    @JsonSetter("instructions")
    public void setInstructions(String instructions) {
        this.instructions = OptionalNullable.of(instructions);
    }

    /**
     * UnSetter for Instructions.
     * Instruções do boleto
     */
    public void unsetInstructions() {
        instructions = null;
    }

    /**
     * Converts this GetCheckoutBoletoPaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCheckoutBoletoPaymentResponse [" + "dueAt=" + dueAt + ", instructions="
                + instructions + "]";
    }

    /**
     * Builds a new {@link GetCheckoutBoletoPaymentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCheckoutBoletoPaymentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.dueAt = internalGetDueAt();
        builder.instructions = internalGetInstructions();
        return builder;
    }

    /**
     * Class to build instances of {@link GetCheckoutBoletoPaymentResponse}.
     */
    public static class Builder {
        private OptionalNullable<LocalDateTime> dueAt;
        private OptionalNullable<String> instructions;



        /**
         * Setter for dueAt.
         * @param  dueAt  LocalDateTime value for dueAt.
         * @return Builder
         */
        public Builder dueAt(LocalDateTime dueAt) {
            this.dueAt = OptionalNullable.of(dueAt);
            return this;
        }

        /**
         * UnSetter for dueAt.
         * @return Builder
         */
        public Builder unsetDueAt() {
            dueAt = null;
            return this;
        }

        /**
         * Setter for instructions.
         * @param  instructions  String value for instructions.
         * @return Builder
         */
        public Builder instructions(String instructions) {
            this.instructions = OptionalNullable.of(instructions);
            return this;
        }

        /**
         * UnSetter for instructions.
         * @return Builder
         */
        public Builder unsetInstructions() {
            instructions = null;
            return this;
        }

        /**
         * Builds a new {@link GetCheckoutBoletoPaymentResponse} object using the set fields.
         * @return {@link GetCheckoutBoletoPaymentResponse}
         */
        public GetCheckoutBoletoPaymentResponse build() {
            return new GetCheckoutBoletoPaymentResponse(dueAt, instructions);
        }
    }
}
