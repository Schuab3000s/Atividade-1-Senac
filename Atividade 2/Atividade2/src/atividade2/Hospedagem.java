package atividade2;

public class Hospedagem {
    
    private int diaria, dias;
    private String destino;
   

    public Hospedagem(int diaria, String destino) {
        this.diaria = diaria;
        this.destino = destino;
    }

    public int getDiaria() {
        return diaria;
    }

    public String getDestino() {
        return destino;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}