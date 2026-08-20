package br.com.fiapride.main;

import br.com.fiapride.model.Carro;
// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// INSTANCIAÇÃO
		// O comando 'new' aloca memória para um novo objeto.
		// Criando o primeiro passageiro (Objeto 1)

		// Passageiro passageiro1 = new Passageiro();
		// passageiro1.nome = "Ana Silva";
		// passageiro1.saldo = 50.0;

		// Criando o segundo passageiro (Objeto 2)
		// Passageiro passageiro2 = new Passageiro();
		// passageiro2.nome = "Carlos Souza";
		// passageiro2.saldo = 12.50;

		// Exibindo os dados no Console
		// System.out.println("--- Sistema FiapRide ---");
		// System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" +
		// passageiro1.saldo);
		// System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" +
		// passageiro2.saldo);

		// Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?

		// Dentro do main...// Fabriquei a primeira (Instância 1)
		Carro meuCarro = new Carro();
		meuCarro.marca = "Lamborghini";
		meuCarro.cor = "Verde";
		meuCarro.ano = 2015;

		// Fabriquei a segunda (Instância 2)

		Carro carroAleatorio = new Carro();
		carroAleatorio.marca = "BMW";
		carroAleatorio.cor = "Azul";
		carroAleatorio.ano = 2020;

		System.out.println("Meu carro é uma: " + meuCarro.marca);
		System.out.println("O carro estacionado na rua é uma: " + carroAleatorio.marca);
	}
}