public class Revista extends Publicacao{
    private int ano;
    private int volume;

    @Override
    
    public String emprestar(int dia, int mes){
        if (dia + 3 >30){
            dia += (3 -30);
            mes+=1;
        }
        else{
            dia+=3;
        }

        return dia +"/"+mes;

    }


    public Revista(int isnb, String nome, int numeroDeCopias, int copiasEmprestadas, String tipo, int ano, int volume) {
        super(isnb, nome, numeroDeCopias, copiasEmprestadas, tipo);
        this.ano = ano;
        this.volume = volume;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


}
