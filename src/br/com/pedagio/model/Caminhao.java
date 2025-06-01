package br.com.pedagio.model;

public class Caminhao implements Veiculo {
    private static final double VALOR_BASE = 10.00;
    private static final double VALOR_POR_EIXO = 2.00;
    private int numeroEixos;

    public Caminhao(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }

    @Override
    public double calcularPedagio() {
        return VALOR_BASE + (VALOR_POR_EIXO * numeroEixos);
    }

    @Override
    public String getTipo() {
        return "Caminhão";
    }
}
