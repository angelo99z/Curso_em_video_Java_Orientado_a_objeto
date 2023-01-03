/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula02;

/**
 *
 * @author anggal
 */
public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();  
        c1.rabiscar();    
        
        System.out.println();
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Vermelho";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
