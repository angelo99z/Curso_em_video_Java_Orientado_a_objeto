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
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    void status() {
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta:  " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }
    
    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
            
        } else {
            System.out.println("Estou rabiscando");
        }
        
    }
    
    protected void tampar() {
        this.tampada = true;
    }
    
    protected void destampar () {
        this.tampada = false;
    }
}
