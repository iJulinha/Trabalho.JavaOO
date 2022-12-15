package Classes;

public class Endereco {
	
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    
    
    public Cliente cliente;

    public Endereco(
    		
    		String logradouro, 
    		String numero, 
    		String cidade, 
    		String uf, 
    		String cep)
    
    {
        this.createEndereco(logradouro, numero, cidade, uf, cep);
    }

    public Endereco(
    		
    		String logradouro, 
    		String numero, 
    		String cidade, 
    		String uf, 
    		String cep, 
    		String complemento)
    
    {
        this.createEndereco(logradouro, numero, cidade, uf, cep);
        this.complemento = complemento;
    }

    private void createEndereco(
    		String logradouro, 
    		String numero, 
    		String cidade, 
    		String uf, 
    		String cep)
    
    {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
    }

    public void printEndereco(){
        
        System.out.print(
                "Logradouro: " + this.logradouro +
                "\n"+
                "Numero: " + this.numero +
                "\n"+
                "Complemento: "+ this.complemento+
                "\n"+
                "Cidade: " + this.cidade +
                "\n"+
                "UF: " + this.uf +
                "\n" +
                "CEP: " + this.cep +
                "\n" +
                "\n"
        );
        
    }

    public void setCliente(Cliente c){
        this.cliente = c;
    }
}