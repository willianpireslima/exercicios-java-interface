package classe_01;
import java.util.Scanner;
import java.lang.Math;
public class Classe_01 {

    public static  class Cone {
    
    private  int raio=0, altura=0;
    
    public  void setRaio (int aux) {
        raio = aux;
    }
    
    public  void setAltura (int aux) {
        altura = aux;
    }
    
    public  int getRaio () {
        return raio;
    }
    
    public  int getAltura () {
        return altura;
    }
    
    public  double geratriz () {
        return Math.sqrt((altura*altura)+(raio*raio));
    }
    
    public  double areaLateral () {
        return  3.14f*raio*geratriz ();
    }
    
    
    public  double areaTotal () {
        return  (3.14f*raio*(geratriz()+raio));
    }
    
    public  float volume () {
        return  (1/3)*3.14f*raio*raio*altura;
    }
    
    }
    
    public static void main(String[] args) {
    Cone Obj = new Cone();
    Scanner teclado = new Scanner(System.in);
 
    System.out.print("Digite o Raio   : ");
    int raio = teclado.nextInt();
    Obj.setRaio(raio);
    
    System.out.print("Digite a Altura : ");
    int altura = teclado.nextInt();
    Obj.setAltura(altura);
  
    
    System.out.println("Raio         : " + Obj.getRaio());
    System.out.println("Altura       : " + Obj.getAltura());
    System.out.println("Geratriz     : " + Obj.geratriz());
    System.out.println("Area Lateral : " + Obj.areaLateral());
    System.out.println("Area Total   : " + Obj.areaTotal());
    System.out.println("Volume       : " + Obj.volume());
    }
    
}
