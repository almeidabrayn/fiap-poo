package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// INSTANCIAÇÃO
		// O comando 'new' aloca memória para um novo objeto.

		// Criando o primeiro passageiro (Objeto 1)
		// Passageiro passageiro1 = new Passageiro("Ana Silva", "222");
		// System.out.println("Regarga passageiro 1");
		// passageiro1.adicionarSaldo(50.0);

		// Criando o segundo passageiro (Objeto 2)
		// Passageiro passageiro2 = new Passageiro("Carlos Souza", "333");
		// System.out.println("Regarga passageiro 2");
		// passageiro2.adicionarSaldo(12.5);

		// System.out.println("--- Sistema FiapRide ---");
		// System.out.println(
		// "Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " |
		// CPF: " + passageiro1.cpf);
		// System.out.println(
		// "Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " |
		// CPF: " + passageiro2.cpf);

		// System.out.println("Pagando viagem do passageiro 1");
		// passageiro1.pagarViagem(20);
		// System.out.println("Pagando viagem do passageiro 2");
		// passageiro2.pagarViagem(20);

		// Dentro do main...// Fabriquei a primeira (Instância 1)
		// Carro meuCarro = new Carro();
		// meuCarro.marca = "Lamborghini";
		// meuCarro.cor = "Verde";
		// meuCarro.ano = 2015;

		// Fabriquei a segunda (Instância 2)

		// Carro carroAleatorio = new Carro();
		// carroAleatorio.marca = "BMW";
		// carroAleatorio.cor = "Azul";
		// carroAleatorio.ano = 2020;

		// System.out.println("Meu carro é uma: " + meuCarro.marca);
		// System.out.println("O carro estacionado na rua é uma: " +
		// carroAleatorio.marca);
		
		// Criando o primeiro carro
		Carro meuCarro = new Carro();

		meuCarro.marca = "Lamborghini";
		meuCarro.cor = "Verde";
		meuCarro.ano = 2015;

		System.out.println("--- FiapRide ---");
		System.out.println("Marca: " + meuCarro.marca);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Ano: " + meuCarro.ano);

		// Alterando a cor do carro
		System.out.println("\nAlterando a cor...");
		meuCarro.alterarCor("Preto");
		
		// Testando alteração inválida da cor
        System.out.println("\nTestando cor inválida...");
        meuCarro.alterarCor("Roxo");

		// Alterando a data do carro
		System.out.println("\nAlterando o ano...");
		meuCarro.atualizarAno(2020);
		
		// Testando alteração inválida do ano
        System.out.println("\nTestando ano inválido...");
        meuCarro.atualizarAno(1800);

		// Mostrando o estado final
		System.out.println("\n--- Estado final do carro ---");
		System.out.println("Marca: " + meuCarro.marca);
		System.out.println("Cor: " + meuCarro.cor);
		System.out.println("Ano: " + meuCarro.ano);
		
		// Criando o carro aleatório
		Carro carroAleatorio = new Carro();

		carroAleatorio.marca = "BMW";
		carroAleatorio.cor = "Azul";
		carroAleatorio.ano = 2020;

		System.out.println("\n--- Carro 2 ---");
		System.out.println("Marca: " + carroAleatorio.marca);
		System.out.println("Cor: " + carroAleatorio.cor);
		System.out.println("Ano: " + carroAleatorio.ano);

		// Alterando a cor do carro
		System.out.println("\nAlterando a cor...");
		carroAleatorio.alterarCor("Branco");

		// Testando alteração inválida da cor
        System.out.println("\nTestando cor inválida...");
        carroAleatorio.alterarCor("Preto");
        
		// Alterando a data do carro
		System.out.println("\nAlterando o ano...");
		carroAleatorio.atualizarAno(2024);
		
		// Testando alteração inválida do ano
        System.out.println("\nTestando ano inválido...");
        carroAleatorio.atualizarAno(1800);
		
		System.out.println("\nSegundo carro: " + carroAleatorio.marca);
		System.out.println("Cor: " + carroAleatorio.cor);
		System.out.println("Ano: " + carroAleatorio.ano);
	}
}