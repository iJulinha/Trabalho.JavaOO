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


public class Aplicacao2 {

	public static void main(String[] args) {
		
		
		// Aplicação 2: -->Crie um cliente e adicione 3 endereços a ele.
				
		        
		        Endereco end1 = new Endereco("Rua Otorino Bilhere", "107", "Tres Rios", "RJ","25808-030","CASA 1");
		        Endereco end2 = new Endereco("Av Roberto C", "88", "Juiz de Fora", "MG", "12344-056","Bloco K");
		        Endereco end3 = new Endereco("Estrada 45", "76", "Sao Paulo", "SP", "1165-090", "Apt 340");
		        ContaPoupanca contap1 = new ContaPoupanca("0000-0");
		        Cliente cliente1 = new Cliente("Stanley Kappler", "047.354.420-22", "(24) 99193-1988", true, end3, contap1);
		        
		        cliente1.addEndereco(end2);
		        cliente1.addEndereco(end1);
		       
		       
		//Aplicação 2: -->Imprima os endereços desse cliente.
		        
		        cliente1.listaDEnderecos() ;
		        System.out.println("\n");
		        System.out.println("\n");

	}

}
