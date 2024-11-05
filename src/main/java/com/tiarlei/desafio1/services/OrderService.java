package com.tiarlei.desafio1.services;

import com.tiarlei.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        double discountValue = (order.getDiscount() / 100) * order.getBasic();  //obtencao porcentagem sobre numero natural, ou decimal.
        double shipmentValue = shippingService.Shipment(order.getBasic());  //obtencao do valor do frete isolado.
        return order.getBasic() - discountValue + shipmentValue;    //obtencao do valor total, deduzido desconto e acrescido frete.
    }
}
