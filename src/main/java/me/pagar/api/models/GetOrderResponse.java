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
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import me.pagar.api.DateTimeHelper;

/**
 * This is a model class for GetOrderResponse type.
 */
public class GetOrderResponse {
    private String id;
    private String code;
    private String currency;
    private List<GetOrderItemResponse> items;
    private OptionalNullable<GetCustomerResponse> customer;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<GetChargeResponse> charges;
    private String invoiceUrl;
    private GetShippingResponse shipping;
    private Map<String, String> metadata;
    private OptionalNullable<List<GetCheckoutPaymentResponse>> checkouts;
    private OptionalNullable<String> ip;
    private OptionalNullable<String> sessionId;
    private OptionalNullable<GetLocationResponse> location;
    private OptionalNullable<GetDeviceResponse> device;
    private Boolean closed;

    /**
     * Default constructor.
     */
    public GetOrderResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  code  String value for code.
     * @param  currency  String value for currency.
     * @param  items  List of GetOrderItemResponse value for items.
     * @param  status  String value for status.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  charges  List of GetChargeResponse value for charges.
     * @param  invoiceUrl  String value for invoiceUrl.
     * @param  shipping  GetShippingResponse value for shipping.
     * @param  metadata  Map of String, value for metadata.
     * @param  closed  Boolean value for closed.
     * @param  customer  GetCustomerResponse value for customer.
     * @param  checkouts  List of GetCheckoutPaymentResponse value for checkouts.
     * @param  ip  String value for ip.
     * @param  sessionId  String value for sessionId.
     * @param  location  GetLocationResponse value for location.
     * @param  device  GetDeviceResponse value for device.
     */
    public GetOrderResponse(
            String id,
            String code,
            String currency,
            List<GetOrderItemResponse> items,
            String status,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            List<GetChargeResponse> charges,
            String invoiceUrl,
            GetShippingResponse shipping,
            Map<String, String> metadata,
            Boolean closed,
            GetCustomerResponse customer,
            List<GetCheckoutPaymentResponse> checkouts,
            String ip,
            String sessionId,
            GetLocationResponse location,
            GetDeviceResponse device) {
        this.id = id;
        this.code = code;
        this.currency = currency;
        this.items = items;
        this.customer = OptionalNullable.of(customer);
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.charges = charges;
        this.invoiceUrl = invoiceUrl;
        this.shipping = shipping;
        this.metadata = metadata;
        this.checkouts = OptionalNullable.of(checkouts);
        this.ip = OptionalNullable.of(ip);
        this.sessionId = OptionalNullable.of(sessionId);
        this.location = OptionalNullable.of(location);
        this.device = OptionalNullable.of(device);
        this.closed = closed;
    }

    /**
     * Internal initialization constructor.
     */
    protected GetOrderResponse(String id, String code, String currency,
            List<GetOrderItemResponse> items, String status, LocalDateTime createdAt,
            LocalDateTime updatedAt, List<GetChargeResponse> charges, String invoiceUrl,
            GetShippingResponse shipping, Map<String, String> metadata, Boolean closed,
            OptionalNullable<GetCustomerResponse> customer,
            OptionalNullable<List<GetCheckoutPaymentResponse>> checkouts,
            OptionalNullable<String> ip, OptionalNullable<String> sessionId,
            OptionalNullable<GetLocationResponse> location,
            OptionalNullable<GetDeviceResponse> device) {
        this.id = id;
        this.code = code;
        this.currency = currency;
        this.items = items;
        this.customer = customer;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.charges = charges;
        this.invoiceUrl = invoiceUrl;
        this.shipping = shipping;
        this.metadata = metadata;
        this.checkouts = checkouts;
        this.ip = ip;
        this.sessionId = sessionId;
        this.location = location;
        this.device = device;
        this.closed = closed;
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
     * Getter for Code.
     * @return Returns the String
     */
    @JsonGetter("code")
    public String getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * @param code Value for String
     */
    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for Currency.
     * @return Returns the String
     */
    @JsonGetter("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for Items.
     * @return Returns the List of GetOrderItemResponse
     */
    @JsonGetter("items")
    public List<GetOrderItemResponse> getItems() {
        return items;
    }

    /**
     * Setter for Items.
     * @param items Value for List of GetOrderItemResponse
     */
    @JsonSetter("items")
    public void setItems(List<GetOrderItemResponse> items) {
        this.items = items;
    }

    /**
     * Internal Getter for Customer.
     * @return Returns the Internal GetCustomerResponse
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetCustomerResponse> internalGetCustomer() {
        return this.customer;
    }

    /**
     * Getter for Customer.
     * @return Returns the GetCustomerResponse
     */
    public GetCustomerResponse getCustomer() {
        return OptionalNullable.getFrom(customer);
    }

    /**
     * Setter for Customer.
     * @param customer Value for GetCustomerResponse
     */
    @JsonSetter("customer")
    public void setCustomer(GetCustomerResponse customer) {
        this.customer = OptionalNullable.of(customer);
    }

    /**
     * UnSetter for Customer.
     */
    public void unsetCustomer() {
        customer = null;
    }

    /**
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Charges.
     * @return Returns the List of GetChargeResponse
     */
    @JsonGetter("charges")
    public List<GetChargeResponse> getCharges() {
        return charges;
    }

    /**
     * Setter for Charges.
     * @param charges Value for List of GetChargeResponse
     */
    @JsonSetter("charges")
    public void setCharges(List<GetChargeResponse> charges) {
        this.charges = charges;
    }

    /**
     * Getter for InvoiceUrl.
     * @return Returns the String
     */
    @JsonGetter("invoice_url")
    public String getInvoiceUrl() {
        return invoiceUrl;
    }

    /**
     * Setter for InvoiceUrl.
     * @param invoiceUrl Value for String
     */
    @JsonSetter("invoice_url")
    public void setInvoiceUrl(String invoiceUrl) {
        this.invoiceUrl = invoiceUrl;
    }

    /**
     * Getter for Shipping.
     * @return Returns the GetShippingResponse
     */
    @JsonGetter("shipping")
    public GetShippingResponse getShipping() {
        return shipping;
    }

    /**
     * Setter for Shipping.
     * @param shipping Value for GetShippingResponse
     */
    @JsonSetter("shipping")
    public void setShipping(GetShippingResponse shipping) {
        this.shipping = shipping;
    }

    /**
     * Getter for Metadata.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for Map of String, String
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * Internal Getter for Checkouts.
     * Checkout Payment Settings Response
     * @return Returns the Internal List of GetCheckoutPaymentResponse
     */
    @JsonGetter("checkouts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<GetCheckoutPaymentResponse>> internalGetCheckouts() {
        return this.checkouts;
    }

    /**
     * Getter for Checkouts.
     * Checkout Payment Settings Response
     * @return Returns the List of GetCheckoutPaymentResponse
     */
    public List<GetCheckoutPaymentResponse> getCheckouts() {
        return OptionalNullable.getFrom(checkouts);
    }

    /**
     * Setter for Checkouts.
     * Checkout Payment Settings Response
     * @param checkouts Value for List of GetCheckoutPaymentResponse
     */
    @JsonSetter("checkouts")
    public void setCheckouts(List<GetCheckoutPaymentResponse> checkouts) {
        this.checkouts = OptionalNullable.of(checkouts);
    }

    /**
     * UnSetter for Checkouts.
     * Checkout Payment Settings Response
     */
    public void unsetCheckouts() {
        checkouts = null;
    }

    /**
     * Internal Getter for Ip.
     * Ip address
     * @return Returns the Internal String
     */
    @JsonGetter("ip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetIp() {
        return this.ip;
    }

    /**
     * Getter for Ip.
     * Ip address
     * @return Returns the String
     */
    public String getIp() {
        return OptionalNullable.getFrom(ip);
    }

    /**
     * Setter for Ip.
     * Ip address
     * @param ip Value for String
     */
    @JsonSetter("ip")
    public void setIp(String ip) {
        this.ip = OptionalNullable.of(ip);
    }

    /**
     * UnSetter for Ip.
     * Ip address
     */
    public void unsetIp() {
        ip = null;
    }

    /**
     * Internal Getter for SessionId.
     * Session id
     * @return Returns the Internal String
     */
    @JsonGetter("session_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetSessionId() {
        return this.sessionId;
    }

    /**
     * Getter for SessionId.
     * Session id
     * @return Returns the String
     */
    public String getSessionId() {
        return OptionalNullable.getFrom(sessionId);
    }

    /**
     * Setter for SessionId.
     * Session id
     * @param sessionId Value for String
     */
    @JsonSetter("session_id")
    public void setSessionId(String sessionId) {
        this.sessionId = OptionalNullable.of(sessionId);
    }

    /**
     * UnSetter for SessionId.
     * Session id
     */
    public void unsetSessionId() {
        sessionId = null;
    }

    /**
     * Internal Getter for Location.
     * Location
     * @return Returns the Internal GetLocationResponse
     */
    @JsonGetter("location")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetLocationResponse> internalGetLocation() {
        return this.location;
    }

    /**
     * Getter for Location.
     * Location
     * @return Returns the GetLocationResponse
     */
    public GetLocationResponse getLocation() {
        return OptionalNullable.getFrom(location);
    }

    /**
     * Setter for Location.
     * Location
     * @param location Value for GetLocationResponse
     */
    @JsonSetter("location")
    public void setLocation(GetLocationResponse location) {
        this.location = OptionalNullable.of(location);
    }

    /**
     * UnSetter for Location.
     * Location
     */
    public void unsetLocation() {
        location = null;
    }

    /**
     * Internal Getter for Device.
     * Device's informations
     * @return Returns the Internal GetDeviceResponse
     */
    @JsonGetter("device")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<GetDeviceResponse> internalGetDevice() {
        return this.device;
    }

    /**
     * Getter for Device.
     * Device's informations
     * @return Returns the GetDeviceResponse
     */
    public GetDeviceResponse getDevice() {
        return OptionalNullable.getFrom(device);
    }

    /**
     * Setter for Device.
     * Device's informations
     * @param device Value for GetDeviceResponse
     */
    @JsonSetter("device")
    public void setDevice(GetDeviceResponse device) {
        this.device = OptionalNullable.of(device);
    }

    /**
     * UnSetter for Device.
     * Device's informations
     */
    public void unsetDevice() {
        device = null;
    }

    /**
     * Getter for Closed.
     * Indicates whether the order is closed
     * @return Returns the Boolean
     */
    @JsonGetter("closed")
    public Boolean getClosed() {
        return closed;
    }

    /**
     * Setter for Closed.
     * Indicates whether the order is closed
     * @param closed Value for Boolean
     */
    @JsonSetter("closed")
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    /**
     * Converts this GetOrderResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GetOrderResponse [" + "id=" + id + ", code=" + code + ", currency=" + currency
                + ", items=" + items + ", status=" + status + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + ", charges=" + charges + ", invoiceUrl=" + invoiceUrl
                + ", shipping=" + shipping + ", metadata=" + metadata + ", closed=" + closed
                + ", customer=" + customer + ", checkouts=" + checkouts + ", ip=" + ip
                + ", sessionId=" + sessionId + ", location=" + location + ", device=" + device
                + "]";
    }

    /**
     * Builds a new {@link GetOrderResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GetOrderResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, code, currency, items, status, createdAt, updatedAt,
                charges, invoiceUrl, shipping, metadata, closed);
        builder.customer = internalGetCustomer();
        builder.checkouts = internalGetCheckouts();
        builder.ip = internalGetIp();
        builder.sessionId = internalGetSessionId();
        builder.location = internalGetLocation();
        builder.device = internalGetDevice();
        return builder;
    }

    /**
     * Class to build instances of {@link GetOrderResponse}.
     */
    public static class Builder {
        private String id;
        private String code;
        private String currency;
        private List<GetOrderItemResponse> items;
        private String status;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private List<GetChargeResponse> charges;
        private String invoiceUrl;
        private GetShippingResponse shipping;
        private Map<String, String> metadata;
        private Boolean closed;
        private OptionalNullable<GetCustomerResponse> customer;
        private OptionalNullable<List<GetCheckoutPaymentResponse>> checkouts;
        private OptionalNullable<String> ip;
        private OptionalNullable<String> sessionId;
        private OptionalNullable<GetLocationResponse> location;
        private OptionalNullable<GetDeviceResponse> device;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  code  String value for code.
         * @param  currency  String value for currency.
         * @param  items  List of GetOrderItemResponse value for items.
         * @param  status  String value for status.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  charges  List of GetChargeResponse value for charges.
         * @param  invoiceUrl  String value for invoiceUrl.
         * @param  shipping  GetShippingResponse value for shipping.
         * @param  metadata  Map of String, value for metadata.
         * @param  closed  Boolean value for closed.
         */
        public Builder(String id, String code, String currency, List<GetOrderItemResponse> items,
                String status, LocalDateTime createdAt, LocalDateTime updatedAt,
                List<GetChargeResponse> charges, String invoiceUrl, GetShippingResponse shipping,
                Map<String, String> metadata, Boolean closed) {
            this.id = id;
            this.code = code;
            this.currency = currency;
            this.items = items;
            this.status = status;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.charges = charges;
            this.invoiceUrl = invoiceUrl;
            this.shipping = shipping;
            this.metadata = metadata;
            this.closed = closed;
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
         * Setter for code.
         * @param  code  String value for code.
         * @return Builder
         */
        public Builder code(String code) {
            this.code = code;
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
         * Setter for items.
         * @param  items  List of GetOrderItemResponse value for items.
         * @return Builder
         */
        public Builder items(List<GetOrderItemResponse> items) {
            this.items = items;
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
         * Setter for charges.
         * @param  charges  List of GetChargeResponse value for charges.
         * @return Builder
         */
        public Builder charges(List<GetChargeResponse> charges) {
            this.charges = charges;
            return this;
        }

        /**
         * Setter for invoiceUrl.
         * @param  invoiceUrl  String value for invoiceUrl.
         * @return Builder
         */
        public Builder invoiceUrl(String invoiceUrl) {
            this.invoiceUrl = invoiceUrl;
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
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for closed.
         * @param  closed  Boolean value for closed.
         * @return Builder
         */
        public Builder closed(Boolean closed) {
            this.closed = closed;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  GetCustomerResponse value for customer.
         * @return Builder
         */
        public Builder customer(GetCustomerResponse customer) {
            this.customer = OptionalNullable.of(customer);
            return this;
        }

        /**
         * UnSetter for customer.
         * @return Builder
         */
        public Builder unsetCustomer() {
            customer = null;
            return this;
        }

        /**
         * Setter for checkouts.
         * @param  checkouts  List of GetCheckoutPaymentResponse value for checkouts.
         * @return Builder
         */
        public Builder checkouts(List<GetCheckoutPaymentResponse> checkouts) {
            this.checkouts = OptionalNullable.of(checkouts);
            return this;
        }

        /**
         * UnSetter for checkouts.
         * @return Builder
         */
        public Builder unsetCheckouts() {
            checkouts = null;
            return this;
        }

        /**
         * Setter for ip.
         * @param  ip  String value for ip.
         * @return Builder
         */
        public Builder ip(String ip) {
            this.ip = OptionalNullable.of(ip);
            return this;
        }

        /**
         * UnSetter for ip.
         * @return Builder
         */
        public Builder unsetIp() {
            ip = null;
            return this;
        }

        /**
         * Setter for sessionId.
         * @param  sessionId  String value for sessionId.
         * @return Builder
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = OptionalNullable.of(sessionId);
            return this;
        }

        /**
         * UnSetter for sessionId.
         * @return Builder
         */
        public Builder unsetSessionId() {
            sessionId = null;
            return this;
        }

        /**
         * Setter for location.
         * @param  location  GetLocationResponse value for location.
         * @return Builder
         */
        public Builder location(GetLocationResponse location) {
            this.location = OptionalNullable.of(location);
            return this;
        }

        /**
         * UnSetter for location.
         * @return Builder
         */
        public Builder unsetLocation() {
            location = null;
            return this;
        }

        /**
         * Setter for device.
         * @param  device  GetDeviceResponse value for device.
         * @return Builder
         */
        public Builder device(GetDeviceResponse device) {
            this.device = OptionalNullable.of(device);
            return this;
        }

        /**
         * UnSetter for device.
         * @return Builder
         */
        public Builder unsetDevice() {
            device = null;
            return this;
        }

        /**
         * Builds a new {@link GetOrderResponse} object using the set fields.
         * @return {@link GetOrderResponse}
         */
        public GetOrderResponse build() {
            return new GetOrderResponse(id, code, currency, items, status, createdAt, updatedAt,
                    charges, invoiceUrl, shipping, metadata, closed, customer, checkouts, ip,
                    sessionId, location, device);
        }
    }
}
