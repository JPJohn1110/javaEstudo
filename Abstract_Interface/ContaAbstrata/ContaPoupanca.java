public class ContaPoupanca extends ContaBancaria implements Aplicacao{

    private int diaRendimento;

    public int getDiaRendimento(){
        return diaRendimento;

    }

    public void setDiaRendimento(int diaRendimento){
        this.diaRendimento = diaRendimento;
    }

    @Override
    public Double rendimento(Double taxa) {
        Double rendimento = saldo*taxa/100;
        saldo += rendimento;
        return rendimento;
    }
    
}
