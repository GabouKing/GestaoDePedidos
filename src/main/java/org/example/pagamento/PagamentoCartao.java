package org.example.pagamento;

public class PagamentoCartao implements Pagamento{
    @Override
    public void pagar(double valor) {
        verComprovante(valor, "Cartao");
    }
}
