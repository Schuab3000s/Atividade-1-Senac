package problema5;

import java.util.Scanner;

public class Problema5 {
   
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        String opcao;
        String ocupacao[][] = new String[4][3];
        int i=0, j=0;
                
        while(i<4){
            while(j<3){
                
                ocupacao[i][j] = "desocupado";
                j = j + 1;
            }
            j = 0;
            i = i + 1;
        }
        
        System.out.println("Nesse hotel possui 4 andares e 3 quartos por andar. Deseja informar alguma ocupação? (s/n)");
        opcao = entrada.next();
                
        do{
            System.out.println("qual andar você deseja ocupar? (1-4)");   
            i = entrada.nextInt();
            i = i - 1;
            System.out.println("qual quarto você deseja ocupar? (1-3)");  
            j = entrada.nextInt();
            j = j -1;
            
            ocupacao[i][j] = "ocupado";
            
            System.out.println("Deseja informar outra ocupação?(s/n)");
            opcao = entrada.next();
             
        }while(opcao.equalsIgnoreCase("s"));        
            
        i=0;
        j=0;
        
        while(i<4){
            
            System.out.println((i+1)+"° andar:");
            
            while(j<3){
                
                System.out.println("- quarto "+(j+1)+": "+ ocupacao[i][j]);
              
                j = j + 1;
            }
            j = 0;
            i = i + 1;
        }   
               
    }
    
}
