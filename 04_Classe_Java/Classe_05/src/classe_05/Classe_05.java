package classe_05;
import java.util.Scanner;

public  class Classe_05 {
    
    public static class Contatos {

    private int Id;
    public void setId(int aux) {
    Id = aux;	
    }

    public	int getId (){
    return Id;	
    }
    
    }

    public static class Agenda {
    private Contatos VetorId[] = new Contatos[256];
    private int indiceId;
	
    public Agenda () {
    
        for (int i=0; i<256; i++) {
        VetorId[i] = new Contatos ();
        }
    indiceId =0;
    }
    public String setContato      (int aux){
	
	VetorId[indiceId].setId(aux);
	indiceId++;	
        return "Contato Adcionado";
    } 
    public void getContato      () {
	
	System.out.println("\n");
	// Percorre o vetor de contatos
	for (int i=0; i < indiceId; i++) {
	System.out.println( VetorId[i].getId() + "  ");	
	}
	System.out.println("\n");
    }
    
    public String buscarContato   (int aux) {
	
	//Percorre o vetor de contatos
	//Se for igual ao parametro uma mensagem acionada
	for (int i=0; i < indiceId; i++) {
	
		if (aux == VetorId[i].getId()) {
	            return "Contato Encontrado";	
		}
        }
    return "Contato Nao Encontrado";
    }
    
    public String modificarContato(int antigoContato , int novoContato){

	//Percorre o vetor de contatos
	//Se for igual ao parametro uma mensagem acionada
	//O Antigo Contato sera substituido Pelo Novo
	for (int i=0; i < indiceId; i++) {
	
		if (antigoContato == VetorId[i].getId()) {
		    VetorId[i].setId(novoContato);
		    return  "Contato Modificado";	
		}
        }
    
    return "Contato Nao Encontrado";
    }
    
    public String excluirContato  (int aux) {
	
	
    int indiceContatoExcluido=0,i=0;
	
     //Percorre o vetor de contatos
	//Se for igual ao parametro uma mensagem acionada
	//O  indice do do contato a sera excluido sera armazenado
	for (i=0; i < indiceId; i++) {
	
		if (aux == VetorId[i].getId()) {
			indiceContatoExcluido =i;
			return "Contato Excluido";	
		}
	}
		
	//Percorre o vetor de contatos apartir do contato que sera excluido
	//O Contato a ser excluido ser substituido pelo proximo e assim por diante
	i=indiceContatoExcluido;
	while (i < indiceId ) {
		   VetorId[i] = VetorId[i+1];
		   i++;
	}
    //O Indice ira diminuir devido a exclusao do Contato
    indiceId--;	

    return "Contato Nao Encontrado";	
    }
		
    }
    
   

    public static void main(String[] args) {
    
    Agenda obj = new Agenda();  
    Scanner input = new Scanner(System.in);
   
    int op =0;
    do {

        System.out.println("\nDigite Uma Opcao :");
        System.out.println( "1: Inserir Contato\n");
        System.out.println("2: Buscar Contato");
        System.out.println("3: Modificar Contato");
        System.out.println("4: Excluir Contato");
        op = input.nextInt();
        System.out.println("\n");

        switch(op)
        {
        case 1:
            System.out.println("Digite o Id do Contato a ser Inserido   : ");
            int id = input.nextInt();
            System.out.println("Obj.setContato(id)");
            System.out.println("\nLista de Contatos");
            obj.getContato(); 
            System.out.println("\n");
            break;
        case 2:
            System.out.println("Digite o Id do Contato a ser Buscado : ");
            id = input.nextInt();
            System.out.println(obj.buscarContato(id));
            System.out.println("\nLista de Contatos");
            obj.getContato(); 
            System.out.println("\n");
            break;
        case 3:
            System.out.println("Digite o Id do Contato a ser Modificado : ");
            id = input.nextInt(); 
            System.out.println("Digite o Id do novo Contato             : ");
            int nid = input.nextInt();
            System.out.println(obj.modificarContato(id,nid));
            System.out.println("\nLista de Contatos");
            obj.getContato(); 
            System.out.println("\n");
            break;
        case 4:
            System.out.println("Digite o Id do Contato a ser Excluido   : ");
            id = input.nextInt();
            System.out.println("Obj.excluirContato(id)");
            System.out.println("\nLista de Contatos");
            obj.getContato(); 
            System.out.println("\n");
            break;
        default:
            break;
        }     
    
    }while (op !=0); 
    
    }
}
