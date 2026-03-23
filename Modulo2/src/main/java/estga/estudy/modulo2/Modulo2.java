package estga.estudy.modulo2;
import java.util.Scanner;

public class Modulo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 18;
        
        String opcao = sc.nextLine();
        
        switch (opcao) {
        
            case "1":
                System.out.println("Ola");
                break;
                
            case "2":
                System.out.println("sua idade é: " + idade);
                break;
                
            case "3":
                System.out.println("A sair...");
                break;
            default:
                System.out.println("Opção invalida");
            
        }
        
        
    }
}
