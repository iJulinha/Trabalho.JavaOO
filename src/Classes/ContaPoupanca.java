package Classes;

public class ContaPoupanca extends Conta {
    private Double rentabilidadeMensal = 0.0;

    public Double Saldo() {
        return this.getSaldo();
    }

    public ContaPoupanca(String n){
        this.setNumero(n);
    }

    public void printConta(){
    	
        System.out.print(
            "Conta: " + this.getNumero() +
            "\n" +
            "Rentabilidade Mensal: " + this.rentabilidadeMensal +
            "\n" +
            "Valor de saque disponivel: " + this.Saldo() +
            "\n" +
            "\n"
            );
    }
}