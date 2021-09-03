package com.sofka.taller;

public class Televisor extends Electrodomesticos{
  private int numeroPulgadas;
    private String tieneTDT;

    public Televisor(String consumo, String procedencia, int numeroPulgadas, String tieneTDT) {
        super(consumo, procedencia);
        this.numeroPulgadas = numeroPulgadas;
        this.tieneTDT = tieneTDT;
    }

    public int getNumeroPulgadas() {
        return numeroPulgadas;
    }

    public void setNumeroPulgadas(int numeroPulgadas) {
        this.numeroPulgadas = numeroPulgadas;
    }

    public String getTieneTDT() {
        return tieneTDT;
    }

    public void setTieneTDT(String tieneTDT) {
        this.tieneTDT = tieneTDT;
    }

    // prueba
    @Override
    public double calcularCostoTotal() {
        double precioAcumulado = super.calcularCostoTotal();
        if (getNumeroPulgadas() > 40){
            precioAcumulado += precioAcumulado * 0.30;
        }
        if (getTieneTDT().equalsIgnoreCase("si")){
            precioAcumulado += 250000;
        }

    return precioAcumulado;}
}
