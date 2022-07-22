
import afds.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int opcao = 0;
        AFD afd = new AFD();
        Scanner ler = new Scanner(System.in);
        
        String path = getAfdPath();
        
        try {
            afd.ler(path);
            while (opcao != 5) {
                printMenu();
                opcao = ler.nextInt();
                selecionaOpcao(opcao, afd);
            }
        } catch (Exception err) {
            System.out.println("Erro ao ler XML");
        }
    }
    
    public static String getAfdPath(){
        System.out.println("Digite o caminho do arquivo XML, ex: ./test/AFD_VAZIO.XML  ");
        Scanner ler = new Scanner(System.in);
        String path = ler.nextLine();
        
        return path;
    }

    public static void selecionaOpcao(int opcao, AFD afd) throws Exception {
        switch (opcao) {
            case 1:
                System.out.println("---------------------------");
                System.out.println("Eh vazio: " + afd.ehVazio());
                System.out.println("---------------------------");
                break;
            case 2:
                System.out.println("---------------------------");
                System.out.println("Eh Finito: " + afd.ehFinito());
                System.out.println("---------------------------");
                break;
            case 3:
                System.out.println("---------------------------");
                System.out.println("Eh Infinito: " + afd.ehInfinito());
                System.out.println("---------------------------");
                break;
            case 4:
                 String path = getAfdPath();
                 afd.ler(path);
            default:
                break;
        }
    }

    public static void printMenu() {
        System.out.println("---ESCOLHA UMA OPÇÃO----");
        System.out.println("(1) - TESTE VAZIO");
        System.out.println("(2) - TESTE FINITO");
        System.out.println("(3) - TESTE INFINITO");
        System.out.println("(4) - Para ler outro AFD");
        System.out.println("(5) - PARA SAIR");
    }
}
