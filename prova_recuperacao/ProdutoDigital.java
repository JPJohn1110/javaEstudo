public abstract class ProdutoDigital extends Produto {
    protected int tamanho;
    protected String tipoDownload;

    public abstract boolean verificaDownload();

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoDownload() {
        return tipoDownload;
    }

    public void setTipoDownload(String tipoDownload) {
        this.tipoDownload = tipoDownload;
    }

    public ProdutoDigital(int codigo, String descricao, Double preco, int tamanho, String tipoDownload) {
        super(codigo, descricao, preco);
        this.tamanho = tamanho;
        this.tipoDownload = tipoDownload;
    }


}
