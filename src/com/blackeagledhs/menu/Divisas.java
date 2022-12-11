/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackeagledhs.menu;

/**
 *
 * @author blackeagle
 */
public class Divisas {
    private double importe;
    private int divisa1, divisa2;
    private double exchange;

    public Divisas() {
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getDivisa1() {
        return divisa1;
    }

    public void setDivisa1(int divisa1) {
        this.divisa1 = divisa1;
    }

    public int getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(int divisa2) {
        this.divisa2 = divisa2;
    }

    public double getExchange() {
        return exchange;
    }

    public void setExchange(double exchange) {
        this.exchange = exchange;
    }

    public double Convertir(){
        
        if(divisa1 == 0 && divisa2 == 1){
            exchange = importe * 169.93; //Dolar a Peso Argentino
        } else if (divisa1 ==0 && divisa2 == 2){
            exchange = importe * 0.95; //Dolar a Euro
        } else if (divisa1 == 0 && divisa2 == 3){
            exchange = importe * 5.23; //Dolar a Reales
        } else if (divisa1 == 0 && divisa2 == 4){
            exchange = importe * 0.82; //Dolar a Libra
        } else if (divisa1 == 0 && divisa2 == 5){
            exchange = importe * 136.58; //Dolar a Yen
        } else if (divisa1 == 0 && divisa2 == 6){
            exchange = importe * 1304.27; //Dolar a Won
        } else if (divisa1 == 1 && divisa2 == 0){
            exchange = importe * 0.0059; //Pesos Argentinos a Dolar
        } else if (divisa1 == 1 && divisa2 == 2){
            exchange = importe * 0.0056; //Pesos a Euro
        } else if (divisa1 == 1 && divisa2 == 3){
            exchange = importe * 0.031; //Peso a Reales
        } else if (divisa1 == 1 && divisa2 == 4){
            exchange = importe * 0.0048; //Pesos a Libras
        } else if (divisa1 == 1 && divisa2 == 5){
            exchange = importe * 0.80; //Pesos a Yen
        } else if (divisa1 == 1 && divisa2 == 6){
            exchange = importe * 7.68; //Pesos a Won
        } else if (divisa1 == 2 && divisa2 == 0){
            exchange = importe * 1.05; //Euro a Dolar
        } else if (divisa1 == 2 && divisa2 == 1){
            exchange = importe * 179.13; //Euro a Pesos
        } else if (divisa1 == 2 && divisa2 == 3){
            exchange = importe * 5.52; //Euro a Reales 
        } else if (divisa1 == 2 && divisa2 == 4){
            exchange = importe * 0.86; //Euro a Libra
        } else if (divisa1 == 2 && divisa2 == 5){
            exchange = importe * 144.04; //Euro a Yen
        } else if (divisa1 == 2 && divisa2 == 6){
            exchange = importe * 1374.90; //Euro a Won
        } else if (divisa1 == 3 && divisa2 == 0){
            exchange = importe * 0.19; //Reales a Dolar
        } else if (divisa1 == 3 && divisa2 == 1){
            exchange = importe * 32.47; //Reales a Pesos
        } else if (divisa1 == 3 && divisa2 == 2){
            exchange = importe * 0.18; //Reales a Euros
        } else if (divisa1 == 3 && divisa2 == 4){
            exchange = importe * 0.16; //Reales a Libras
        } else if (divisa1 == 3 && divisa2 == 5){
            exchange = importe * 26.06; //Reales a Yen
        } else if (divisa1 == 3 && divisa2 == 6){
            exchange = importe * 248.89; //Reales a Won
        } else if (divisa1 == 4 && divisa2 == 0){
            exchange = importe * 1.23; //Libra a Dolar
        } else if (divisa1 == 4 && divisa2 == 1){
            exchange = importe * 208.29; //Libra a Pesos
        } else if (divisa1 == 4 && divisa2 == 2){
            exchange = importe * 1.16; //Libra a Euro
        } else if (divisa1 == 4 && divisa2 == 3){
            exchange = importe * 6.41; //Libra a Reales
        } else if (divisa1 == 4 && divisa2 == 5){
            exchange = importe * 167.40; //Libra a Yen
        } else if (divisa1 == 4 && divisa2 == 6){
            exchange = importe * 1598.71; //Libra a Won
        } else if (divisa1 == 5 && divisa2 == 0){
            exchange = importe * 0.0073; //Yen a Dolar
        } else if (divisa1 == 5 && divisa2 == 1){
            exchange = importe * 1.24; //Yen a Pesos
        } else if (divisa1 == 5 && divisa2 == 2){
            exchange = importe * 0.0069; //Yen a Euro
        } else if (divisa1 == 5 && divisa2 == 3){
            exchange = importe * 0.038; //Yen a Reales
        } else if (divisa1 == 5 && divisa2 == 4){
            exchange = importe * 0.0060; //Yen a Libras
        } else if (divisa1 == 5 && divisa2 == 6){
            exchange = importe * 9.55; //Yen a Won
        } else if (divisa1 == 6 && divisa2 == 0){
            exchange = importe * 0.00077; //Won a Dolar
        } else if (divisa1 == 6 && divisa2 == 1){
            exchange = importe * 0.13; //Won a Pesos
        } else if (divisa1 == 6 && divisa2 == 2){
            exchange = importe * 0.00073; //Won a Euro;
        } else if (divisa1 == 6 && divisa2 == 3){
            exchange = importe * 0.0040; //Won a Reales
        } else if (divisa1 == 6 && divisa2 == 4){
            exchange = importe * 0.00063; //Won a Libras
        } else if (divisa1 == 6 && divisa2 == 5){
            exchange = importe * 0.10; //Won a Yen
        } else if (divisa1 == divisa2) {
            exchange = importe;
        }
          
        return exchange;
    }
    
   
}
/*
0 USD (Dolar Estados Unidos)
1 ARS (Peso Argentino)
2 EUR (Euro)
3 BRL (Real Brasileño)
4 GBP (Libra Esterlina)
5 JPY (Yen Japonés)
6 KRW (Won Surcoreano)
*/