package org.example.pagamento;

import org.example.notificacao.Notificacao;
import org.example.notificacao.NotificacaoEnum;
import org.example.notificacao.NotificacaoFactory;

public class PagamentoBoleto implements Pagamento {
    @Override
    public void pagar(double valor) {
        Notificacao notificacao;
        notificacao = NotificacaoFactory.criar(NotificacaoEnum.PUSH);
        notificacao.enviar("FACTORY EM UM STRATEGY SUCESSO TOTAL");
        verComprovante(valor, "BOLETO");
    }
}
