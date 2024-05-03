package edu.paulo.condicional.encadeada;

public class NotasEscolares {

	public static void main(String[] args) {
		double nota = 4;
		if(nota>=7) {
			System.out.println("Aprovado");
		}else if(nota >= 5.0 && nota < 7.0) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}

	}

}
