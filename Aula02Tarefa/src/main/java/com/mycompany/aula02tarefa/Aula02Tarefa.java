
package com.mycompany.aula02tarefa;

public class Aula02Tarefa {

    public static void main(String[] args) {
        Reuniao r1 = new Reuniao();
        r1.tema = "Entrevista 01";
        r1.sala = "Sala de entrevistas";
        r1.dia = 05;
        r1.hora = 14;
        r1.mes = "Outubro";
        r1.duracao = 1;
        r1.vc = false;
        r1.agendar();
        
        System.out.println("");
        Reuniao r2 = new Reuniao();
        r1.tema = "Entrevista 02";
        r1.sala = "Sala de entrevistas";
        r1.dia = 05;
        r1.hora = 15;
        r1.mes = "Outubro";
        r1.duracao = 1;
        r1.vc = false;
        r1.agendar();
        r1.cancelar();
    }
}
