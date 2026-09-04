package org.example.notificacao;

public class NotificacaoEmail implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.printf("Mensagem: %s\nNotificado via: EMAIL",mensagem);
    }
}
