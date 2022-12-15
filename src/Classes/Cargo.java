package Classes;

import java.util.ArrayList;

public class Cargo {
	
    private String nome;

    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    public Cargo(String n){
        this.nome = n;
    }

    public String getNome(){
        return this.nome;
    }

    public void addFuncionario(Funcionario f){
        this.funcionarios.add(f);
    }
}