public class CreditCardPayment implements PagamentoStrategy {
    private String numeroCartao;
    private String dataExpiracao;
    private String codigoSeguranca;

    public CreditCardPayment(String numeroCartao, String dataExpiracao, String codigoSeguranca) {
        this.numeroCartao = numeroCartao;
        this.dataExpiracao = dataExpiracao;
        this.codigoSeguranca = codigoSeguranca;
    }

    @Override
    public void pagar(double valor) {
        // Simulação da validação do cartão de crédito
        if (validarCartao()) {
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso via Cartão de Crédito.");
        } else {
            System.out.println("Falha na validação do Cartão de Crédito.");
        }
    }

    private boolean validarCartao() {
        // Lógica simples de validação simulada
        return "1234567890123456".equals(numeroCartao) && "12/25".equals(dataExpiracao) && "123".equals(codigoSeguranca);
    }
}