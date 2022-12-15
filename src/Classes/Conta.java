package Classes;

import java.util.ArrayList;

public abstract class Conta {
    private String numero;
    private Cliente cliente;
    
    private ArrayList<Debito> TDebito = new ArrayList<Debito>();
    private ArrayList<Credito> TCredito = new ArrayList<Credito>();
    
    
    public String getNumero() {
        return this.numero;
        
    }
    

    public void depositar(Double v){
    	
        Credito deposito = new Credito(v);
        this.TCredito.add(deposito);
        
    }

    public void sacar(Double v){
    	
        Debito saque = new Debito(v);
        this.TDebito.add(saque);
        
    }
    
    public Double getSaldo(){
        return this.getTotalCredito() - this.getTotalDebito();
        
    }

    public void setNumero(String n) {
        this.numero = n;
    }

    public void setCliente(Cliente c) {
        this.cliente = c;
    }

    public Double getTotalCredito(){
    	
        Double value = 0.0;
        for(Credito credito: this.TCredito){
            value += credito.getValor();
            
        }

        return value;
    }

    public Double getTotalDebito(){
        Double value = 0.0;
        for(Debito debito: this.TDebito){
            value += debito.getValor();
            
        }

        return value;
    }
}