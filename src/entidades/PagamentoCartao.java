package entidades;
public class PagamentoCartao implements FormaPagamento{
    @Override
    public double calculaValorFinal(double valorBruto) {
        return valorBruto * 0.90; // 10% de desconto
    }
}
