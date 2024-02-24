package atividade4;

import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String nome, continuar="s";
        int opcao, k=0;
        double debito, credito, valorProduto, frete, seguro, outrasDespesas, aliquota;
        Pagamento lista = new Pagamento();
        
        System.out.println("Olá, qual o nome da empresa para o cadastro de impostos ?");
        nome = scan.nextLine();
        
        lista.setNome(nome);
        
        while(!continuar.equalsIgnoreCase("n")){
            System.out.println("Escolhe qual o imposto que deseja cadastrar:");
            System.out.println("1 - PIS (Programa de Integração Social)");
            System.out.println("2 - IPI (Imposto sobre Produtos Industrializados)");
            opcao = scan.nextInt();
            
            if(opcao==1){
                System.out.println("Digite o valor do debito:");
                debito = scan.nextDouble();
                System.out.println("Digite o valor do cretido:");
                credito = scan.nextDouble();
                
                PIS pis = new PIS(debito, credito);
                lista.add(pis);
                
            }else if(opcao==2){
                System.out.println("Digite o valor do produto:");
                valorProduto = scan.nextDouble();
                System.out.println("Digite o valor do frete:");
                frete = scan.nextDouble();
                System.out.println("Digite o valor do seguro:");
                seguro = scan.nextDouble();
                System.out.println("Digite o valor de outras despesas:");
                outrasDespesas = scan.nextDouble();
                System.out.println("Digite o valor da alíquota;");
                aliquota = scan.nextDouble();
                
                IPI ipi = new IPI(valorProduto, frete, seguro, outrasDespesas, aliquota);
                lista.add(ipi);
            }else{
                System.out.println("Número inválido");
            }
            
            System.out.println("Dejesa adicionar mais impostos?");
            continuar = scan.next();
        }
        
        lista.listarTodos();
  
    }
    
}
