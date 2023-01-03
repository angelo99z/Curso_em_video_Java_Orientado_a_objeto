/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;

/**
 *
 * @author anggal
 */
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Ponta:  " + this.ponta);
    }
    
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
            
        } else {
            System.out.println("Estou rabiscando");
        }
        
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar () {
        this.tampada = false;
    }
}
