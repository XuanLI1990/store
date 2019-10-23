package com.idmgroup.ms.web.rest;

import com.idmgroup.ms.client.AccountancyClient;
import com.idmgroup.ms.client.CrmClient;
import com.idmgroup.ms.client.dto.InvoiceDTO;
import com.idmgroup.ms.web.api.OrdersApiDelegate;
import com.idmgroup.ms.web.api.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrdersResource implements OrdersApiDelegate {
    private final CrmClient crmClient;
    private final AccountancyClient accountancyClient;
    public OrdersResource(CrmClient crmClient, AccountancyClient accountancyClient) {
        this.crmClient = crmClient;
        this.accountancyClient = accountancyClient;
    }

    @Override
    public ResponseEntity<List<Order>> getDetailedOrders() {
        return ResponseEntity.ok(crmClient.getAllCrmProductOrders()
            .stream()
            .map(productOrder -> {
                Order order = new Order();
                order.setId(productOrder.getId());
                order.setCode(productOrder.getCode());
                String invoiceId = productOrder.getInvoiceId();
                order.setInvoiceId(invoiceId);
                InvoiceDTO invoice = accountancyClient.getInvoice(invoiceId);
                order.setPaymentAmount(invoice.getPaymentAmount());
                order.setPaymentMethod(invoice.getPaymentMethod());
                order.setPaymentStatus(invoice.getStatus());
                order.setPaymentDate(LocalDateTime.ofInstant(invoice.getDate(), ZoneId.systemDefault()).toString());
                return order;
            }).collect(Collectors.toList()));
    }

}
