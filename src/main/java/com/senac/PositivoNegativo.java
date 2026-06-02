package com.senac;

import java.util.Locale;

public class PositivoNegativo {
    public static String avalia(double n1){
        if (n1 > 0){
            return "Numero +";
        } else if (n1 < 0){
            return "Negativo";
        } else {
            return "Zero";
        }
    }
    public static String paraDarErro(String teste) throws InterruptedException{
        Thread.sleep(10000L);
        return teste.toLowerCase(Locale.ROOT).toUpperCase();
    }

    public static String tete(String teste) throws InterruptedException{
        Thread.sleep(10000L);
        return teste.toLowerCase(Locale.ROOT).toUpperCase();
    }

    public static String testete(String teste) throws InterruptedException{
        Thread.sleep(10000L);
        return teste.toLowerCase(Locale.ROOT).toUpperCase();
    }
}
