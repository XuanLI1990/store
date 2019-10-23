package com.idmgroup.ms.client;

import com.idmgroup.ms.client.dto.ProductOrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "crm", fallback = CrmClientFallback.class)
public interface CrmClient {
    @RequestMapping(method = RequestMethod.GET, value = "/api/product-orders")
    List<ProductOrderDTO> getAllCrmProductOrders();
}

