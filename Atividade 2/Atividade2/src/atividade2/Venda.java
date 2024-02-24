package atividade2;

public class Venda {
    
    private String nome, forma_pagamento;
    int pacote_viagem;
    
    public Venda(String nome, String forma_pagamento) {
        this.nome = nome;
        this.forma_pagamento = forma_pagamento;
    }

    public void setPacote_viagem(int pacote_viagem) {
        this.pacote_viagem = pacote_viagem;
    }
     
    public double conversao(double reais, double dolar){
       return (reais / dolar);
    }       
}