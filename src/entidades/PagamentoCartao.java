public class PagamentoCartao {
    @Override
    public double calcularValorFinal(double valorBruto) {
        return valorBruto * 0.90; // 10% de desconto
    }
}
