package classe_10;
import java.util.Scanner;
public class Classe_10 {

    static class Forca {
    
    private String  palavra;
    private int vencedor,perdedor;
    
    Forca () {
    palavra = "";
    vencedor = 0;
    perdedor = 0;
    }
    
    void setPalavra (String aux) {
    palavra = aux;
    }
    
    String getPalavra () {
        return palavra;
    }
    
    int getVencedor () {
        return vencedor;
    }
    
     int getPerdedor () {
        return perdedor;
    }
    
    String verificar (char letra) {
    
        
    int posicao = palavra.indexOf(letra);
    
    if (posicao != -1) {
            vencedor++;
            return    "Caractere " +  letra + " em " +  posicao +
                      "Letras Acertadas : " + vencedor +
                      "Letras Erradas   : " + perdedor;
            
        } else {
            perdedor++; 
            return   "Nao Encontrado  " +
                      "Letras Acertadas : " + vencedor +
                      "Letras Erradas   : " + perdedor ;
        }
    
    }
    
    
    
    }
    
   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Forca obj = new Forca();
    
    System.out.print("Digite a Palavra : ");
    String palavra = input.nextLine();
    obj.setPalavra(palavra);
    System.out.println("\n");
    
    do {
    
        System.out.print("\nDigite a Letra : ");
        char letra = input.next().charAt(0);
        System.out.println(obj.verificar(letra));
    }while (obj.getVencedor () < palavra.length() && obj.getPerdedor () < 5 );
    
     if (obj.getVencedor () >= obj.getPalavra().length()) {
        System.out.println("Venceu");
    } else if (obj.getPerdedor () >= 5) {
       System.out.println("Perdeu");
    }   
    
    }
    
    
}
