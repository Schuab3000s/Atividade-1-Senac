package atividade4;

import java.util.ArrayList;

public class Pagamento {
   
    private String nome;
    private ArrayList<Imposto> lista;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pagamento() {
        this.lista = new ArrayList();
    }
    
    public void add(Imposto tipo) {
        this.lista.add(tipo);
    }
    
    public void listarTodos() {
            
        System.out.println("Nome da empresa: "+nome);
        
        for (int i = 0; i < lista.size(); i++) { 
            System.out.println("\nImposto "+(i+1));
            System.out.println("Tipo de imposto: "+lista.get(i).tipoImposto());
            System.out.println("Total a pagar: R$"+lista.get(i).calcularImposto());
                
        }
    }
}
