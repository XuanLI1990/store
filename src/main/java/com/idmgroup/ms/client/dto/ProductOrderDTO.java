package com.idmgroup.ms.client.dto;

import java.time.Instant;

public class ProductOrderDTO {
    private Long id;
    private Instant placedDate;
    private String code;
    private String invoiceId;
    // constructor, getter and setters

    public ProductOrderDTO(Long id, Instant placedDate, String code, String invoiceId) {
        this.id = id;
        this.placedDate = placedDate;
        this.code = code;
        this.invoiceId = invoiceId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getPlacedDate() {
        return placedDate;
    }

    public void setPlacedDate(Instant placedDate) {
        this.placedDate = placedDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
}
