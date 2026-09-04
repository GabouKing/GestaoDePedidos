package org.example.notificacao;

public class NotificacaoZAP implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.printf("Mensagem: %s\nNotificado via: ZAP",mensagem);
    }
}
