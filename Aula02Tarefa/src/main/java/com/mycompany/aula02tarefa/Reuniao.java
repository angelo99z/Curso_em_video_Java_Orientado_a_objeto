
package com.mycompany.aula02tarefa;

public class Reuniao {
    String tema;
    String sala;
    int hora;
    int dia;
    String mes;
    int duracao;
    boolean vc;
    boolean cancelar;
    
    void status() {
        System.out.println("Tema: " + this.tema);
        System.out.println("Sala: " + this.sala);
        System.out.println("Hora: " + this.hora);
        System.out.println("Dia: " + this.dia);
        System.out.println("Mes: " + this.mes);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Equipamento de VC: " + this.vc);
    }
    
    void agendar() {
        this.cancelar = false;
        System.out.println("Reunião agendada! dados de agendamento abaixo: ");
        status();
    }
    
    void cancelar() {
        this.cancelar = true;
        System.out.println("!!!REUNIÃO CANCELADA!!!");
    }
    
}
