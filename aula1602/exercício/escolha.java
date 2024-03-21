package aula1602.exercício;

import java.util.Scanner;

public class escolha {

    public static void main(String[] args) {

    Scanner read = new Scanner(System.in);

    System.out.println("Selecione a opção de envio:");
    System.out.println("[1] - SMS");
    System.out.println("[2] - E-mail");
    System.out.println("[3] - Whatsapp");

    notificacaoEmail email = new notificacaoEmail();
    notificacaoSMS sms = new notificacaoSMS();
    notificacaoWhatsapp wpp = new notificacaoWhatsapp();
    
    int option = read.nextInt();

        switch (option) {
            case 1:
                sms.lancarMensagem();
                break;

            case 2:
                email.lancarMensagem();
                break;
                
            case 3:
                wpp.lancarMensagem();
                break;
        
            default:
                break;
        }

    }

}
    
    
