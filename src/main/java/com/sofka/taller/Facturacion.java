package com.sofka.taller;

import java.util.ArrayList;
import java.util.Scanner;

public class Facturacion {

    public static void main(String[] args) {
        ArrayList<Electrodomesticos> electrodomesticos = new ArrayList<>();
        Electrodomesticos elec;
        Televisor tel;
        Nevera nevera;
        String consumo, procedencia, sintonizador;
        int capacidad, nPulgadas;
        int seleccion;
        do {
            System.out.println("Seleccione un item del menu");
            System.out.println("1-Electrodomesticos\n 2-Televisor\n 3 - Nevera\n 4- costo Total\n 5- salir");
            Scanner scanner = new Scanner(System.in);
            seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    System.out.println("Ingrese el consumo del electrodomestico");
                    consumo = scanner.next();
                    System.out.println("Ingrese la procedencia del electrodomestico");
                    procedencia = scanner.next();
                    elec = new Electrodomesticos(consumo, procedencia);
                    electrodomesticos.add(elec);
                    break;
                case 2:
                    System.out.println("Ingrese el consumo del electrodomestico");
                    consumo = scanner.next();
                    System.out.println("Ingrese la procedencia del televisor");
                    procedencia = scanner.next();
                    System.out.println("ingrese el numero de pulgadas del televisor");
                    nPulgadas = scanner.nextInt();
                    System.out.println("Ingrese <<si> o <<no>> tiene sintonizador el televisor");
                    sintonizador = scanner.next();
                    tel = new Televisor(consumo, procedencia, nPulgadas, sintonizador);
                    electrodomesticos.add(tel);
                    break;
                case 3:
                    System.out.println("Ingrese el consumo de la nevera");
                    consumo = scanner.next();
                    System.out.println("Ingrese la procedencia de la nevera");
                    procedencia = scanner.next();
                    System.out.println("Ingrese la capacidad que tiene la nevera");
                    capacidad = scanner.nextInt();
                    nevera = new Nevera(consumo, procedencia, capacidad);
                    electrodomesticos.add(nevera);
                    break;
                case 4:
                    double totalCosto = 0;
                    if (electrodomesticos.size() > 0) {
                        for (Electrodomesticos e: electrodomesticos) {
                            totalCosto+=e.calcularCostoTotal();
                        }
                        System.out.println("el costo total de los electrodomesticos es: "+ totalCosto);
                    } else {
                        System.out.println("no hay electrodomesticos aún");
                    }
                    break;
                case 5:
                    seleccion=5;
                    break;

            }
        } while (seleccion != 5);
    }
}
