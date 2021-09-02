package com.sofka.taller;

public class Nevera extends Electrodomesticos {
    private int capacidad;

    public Nevera(String consumo, String procedencia, int capacidad) {
        super(consumo, procedencia);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int cantidadLitrosExtras() {
        int capTemp = 0;
        if (this.capacidad > 120) {
            capTemp = (this.capacidad - 120) / 10;
        }
        return capTemp;
    }

    @Override
    public double calcularCostoTotal() {
        if (this.cantidadLitrosExtras() > 0) {
            double porcentaje = this.cantidadLitrosExtras() * 0.05;
            return super.calcularCostoTotal() + (super.calcularCostoTotal() * porcentaje);
        } else {
            return super.calcularCostoTotal();
        }
    }


}
