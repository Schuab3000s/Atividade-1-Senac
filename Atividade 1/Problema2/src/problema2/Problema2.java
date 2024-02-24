package problema2;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        
    String nome_1, nome_2;
    int idade_1, idade_2;
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o nome do Hóspede 1:");
    nome_1 = entrada.nextLine();
    System.out.println("Digite a idade do(a) "+ nome_1+":");
    idade_1 = entrada.nextInt();
    
    if (idade_1>=60){
        nome_1 = nome_1 + " com desconto de 40%";
    }
    
    entrada.nextLine();
     
    System.out.println("Digite o nome do Hóspede 2:");
    nome_2 = entrada.nextLine();
    System.out.println("Digite a idade do(a) "+ nome_2+":");
    idade_2 = entrada.nextInt();
    
    if (idade_2>=60){
        nome_2 = nome_2 + " com desconto de 40%";
    }
      
    if (idade_1>idade_2){
        
        System.out.println("Quarto A: " + nome_1 + ".");
        System.out.println("Quarto B: " + nome_2 + ".");
        
    }else{
        
        System.out.println("Quarto A: " + nome_2 + ".");
        System.out.println("Quarto B: " + nome_1 + ".");
        
    }
    
    
    } 
}
