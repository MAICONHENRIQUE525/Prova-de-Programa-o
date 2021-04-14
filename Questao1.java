package br.edu.provaDeProgramacao;

public class Questao1 {

	public static void main(String[] args) {
		
		int nota1 = 50, nota2 = 50, nota3 = 50, nota4 = 50;
		int soma = nota1 + nota2 + nota3 + nota4;
		float resultado = soma/4;
		
		if(resultado < 50) {
			System.out.println("Aluno reprovado");
		}else if(resultado >= 50 & resultado <= 69){
			System.out.println("Aluno em recuperação");
		}else {
			System.out.println("Aluno aprovado");
		}
	}

}
