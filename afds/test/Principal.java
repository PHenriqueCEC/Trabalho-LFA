
import afds.*;

public class Principal {
	
    public static void main(String[] args) {				
	Principal t = new Principal();		
        
        AFD a = new AFD();
        try{
            a.ler("./test/AFD.XML");
            System.out.print(a.ehVazio());
            a.ehInfinito();
            
        }catch(Exception E){
            
        }
    }

    /**
     *  Esse método lê o arquivo AFD.XML e imprime
     *  seu conteudo formatado.
     * @param w
     */    
    
    
    public void testeVazio(){
        AFD a = new AFD();
        try{
            a.ler("./test/AFD.XML");
            System.out.print(a.ehVazio());
            a.ehInfinito();
            
        }catch(Exception E){
            
        }
    }
    
    @SuppressWarnings("empty-statement")
    public void faca1(String w) {
        AFD a = new AFD();
        try {
               a.ler("./test/AFD.XML");
               System.out.println("AFD M = "+a);
               if (a.Aceita(w))
                   System.out.println("Aceitou "+w);
               System.out.println("Pe(q0,"+w+"):"+a.pe(a.getEstadoInicial(),w));
        } catch (Exception e){
               System.out.println(e); 
        } 
    }

    public void faca2() {
        AFN a = new AFN();
        try {
               a.ler("./test/AFN01.XML");
               System.out.println("AFN M = "+a);
               System.out.println(("AFD M' = " + a.toAFD()).toString());
        } catch (Exception e){
               System.out.println(e);
        }     
    }
}
