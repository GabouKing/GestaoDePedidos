package org.example.notificacao;

public class NotificacaoPush implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.printf("Mensagem: %s\nNotificado via: PUSH",mensagem);
    }
}
