package atividade3;

import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        String opcao, nome, endereco, setor, tipo;
        String cpf, telefone;
        int i=0, k=0;
        double salario, valorHora, hora, aumento;
        Funcionario[] funcionario = new Funcionario[10];
        
        if(i<10){
        do{
            System.out.println("Digite as informaçoes do funcionario:");
            System.out.println("Nome:");
            nome = scan.nextLine();
            System.out.println("Tefone:");
            telefone = scan.next();
            System.out.println("Endereço:");
            scan.nextLine(); 
            endereco = scan.nextLine();
            System.out.println("CPF:");
            cpf = scan.next();
            System.out.println("Setor:");
            scan.nextLine();
            setor = scan.nextLine();
            System.out.println("Assalariado ou Horista?");
            tipo = scan.next();
            tipo = tipo.toLowerCase();
            
            if(tipo.equalsIgnoreCase("assalariado")){
                System.out.println("Salário:");
                salario = scan.nextDouble();
                
                funcionario[i] = new Assalariado(nome, endereco, setor, cpf, telefone, salario);
                funcionario[i].calcularSalario();
                
                
            }else{
                System.out.println("Valor da hora:");
                valorHora = scan.nextDouble();
                System.out.println("Quantidade de hora trabalhada:");
                hora = scan.nextDouble();
                
                funcionario[i] = new Horista(nome, endereco, setor, cpf, telefone, valorHora, hora);
                funcionario[i].calcularSalario();
                
            }
            
            System.out.println("Dejesa aplicar um aumento?(s/n)");
            opcao = scan.next();
            if(opcao.equalsIgnoreCase("s")){
                System.out.println("Quanto de aumento?(informa em porcentagem");
                aumento = scan.nextDouble();
                funcionario[i].aplicarAumento(aumento);
            }
            
            i = i + 1;
            k = k + 1;
            System.out.println("Deseja adicionar um novo funcionário?(s/n)");
            opcao = scan.next();
            scan.nextLine();
            
        }while(opcao.equalsIgnoreCase("s"));
        }else{
            System.out.println("Máximo de funcionários atingido!");
        }

        for(int j=0; j<k; j++){
            funcionario[j].exibirDados();
            System.out.println("-----------------");
        }
        
        System.out.println("Dejesa aplicar um aumento para todos os funcionários?(s/n)");
            opcao = scan.next();
            if(opcao.equalsIgnoreCase("s")){
                System.out.println("Quanto de aumento?(informa em porcentagem");
                aumento = scan.nextDouble();
                
                for(int j=0; j<k; j++){
                
                funcionario[j].aplicarAumento(aumento);
                funcionario[j].exibirSalario();
                System.out.println("-----------------");
                }
                
            }
        
        
    }
    
}
