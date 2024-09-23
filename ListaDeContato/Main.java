import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Agenda age = new Agenda();
    
    int escolha = 0;

    while(escolha >=0){
        System.out.println("Escolha uma opçao:\n[0]-Adicionar contato\n[1]-Amigos\n[2]-Conhecidos\n[3]-Contatos\n[4]-Aniversario\n[5]-Emails\n");
        escolha = scan.nextInt();
     switch (escolha) {
    
        case 0:
            Amigo amigo = new Amigo("jp", 20, "11/10/2003");
            age.adicionaContatos(amigo);


            Conhecido conhecid = new Conhecido("jp", 20, "132@gmail.com");
            age.adicionaContatos(conhecid);
        
            break;
    
        case 1:

            age.listaAmigos();

            break;
        case 2:
            age.listaConhecido();
        
            break;
        case 3:
            age.listaContatos();
            break;


        case 4:
            age.imprimeAniversarios();
            break;
        case 5:
            age.imprimeEmails();
            break;

        case 6:
            age.alteraContato();
            break;
    }       

        }
    }
}
