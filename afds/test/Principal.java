
import afds.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
        int opcao = 0;
        Scanner ler = new Scanner(System.in);
       
        while(opcao != 4)
        {
            System.out.println("---ESCOLHA UMA OPÇÃO----");
            System.out.println("(1) - TESTE VAZIO");
            System.out.println("(2) - TESTE FINITO");
            System.out.println("(3) - TESTE INFINITO");
            System.out.println("(4) - PARA SAIR");
            opcao = ler.nextInt();
            
            if(opcao == 1)
            {
               testeVazio();
            }
            
            if(opcao == 2)
            {
               testeFinito();
            }
            
            if(opcao == 3)
            {
               testeInfinito();
            }
        }
        
    }

    /**
     * Esse método lê o arquivo AFD.XML e imprime seu conteudo formatado.
     *
     * @param w
     */
    public static void testeVazio() {
        AFD certo = new AFD();
        AFD errado = new AFD();
        try {
            certo.ler("./test/AFD_VAZIO.XML");
            System.out.println("Eh vazio: " + certo.ehVazio());
            errado.ler("./test/AFD_VAZIO_2.XML");
            System.out.println("Eh vazio: " + errado.ehVazio());
        } catch (Exception E) {
            System.out.println("Erro ao ler XML");
        }
    }

    public static void testeFinito() {
        AFD certo = new AFD();
        AFD errado = new AFD();
        try {
            certo.ler("./test/AFD_FINITO.XML");
            System.out.println("Eh finito : " + certo.ehFinito());
            errado.ler("./test/AFD_FINITO_2.XML");
            System.out.println("Eh finito : " + errado.ehFinito());
        } catch (Exception E) {
            System.out.println("Erro ao ler XML");
        }
    }

    public static void testeInfinito() {
        AFD certo = new AFD();
        AFD errado = new AFD();
        try {
            certo.ler("./test/AFD_INFINITO.XML");
            System.out.println("Eh infinito : " + certo.ehInfinito());
            errado.ler("./test/AFD_INFINITO_2.XML");
            System.out.println("Eh infinito : " + errado.ehInfinito());
        } catch (Exception E) {
            System.out.println("Erro ao ler XML");
        }
    }

    @SuppressWarnings("empty-statement")
    public void faca1(String w) {
        AFD a = new AFD();
        try {
            a.ler("./test/AFD.XML");
            System.out.println("AFD M = " + a);
            if (a.Aceita(w)) {
                System.out.println("Aceitou " + w);
            }
            System.out.println("Pe(q0," + w + "):" + a.pe(a.getEstadoInicial(), w));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void faca2() {
        AFN a = new AFN();
        try {
            a.ler("./test/AFN01.XML");
            System.out.println("AFN M = " + a);
            System.out.println(("AFD M' = " + a.toAFD()).toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
