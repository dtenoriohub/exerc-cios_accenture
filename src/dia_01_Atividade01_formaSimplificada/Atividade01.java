package dia_01_Atividade01_formaSimplificada;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		int classeA = 50;
		int classeB = 30;
		int classeC = 20;
		int rendaFinal = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantos assentos da classe A foram vendidos?: ");
		rendaFinal += Integer.parseInt(input.nextLine()) * classeA;
		System.out.println("Quantos assentos da classe B foram vendidos?: ");
		rendaFinal += Integer.parseInt(input.nextLine()) * classeB;
		System.out.println("Quantos assentos da classe C foram vendidos?: ");
		rendaFinal += Integer.parseInt(input.nextLine()) * classeC;
		System.out.println("A renda final gerada pelos bilhetes foi de: R$"+rendaFinal+",00");
	}

}
