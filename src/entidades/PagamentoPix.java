public class PagamentoPix implements FormaPagamento {
    @Override
    public double calcularValorFinal(double valorBruto) {
        return valorBruto * 1.05; // 5% a mais - Taxa da máquina
    }
}
