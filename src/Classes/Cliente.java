package Classes;

import java.util.ArrayList;

public class Cliente extends Pessoa implements IUsuario {
	
	
    private Boolean vip;

    private ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
    private ArrayList<Conta> contas = new ArrayList<Conta>();

    public Cliente(
    		
    		String nome, 
    		String cpf, 
    		String telefone, 
    		Boolean Vip, 
    		Endereco endereco, 
    		Conta conta)
    {
    	
    	
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.vip = Vip;

        endereco.setCliente(this);
        this.addEndereco(endereco);

        conta.setCliente(this);
        this.addConta(conta);
    }

    public void listaDEnderecos(){
        System.out.println("Lista de endereços do cliente " + this.getNome() + ":");
        for (Endereco endereco: this.enderecos) {
            endereco.printEndereco();
        }
    }

    @Override
    public Boolean autenticar() {
        return true;
    }

    public void addEndereco(Endereco e){
        e.setCliente(this);
        this.enderecos.add(e);
    }

    public void addConta(Conta c){
        this.contas.add(c);
    }
}