package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService
public class EuroToDhConverterService {

    @WebMethod
    public double conversion(double mt) {
        return mt * 11;
    }

    @WebMethod
    public Compte getCompte(int code) {
        return new Compte(code, Math.random()*60000, new Date());
    }

    @WebMethod
    public List<Compte> getListComptes() {
        return List.of(
                getCompte(1), getCompte(2), getCompte(3)
        );
    }
}
