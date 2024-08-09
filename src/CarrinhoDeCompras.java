public class CarrinhoDeCompras {
    private Pedido pedido;

    public CarrinhoDeCompras(Pedido pedido) {
        this.pedido = pedido;
    }

    public void processarPagamento(PagamentoStrategy estrategiaPagamento) {
        estrategiaPagamento.pagar(pedido.getValorTotal());
    }
}