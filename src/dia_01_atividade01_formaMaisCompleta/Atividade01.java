package dia_01_atividade01_formaMaisCompleta;

import java.util.Scanner;

//exercicio assentos estadio

public class Atividade01 {

	public static void main(String[] args) {
		
		//criação do objeto Scanner
		Scanner input = new Scanner(System.in);
		
		//solicitacao e armazenamento da quantidade de assentos
		System.out.println("Quantos assentos da classe A foram vendidos?");
		int quantAssentosA = Integer.parseInt(input.nextLine());
		System.out.println("Quantos assentos da classe B foram vendidos?");
		int quantAssentosB = Integer.parseInt(input.nextLine());
		System.out.println("Quantos assentos da classe C foram vendidos?");
		int quantAssentosC = Integer.parseInt(input.nextLine());

		//calculo final com valores predefinidos do enum
		int rendaFinal = AssentoEnum.ClasseA.getValorAssento()*quantAssentosA
				+ AssentoEnum.ClasseB.getValorAssento()*quantAssentosB
				+AssentoEnum.ClasseC.getValorAssento()*quantAssentosC;
		
		System.out.println("A renda gerada pelos bilhetes foi de: R$"+ rendaFinal+",00");
		
	}
}
