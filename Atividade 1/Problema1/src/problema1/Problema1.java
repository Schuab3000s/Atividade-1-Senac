package problema1;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
       
        int alfa = 150, beta = 350, precisa_cadeira, cadeira;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quantas pessoas comparecerão ao evento?");
        cadeira = entrada.nextInt();
        
        if (cadeira > 0 && cadeira <= alfa){
            
            System.out.println("Pode se direcionar ao auditório Alfa.");
        
        }else if (cadeira <= 230){
           
            precisa_cadeira = cadeira - alfa;
            
            System.out.println("Pode ir ao auditório Alfa, porém precisará de "+ precisa_cadeira +" cadeiras.");      
        }else if (cadeira <= beta){
            
            System.out.println("Pode se direcionar ao auditório Beta.");
        }else{
            
            System.out.println("Número de pessoas incopativel com os auditórios.");
        }
      
    }
    
}
