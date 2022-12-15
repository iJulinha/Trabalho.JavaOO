package Classes;

public class ContaCorrente extends Conta {
	
    private Double limite;

    public ContaCorrente(
    		
    		String numero, 
    		Double limite)
    
    {
        this.setNumero(numero);
        this.limite = limite;
    }

    public void transferir(
    		
    		Conta contaDestino, 
    		Double valor)
    
    {
        if(valor > this.Saldo()){
            System.out.println("Saldo insuficiente para a tranferencia solictada");
            
        } else {
            super.sacar(valor);
            contaDestino.depositar(valor);
        }
    }

    public Double Saldo(){
        return this.getSaldo() + + this.limite;
    }

    
    
    public void sacar(Double saque){
    	
        Double Saque = this.Saldo();

        if(saque > Saque){
            System.out.println("Saldo insuficiente Para realizar o Saque solictado");

        } else {
            super.sacar(saque);
        }
    }

    
    
    public void printConta(){
        System.out.print(
        		
            "Conta: " + this.getNumero() +
            "\n" +
            "Limite disponivel: " + this.limite +
            "\n" +
            "Valor de saque disponivel: " + this.Saldo()+
            "\n" +
            "\n"
            );
    }
}