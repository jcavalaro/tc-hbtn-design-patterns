public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int coloridas, boolean ehFrenteVerso){
        return new Impressao(tamanhoImpressao, totalPaginas, coloridas, ehFrenteVerso);
    }

}
