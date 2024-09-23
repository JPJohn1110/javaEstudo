public class Musica extends ProdutoDigital implements RemessaDigital {
    private String interprete;
    private int duracao;
   
   
    public Musica(int codigo, String descricao, Double preco, int tamanho, String tipoDownload, String interprete,
            int duracao) {
        super(codigo, descricao, preco, tamanho, tipoDownload);
        this.interprete = interprete;
        this.duracao = duracao;
    }


    public String getInterprete() {
        return interprete;
    }


    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }


    public int getDuracao() {
        return duracao;
    }


    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    @Override
    public boolean verificaDownload() {
        
        return false;
    }


    @Override
    public Double aplicaDesconto(Double desconto) {

        return this.preco*desconto/100;
    }


    @Override
    public int tempoDownload(int tempo) {
        // TODO Auto-generated method stub
        return 0;
    }

    
    

}
