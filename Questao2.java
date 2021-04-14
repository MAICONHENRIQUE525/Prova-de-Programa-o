package br.edu.provaDeProgramacao;

public class Questao2 {

	public static void main(String[] args) {
		
		int a = 10, b = 10, c = 30;
		int anoAtual = 2021, anoDeViagem = 1950;
		int soma = a + b + c;

		if(anoAtual % anoDeViagem > soma) {
			System.out.println("Não");
		
		}else {
			System.out.println("sim");
			
		}if(anoDeViagem % anoAtual > soma) {
			System.out.println("Não");

		}else {
			System.out.println("Sim");

		}
	}

}
