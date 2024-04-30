package org.example;

import proxy.EuroToDhConverterServiceService;
import proxy.Compte;

import java.util.List;

public class EuroToDhClient {
    public static void main(String[] args) {
        var proxy = new EuroToDhConverterServiceService().getEuroToDhConverterServicePort();
        double dhAmount = proxy.conversion(100);
        System.out.println("Amount in DH: " + dhAmount);

        Compte compte = proxy.getCompte(1);
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
        System.out.println(compte.getDateCreation());

        List<Compte> list = proxy.getListComptes();
        for (Compte c: list){
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
            System.out.println(c.getDateCreation());
        }
    }
}
