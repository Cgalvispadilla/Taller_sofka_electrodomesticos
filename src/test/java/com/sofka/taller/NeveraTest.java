package com.sofka.taller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NeveraTest {

    @Test
    void cantidadLitrosExtras() {
        //arrange
        int capacidad=130;
        String consumo="A";
        String procendencia="Internacional";
        int valorEsperado=1;
        Nevera nevera = new Nevera(consumo, procendencia,capacidad);

        //act
        int resultado= nevera.cantidadLitrosExtras();

        //Assert
       assertEquals(valorEsperado, resultado,"falló c:");

    }

   /* @Test
    void calcularCostoTotal() {
    }*/
}