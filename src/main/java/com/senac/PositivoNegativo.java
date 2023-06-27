package com.senac;

public class PositivoNegativo {
    public static String avalia(double n1){
        if (n1 > 0){
            return "Positivo";
        } else if (n1 < 0){
            return "Negativo";
        } else {
            return "Zero";
        }
    }
}
