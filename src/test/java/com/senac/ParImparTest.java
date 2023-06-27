package com.senac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParImparTest {

    @Test
    void validaPar() {
        boolean validacao = ParImpar.validaPar(2);
        Assertions.assertTrue(validacao);
    }

    @Test
    void validaImpar() {
        boolean validacao = ParImpar.validaImpar(3);
        Assertions.assertTrue(validacao);
    }
}