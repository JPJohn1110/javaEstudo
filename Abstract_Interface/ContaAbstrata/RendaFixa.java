public class RendaFixa implements Aplicacao{

    private Double saldo;

@Override
public Double rendimento(Double taxa){

    Double rendimento = saldo*taxa/100;
    saldo += rendimento;
    return rendimento;}

public Double getSaldo() {
    return saldo;
}
    
public void aplicacao(Double valor){

    this.saldo+= valor;
    
}
}
