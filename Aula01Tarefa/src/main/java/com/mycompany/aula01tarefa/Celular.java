package com.mycompany.aula01tarefa;

public class Celular {
    String marca;
    String modelo;
    String cor;
    int carga;
    boolean ligado;
    
    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ligado: " + this.ligado);
    }
    
    void usar() {   
    if (this.ligado == true) {
        System.out.println("Usando o celular");
    } else {
        System.out.println("ERRO! Celular precisa estar ligado para usar");
    } 
}
    
    void ligar() {
        this.ligado = true;
    }
    
    void desligar() {
        this.ligado = false;
    }
}
