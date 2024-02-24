package atividade3;

public class Assalariado extends Funcionario {
    
    private double salario;

    public Assalariado(String nome, String endereco, String setor, String cpf, String telefone, double salario) {
        super(nome, endereco, setor, cpf, telefone);
        this.salario = salario;
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
        salario = salario;
    }
    @Override
    public void aplicarAumento(double aumento){
        salario = salario + ((salario*aumento)/100);
    }
    public void exibirSalario(){
        System.out.println("Nome: "+nome);
        System.out.println("Novo salário: "+salario);
    }
}
