package classe_06;
import java.util.Scanner;
public class Classe_06 {
    
    public static class Derivada {
    
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
    
    public double  derivada () {
	
    double xi = -CB / (2*CA);
    double deriv = 2*CA*xi + 2;
    double equacao = CA * (deriv*deriv) + CB* deriv + CC;

    return equacao;
    }
    
    void eixoXandY  (int X, int Y) {
	
	int limiteX,limiteY,Tamanho,i;
	
	limiteX = X/2;
	limiteY = Y/2;
	Tamanho = (int) derivada ();
	
	int [] VetorX = new int[Tamanho];
        int [] VetorY = new int[limiteY];
	
	for (i = limiteX; i< Tamanho; i++) {
		VetorX[i] = i;
	}
	
	for (i = Tamanho; i< limiteY; i++) {	
	    VetorY[i] = i;
	}
	
        System.out.println("As Coordenadas De X\n");
	
	for (i = limiteX; i < Tamanho ; i++) {
	System.out.println(VetorX[i] + "\n");	
	}
	
	System.out.println("\nAs Coordenadas De Y\n");
	   	
	for (i = Tamanho; i< limiteY; i++) {
	System.out.println( VetorY[i] + "\n");	
	}
    }    
    }
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Derivada obj = new Derivada();
        
    System.out.print("Digite Coeficiente A : ");
    int a = input.nextInt();
    obj.setCA(a);
    
    System.out.print("Digite Coeficiente B : ");
    int b = input.nextInt();
    obj.setCB(b);
    
    System.out.print("Digite Coeficiente C : ");
    int c = input.nextInt();
    obj.setCC(c);
    
    System.out.println("A        : " + obj.getCA());
    System.out.println("B        : " + obj.getCB());
    System.out.println("C        : " + obj.getCC());
    System.out.println("Derivada : " + obj.getCC());
    
    
    System.out.print("\nDigite a Qunatidade de Coordenadas X : ");
    int x = input.nextInt();
    System.out.print("Digite a Qunatidade de Coordenadas Y : ");
    int y = input.nextInt();
    
    obj.eixoXandY(x, y);
    }   
}
