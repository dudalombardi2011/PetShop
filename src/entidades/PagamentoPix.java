public class PagamentoPix implements FormaPagamento {
    @Override
    public double calculaValorFinal(double valorBruto) {
        return valorBruto * 1.05; // 5% a mais - Taxa da máquina
    }
}
