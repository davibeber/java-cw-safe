package trabalho;

import java.util.Scanner;
/*Principio fundamental das linguagens,
 * importar pacotes para comandos específicos para 
 * melhor organização e desempenho
 */

public class Principal {

    public static void main (String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        Cofrinho meuCofrinho = new Cofrinho();
        
        int opcao = 0;
        
        while (opcao != 5){   
            System.out.println("=== COFRE DIGITAL ===");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular Total Convertido para Real");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            
            if (scanner.hasNextInt()){
            /* hassNextInt() é uma pergunta "tem o proximmo inteiro?" 
             * verifica se o dado é um número inteiro
             */
                opcao = scanner.nextInt();
            //nextInt() recebe e processa o número inteiro verificado 
            } 
            
            else { //Caso não seja um numero inteiro, haverá uma mensagem de erro
                System.out.println("Valor inválido. Digite um número.");
                scanner.nextLine(); 
               /* Consumir = ler e remover do buffer (memória temporária);
                * consome tudo na linha e apagando, ajuda a 
                * remover dados não desejados       
                */
                continue; // Volta para o início do loop
            }
            scanner.nextLine(); 
        
            switch (opcao) {

            case 1: //Adicionar moeda
                System.out.println("Qual moeda deseja adicionar?");
                System.out.println("1 - Dolar");
                System.out.println("2 - Euro");
                System.out.println("3 - Real");
                System.out.print("Escolha: ");
                
                int tipoMoeda = 0;
                double valorMoeda = 0.0;
                
                //Validação do tipo de moeda (INT)
                if (scanner.hasNextInt()) {
                    tipoMoeda = scanner.nextInt();
                } else {
                    System.out.println("Valor inválido. O tipo de moeda deve conter um número.");
                    scanner.nextLine();
                    break; 
                }
                scanner.nextLine(); 
                
                //Validação do tipo de moeda (DOUBLE)
                System.out.print("Qual o valor? ");
                if (scanner.hasNextDouble()) {
                    valorMoeda = scanner.nextDouble();
                } else {
                    System.out.println("Valor inválido. O tipo de moeda deve conter um número");
                    scanner.nextLine();
                    break; 
                }
                scanner.nextLine(); 
                    
                    Moeda novaMoeda = null;
                    
                    switch (tipoMoeda){
                    case 1:
                        novaMoeda = new Dolar(valorMoeda);
                        break;
                    case 2:
                        novaMoeda = new Euro(valorMoeda);
                        break;
                    case 3:
                        novaMoeda = new Real(valorMoeda);
                        break;
                    default:
                        System.out.println("Opção inválida. Adição cancelada.");
                    }
                    
                    //Lógica de Adição
                    if (novaMoeda != null){
                        meuCofrinho.adicionar(novaMoeda);
                        System.out.println("Moeda adicionada com sucesso!");
                    } 
                    else {
                        System.out.println("Não foi possível adicionar a moeda ao cofrinho. Opção inválida.");
                    }
                    break;
                
                case 2: //Remover moeda
                    System.out.println("Qual moeda deseja remover?");
                    System.out.println("1 - Dolar");
                    System.out.println("2 - Euro");
                    System.out.println("3 - Real");
                    System.out.print("Escolha: ");
                    int tipoRemover = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Qual o valor EXATO da moeda a ser removida? ");
                    //Podem ter moedas do mesmo tipo com valores diferentes
                    double valorRemover = scanner.nextDouble();
                    scanner.nextLine();
                    //Uso do nextLine() para limpeza preventiva do buffer, evita problemas para as proximas leituras
      
                    Moeda moedaParaRemover = null;
                   
                    switch (tipoRemover){
                        case 1:
                            moedaParaRemover = new Dolar(valorRemover);
                            break;
                        case 2:
                            moedaParaRemover = new Euro(valorRemover);
                            break;
                        case 3:
                            moedaParaRemover = new Real(valorRemover);
                            break;
                        default:
                            System.out.println("Opção de moeda inválida.");
                            break;
                    }
            	   
                    if (moedaParaRemover != null){
                    	meuCofrinho.remover(moedaParaRemover);
                    }
                    break;
                	
                case 3: //Listagem de moedas
                	meuCofrinho.listagemMoedas(); 
                	break;
                	
                case 4: //Calcular o o total
                	double total = meuCofrinho.totalConvertido();
                	System.out.printf("Total no cofre, convertido para R$: R$ %.2f\n", total);
                    break;
                
                case 5: //Sair
                	System.out.println("Encerrando o sistema.");
                    break;
                
                default:
             	    System.out.println("Opção inválida, tente novamente.");
             	    break;
            }
        }
     }
}
