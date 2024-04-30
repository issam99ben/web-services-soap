package org.example;

import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/eurotodhconverter", new EuroToDhConverterService());
        System.out.println("Web service deployé");
    }
}
