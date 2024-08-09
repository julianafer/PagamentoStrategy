public class PaypalPayment implements PagamentoStrategy {
    private String email;
    private String senha;

    public PaypalPayment(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public void pagar(double valor) {
        // Simulação da autenticação no PayPal
        if (autenticar()) {
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso via PayPal.");
        } else {
            System.out.println("Falha na autenticação do PayPal.");
        }
    }

    private boolean autenticar() {
        // Lógica simples de autenticação simulada
        return "user@example.com".equals(email) && "senha123".equals(senha);
    }
}