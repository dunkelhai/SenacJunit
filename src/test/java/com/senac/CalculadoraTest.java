package com.senac;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void soma() {
        int resultado = Calculadora.soma(2,2);
        Assertions.assertEquals(4, resultado);
    }

    @org.junit.jupiter.api.Test
    void subtracao() {
        int resultado = Calculadora.subtracao(8, 6);
        Assertions.assertEquals(2, resultado);
    }

    @org.junit.jupiter.api.Test
    void divisao() {
        int resultado = Calculadora.divisao(10, 5);
        Assertions.assertEquals(2, resultado);
    }

    @org.junit.jupiter.api.Test
    void multiplicacao() {
        int resultado = Calculadora.multiplicacao(4, 6);
        Assertions.assertEquals(24, resultado);
    }
}