package estga.estudy.modulo2;
import java.util.Scanner;

public class Modulo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 18; //idade a imprimir
        String opcao = ""; //se fizermos isso garantimo que a opao é nula antes de entrar em while(garante que por acaso nao seja 3.
        
        
        while(!opcao.equals("3")){ //assim repete enquanto a opcao nao for igual a 3
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Dizer Olá");
        System.out.println("2 - Mostrar idade");
        System.out.println("3 - Sair");

        opcao = sc.nextLine(); // criei apos o break pois estava a ficar confuso
        
        switch (opcao) { //aqui ele usara a opção entei meio confuso pensei em criar uma string e ler do teclado e jogar pta la
        
            case "1":
                System.out.println("Ola");
                break;
                
            case "2":
                System.out.println("sua idade e: " + idade);
                break;
                
            case "3":
                System.out.println("A sair...");
                break;
            default:
                System.out.println("Opção invalida");
            
        }
        }
        sc.close();
        
        
    }
}
