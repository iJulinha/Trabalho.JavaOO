package Main;

import Classes.Cargo;
import Classes.Cliente;
import Classes.Conta;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;
import Classes.Credito;
import Classes.Debito;
import Classes.Endereco;
import Classes.Funcionario;
import Classes.Pessoa;

public class Aplicacao1 {

	public static void main(String[] args) {

		
		//Aplicação 1:-> Crie dois funcionários do banco, um gerente e um atendente.
		
        Cargo cargo1 = new Cargo("Gerente");
        Cargo cargo2 = new Cargo("Atendente");
        Funcionario funcionario1 = new Funcionario("Julia de Souza", "166.641.687-82", "(24) 99293-4299", 10000.00, cargo1);
        Funcionario fucionario2 = new Funcionario("Luiza Helena", "134.876.554-90", "(32) 98817-3486", 5000.00, cargo2);


	}

}
