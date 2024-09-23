public class Natal extends CartaoWeb {
    Natal(String destinatario){
        this.destinatario = destinatario;
    }

    @Override
    public String showMessage() {
        return ("Feliz Natal meu querido " + destinatario);
    }
}
