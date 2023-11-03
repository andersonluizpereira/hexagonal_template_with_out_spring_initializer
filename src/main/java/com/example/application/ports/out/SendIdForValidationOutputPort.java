package com.example.application.ports.out;

public interface SendIdForValidationOutputPort {
    void send(Integer id, String topic);

}
