package trabalho;

import java.util.ArrayList; 
import java.util.List;      

public class Cofrinho{
	
    private List<Moeda> listaMoedas = new ArrayList<>();
    /* Arraylist: memoria de longo prazo, sem isso
     * valores adicionados não seriam somados, convertidos para real
     * ou listados em sequencia, apenas o último valor escrito.
     */

	public void adicionar(Moeda m){ // m é o nome da variavel, m de moeda
	    this.listaMoedas.add(m); 
	    System.out.println("Moeda adicionada ao cofre!");
	}
	
	
	public void remover(Moeda m){
	    if (listaMoedas.remove(m)){
	        System.out.println("Moeda removida com sucesso!");
	    } 
	    else{
	        System.out.println("Erro: Moeda não encontrada no cofre.");
	    }
	} 
	

	public void listagemMoedas(){
	    System.out.println("\n--- LISTA DE MOEDAS NO COFRE ---");
	    
	    if (listaMoedas.isEmpty()){
	        System.out.println("O cofre está vazio.");
	        return;
	    }
	    
	    for (Moeda moeda : listaMoedas){
	        moeda.info(); 
	    }
	    
	    System.out.println("---------------------------------");
	}
	
	public double totalConvertido(){
	    double total = 0;
	    
	    if (listaMoedas.isEmpty()){
	        return 0;
	    }

	    for (Moeda moeda : listaMoedas){
	    	total = total + moeda.converter(); 
	    }
	    
	    return total;
	}
}
