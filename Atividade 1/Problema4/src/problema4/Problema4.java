package problema4;

import java.util.Scanner;

public class Problema4 {

    public static void main(String[] args) {
        
        int opcao, i=0, posicao;
        String nome_pesquisa;
        String[] nome = new String[15]; 
        Scanner entrada = new Scanner(System.in);
        do{   
            System.out.println("--------------MENU--------------");
            System.out.println("Escolha umas das opções abaixo:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Pesquisar");
            System.out.println("3 - Sair");
            opcao = entrada.nextInt(); 
            
            switch (opcao) {
                case 1:
                    if(i<15){
                        System.out.println("Você pode cadastrar até 15 hoóspedes");
                        System.out.println("(Já cadastrou "+ i +" hóspedes)");
                        System.out.println("Digite o nome do Hóspede:");
                        nome[i] = entrada.nextLine();
                        entrada.nextLine();
                        i = i + 1;
                    }else{
                        System.out.println("Máximo de cadastros atingidos");
                    }
                break;
                case 2:
                    System.out.println("Digite o nome do hóspede para encontrar:");
                    nome_pesquisa = entrada.nextLine();
                    entrada.nextLine();
                    posicao=0;
                    while((posicao<15) && !nome[posicao].equals(nome_pesquisa)){
                        posicao = posicao + 1 ;
                    }
                        
                    if(nome[posicao].equals(nome_pesquisa)){
                        System.out.println("O(A) hóspede "+ nome[posicao] +" foi encontrado no índice "+ posicao +".");
                    }else{
                        System.out.println("Hospede não econtrado");
                    }
                break;
                case 3:
                    System.out.println("Foi bom tê-lo conosco, volte sempre!");
                break;
                default:
                    System.out.println("Opção Inválida");
                break;
            }
            
        }while(opcao!=3);
        
    }
    
}
