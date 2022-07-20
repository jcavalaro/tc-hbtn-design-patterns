import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida{
    @Override
    public List<String> obterIngredientes() {
    List<String> list = new ArrayList<String>();
    list.add("cafe");
    return list;
    }

    @Override
    public double obterPreco() {
        return 5.35;
    }
}
