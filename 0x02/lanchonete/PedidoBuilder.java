public class PedidoBuilder extends PedidoAbstractBuilder{

    private Pedido pedido = new Pedido();
    private ItemPedido itemPedido;

    @Override
    public void setLanche(TipoLanche tipo) {
        itemPedido = new ItemPedido();
        itemPedido.setTipo(TipoItemPedido.LANCHE);
        itemPedido.setNome(tipo.name());

        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        itemPedido = new ItemPedido();
        itemPedido.setTipo(TipoItemPedido.BATATA);
        itemPedido.setNome(tamanho.name());

        pedido.adicionarItemDentroCaixa(itemPedido);
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {

        itemPedido = new ItemPedido();
        itemPedido.setTipo(TipoItemPedido.BRINDE);
        itemPedido.setNome(tipo.name());

        pedido.adicionarItemDentroCaixa(itemPedido);

    }

    @Override
    public void setBebida(TipoBebida tipo) {

        itemPedido = new ItemPedido();
        itemPedido.setTipo(TipoItemPedido.BEBIDA);
        itemPedido.setNome(tipo.name());

        pedido.adicionarItemForaCaixa(itemPedido);

    }

    public Pedido build(){
        return pedido;
    }
}
