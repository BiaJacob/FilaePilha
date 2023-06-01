package camadaFila;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio1CamadaFila {

	public static void main(String[] args) {
		
		int opcao;
		String clienteChamado;
		
		Queue<String> filaClientes = new LinkedList<>();
		 Scanner leia = new Scanner(System.in);
		 
		 do {
	            System.out.println("\n******************************************");
	            System.out.println("1: Adicionar um novo Cliente na fila");
	            System.out.println("2: Listar todos os Clientes na fila");
	            System.out.println("3: Chamar (retirar) uma pessoa da fila");
	            System.out.println("0: Sair do programa");
	            System.out.println("\n******************************************");
	            System.out.print("Entre com a opção desejada: ");
	            opcao = leia.nextInt();
	            leia.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do Cliente: ");
	                    String nomeCliente = leia.nextLine();
	                    filaClientes.add(nomeCliente);
	                    System.out.println(nomeCliente + " adicionado à fila.");
	                    break;
	                case 2:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("A fila está vazia.");
	                    } else {
	                        System.out.println("Clientes na fila:");
	                        for (String cliente : filaClientes) {
	                            System.out.println(cliente);
	                        }
	                    }
	                    break;
	                case 3:
	                    if (filaClientes.isEmpty()) {
	                        System.out.println("A fila está vazia. Não há clientes para chamar.");
	                    } else {
	                         clienteChamado = filaClientes.poll();
	                        System.out.println("Cliente chamado: " + clienteChamado);
	                    }
	                    break;
	                case 0:
	                    System.out.println("Programa finalizado.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	                    break;
	            }
	        } while (opcao != 0);
		

	}

}
