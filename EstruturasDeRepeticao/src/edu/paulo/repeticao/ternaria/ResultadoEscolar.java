package edu.paulo.repeticao.ternaria;

public class ResultadoEscolar {

	public static void main(String[] args) {
		int notaFinal = 4;
		String resultado = notaFinal >=7 ? "Aprovado": notaFinal >= 5 && notaFinal < 7 ? "Recuperação": "Reprovado";
		System.out.println(resultado);
	}

}
