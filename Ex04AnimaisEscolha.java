/*Escreva um algoritmo em Java, que leia 3 palavras (String), que definem as características
 *  de um tipo de animal possível segundo o diagrama abaixo, que deve ser lido da esquerda
 *   para a direita.*/


package ControleDeFluxoESwitch;

import java.util.Scanner;

public class Ex04AnimaisEscolha {

	public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			
			System.out.printf("Vertebrado ou invertebrado?: ");
			String tipo = leia.nextLine();
			
			//Vertebrado
			
			if(tipo.equalsIgnoreCase("vertebrado")) {
				System.out.printf("Ave ou mamífero?: ");
				String classe = leia.nextLine();
				
			// Ave
				
				if(classe.equalsIgnoreCase("ave")) {
					System.out.printf("Carnivoro ou onivoro?: ");
					String alimento = leia.nextLine();
					
					if(alimento.equalsIgnoreCase("Carnivoro")) {
						System.out.println("Águia!");
					}else {
						System.out.println("Pomba!");
					}
					
			//Mamifero
					
				}else {
					System.out.printf("Onívoro ou herbivoro?: ");
					String alimento = leia.nextLine();
					
					if(alimento.equalsIgnoreCase("onivoro")) {
						System.out.println("Homem!");
					}else {
						System.out.println("Vaca!");
					}
				}
			}else {
			//invertebrado
				System.out.printf("inseto ou anelideo?: ");
				String clase = leia.nextLine();
				
			//inseto
				if(clase.equalsIgnoreCase("inseto")) {
					
					System.out.printf("Hematofago ou Herbivoro?: ");
					String alimento = leia.next();
					
					if(alimento.equalsIgnoreCase("hematofago")) {
						System.out.println("Pulga!");
					}else {
						System.out.println("Lagarta!");
					}
			//Anelideo
					
				}else {
					System.out.printf("Hematofago ou Onívoro?: ");
					String alimento = leia.nextLine();
					
					if(alimento.equalsIgnoreCase("hematofago")) {
						System.out.println("Sanguessuga!");
					}else {
						System.out.println("Minhoca!");
					}
				}
				
			}

	}

}
