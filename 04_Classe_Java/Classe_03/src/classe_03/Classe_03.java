package classe_03;
import java.lang.Math;
import java.util.Scanner;
public class Classe_03 {

    public static class Equacao2Grau {
    
    private int CA,CB,CC;
    
    public  void setCA (int aux) {
        CA = aux;
    }
    
    public void setCB (int aux) {
        CB = aux;
    }
    
    public void setCC (int aux) {
        CC = aux;
    }
    
    public int getCA () {
        return CA;
    }
    
    public int getCB () {
        return CB;
    }
    
    public int getCC () {
        return CC;
    }
    
    public boolean checarEquaco () {
    
    if ( (CB*CB) - (4*CA*CC) > 0) {
        return true;   
    }
    return false; 
    }
    
    public  void imprimirRaiz () {
    
    int delta = (CB*CB) - (4*CA*CC);
        
    if (delta == 0) {
        System.out.println("Raiz Unica : " + -CB/(2*CA));
    }else {
    
    System.out.println("Raiz X1 : " + (-CB + Math.sqrt(delta))/2*CA);   
    System.out.println("Raiz X2 : " + (-CB - Math.sqrt(delta))/2*CA);  
    }
    
    }
   
    
    }
    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    Equacao2Grau obj = new Equacao2Grau();    
    
    System.out.print("Digite o Coeficiente A : ");
    int coeA = input.nextInt();
    obj.setCA(coeA);
    
    System.out.print("Digite o Coeficiente B : ");
    int coeB = input.nextInt();
    obj.setCB(coeB);
    
    System.out.print("Digite o Coeficiente C : ");
    int coeC = input.nextInt();
    obj.setCC(coeC);
    
    if (obj.checarEquaco() == true) {
    obj.imprimirRaiz();
    }else {
    System.out.print("A Raiz nao e Real");
    }
    
    }
    
}
