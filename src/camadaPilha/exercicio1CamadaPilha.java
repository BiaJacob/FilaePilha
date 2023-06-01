package camadaPilha;

import java.util.Scanner;
import java.util.Stack;

public class exercicio1CamadaPilha {

	public static void main(String[] args) {
		
		 int opcao = -1;
		 
		Stack<String> pilhaLivros = new Stack<>();
		Scanner leia = new Scanner(System.in);

		while (opcao != 0) {
            System.out.println("****************************************");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Finalizar o programa");
            System.out.println("****************************************");
            System.out.print("Entre com o opção desejada: ");
            opcao = leia.nextInt();
            leia.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String nomeLivro = leia.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("Livro adicionado à pilha.");
                    break;
                case 2:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("Livros na pilha:");
                        for (String livro : pilhaLivros) {
                            System.out.println(livro);
                        }
                    }
                    break;
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println("Livro retirado: " + livroRetirado);
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println(); 
        }

        leia.close();
	}

}
