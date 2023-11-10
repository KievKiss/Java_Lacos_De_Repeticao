/*Exercicio 1: Faça um algoritmo em Java que leia 3 valores inteiros A, B
e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.*/

package ControleDeFluxoESwitch;

import java.util.Scanner;

public class EX01MaiorMenorQue {

	public static void main(String[] args) {
		
		
		int a = 0,b = 0,c,total;
		
		
		Scanner leia = new Scanner(System.in);
		
			
		System.out.println("Digite um valor para A:");
		a = leia.nextInt();
		System.out.println("Digite um valor para b:");
		b = leia.nextInt();
		System.out.println("Digite um valor para c:");
		c = leia.nextInt();
		
		total = a + b;
		
		if(a + b > c){
			System.out.println( a + " + " + b +  " = " +  total + " > " +  c + " \nA soma de A + B é maior que C");
						
		}else if(a + b < c){
			System.out.println(a + " + " + b +  " = " +  total + " < " +  c + " \nA soma de A + B é menor que C");
			
		}else {
			System.out.println(a + " + " + b +  " = " +  total + " = " +  c + " \nA soma de A + B é igual a C");
		}
				
		
		

	}

}
