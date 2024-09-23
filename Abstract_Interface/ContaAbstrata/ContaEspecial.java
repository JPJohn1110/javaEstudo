public class ContaEspecial extends ContaBancaria implements Tributavel{

    private Double limite;


    @Override
    public void sacar(Double valor) {
        if(saldo + limite >= valor){
            saldo-=valor;
        }

    }

    @Override
    public Double imposto(Double taxa) {
        Double desconto = saldo*taxa/100;
        saldo -= desconto;
        return desconto;
    } 

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    
    
}
