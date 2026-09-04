package org.example.notificacao;

public class NotificacaoFactory {
    public static Notificacao criar(NotificacaoEnum tipo){

        return switch (tipo){
            case EMAIL -> new  NotificacaoEmail();
            case SMS -> new  NotificacaoSMS();
            case ZAP -> new  NotificacaoZAP();
            case PUSH -> new  NotificacaoPush();

        };
    }
}
