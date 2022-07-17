
import afds.*;

public class Principal {

    public static void main(String[] args) {
        testeVazio();
        testeFinito();
        testeInfinito();
    }

    /**
     * Esse método lê o arquivo AFD.XML e imprime seu conteudo formatado.
     *
     * @param w
     */
    public static void testeVazio() {
        AFD a = new AFD();
        try {
            a.ler("./test/AFD_VAZIO.XML");
            System.out.println("Eh vazio: " + a.ehVazio());
            a.ler("./test/AFD_VAZIO_2.XML");
            System.out.println("Eh vazio: " + a.ehVazio());
        } catch (Exception E) {
            System.out.println("Erro ao ler XML");
        }
    }

    public static void testeFinito() {
        AFD a = new AFD();
        try {
            a.ler("./test/AFD_FINITO.XML");
            System.out.println("Eh finito : " + a.ehFinito());
            a.ler("./test/AFD_FINITO_2.XML");
            System.out.println("Eh finito : " + a.ehFinito());
        } catch (Exception E) {
            System.out.println("Erro ao ler XML");
        }
    }

    public static void testeInfinito() {
        AFD a = new AFD();
        try {
            a.ler("./test/AFD_INFINITO.XML");
            System.out.println("Eh infinito : " + a.ehInfinito());
            a.ler("./test/AFD_INFINITO_2.XML");
            System.out.println("Eh infinito : " + a.ehInfinito());
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
