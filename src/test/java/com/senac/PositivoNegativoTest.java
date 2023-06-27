package com.senac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositivoNegativoTest {

    @Test
    void avaliaPositivo() {
        String resultado = PositivoNegativo.avalia(1.0);
        Assertions.assertEquals("Positivo", resultado);
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