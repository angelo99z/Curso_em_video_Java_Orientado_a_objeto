
package com.mycompany.aula04;


public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Vermelha", 0.4f);
        c1.status();
        
        System.out.println("");
        Caneta c2 = new Caneta("Faber", "Roxa", 0.6f);
        c2.status();
    }
}
