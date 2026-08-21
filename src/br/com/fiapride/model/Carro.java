package br.com.fiapride.model;

public class Carro {// <-- Use o nome do SEU objeto

	// As características que você pensou
	public String marca;
	public String cor;
	public int ano;

	public void alterarCor(String novaCor) {

		if (novaCor != null && !novaCor.trim().isEmpty()) {
			cor = novaCor;
			System.out.println("Cor alterada para: " + cor);
		} else {
			System.out.println("Erro: a cor não pode ser vazia.");
		}
	}

	public void atualizarAno(int novoAno) {

            if (novoAno >= 1886 && novoAno <= 2026) {
                ano = novoAno;
                System.out.println("Ano atualizado para: " + ano);
            } else {
                System.out.println("Erro: ano inválido.");
            }
       }
}
