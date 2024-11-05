package com.tiarlei.desafio1.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double Shipment(double basic){
        if (basic >= 200) {
            return 0;
        } else if (basic < 100) {
            return 20;
            } else {
                return 12;
            }
    }
}
