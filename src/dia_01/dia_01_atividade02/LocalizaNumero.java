package dia_01.dia_01_atividade02;

import java.util.Arrays;
import java.util.Scanner;

//Faca um programa para pesquisar o valor 8 no vetor dado:
//inteiro vetor[] = {1, 3, 5, 8, 9, 10}

public class LocalizaNumero {
	
	// Corrigir este algoritmo.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("no vetor: "+Arrays.toString(vetor)+" qual o item deseja ter a posicao?");
		int numero = Integer.parseInt(input.nextLine());
		boolean achou = false;
		int posicao = 0;
		
		for (int i=0; i<10; i++) {
			if (vetor[i] == numero){
				achou = true;
				posicao = i;
				break;
		    }
		}
		if (achou) {
	        System.out.println("Achei");
	        System.out.printf("Na Posicao %d esta localizado o numero %d.", posicao, vetor[posicao]);			
		}
		else
			System.out.println("o item nao existe!");
		
	}
}
