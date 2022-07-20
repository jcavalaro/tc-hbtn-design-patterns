import java.util.ArrayList;
import java.util.List;

public class BebidaDecorator extends Bebida{
    private Bebida bebidaDecorada;

    public Bebida getBebidaDecorada() {
        return bebidaDecorada;
    }

    public void setBebidaDecorada(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    public BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }

    @Override
    public List<String> obterIngredientes() {
        return getBebidaDecorada().obterIngredientes();
    }

    @Override
    public double obterPreco() {
        return getBebidaDecorada().obterPreco();
    }
}
