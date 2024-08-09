public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(500.0);

        // Pagamento via PayPal
        PagamentoStrategy paypal = new PaypalPayment("user@example.com", "senha123");
        CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras(pedido);
        carrinho1.processarPagamento(paypal);

        // Pagamento via Cartão de Crédito
        PagamentoStrategy cartaoCredito = new CreditCardPayment("1234567890123456", "12/25", "123");
        CarrinhoDeCompras carrinho2 = new CarrinhoDeCompras(pedido);
        carrinho2.processarPagamento(cartaoCredito);
    }
}