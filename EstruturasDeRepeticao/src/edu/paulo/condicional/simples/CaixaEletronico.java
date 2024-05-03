package edu.paulo.condicional.simples;

public class CaixaEletronico {

	public static void main(String[] args) {
		double saldo = 250.36;
		double valorSolicitado = 6.52;
		
		if (valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
			System.out.println(saldo);
		}

	}

}
