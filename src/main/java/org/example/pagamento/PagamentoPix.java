package org.example.pagamento;

public class PagamentoPix implements Pagamento{
    @Override
    public void pagar(double valor) {
        verComprovante(valor, "PIX");
    }
}
