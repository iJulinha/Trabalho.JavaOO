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

public class Aplicacao4 {

	public static void main(String[] args) { 
		
        
		//Aplicação 4: -->Crie um cliente que possua uma ContaCorrente
        
        Endereco end5 = new Endereco("Rua naruto", "808", "Belo Horizonte", "MG", "28383-029", "S/N");
        ContaCorrente contac2 = new ContaCorrente("988768-75", 1000.00);
        Cliente cliente3 = new Cliente("Victor Almeida", "627.661.140-92", "(11) 98881-8745", true, end5, contac2);
        
        
        //Aplicação 4: -->Efetue um depósito de 1000 nessa ContaCorrente
        
        
        contac2.depositar(1000.00);
        
        
        //Aplicação 4: -->Crie um cliente que possua uma ContaPoupanca
        
        
        Endereco end6 = new Endereco("Rua São Pedro", "2253", "São Gonçalo do Amarante", "RN", "65728-622", "Galeria 4");
        ContaPoupanca contap2 = new ContaPoupanca("12345-67");
        Cliente cliente4 = new Cliente("Giovanna Débora Moraes", "182.704.335-00", "(92) 3266-2746", true, end6, contap2);
        
        
        
        //Aplicação 4: -->Efetue um depósito de 1000 reais nessa conta Poupanca
        

        contap2.depositar(1000.00);
        
        

        //Aplicação 4: -->Efetue uma transferência de 500 reais da ContaCorrente para ContaPoupanca
        
        
        contac2.transferir(contap2, 500.00);

        contac2.printConta();
        System.out.println("\n");
        contap2.printConta();
        System.out.println("\n");
    }

}
