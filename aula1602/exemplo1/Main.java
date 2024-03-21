package aula1602.exemplo1;

import aula1602.exercício.notificacaoEmail;
import aula1602.exercício.notificacaoWhatsapp;

public class Main {

    public static void main(String[] args) {
        
        Notificacao n = new NotificacaoEmail();
        Alerta a = new Alerta(n);
        System.out.println(a.dispararAlerta());

        n = new NotificacaoSMS();
        a = new Alerta(n);
        System.out.println(a.dispararAlerta());

        n = new NotificacaoWhatsapp();
        a = new Alerta(n);
        System.out.println(a.dispararAlerta());

    }
}