package classe_07;
import java.util.Scanner;
public class Classe_07 {

    static class Fracao {
    
    private int n,d,resuNum,resulDen;
    
    Fracao () {
        n=0;
        d=0;
        resuNum = 0;
        resulDen = 0;
    }
    
    void setNum (int aux) {
        n = aux;
    }
    
    void setDen (int aux) {
        d = aux;
    }
    
    int getNum () {
        return n;
    }
    
    int getDen () {
        return d;
    }
    
    int getResuNum () {
        return resuNum;
    }
    
    int getresulDen () {
        return resulDen;
    }
    
    int  mdc (int Valor1,int Valor2) {
	
    int Resto= Valor1 % Valor2;

	
    while (Resto != 0) {
		
	Valor1 = Valor2;
		
	Valor2 = Resto;
		
	Resto  = Valor1 % Valor2;
		
    }
	
    return Valor2;
    }
    
    void soma (int numA, int denA,int numB, int denB) {
    
    int denSom = denA * denB;
    int numSom = numA * denB + numB * denA;
    int storeMdc = mdc(numSom, denSom);

    resuNum = numSom / storeMdc;  // Usando os parâmetros numA e denA
    resulDen = denSom / storeMdc;  // Usando os parâmetros denA e denB
    }
    
    void subb (int numA, int denA,int numB, int denB) {
    
    int denSub = denA * denB;
    int numSub = numA * denB - numB * denA;
    int storeMdc = mdc(numSub, denSub);

    resuNum = numSub / storeMdc;  // Usando os parâmetros numA e denA
    resulDen = denSub / storeMdc;  // Usando os parâmetros denA e denB
    }
    
    void multi (int numA, int denA,int numB, int denB) {
    
    int numMul = denA * denB;
    int denMul = numA * numB;
    int storeMdc = mdc(numMul, denMul);

    resuNum = denMul / storeMdc;  // Usando os parâmetros numA e denA
    resulDen = numMul / storeMdc;  // Usando os parâmetros denA e denB
    }
    
    void divis (int numA, int denA,int numB, int denB) {
    
    int numDiv = denA *  numB;
    int denDiv = numA * denB;
    int storeMdc = mdc(denDiv, numDiv);

    resuNum = denDiv / storeMdc;  // Usando os parâmetros numA e denA
    resulDen = numDiv / storeMdc;  // Usando os parâmetros denA e denB
    }
    
    }

    public static void main(String[] args) {
    Fracao objA = new Fracao();
    Fracao objB = new Fracao();
    Fracao objC = new Fracao();
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite O Numerador Da Primeira Fracao   : ");
    int num = input.nextInt();
    objA.setNum(num );
    
    System.out.print("Digite O Denumerador Da Primeira Fracao : ");
    int den = input.nextInt();
    objA.setDen(den);
    
    System.out.print("Digite O Numerador Da Segunda Fracao    : ");
    num = input.nextInt();
    objB.setNum(num );
    
    System.out.print("Digite O Denumerador Da Segunda Fracao  : ");
    den = input.nextInt();
    objB.setDen(den); 
    
    System.out.println("Digite A Opercao");
    System.out.println("1 - Adicao");
    System.out.println("2 - Subtracao");
    System.out.println("3 - Multiplicacao");
    System.out.println("4 - Divisao");
    int op = input.nextInt();
    
    switch (op) {
    
        case 1:    
        objC.soma(objA.getNum(),objA.getDen(),objB.getNum(),objB.getDen());
        System.out.println(objC.getResuNum() + "/" + objC.getresulDen());     
        break;
        
        case 2:    
        objC.subb(objA.getNum(),objA.getDen(),objB.getNum(),objB.getDen());
        System.out.println(objC.getResuNum() + "/" + objC.getresulDen());     
        break;
        
        case 3:    
        objC.multi(objA.getNum(),objA.getDen(),objB.getNum(),objB.getDen());
        System.out.println(objC.getResuNum() + "/" + objC.getresulDen());     
        break;
        
        case 4:    
        objC.divis(objA.getNum(),objA.getDen(),objB.getNum(),objB.getDen());
        System.out.println(objC.getResuNum() + "/" + objC.getresulDen());     
        break;
        
        default:
            break;
    
    }
    

    }  
}
