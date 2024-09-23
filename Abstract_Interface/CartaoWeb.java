public abstract class CartaoWeb {
    
    protected String destinatario;

    public abstract String showMessage();

    public void setDestinatario(String destinatario){
        this.destinatario = destinatario;

    }

    public String getDestinatario(){
        return destinatario;
    }
}
