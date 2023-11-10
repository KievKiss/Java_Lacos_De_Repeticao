/*Com base na tabela abaixo, escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6)
 *  e a quantidade comprada deste item (número inteiro). A seguir, mostre na tela o valor total da conta e o
 *   nome do produto que foi comprado.*/

package ControleDeFluxoESwitch;

import java.util.Scanner;

public class Ex05MenuLanche {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo, quantidade, total;
		
		System.out.println("\tLanchonete Família 69\n");
		System.out.println("1 - Cachorro Quente | R$10,00\n");
		System.out.println("2 - X-Salada        | R$15,00\n");
		System.out.println("3 - X-Bacon         | R$18,00\n");
		System.out.println("4 - Bauru           | R$12,00\n");
		System.out.println("5 - Refrigerante    | R$08,00\n");
		System.out.println("6 - Suco de laranja | R$13,00\n");
		
		System.out.println("\tEscolha o código de produto:");
		codigo = leia.nextInt();
			
		switch(codigo) {
		
		case 1:
			System.out.printf("Insira a quantidade: ");
			quantidade = leia.nextInt();
			total = quantidade*10;
			System.out.println(quantidade + "Cachorro(s) Quente(s)\n" + "Total: R$"+total);
			break;
			
		case 2:
			System.out.printf("Insira a quantidade: ");
			quantidade = leia.nextInt();
			total = quantidade*15;
			System.out.println(quantidade + "X-Salada(s)\n" + "Total: R$"+total);
			break;
			
		case 3:
			System.out.printf("Insira a quantidade: ");
			quantidade = leia.nextInt();
			total = quantidade*18;
			System.out.println(quantidade + "X-Bacon(s)\n" + "Total: R$"+total);
			break;
			
		case 4:
			System.out.printf("Insira a quantidade: ");
			quantidade = leia.nextInt();
			total = quantidade*12;
			System.out.println(quantidade + "Bauru(s)\n" + "Total: R$"+total);
			break;
			
		case 5:
			System.out.printf("Insira a quantidade: ");
			quantidade = leia.nextInt();
			total = quantidade*8;
			System.out.println(quantidade + "Refrigerante(s)\n" + "Total: R$"+total);
			break;
			
		case 6:
			System.out.printf("Insira a quantidade: ");
			quantidade = leia.nextInt();
			total = quantidade*13;
			System.out.println(quantidade + "Suco(s) de laranja\n" + "Total: R$"+total);
			break;
		default:
			System.out.println("Escolha um código valido!");
		}
		
			

	}

}
