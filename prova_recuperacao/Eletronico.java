public class Eletronico extends ProdutoFisico implements RemessaFisica{
    private String tipo;
    private String alimentacao;
    
    public Eletronico(int codigo, String descricao, Double preco, Double peso, String entrega, String tipo,
            String alimentacao) {
        super(codigo, descricao, preco, peso, entrega);
        this.tipo = tipo;
        this.alimentacao = alimentacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    @Override
    public Double calculaFrete(String resposta) {
        if(resposta.equals("NORMAL")){
            return this.preco*0.2;

        }
        return this.preco*0.3;
    }

    @Override
    public Double aplicaDesconto(Double desconto) {
        if(this.alimentacao.equals("TOMADA")){
            return desconto*this.preco/100;
        }
        return 0.0;
    }

    @Override
    public int prazoEntrega(int data) {
    
        if(this.tipo.equals("PORTÁTIL")){
            if(this.entrega.equals("CORREIOS")) {
                return data*2;
            }
            return data;
        }

        else{
            if(this.entrega.equals("CORREIOS")) {
                return data*4;
            }

        }
        return data*2;
    }
    
    public String detalhes(){
    return("TIPO: "+this.tipo+"\nDESCRIÇÂO: "+this.descricao+"\nPESO: "+this.peso+"ALIMENTAÇÂO: "+this.alimentacao);

    }

    
}
