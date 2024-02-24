package atividade3;

abstract class Funcionario {
    
    protected String nome, endereco, setor, cpf, telefone;
        
    public Funcionario(String nome, String endereco, String setor, String cpf, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.setor = setor;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public abstract void exibirDados();
    
    public abstract void calcularSalario();
    
    public abstract void exibirSalario();
    
    public abstract void aplicarAumento(double aumento);
}
