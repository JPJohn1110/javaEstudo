public class DiaDosNamorados extends CartaoWeb {

    DiaDosNamorados(String destinatario){
        this.destinatario = destinatario;
    }

    @Override
    public String showMessage() {
        return ("Feliz ValentinDay meu querido " + destinatario);
    }
}