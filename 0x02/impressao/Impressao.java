public class Impressao {

    private TamanhoImpressao tamanhoImpressao;

    private int paginasTotais;
    private int paginasColoridas;

    private int paginasPretoBranco;

    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;


    public Impressao(TamanhoImpressao tamanho, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso){
        this.valorPretoBrancoFrenteApenas = tamanho.getValorUmLadoPretoBranco();
        this.valorPretoBrancoFrenteVerso = tamanho.getValorFrenteEVersoPretoBranco();
        this.valorColoridasFrenteApenas = tamanho.getValorUmLadoColorida();
        this.valorColoridasFrenteVerso = tamanho.getValorFrenteEVersoColorida();
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.paginasPretoBranco = paginasTotais - paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
    }


    public double calcularTotal(){
        double totalPretoBranco = 0.0;
        double totalColorida = 0.0;

        if (this.ehFrenteVerso) {
            totalPretoBranco = this.paginasPretoBranco * this.valorPretoBrancoFrenteVerso;
            totalColorida = this.paginasColoridas * this.valorColoridasFrenteVerso;
        } else {
            totalPretoBranco = this.paginasPretoBranco * this.valorPretoBrancoFrenteApenas;
            totalColorida = this.paginasColoridas * this.valorColoridasFrenteApenas;
        }

        return totalPretoBranco + totalColorida;
    }



    public Impressao(int paginasTotais, int paginasColoridas, boolean ehFrenteVerso, double valorColoridasFrenteVerso, double valorPretoBrancoFrenteVerso, double valorColoridasFrenteApenas, double valorPretoBrancoFrenteApenas) {
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public Impressao() {
    }

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public TamanhoImpressao getTamanhoImpressao() {
        return tamanhoImpressao;
    }

    public void setTamanhoImpressao(TamanhoImpressao tamanhoImpressao) {
        this.tamanhoImpressao = tamanhoImpressao;
    }

    public int getPaginasPretoBranco() {
        return paginasPretoBranco;
    }

    public void setPaginasPretoBranco(int paginasPretoBranco) {
        this.paginasPretoBranco = paginasPretoBranco;
    }

    @Override
    public String toString() {
        return String.format("total de paginas: %d, total coloridas: %d, " +
                        "total preto e branco: %d, %s. total: R$ %.2f",
                this.paginasTotais,
                this.paginasColoridas,
                this.paginasPretoBranco,
                this.ehFrenteVerso ? "frente e verso" : "frente apenas",
                this.calcularTotal());
    }

}
