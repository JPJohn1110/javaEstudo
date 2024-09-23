public class Livro extends Publicacao {
    private String autor;
    private String editora;
    public Livro(int isnb, String nome, int numeroDeCopias, int copiasEmprestadas, String tipo, String autor,
            String editora) {
        super(isnb, nome, numeroDeCopias, copiasEmprestadas, tipo);
        this.autor = autor;
        this.editora = editora;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    @Override
    public String emprestar(int dia, int mes){
        if (numeroDeCopias - 1 - copiasEmprestadas != 0){
            if (dia + 10 >30){
                dia += (10 -30);
                mes+=1;
            }
            else{
                dia+=10;
            }
    }

        return dia +"/"+mes;

    }
}
