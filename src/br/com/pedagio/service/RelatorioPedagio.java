package br.com.pedagio.service;

public class RelatorioPedagio {
    private static int contagemTotalVeiculos = 0;
    private static double somaTotalArrecadada = 0.0;

    public static void adicionarValor(double valor) {
        contagemTotalVeiculos++;
        somaTotalArrecadada += valor;
    }

    public static void exibirRelatorio() {
        System.out.println("==== RELATÓRIO DO PEDÁGIO ====");
        System.out.println("Total de veículos: " + contagemTotalVeiculos);
        System.out.printf("Total arrecadado: R$ %.2f%n", somaTotalArrecadada);
    }
}
