import java.util.Scanner;

public class Agenda{

    private int quantidadeDeContatos = 10;
    Scanner scan = new Scanner(System.in);
    private Pessoa[] lista  = new Pessoa[quantidadeDeContatos];
    ;
    
    
    
    public int getQuantidadeDeContatos() {
        return quantidadeDeContatos;
    }
    public void setQuantidadeDeContatos(int quantidadeDeContatos) {
        this.quantidadeDeContatos = quantidadeDeContatos;
    }

    public void adicionaContatos(Amigo amigo){

        for(int i=0; i <quantidadeDeContatos;i++){
            if(lista[i] == null){ 
                lista[i] = amigo;
                System.out.println("Contato adicionado \n");
                return;
            }
            }
            System.out.println("Contato Nao adicionado \n");
            return;
    }


    public void adicionaContatos(Conhecido conhecido){

        for(int i=0;i< quantidadeDeContatos;i++){
            if(lista[i] == null) {
                lista[i] = conhecido;
                System.out.println("Contato adicionado \n");
                return;
            }
        }
        System.out.println("Contato Nao adicionado \n");
        return;

}


     public void alteraContato(){

    for(int i=0;i< quantidadeDeContatos;i++){
            if(lista[i] != null){
                System.out.println(i + lista[i].getNome());
            }

        
        }
        System.out.println("Qual o numero do contato");
        int escolha = scan.nextInt();
        scan.nextLine();
                if(lista[escolha].getTipo().equals("A")){
                    Amigo amigo = (Amigo) lista[escolha];
                    System.out.print("nome: \n");
                    String a = scan.nextLine();
                    amigo.setNome(a);
                    System.out.print("idade: \n");
                    int b = scan.nextInt();
                    scan.nextLine();
                    amigo.setIdade(b);
                    System.out.println("data de nascimento (dd/mm/aaaa): \n");
                    a = scan.nextLine();
                    amigo.setAniversario(a);

                    Pessoa s = (Pessoa) amigo;
                    lista[escolha] = s;


                }

                if(lista[escolha].getTipo().equals("C")){
                    Conhecido conhe = (Conhecido) lista[escolha];
                    System.out.print("nome: \n");
                    String a = scan.nextLine();
                    conhe.setNome(a);
                    System.out.print("idade: \n");
                    int b = scan.nextInt();
                    conhe.setIdade(b);
                    scan.nextLine();
                    System.out.print("email:: \n");
                    a = scan.nextLine();
                    conhe.setEmail(a);

                    Pessoa s = (Pessoa) conhe;
                    lista[escolha] = s; 

            
        }

    }



    public void listaAmigos(){
        System.out.println("AMIGOS:");
        for(int i=0;i< quantidadeDeContatos;i++){
            if(lista[i] != null) {
                if(lista[i].getTipo().equals("A")){
                    Amigo amigo = (Amigo) lista[i];
                    System.out.printf("[%s] - nome: %s \t \n",i,amigo.getNome());
                }
            }
        }
    }
    public void listaConhecido(){
        System.out.println("CONHECIDOS:");
        for(int i=0;i< quantidadeDeContatos;i++){
            if(lista[i] != null){
                if(lista[i].getTipo().equals("C")){
                    Conhecido conhecido = (Conhecido) lista[i];
                    System.out.printf("[%s] - nome: %s \t \n",i, conhecido.getNome());
                }
            }
        }
    }
    public void listaContatos(){

        listaAmigos();
        System.out.println();
        listaConhecido();
        
    }
    public void imprimeAniversarios(){
        System.out.println("AMIGOS:");
        for(int i=0;i< quantidadeDeContatos;i++){
            if(lista[i] != null) {
                if(lista[i].getTipo().equals("A")){
                    Amigo amigo = (Amigo) lista[i];
                System.out.printf("nome: %s \t data de aniversario: %s \n ",amigo.getNome(),amigo.getAniversario());
            }
        }
    }
}
    public void imprimeEmails(){

        System.out.println("CONHECIDOS:");
        for(int i=0;i< quantidadeDeContatos;i++){
            if(lista[i] != null){
                if(lista[i].getTipo().equals("C")){
                    Conhecido conhecido = (Conhecido) lista[i];;
                    System.out.printf("nome: %s \t Email: %s \n",conhecido.getNome(),conhecido.getEmail());
                }
            }
        }
    }
        
}
