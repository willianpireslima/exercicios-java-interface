package classe_09;
import java.util.Scanner;

public class Classe_09 {
    
    static class Data   {

    private int dia, mes ,ano;
	
    void   setData    (int AuxDia,int AuxMes,int AuxAno) {
	
	dia = AuxDia;
	mes = AuxMes;
	ano = AuxAno;
    }

    String  validaData () {

    if ( (dia >  0    && dia < 32) &&
	 (mes  >  0   && mes  < 13) &&
         (ano >  1900 && ano < 2040) ) {
         
        return "Data Valida";
    }
	
    return "Data Inalida";
    }



    String  DeterminaDiaSemana() {
	
    // Formula para o dia da semana
    //Dia + Chave do mês + Chave do ano - Maior múltiplo de 7 = Dia da semana
	
    int ChaveDoMes=0,ChaveDoAno=0,MaiorMultiploDeSete=0;
	
    // chave do mes
	
    switch (dia) {
		
	case 1:
            ChaveDoMes = 1; 
	break;
		
	case 2:
            ChaveDoMes = 4; 
        break;
		
	case 3:
            ChaveDoMes = 4; 
        break;
		
	case 4:
            ChaveDoMes = 0; 
	break;
		
	case 5:
            ChaveDoMes = 2; 
	break;
		
	case 6:
            ChaveDoMes =5; 
	break;
		
	case 7:
            ChaveDoMes = 0; 
	break;
		
	case 8:
            ChaveDoMes = 3; 
	break;
		
	case 9:
            ChaveDoMes = 6; 
	break;
		
	case 10:
            ChaveDoMes = 1;
        break;
		
	case 11:	
            ChaveDoMes = 4; 
            break;
		
	case 12:
                ChaveDoMes = 6; 
            break;		
	}
	
    //chave do ano
	
    ChaveDoAno = ano / 4;
    ChaveDoAno = ChaveDoAno + (ano % 7);
    ChaveDoAno = ChaveDoAno % 7;
	
    // maior mulltipo de 7
	
    for (int i = 0; i < dia+ ChaveDoMes + ChaveDoAno; i++) {
		
	if ( i % 7 == 0 ) 
            MaiorMultiploDeSete = i;
	}
	
    // retornar o dia da semana
	
    int Formula = (dia + ChaveDoMes + ChaveDoAno) - MaiorMultiploDeSete;
	
    String DiaDaSemana ="";
	
    switch (Formula) {
		
	case 1:
            DiaDaSemana = "Domingo";
        break;
		
        case 2:
            DiaDaSemana = "Segunda-feira";
        break;
		
	case 3:
            DiaDaSemana = "Terca-feira"; 
	break;
		
	case 4:
            DiaDaSemana = "Quarta-feira"; 
	break;
		
	case 5:
            DiaDaSemana = "Quinta-feira"; 
	break;
		
	case 6:
            DiaDaSemana = "Sexta-feira";
	break;
		
	case 0:
            DiaDaSemana = "Sabado";
	break;
			
				
	}
	
		
    return DiaDaSemana;
    }
	

    int calculaDiasEntreDatas(int dia1,int mes1,int ano1, int dia2,int mes2,int ano2) {

	
    int diaTotalAno=0,diaTotalMes=0,i=0;

    // Pega os dias entre ano1 e ano2
    for(i = ano1; i < ano2; i++){ 

        // verifica se ano é bissexto ou não
        if(i % 4 == 0){
            diaTotalAno += 366;
        } else {
            diaTotalAno += 365;
        }
    }

    if (mes1 > mes2) {
	
        for(i =mes1 ; i < mes2; i++){ 
            diaTotalMes +=30;  
        }
		
	for(i =mes1 ; i < mes2; i = i + 2 ){ 
            diaTotalMes +=1;  
    	}
    }

   else
	{
	  
	for(i =mes2 ; i < mes1; i++){ 
            diaTotalMes +=30;  
    	} 
   	   
	for(i =mes2 ; i < mes1; i = i + 2 ){ 
            diaTotalMes +=1;  
    	} 
    }	  	
	
    // a diferença entre os meses
	
    if (mes1 > mes2) {
		
	diaTotalAno = diaTotalAno + diaTotalMes;
    }
    else
	{
	diaTotalAno = diaTotalAno - diaTotalMes;
    }
	
    // a diferença entre os anos
	
    if (dia1 > dia2) {
		
	diaTotalAno = diaTotalAno + (dia1 - dia2);
    }
	
    else
	{
	diaTotalAno = diaTotalAno + (dia2 - dia1);
    }
		
    return diaTotalAno ;
    }
  
    }
    
    
    public static void main(String[] args) {
    int [] dia = new int[2];
    int [] mes = new int[2];
    int [] ano = new int[2];
    Data [] obj =  new Data[3];
    Scanner input = new Scanner(System.in);
  
    // Iterando sobre cada posição do array e criando uma instância de Data
    for (int i = 0; i < obj.length; i++) {
        obj[i] = new Data();
    }
    
    for (int i =0; i <2; i++) {

        System.out.print("Digite o Dia : ");    
        dia[i] = input.nextInt();
        
        
        System.out.print("Digite o Mes : ");    
        mes[i] = input.nextInt();
        
        System.out.print("Digite o Ano : ");    
        ano[i] = input.nextInt();
        
        obj[i].setData(dia[i],mes[i],ano[i]);
        System.out.println(obj[i].validaData());
        System.out.println(obj[i].DeterminaDiaSemana());
        System.out.println("\n");
    }
    
    System.out.println(obj[2].calculaDiasEntreDatas ( dia[0] , mes[0] , ano[0] ,
	               dia[1] , mes[1] , ano[1]  ) );
    
    }
    
}
