package org.example.pagamento;

import org.example.notificacao.*;

public class PagamentoServiceImpl implements PagamentoService {

    public void pagar(double valor, Pagamento pagamento) {
        Notificacao notificacao;
        if(!Pagamento.validadorDeValor(valor)) {
            notificacao = NotificacaoFactory.criar(NotificacaoEnum.EMAIL);
            notificacao.enviar("Valor invalido");
        }
        else {
            //strategia
            pagamento.pagar(valor);

            //factory
            notificacao = NotificacaoFactory.criar(NotificacaoEnum.ZAP);
            notificacao.enviar("Pagamento efetuado com sucesso");
        }
    }
}

//Notificacao noficacaoCliente = NotificacaoFactory.criar(metodoNotificacao);
//noficacaoCliente.enviar("Pagamento efetuado com sucesso");

//            Notificacao notificacaoEmail = new NotificacaoEmail();
//            Notificacao notificacaoSMS = new NotificacaoSMS();
//            Notificacao notificacaoZap = new NotificacaoZAP();
//            Notificacao notificacaoPush = new NotificacaoPush();
//
//            if(metodoNotiificacao.equalsIgnoreCase("EMAIL")){
//                notificacaoEmail.enviar("Pagamento efetuado com sucesso");
//            }
//            else if(metodoNotiificacao.equalsIgnoreCase("SMS")){
//                notificacaoSMS.enviar("Pagamento efetuado com sucesso");
//            }
//            else if (metodoNotiificacao.equalsIgnoreCase("ZAP")){
//                notificacaoZap.enviar("Pagamento efetuado com sucesso");
//            }
//            else{
//                notificacaoPush.enviar("Pagamento efetuado com sucesso");
//            }