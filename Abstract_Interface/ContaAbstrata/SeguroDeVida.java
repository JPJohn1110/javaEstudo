public class SeguroDeVida implements Tributavel{

    private Double tarifa;
    private Double valorSeguro;
    public Double getTarifa() {
        return tarifa;
    }
    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }
    public Double getValorSeguro() {
        return valorSeguro;
    }
    public void setValorSeguro(Double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }
    @Override
    public Double imposto(Double taxa) {
        Double desconto = valorSeguro*taxa/100;
        valorSeguro -= desconto;
        return desconto;
    } 

    
    
}
