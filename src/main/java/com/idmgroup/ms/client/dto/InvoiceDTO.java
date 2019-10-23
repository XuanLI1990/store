package com.idmgroup.ms.client.dto;

import java.math.BigDecimal;
import java.time.Instant;

public class InvoiceDTO {
    private String code;
    private Instant date;
    private String details;
    private String status;
    private String paymentMethod;
    private Instant paymentDate;
    private BigDecimal paymentAmount;
    // constructor, getter and setters

    public InvoiceDTO(String code, Instant date, String details, String status, String paymentMethod, Instant paymentDate, BigDecimal paymentAmount) {
        this.code = code;
        this.date = date;
        this.details = details;
        this.status = status;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Instant getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Instant paymentDate) {
        this.paymentDate = paymentDate;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}

