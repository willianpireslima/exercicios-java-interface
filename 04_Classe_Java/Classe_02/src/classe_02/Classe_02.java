package classe_02;
import java.util.Scanner;
public class Classe_02 {
    
    public static class Triangulo {
    
    private int lA,lB,lC;
    
    public void setL1 (int aux) {
        lA = aux;
    }
    
    public void setL2 (int aux) {
        lB = aux;
    }
    
    public void setL3 (int aux) {
        lC = aux;
    }
    
    public int getL1 () {
        return lA;
    }
    
    public int getL2 () {
        return lB;
    }
    
    public int getL3 () {
        return lC;
    }
    
    public boolean checarTriangulo () {
    
    if (lA < lB + lC && lB < lA + lC && lC < lA + lB ) {
    return true;   
    }
    return false; 
    }
    public  String tipoTrianguloLados () {
  
    if (lA == lB && lB == lC) {
        return "Equilatero";
    }else if (lA == lB || lB == lC || lA == lC) {
        return "Isosceles";
    }else if (lA != lB && lB != lC) {
        return "Escaleno";
    }
  
    return "";
    }
    
    public  String tipoTrianguloAngulo () {
    
        if (lA*lA < lB*lB + lC*lC) {
            return "Acutangulo";
        }else if (lA*lA > lB*lB + lC*lC) {
            return "Obtusangulo";
        }else if (lA*lA == lB*lB + lC*lC) {
            return "Retangulo";
        }
    return "";
    }
   
    
    }
 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Triangulo obj = new Triangulo();    
    
    System.out.print("Digite Lado A do Triangulo : ");
    int lado1 = input.nextInt();
    obj.setL1(lado1);
    
    System.out.print("Digite Lado B do Triangulo : ");
    int lado2 = input.nextInt();
    obj.setL2(lado2);
    
    System.out.print("Digite Lado C do Triangulo : ");
    int lado3 = input.nextInt();
    obj.setL3(lado3);
    
    if (obj.checarTriangulo () == true) {
    
    System.out.println("Trianguloo Tipo Lado   : " + obj.tipoTrianguloLados());
    System.out.println("Trianguloo Tipo Angulo : " +obj.tipoTrianguloAngulo());
    }else {
    System.out.println("Nao e um Triangulo");
    }
    
    
    }
    
}
