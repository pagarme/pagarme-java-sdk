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
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetCheckoutPaymentResponse type.
 */
public class GetCheckoutPaymentResponse {
    private String id;
    private Integer amount;
    private String defaultPaymentMethod;
    private String successUrl;
    private String paymentUrl;
    private String gatewayAffiliationId;
    private List<String> acceptedPaymentMethods;
    private String status;
    private boolean skipCheckoutSuccessPage;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime canceledAt;
    private boolean customerEditable;
    private GetCustomerResponse customer;
    private GetAddressResponse billingaddress;
    private GetCheckoutCreditCardPaymentResponse creditCard;
    private GetCheckoutBoletoPaymentResponse boleto;
    private boolean billingAddressEditable;
    private GetShippingResponse shipping;
    private boolean shippable;
    private LocalDateTime closedAt;
    private LocalDateTime expiresAt;
    private String currency;
    private GetCheckoutDebitCardPaymentResponse debitCard;
    private GetCheckoutBankTransferPaymentResponse bankTransfer;
    private List<String> acceptedBrands;
    private GetCheckoutPixPaymentResponse pix;

    /**
     * Default constructor.
     */
    public GetCheckoutPaymentResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  defaultPaymentMethod  String value for defaultPaymentMethod.
     * @param  successUrl  String value for successUrl.
     * @param  paymentUrl  String value for paymentUrl.
     * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
     * @param  acceptedPaymentMethods  List of String value for acceptedPaymentMethods.
     * @param  status  String value for status.
     * @param  skipCheckoutSuccessPage  boolean value for skipCheckoutSuccessPage.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  customerEditable  boolean value for customerEditable.
     * @param  billingaddress  GetAddressResponse value for billingaddress.
     * @param  creditCard  GetCheckoutCreditCardPaymentResponse value for creditCard.
     * @param  boleto  GetCheckoutBoletoPaymentResponse value for boleto.
     * @param  billingAddressEditable  boolean value for billingAddressEditable.
     * @param  shipping  GetShippingResponse value for shipping.
     * @param  shippable  boolean value for shippable.
     * @param  currency  String value for currency.
     * @param  acceptedBrands  List of String value for acceptedBrands.
     * @param  amount  Integer value for amount.
     * @param  canceledAt  LocalDateTime value for canceledAt.
     * @param  customer  GetCustomerResponse value for customer.
     * @param  closedAt  LocalDateTime value for closedAt.
     * @param  expiresAt  LocalDateTime value for expiresAt.
     * @param  debitCard  GetCheckoutDebitCardPaymentResponse value for debitCard.
     * @param  bankTransfer  GetCheckoutBankTransferPaymentResponse value for bankTransfer.
     * @param  pix  GetCheckoutPixPaymentResponse value for pix.
     */
    public GetCheckoutPaymentResponse(
            String id,
            String defaultPaymentMethod,
            String successUrl,
            String paymentUrl,
            String gatewayAffiliationId,
            List<String> acceptedPaymentMethods,
            String status,
            boolean skipCheckoutSuccessPage,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            boolean customerEditable,
            GetAddressResponse billingaddress,
            GetCheckoutCreditCardPaymentResponse creditCard,
            GetCheckoutBoletoPaymentResponse boleto,
            boolean billingAddressEditable,
            GetShippingResponse shipping,
            boolean shippable,
            String currency,
            List<String> acceptedBrands,
            Integer amount,
            LocalDateTime canceledAt,
            GetCustomerResponse customer,
            LocalDateTime closedAt,
            LocalDateTime expiresAt,
            GetCheckoutDebitCardPaymentResponse debitCard,
            GetCheckoutBankTransferPaymentResponse bankTransfer,
            GetCheckoutPixPaymentResponse pix) {
        this.id = id;
        this.amount = amount;
        this.defaultPaymentMethod = defaultPaymentMethod;
        this.successUrl = successUrl;
        this.paymentUrl = paymentUrl;
        this.gatewayAffiliationId = gatewayAffiliationId;
        this.acceptedPaymentMethods = acceptedPaymentMethods;
        this.status = status;
        this.skipCheckoutSuccessPage = skipCheckoutSuccessPage;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.canceledAt = canceledAt;
        this.customerEditable = customerEditable;
        this.customer = customer;
        this.billingaddress = billingaddress;
        this.creditCard = creditCard;
        this.boleto = boleto;
        this.billingAddressEditable = billingAddressEditable;
        this.shipping = shipping;
        this.shippable = shippable;
        this.closedAt = closedAt;
        this.expiresAt = expiresAt;
        this.currency = currency;
        this.debitCard = debitCard;
        this.bankTransfer = bankTransfer;
        this.acceptedBrands = acceptedBrands;
        this.pix = pix;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Amount.
     * Valor em centavos
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Valor em centavos
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for DefaultPaymentMethod.
     * Meio de pagamento padrão no checkout
     * @return Returns the String
     */
    @JsonGetter("default_payment_method")
    public String getDefaultPaymentMethod() {
        return defaultPaymentMethod;
    }

    /**
     * Setter for DefaultPaymentMethod.
     * Meio de pagamento padrão no checkout
     * @param defaultPaymentMethod Value for String
     */
    @JsonSetter("default_payment_method")
    public void setDefaultPaymentMethod(String defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
    }

    /**
     * Getter for SuccessUrl.
     * Url de redirecionamento de sucesso após o checkou
     * @return Returns the String
     */
    @JsonGetter("success_url")
    public String getSuccessUrl() {
        return successUrl;
    }

    /**
     * Setter for SuccessUrl.
     * Url de redirecionamento de sucesso após o checkou
     * @param successUrl Value for String
     */
    @JsonSetter("success_url")
    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    /**
     * Getter for PaymentUrl.
     * Url para pagamento usando o checkout
     * @return Returns the String
     */
    @JsonGetter("payment_url")
    public String getPaymentUrl() {
        return paymentUrl;
    }

    /**
     * Setter for PaymentUrl.
     * Url para pagamento usando o checkout
     * @param paymentUrl Value for String
     */
    @JsonSetter("payment_url")
    public void setPaymentUrl(String paymentUrl) {
        this.paymentUrl = paymentUrl;
    }

    /**
     * Getter for GatewayAffiliationId.
     * Código da afiliação onde o pagamento será processado no gateway
     * @return Returns the String
     */
    @JsonGetter("gateway_affiliation_id")
    public String getGatewayAffiliationId() {
        return gatewayAffiliationId;
    }

    /**
     * Setter for GatewayAffiliationId.
     * Código da afiliação onde o pagamento será processado no gateway
     * @param gatewayAffiliationId Value for String
     */
    @JsonSetter("gateway_affiliation_id")
    public void setGatewayAffiliationId(String gatewayAffiliationId) {
        this.gatewayAffiliationId = gatewayAffiliationId;
    }

    /**
     * Getter for AcceptedPaymentMethods.
     * Meios de pagamento aceitos no checkout
     * @return Returns the List of String
     */
    @JsonGetter("accepted_payment_methods")
    public List<String> getAcceptedPaymentMethods() {
        return acceptedPaymentMethods;
    }

    /**
     * Setter for AcceptedPaymentMethods.
     * Meios de pagamento aceitos no checkout
     * @param acceptedPaymentMethods Value for List of String
     */
    @JsonSetter("accepted_payment_methods")
    public void setAcceptedPaymentMethods(List<String> acceptedPaymentMethods) {
        this.acceptedPaymentMethods = acceptedPaymentMethods;
    }

    /**
     * Getter for Status.
     * Status do checkout
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Status do checkout
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for SkipCheckoutSuccessPage.
     * Pular tela de sucesso pós-pagamento?
     * @return Returns the boolean
     */
    @JsonGetter("skip_checkout_success_page")
    public boolean getSkipCheckoutSuccessPage() {
        return skipCheckoutSuccessPage;
    }

    /**
     * Setter for SkipCheckoutSuccessPage.
     * Pular tela de sucesso pós-pagamento?
     * @param skipCheckoutSuccessPage Value for boolean
     */
    @JsonSetter("skip_checkout_success_page")
    public void setSkipCheckoutSuccessPage(boolean skipCheckoutSuccessPage) {
        this.skipCheckoutSuccessPage = skipCheckoutSuccessPage;
    }

    /**
     * Getter for CreatedAt.
     * Data de criação
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * Data de criação
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * Data de atualização
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * Data de atualização
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for CanceledAt.
     * Data de cancelamento
     * @return Returns the LocalDateTime
     */
    @JsonGetter("canceled_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCanceledAt() {
        return canceledAt;
    }

    /**
     * Setter for CanceledAt.
     * Data de cancelamento
     * @param canceledAt Value for LocalDateTime
     */
    @JsonSetter("canceled_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCanceledAt(LocalDateTime canceledAt) {
        this.canceledAt = canceledAt;
    }

    /**
     * Getter for CustomerEditable.
     * Torna o objeto customer editável
     * @return Returns the boolean
     */
    @JsonGetter("customer_editable")
    public boolean getCustomerEditable() {
        return customerEditable;
    }

    /**
     * Setter for CustomerEditable.
     * Torna o objeto customer editável
     * @param customerEditable Value for boolean
     */
    @JsonSetter("customer_editable")
    public void setCustomerEditable(boolean customerEditable) {
        this.customerEditable = customerEditable;
    }

    /**
     * Getter for Customer.
     * Dados do comprador
     * @return Returns the GetCustomerResponse
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GetCustomerResponse getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * Dados do comprador
     * @param customer Value for GetCustomerResponse
     */
    @JsonSetter("customer")
    public void setCustomer(GetCustomerResponse customer) {
        this.customer = customer;
    }

    /**
     * Getter for Billingaddress.
     * Dados do endereço de cobrança
     * @return Returns the GetAddressResponse
     */
    @JsonGetter("billingaddress")
    public GetAddressResponse getBillingaddress() {
        return billingaddress;
    }

    /**
     * Setter for Billingaddress.
     * Dados do endereço de cobrança
     * @param billingaddress Value for GetAddressResponse
     */
    @JsonSetter("billingaddress")
    public void setBillingaddress(GetAddressResponse billingaddress) {
        this.billingaddress = billingaddress;
    }

    /**
     * Getter for CreditCard.
     * Configurações de cartão de crédito
     * @return Returns the GetCheckoutCreditCardPaymentResponse
     */
    @JsonGetter("credit_card")
    public GetCheckoutCreditCardPaymentResponse getCreditCard() {
        return creditCard;
    }

    /**
     * Setter for CreditCard.
     * Configurações de cartão de crédito
     * @param creditCard Value for GetCheckoutCreditCardPaymentResponse
     */
    @JsonSetter("credit_card")
    public void setCreditCard(GetCheckoutCreditCardPaymentResponse creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * Getter for Boleto.
     * Configurações de boleto
     * @return Returns the GetCheckoutBoletoPaymentResponse
     */
    @JsonGetter("boleto")
    public GetCheckoutBoletoPaymentResponse getBoleto() {
        return boleto;
    }

    /**
     * Setter for Boleto.
     * Configurações de boleto
     * @param boleto Value for GetCheckoutBoletoPaymentResponse
     */
    @JsonSetter("boleto")
    public void setBoleto(GetCheckoutBoletoPaymentResponse boleto) {
        this.boleto = boleto;
    }

    /**
     * Getter for BillingAddressEditable.
     * Indica se o billing address poderá ser editado
     * @return Returns the boolean
     */
    @JsonGetter("billing_address_editable")
    public boolean getBillingAddressEditable() {
        return billingAddressEditable;
    }

    /**
     * Setter for BillingAddressEditable.
     * Indica se o billing address poderá ser editado
     * @param billingAddressEditable Value for boolean
     */
    @JsonSetter("billing_address_editable")
    public void setBillingAddressEditable(boolean billingAddressEditable) {
        this.billingAddressEditable = billingAddressEditable;
    }

    /**
     * Getter for Shipping.
     * Configurações de entrega
     * @return Returns the GetShippingResponse
     */
    @JsonGetter("shipping")
    public GetShippingResponse getShipping() {
        return shipping;
    }

    /**
     * Setter for Shipping.
     * Configurações de entrega
     * @param shipping Value for GetShippingResponse
     */
    @JsonSetter("shipping")
    public void setShipping(GetShippingResponse shipping) {
        this.shipping = shipping;
    }

    /**
     * Getter for Shippable.
     * Indica se possui entrega
     * @return Returns the boolean
     */
    @JsonGetter("shippable")
    public boolean getShippable() {
        return shippable;
    }

    /**
     * Setter for Shippable.
     * Indica se possui entrega
     * @param shippable Value for boolean
     */
    @JsonSetter("shippable")
    public void setShippable(boolean shippable) {
        this.shippable = shippable;
    }

    /**
     * Getter for ClosedAt.
     * Data de fechamento
     * @return Returns the LocalDateTime
     */
    @JsonGetter("closed_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getClosedAt() {
        return closedAt;
    }

    /**
     * Setter for ClosedAt.
     * Data de fechamento
     * @param closedAt Value for LocalDateTime
     */
    @JsonSetter("closed_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setClosedAt(LocalDateTime closedAt) {
        this.closedAt = closedAt;
    }

    /**
     * Getter for ExpiresAt.
     * Data de expiração
     * @return Returns the LocalDateTime
     */
    @JsonGetter("expires_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    /**
     * Setter for ExpiresAt.
     * Data de expiração
     * @param expiresAt Value for LocalDateTime
     */
    @JsonSetter("expires_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * Getter for Currency.
     * Moeda
     * @return Returns the String
     */
    @JsonGetter("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * Moeda
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for DebitCard.
     * Configurações de cartão de débito
     * @return Returns the GetCheckoutDebitCardPaymentResponse
     */
    @JsonGetter("debit_card")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GetCheckoutDebitCardPaymentResponse getDebitCard() {
        return debitCard;
    }

    /**
     * Setter for DebitCard.
     * Configurações de cartão de débito
     * @param debitCard Value for GetCheckoutDebitCardPaymentResponse
     */
    @JsonSetter("debit_card")
    public void setDebitCard(GetCheckoutDebitCardPaymentResponse debitCard) {
        this.debitCard = debitCard;
    }

    /**
     * Getter for BankTransfer.
     * Bank transfer payment response
     * @return Returns the GetCheckoutBankTransferPaymentResponse
     */
    @JsonGetter("bank_transfer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GetCheckoutBankTransferPaymentResponse getBankTransfer() {
        return bankTransfer;
    }

    /**
     * Setter for BankTransfer.
     * Bank transfer payment response
     * @param bankTransfer Value for GetCheckoutBankTransferPaymentResponse
     */
    @JsonSetter("bank_transfer")
    public void setBankTransfer(GetCheckoutBankTransferPaymentResponse bankTransfer) {
        this.bankTransfer = bankTransfer;
    }

    /**
     * Getter for AcceptedBrands.
     * Accepted Brands
     * @return Returns the List of String
     */
    @JsonGetter("accepted_brands")
    public List<String> getAcceptedBrands() {
        return acceptedBrands;
    }

    /**
     * Setter for AcceptedBrands.
     * Accepted Brands
     * @param acceptedBrands Value for List of String
     */
    @JsonSetter("accepted_brands")
    public void setAcceptedBrands(List<String> acceptedBrands) {
        this.acceptedBrands = acceptedBrands;
    }

    /**
     * Getter for Pix.
     * Pix payment response
     * @return Returns the GetCheckoutPixPaymentResponse
     */
    @JsonGetter("pix")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GetCheckoutPixPaymentResponse getPix() {
        return pix;
    }

    /**
     * Setter for Pix.
     * Pix payment response
     * @param pix Value for GetCheckoutPixPaymentResponse
     */
    @JsonSetter("pix")
    public void setPix(GetCheckoutPixPaymentResponse pix) {
        this.pix = pix;
    }

    /**
     * Converts this GetCheckoutPaymentResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetCheckoutPaymentResponse [" + "id=" + id + ", defaultPaymentMethod="
                + defaultPaymentMethod + ", successUrl=" + successUrl + ", paymentUrl=" + paymentUrl
                + ", gatewayAffiliationId=" + gatewayAffiliationId + ", acceptedPaymentMethods="
                + acceptedPaymentMethods + ", status=" + status + ", skipCheckoutSuccessPage="
                + skipCheckoutSuccessPage + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", customerEditable=" + customerEditable + ", billingaddress=" + billingaddress
                + ", creditCard=" + creditCard + ", boleto=" + boleto + ", billingAddressEditable="
                + billingAddressEditable + ", shipping=" + shipping + ", shippable=" + shippable
                + ", currency=" + currency + ", acceptedBrands=" + acceptedBrands + ", amount="
                + amount + ", canceledAt=" + canceledAt + ", customer=" + customer + ", closedAt="
                + closedAt + ", expiresAt=" + expiresAt + ", debitCard=" + debitCard
                + ", bankTransfer=" + bankTransfer + ", pix=" + pix + "]";
    }

    /**
     * Builds a new {@link GetCheckoutPaymentResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetCheckoutPaymentResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, defaultPaymentMethod, successUrl, paymentUrl,
                gatewayAffiliationId, acceptedPaymentMethods, status, skipCheckoutSuccessPage,
                createdAt, updatedAt, customerEditable, billingaddress, creditCard, boleto,
                billingAddressEditable, shipping, shippable, currency, acceptedBrands)
                .amount(getAmount())
                .canceledAt(getCanceledAt())
                .customer(getCustomer())
                .closedAt(getClosedAt())
                .expiresAt(getExpiresAt())
                .debitCard(getDebitCard())
                .bankTransfer(getBankTransfer())
                .pix(getPix());
        return builder;
    }

    /**
     * Class to build instances of {@link GetCheckoutPaymentResponse}.
     */
    public static class Builder {
        private String id;
        private String defaultPaymentMethod;
        private String successUrl;
        private String paymentUrl;
        private String gatewayAffiliationId;
        private List<String> acceptedPaymentMethods;
        private String status;
        private boolean skipCheckoutSuccessPage;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private boolean customerEditable;
        private GetAddressResponse billingaddress;
        private GetCheckoutCreditCardPaymentResponse creditCard;
        private GetCheckoutBoletoPaymentResponse boleto;
        private boolean billingAddressEditable;
        private GetShippingResponse shipping;
        private boolean shippable;
        private String currency;
        private List<String> acceptedBrands;
        private Integer amount;
        private LocalDateTime canceledAt;
        private GetCustomerResponse customer;
        private LocalDateTime closedAt;
        private LocalDateTime expiresAt;
        private GetCheckoutDebitCardPaymentResponse debitCard;
        private GetCheckoutBankTransferPaymentResponse bankTransfer;
        private GetCheckoutPixPaymentResponse pix;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  defaultPaymentMethod  String value for defaultPaymentMethod.
         * @param  successUrl  String value for successUrl.
         * @param  paymentUrl  String value for paymentUrl.
         * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
         * @param  acceptedPaymentMethods  List of String value for acceptedPaymentMethods.
         * @param  status  String value for status.
         * @param  skipCheckoutSuccessPage  boolean value for skipCheckoutSuccessPage.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  customerEditable  boolean value for customerEditable.
         * @param  billingaddress  GetAddressResponse value for billingaddress.
         * @param  creditCard  GetCheckoutCreditCardPaymentResponse value for creditCard.
         * @param  boleto  GetCheckoutBoletoPaymentResponse value for boleto.
         * @param  billingAddressEditable  boolean value for billingAddressEditable.
         * @param  shipping  GetShippingResponse value for shipping.
         * @param  shippable  boolean value for shippable.
         * @param  currency  String value for currency.
         * @param  acceptedBrands  List of String value for acceptedBrands.
         */
        public Builder(String id, String defaultPaymentMethod, String successUrl, String paymentUrl,
                String gatewayAffiliationId, List<String> acceptedPaymentMethods, String status,
                boolean skipCheckoutSuccessPage, LocalDateTime createdAt, LocalDateTime updatedAt,
                boolean customerEditable, GetAddressResponse billingaddress,
                GetCheckoutCreditCardPaymentResponse creditCard,
                GetCheckoutBoletoPaymentResponse boleto, boolean billingAddressEditable,
                GetShippingResponse shipping, boolean shippable, String currency,
                List<String> acceptedBrands) {
            this.id = id;
            this.defaultPaymentMethod = defaultPaymentMethod;
            this.successUrl = successUrl;
            this.paymentUrl = paymentUrl;
            this.gatewayAffiliationId = gatewayAffiliationId;
            this.acceptedPaymentMethods = acceptedPaymentMethods;
            this.status = status;
            this.skipCheckoutSuccessPage = skipCheckoutSuccessPage;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.customerEditable = customerEditable;
            this.billingaddress = billingaddress;
            this.creditCard = creditCard;
            this.boleto = boleto;
            this.billingAddressEditable = billingAddressEditable;
            this.shipping = shipping;
            this.shippable = shippable;
            this.currency = currency;
            this.acceptedBrands = acceptedBrands;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for defaultPaymentMethod.
         * @param  defaultPaymentMethod  String value for defaultPaymentMethod.
         * @return Builder
         */
        public Builder defaultPaymentMethod(String defaultPaymentMethod) {
            this.defaultPaymentMethod = defaultPaymentMethod;
            return this;
        }

        /**
         * Setter for successUrl.
         * @param  successUrl  String value for successUrl.
         * @return Builder
         */
        public Builder successUrl(String successUrl) {
            this.successUrl = successUrl;
            return this;
        }

        /**
         * Setter for paymentUrl.
         * @param  paymentUrl  String value for paymentUrl.
         * @return Builder
         */
        public Builder paymentUrl(String paymentUrl) {
            this.paymentUrl = paymentUrl;
            return this;
        }

        /**
         * Setter for gatewayAffiliationId.
         * @param  gatewayAffiliationId  String value for gatewayAffiliationId.
         * @return Builder
         */
        public Builder gatewayAffiliationId(String gatewayAffiliationId) {
            this.gatewayAffiliationId = gatewayAffiliationId;
            return this;
        }

        /**
         * Setter for acceptedPaymentMethods.
         * @param  acceptedPaymentMethods  List of String value for acceptedPaymentMethods.
         * @return Builder
         */
        public Builder acceptedPaymentMethods(List<String> acceptedPaymentMethods) {
            this.acceptedPaymentMethods = acceptedPaymentMethods;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for skipCheckoutSuccessPage.
         * @param  skipCheckoutSuccessPage  boolean value for skipCheckoutSuccessPage.
         * @return Builder
         */
        public Builder skipCheckoutSuccessPage(boolean skipCheckoutSuccessPage) {
            this.skipCheckoutSuccessPage = skipCheckoutSuccessPage;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for customerEditable.
         * @param  customerEditable  boolean value for customerEditable.
         * @return Builder
         */
        public Builder customerEditable(boolean customerEditable) {
            this.customerEditable = customerEditable;
            return this;
        }

        /**
         * Setter for billingaddress.
         * @param  billingaddress  GetAddressResponse value for billingaddress.
         * @return Builder
         */
        public Builder billingaddress(GetAddressResponse billingaddress) {
            this.billingaddress = billingaddress;
            return this;
        }

        /**
         * Setter for creditCard.
         * @param  creditCard  GetCheckoutCreditCardPaymentResponse value for creditCard.
         * @return Builder
         */
        public Builder creditCard(GetCheckoutCreditCardPaymentResponse creditCard) {
            this.creditCard = creditCard;
            return this;
        }

        /**
         * Setter for boleto.
         * @param  boleto  GetCheckoutBoletoPaymentResponse value for boleto.
         * @return Builder
         */
        public Builder boleto(GetCheckoutBoletoPaymentResponse boleto) {
            this.boleto = boleto;
            return this;
        }

        /**
         * Setter for billingAddressEditable.
         * @param  billingAddressEditable  boolean value for billingAddressEditable.
         * @return Builder
         */
        public Builder billingAddressEditable(boolean billingAddressEditable) {
            this.billingAddressEditable = billingAddressEditable;
            return this;
        }

        /**
         * Setter for shipping.
         * @param  shipping  GetShippingResponse value for shipping.
         * @return Builder
         */
        public Builder shipping(GetShippingResponse shipping) {
            this.shipping = shipping;
            return this;
        }

        /**
         * Setter for shippable.
         * @param  shippable  boolean value for shippable.
         * @return Builder
         */
        public Builder shippable(boolean shippable) {
            this.shippable = shippable;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for acceptedBrands.
         * @param  acceptedBrands  List of String value for acceptedBrands.
         * @return Builder
         */
        public Builder acceptedBrands(List<String> acceptedBrands) {
            this.acceptedBrands = acceptedBrands;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for canceledAt.
         * @param  canceledAt  LocalDateTime value for canceledAt.
         * @return Builder
         */
        public Builder canceledAt(LocalDateTime canceledAt) {
            this.canceledAt = canceledAt;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  GetCustomerResponse value for customer.
         * @return Builder
         */
        public Builder customer(GetCustomerResponse customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for closedAt.
         * @param  closedAt  LocalDateTime value for closedAt.
         * @return Builder
         */
        public Builder closedAt(LocalDateTime closedAt) {
            this.closedAt = closedAt;
            return this;
        }

        /**
         * Setter for expiresAt.
         * @param  expiresAt  LocalDateTime value for expiresAt.
         * @return Builder
         */
        public Builder expiresAt(LocalDateTime expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Setter for debitCard.
         * @param  debitCard  GetCheckoutDebitCardPaymentResponse value for debitCard.
         * @return Builder
         */
        public Builder debitCard(GetCheckoutDebitCardPaymentResponse debitCard) {
            this.debitCard = debitCard;
            return this;
        }

        /**
         * Setter for bankTransfer.
         * @param  bankTransfer  GetCheckoutBankTransferPaymentResponse value for bankTransfer.
         * @return Builder
         */
        public Builder bankTransfer(GetCheckoutBankTransferPaymentResponse bankTransfer) {
            this.bankTransfer = bankTransfer;
            return this;
        }

        /**
         * Setter for pix.
         * @param  pix  GetCheckoutPixPaymentResponse value for pix.
         * @return Builder
         */
        public Builder pix(GetCheckoutPixPaymentResponse pix) {
            this.pix = pix;
            return this;
        }

        /**
         * Builds a new {@link GetCheckoutPaymentResponse} object using the set fields.
         * @return {@link GetCheckoutPaymentResponse}
         */
        public GetCheckoutPaymentResponse build() {
            return new GetCheckoutPaymentResponse(id, defaultPaymentMethod, successUrl, paymentUrl,
                    gatewayAffiliationId, acceptedPaymentMethods, status, skipCheckoutSuccessPage,
                    createdAt, updatedAt, customerEditable, billingaddress, creditCard, boleto,
                    billingAddressEditable, shipping, shippable, currency, acceptedBrands, amount,
                    canceledAt, customer, closedAt, expiresAt, debitCard, bankTransfer, pix);
        }
    }
}
