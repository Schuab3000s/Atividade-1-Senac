package problema3;

import java.util.Scanner;

public class Problema3 {

    public static void main(String[] args) {
        
        float diaria, valor_diaria, diaria_meia=0, diaria_gratuidade=0, diaria_total=0;
        int idade, contador_gratuito=0, contador_total=0, contador_meia=0;
        String continuar = "s", nome;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o valor da diária:");
        diaria = entrada.nextFloat();
        
        do{
            entrada.nextLine();
            
            System.out.println("Digite o nome do(a) hóspede:");
            nome = entrada.nextLine();
            System.out.println("Digite a idade do(a) hóspede:");
            idade = entrada.nextInt();
            
            entrada.nextLine();
            if (idade>0 && idade <= 4){
                contador_gratuito = contador_gratuito + 1;
                System.out.println("O(A) "+ nome+" possui gratuidade");
            }else if(idade<80){
                contador_total = contador_total + 1;
                System.out.println("O(A) "+ nome+" paga o valor total da diária");
		diaria_total = diaria*contador_total;
            }else{
                contador_meia = contador_meia + 1;
		System.out.println("O(A) "+ nome+" paga meia");
		diaria_meia = (diaria*contador_meia)/2;
            }
            
            System.out.println("Quer adicionar mais pessoas? (s/n)");
            continuar = entrada.nextLine();
            
        }while(continuar.equals("s")); 
     
        valor_diaria = diaria_gratuidade + diaria_total + diaria_meia;
        System.out.println("O valor total de hospedagem é R$"+ valor_diaria +"; contendo: "+  contador_gratuito+" gratuito(s), "+ contador_total+" valor(es) total(is), "+ contador_meia +" meia(s)"); 
        
    
    }
    
}
    


