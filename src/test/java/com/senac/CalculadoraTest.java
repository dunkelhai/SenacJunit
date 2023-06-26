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
    }

    @org.junit.jupiter.api.Test
    void divisao() {
    }

    @org.junit.jupiter.api.Test
    void multiplicacao() {
    }
}