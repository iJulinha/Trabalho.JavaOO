package Classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Funcionario extends Pessoa implements IUsuario {
	
	
    private Double salario;
    private ArrayList<Cargo> cargos = new ArrayList<Cargo>();

    public Funcionario(
    		String nome, 
    		String cpf, 
    		String telefone, 
    		Double salario, 
    		Cargo cargo)
    {
    	
    	
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.salario = salario;

        cargo.addFuncionario(this);
        this.cargos.add(cargo);
    }

    @Override
    public Boolean autenticar() {
        return true;
        
    }

    public void addCargo(Cargo c){
        this.cargos.add(c);

    }

    
    public String toString(){
        String dadoPessoaL = this.getInformacoesPessoais();
        String cargos = "Cargo(s):";

        for(int i = 0; i < this.cargos.size(); i++){
            Cargo c = this.cargos.get(i);
            
            cargos = cargos + c.getNome();
        }

        return "Salario: " + this.salario;
    }
}
