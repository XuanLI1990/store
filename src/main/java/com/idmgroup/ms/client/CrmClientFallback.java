package com.idmgroup.ms.client;

import com.idmgroup.ms.client.dto.ProductOrderDTO;

import java.util.Collections;
import java.util.List;

public class CrmClientFallback implements CrmClient {
    @Override
    public List<ProductOrderDTO> getAllCrmProductOrders() {
        return Collections.emptyList();
    }
}

