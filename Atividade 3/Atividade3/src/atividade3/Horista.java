package atividade3;

public class Horista extends Funcionario{
    
    private double valorHora, hora, salario;

    public Horista(String nome, String endereco, String setor, String cpf, String telefone, double valorHora, double hora) {
        super(nome, endereco, setor, cpf, telefone);
        this.valorHora = valorHora;
        this.hora = hora;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Setor: "+setor);
        System.out.println("CPF: "+cpf);
        System.out.println("Telefone: "+telefone);
        System.out.println("Salário: "+salario);
    }
    @Override
    public void calcularSalario(){
        salario = hora*valorHora;
        
    }
    @Override
    public void aplicarAumento(double aumento){
        salario = salario + ((salario*aumento)/100);
    }
    @Override
    public void exibirSalario(){
        System.out.println("Nome: "+nome);
        System.out.println("Novo salário: "+salario);
    }
}
