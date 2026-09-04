package org.example.notificacao;

public class NotificacaoSMS implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.printf("Mensagem: %s\nNotificado via: SMS",mensagem);
    }
}
