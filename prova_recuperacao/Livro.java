public class Livro extends ProdutoFisico implements RemessaFisica{
    private String autor;
    private String tipoCapa;
    
    public Livro(int codigo, String descricao, Double preco, Double peso, String entrega, String autor,
            String tipoCapa) {
        super(codigo, descricao, preco, peso, entrega);
        this.autor = autor;
        this.tipoCapa = tipoCapa;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(String tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    @Override
    public Double calculaFrete(String resposta) {
        if(resposta.equals("PADRAO")){
            return this.preco*0.1;

        }
        return this.preco*0.15;
    }

    @Override
    public Double aplicaDesconto(Double desconto) {
        Double valor = this.preco*desconto/100;
        
        if(tipoCapa.equals("DURA")){
            return valor *=2;

        }
        
        return valor*=3;
    }

    @Override
    public int prazoEntrega(int data) {
        if(this.entrega.equals("CORREIOS")){
            return data*2;

        }
        return data;
    }

    public String resumo(){

        return("AUTOR:"+this.autor + "\nDESCRIÇÃO: " + this.descricao+"\nTIPO DE CAPA: "+this.tipoCapa);
    }
}
