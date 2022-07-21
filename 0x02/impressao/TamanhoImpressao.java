public enum TamanhoImpressao {
    A2(0.22, 0.18, 0.32, 0.28),
    A3(0.20, 0.15, 0.30, 0.25),
    A4(0.15, 0.10, 0.25, 0.20);

    public final double valorUmLadoPretoBranco;
    public final double valorFrenteEVersoPretoBranco;
    public final double valorUmLadoColorida;
    public final double valorFrenteEVersoColorida;

    TamanhoImpressao(double valorUmLadoPretoBranco, double valorFrenteEVersoPretoBranco, double valorUmLadoColorida, double valorFrenteEVersoColorida) {
        this.valorUmLadoPretoBranco = valorUmLadoPretoBranco;
        this.valorFrenteEVersoPretoBranco = valorFrenteEVersoPretoBranco;
        this.valorUmLadoColorida = valorUmLadoColorida;
        this.valorFrenteEVersoColorida = valorFrenteEVersoColorida;
    }

    public double getValorUmLadoPretoBranco() {
        return valorUmLadoPretoBranco;
    }

    public double getValorFrenteEVersoPretoBranco() {
        return valorFrenteEVersoPretoBranco;
    }

    public double getValorUmLadoColorida() {
        return valorUmLadoColorida;
    }

    public double getValorFrenteEVersoColorida() {
        return valorFrenteEVersoColorida;
    }
}
