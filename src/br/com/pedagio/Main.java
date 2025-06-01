package br.com.pedagio;

import br.com.pedagio.model.Caminhao;
import br.com.pedagio.model.Carro;
import br.com.pedagio.model.Moto;
import br.com.pedagio.model.Veiculo;
import br.com.pedagio.service.RelatorioPedagio;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Veiculo v1 = new Carro();
        Veiculo v2 = new Caminhao(4);
        Veiculo v3 = new Moto();

        processarPedagio(v1);
        processarPedagio(v2);
        processarPedagio(v3);

        RelatorioPedagio.exibirRelatorio();
    }

    public static void processarPedagio(Veiculo veiculo) {
        double valor = veiculo.calcularPedagio();
        System.out.printf("Veículo: %s | Valor do Pedágio: R$ %.2f%n", veiculo.getTipo(), valor);
        RelatorioPedagio.adicionarValor(valor);
    }
}
