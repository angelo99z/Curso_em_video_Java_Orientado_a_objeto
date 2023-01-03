
package com.mycompany.aula01tarefa;

public class Aula01Tarefa {

    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.marca = "Xiaomi";
        c1.modelo = "MI 10T";
        c1.carga = 90;
        c1.ligado = true;
        c1.status();
        c1.usar();
        
        System.out.println("");
        Celular c2 = new Celular();
        c2.marca = "Apple";
        c2.modelo = "Iphone 14";
        c2.cor = "branco";
        c2.carga = 50;
        c1.ligado = false;
        c2.status();
        c2.usar();
    }
}
