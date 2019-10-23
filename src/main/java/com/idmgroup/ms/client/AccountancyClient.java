package com.idmgroup.ms.client;

import com.idmgroup.ms.client.dto.InvoiceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("accountancy")
public interface AccountancyClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/invoices/{id}")
    InvoiceDTO getInvoice(@PathVariable("id") String id);
}
