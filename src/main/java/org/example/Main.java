package org.example;

import org.example.pagamento.PagamentoBoleto;
import org.example.pagamento.PagamentoService;
import org.example.pagamento.PagamentoServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PagamentoService pagamentoServiceImpl = new PagamentoServiceImpl();
        pagamentoServiceImpl.pagar(
                100,
                new PagamentoBoleto()
        );

    }
}