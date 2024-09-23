public class Aniversario extends CartaoWeb {
    
    Aniversario(String destinatario){
        this.destinatario = destinatario;
    }

    @Override
    public String showMessage() {
        return ("Parabéns meu querido " + destinatario);
    }

}
