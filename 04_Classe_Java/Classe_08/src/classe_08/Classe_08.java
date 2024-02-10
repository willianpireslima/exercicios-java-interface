package classe_08;
import java.util.Scanner;
public class Classe_08 {

    static class Tempo {
    
    private int horas, minutos , segundos,DifeHora,DifeMin,DifeSeg;
    
    Tempo () {
    horas    = 0;
    minutos  = 0; 
    segundos = 0;
    DifeHora = 0; 
    DifeMin  = 0; 
    DifeSeg  = 0; 
    }
     
    String setMedidasTempo (int auxHora,int auxMin, int auxSeg) {
    
    if (  (auxHora > -1 && auxHora < 25) 
        && (auxMin  > -1 && auxMin  < 61) 
        && (auxSeg  > -1 && auxSeg  < 61) )  {
        
        horas    = auxHora; 
        minutos  = auxMin; 
        segundos = auxSeg;
        return "Hora Valida";
    }
    
    return "Hora Invalida";
    }
    
    int converteTempoSgundos() {
    
    return 36000*horas + 60*minutos +segundos;
    }
    
    void converteSegundosTempo(int tempo1 , int tempo2) {
    
    int diferenca = tempo1 - tempo2;
   	
    DifeHora = diferenca / 3600;
    DifeMin  = (diferenca - (DifeHora * 3600)) / 60;
    DifeSeg  = diferenca   % 60;
    }
    
    int getDifeHora () {
        return DifeHora;
    }
    
    int getDifeMin () {
        return DifeMin;
    }
    
    int getDifeSeg () {
        return  DifeSeg;
    }
    
    }
    
    public static void main(String[] args) {
    Tempo objA = new Tempo();
    Tempo objB = new Tempo();
    Tempo objC = new Tempo();
    Scanner input = new Scanner(System.in);
        
    System.out.print("Digite as Horas do Primeiro Tempo   : ");
    int h = input.nextInt();
        
    System.out.print("Digite as Minutos do Primeiro Tempo : ");
    int m = input.nextInt();
    
    System.out.print("Digite as Segundos do Primeiro Tempo : ");
    int s = input.nextInt();
  
    System.out.println(objA.setMedidasTempo (h,m,s)); 
        
    System.out.print("Digite as Horas do Segundo Tempo   : ");
    h = input.nextInt();
        
    System.out.print("Digite as Minutos do Segundo Tempo : ");
    m = input.nextInt();
    
    System.out.print("Digite as Segundos do Segundo Tempo : ");
    s = input.nextInt();
  
    System.out.println(objB.setMedidasTempo (h,m,s));
    
    objC.converteSegundosTempo(objA.converteTempoSgundos(),objB.converteTempoSgundos());
    
    System.out.println("Diferenca Horas   : " + objC.getDifeHora());
    System.out.println("Diferenca Minutos : " + objC.getDifeMin());
    System.out.println("Diferenca Segundo : " + objC.getDifeSeg());
    }
}
