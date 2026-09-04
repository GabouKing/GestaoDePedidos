package org.example.pagamento;

public interface Pagamento {
    void pagar(double valor);

    default void verComprovante(double valor, String metodo) {
        System.out.printf("Valor pago: %.2f\nMetodo de pagamento: %s\n", valor, metodo);
    }

    static boolean validadorDeValor(double valor) {
        return valor >= 0;
    }

}
