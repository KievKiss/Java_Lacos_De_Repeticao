/*Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma Calculadora simples.
 *  O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o Código
 *   da operação matemática (número inteiro de 1 a 4). A seguir, mostre na tela o resultado
 *    da operação entre os 2 números. Caso a operação seja diferente do intervalo 1 a 4,
 *     mostre a mensagem Operação Inválida!*/

package ControleDeFluxoESwitch;
import java.util.Scanner;

public class CaseSwitch2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, total;
		int codigo;
		
		System.out.printf("Digite o primeiro numero: ");
		n1 = leia.nextFloat();
		
		System.out.printf("Digite o segundo numero: ");
		n2 = leia.nextFloat();
		
		System.out.println("\n Escolha a operação\n 1 - para somar \n 2 - para subtrair \n 3 - pa"
				+ "ra multiplicar \n 4 - para dividir: \n");
		codigo = leia.nextInt();
		
		switch(codigo) {
		case 1: 
			total = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + total);
			break;
			
		case 2: 
			total = n1 - n2;
			System.out.println(n1 + " + " + n2 + " = " + total);
			break;
			
		case 3: 
			total = n1 * n2;
			System.out.println(n1 + " X " + n2 + " = " + total);
			break;
			
		case 4: 
			total = n1 / n2;
			System.out.printf(n1 + " / " + n2 + " = %.1f" , total);
			break;
			
		default:
			System.out.println("Operação inválida!");
		}
		

	}

}
