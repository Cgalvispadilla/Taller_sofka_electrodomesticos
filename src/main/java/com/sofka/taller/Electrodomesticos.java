package com.sofka.taller;

public class Electrodomesticos {
    private String consumo;
    private String procedencia;

    public Electrodomesticos(String consumo, String procedencia) {
        this.consumo = consumo;
        this.procedencia = procedencia;
    }

    public Electrodomesticos() {
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public double calcularCostoSegunConsumo() {
        switch (this.consumo) {
            case "A":
                return 450000;
            case "B":
                return 350000;
            case "C":
                return 250000;
            default:
                return -1;
        }
    }
    public double calcularCostoSegunProcedencia() {
        if(this.procedencia.equalsIgnoreCase("Nacional")){
            return 250000;
        }else if(this.procedencia.equalsIgnoreCase("Importado")){
            return 350000;
        }else{
            return -1;
        }
    }
    public double calcularCostoTotal(){
        return this.calcularCostoSegunConsumo()+this.calcularCostoSegunProcedencia();
    }

}

