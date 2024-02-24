package atividade2;

public class PacoteViagem {
    
    private String destino, meio_trasnporte;
    private int dias, pacote;
    private double total_pacote=0, valor_hospedagem=0, taxa_add, margem_lucro, lucro;
    private Transporte transporte;
    private Hospedagem hospedagem;
   
    public PacoteViagem(int pacote, Transporte transporte, Hospedagem hospedagem){
        this.pacote= pacote;
        this.transporte = transporte;
        this.hospedagem = hospedagem;
    }

    public int getPacote() {
        return pacote;
    }
    
    public double calcularLucro(double valor, double margem_lucro){
        return ((margem_lucro * valor) / 100);
    }
    
    public double calculoTotalPacote(double taxa_add, double margem_lucro, int dias){
        
        total_pacote += transporte.getValor();
        total_pacote += (hospedagem.getDiaria() * dias);
        total_pacote += taxa_add;
        total_pacote += calcularLucro(total_pacote, margem_lucro);
        return total_pacote;
    }
    public void mostrarPacote(){
        System.out.println("Aqui está o pacote "+ getPacote() +":");
        System.out.println("Transporte: "+transporte.getTipo());
        System.out.println("Valor do transporte: "+transporte.getValor()+" reais");
        System.out.println("Destino da viagem: "+hospedagem.getDestino());
        System.out.println("Valor da diária: "+hospedagem.getDiaria()+" reais\n");
    }
    
    public double valorHospedagem(int dias){
        valor_hospedagem = hospedagem.getDiaria() * dias;
        return valor_hospedagem;
    }  
}