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

public class Aplicacao3 {

	public static void main(String[] args) {
		

		//Aplicação 3: -->o Crie um cliente que possua uma ContaCorrente.
		        
		        Endereco end4 = new Endereco("AV 676", "123", "Rio de Janeiro", "RJ", "12345-090", "Fundos");
		        ContaCorrente contac1 = new ContaCorrente("89989-00", 500.00);
		        Cliente cliente2 = new Cliente("Aline Daniele", "034.898.790-07", "(21) 2018-2415", true, end4, contac1);
		        
		        
		//Aplicação 3: -->Efetue três depósitos de 100 nessa ContaCorrente.
		        
		        contac1.depositar(100.00);
		        contac1.depositar(100.00);
		        contac1.depositar(100.00);
		        
		      
		//Aplicação 3: -->Efetue um saque de 50 reais nessa ContaCorrente.
		       
		        contac1.sacar(50.00);
		        
		     
		//Aplicação 3: -->Imprima o valor do saldo dessa ContaCorrente.
		        
		        Double value = contac1.Saldo();
		        contac1.printConta();
		        
		        
	}

}