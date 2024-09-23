public abstract class ProdutoFisico extends Produto {

    protected Double peso;
    protected String entrega;

    public abstract Double calculaFrete(String resposta);

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public ProdutoFisico(int codigo, String descricao, Double preco, Double peso, String entrega) {
        super(codigo, descricao, preco);
        this.peso = peso;
        this.entrega = entrega;
    }
    

}
