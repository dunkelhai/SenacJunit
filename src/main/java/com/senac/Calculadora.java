package com.senac;

public class Calculadora {
    int codigo;

    public Calculadora(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static int soma(int x, int y){
        return x+y;
    }
    public static int subtracao(int x, int y){
        return x-y;
    }
    public static int divisao(int x, int y){
        return x/y;
    }
    public static int multiplicacao(int x, int y){
        return x*y;
    }
}
