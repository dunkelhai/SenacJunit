package com.senac;

import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class PositivoNegativoTest {

    @Test
    //falha, assert -> diferente do esperado
    void deveResultarPositivoQuandoNumeroMaiorQueZero() {
        String resultado = PositivoNegativo.avalia(1.0);
        Assertions.assertEquals("Positivo", resultado);
    }

    @Disabled
    @Test
    void ignorar() {
       assertTrue(true);
    }

    @Test
    void erro() throws InterruptedException{
        String resultado = PositivoNegativo.paraDarErro(null);
        Assertions.assertEquals("Negativo", resultado);
    }

    @Test
    void sucesso() {
        assertFalse(false);
    }

    @Test
    void avaliaNegativo() {
        String resultado = PositivoNegativo.avalia(-1.0);
        Assertions.assertEquals("Negativo", resultado);
    }
    @Test
    void avaliaZero() {
        String resultado = PositivoNegativo.avalia(0.0);
        Assertions.assertEquals("Zero", resultado);
    }
}