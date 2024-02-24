package atividade2;

import java.util.Scanner;

public class Atividade2 {
  
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String nome, forma_pagamento;
        double dolar, margem_lucro, taxa_add;
        int dias, opcao;
       
        Transporte trem = new Transporte("Trem",10);
        Transporte aviao = new Transporte("Avião",500);
        Transporte navio = new Transporte("Navio",150);
        Transporte carro = new Transporte("Carro",120);
        Transporte onibus = new Transporte("Ônibus",80);
        
        Hospedagem hosp1 = new Hospedagem(100,"Santa Lúcia (Caribe)");
        Hospedagem hosp2 = new Hospedagem(200,"Machu Picchu (Peru)");
        Hospedagem hosp3 = new Hospedagem(300,"Sydney (Austrália)");
        Hospedagem hosp4 = new Hospedagem(400,"Grand Canyon (Estados Unidos)");
        Hospedagem hosp5 = new Hospedagem(500,"Ilhas Maldivas (Maldivas)");
        
        PacoteViagem pacoteViagem1 = new PacoteViagem(1, trem, hosp5);
        PacoteViagem pacoteViagem2 = new PacoteViagem(2, aviao, hosp4);
        PacoteViagem pacoteViagem3 = new PacoteViagem(3, navio, hosp3);
        PacoteViagem pacoteViagem4 = new PacoteViagem(4, carro, hosp2);
        PacoteViagem pacoteViagem5 = new PacoteViagem(5, onibus, hosp1);
        
        System.out.println("Bom dia, poderia responder as próximas perguntas:");
        System.out.println("(Observação: o valor monetário é em Dólar, por favor!!)");
        
        System.out.println("Qual o nome do cliente?");
        nome = scan.nextLine();
        System.out.println("Qual pacote você deseja?\n");
        
        pacoteViagem1.mostrarPacote();
        pacoteViagem2.mostrarPacote();
        pacoteViagem3.mostrarPacote();
        pacoteViagem4.mostrarPacote();
        pacoteViagem5.mostrarPacote();
        
        System.out.print("Opcçao: ");
        opcao = scan.nextInt();
        
        System.out.println("\nQuanto está o dólar hoje?");
        dolar = scan.nextDouble();
           
        System.out.println("\nQuantos dias ficará hospedado?");
        dias = scan.nextInt();
        
        System.out.println("\nQual a forma de pagamento?");
        scan.nextLine();
        forma_pagamento = scan.nextLine();
        
        System.out.println("\nMargem de lucro?");
        margem_lucro = scan.nextDouble();
        
        System.out.println("\nTaxas adicioanis?");
        taxa_add = scan.nextDouble();
       
        Venda venda = new Venda(nome, forma_pagamento);
        
        switch (opcao){
            case 1:
                venda.setPacote_viagem(1);
                    
                System.out.println("\nPacote n° 1:");
                System.out.println("Nome do cliente: "+ nome);
                System.out.println("Meio de transporte: "+ trem.getTipo());
                System.out.println("A hospedagem será em "+ hosp5.getDestino());
                System.out.println("Taxas adicionais: "+ taxa_add);
                System.out.println("Margem de lucro de "+ margem_lucro +"%");
                System.out.println("Então o valor final do pacote ficará em R$"+ pacoteViagem1.calculoTotalPacote(taxa_add, margem_lucro, dias));
                System.out.println("Em dólar o total ficou em $"+ venda.conversao(pacoteViagem1.calculoTotalPacote(taxa_add, margem_lucro, dias), dolar));
                
            break;

            case 2:
                venda.setPacote_viagem(2);
                
                System.out.println("\nPacote n° 2:");
                System.out.println("Nome do cliente: "+ nome);
                System.out.println("Meio de transporte: "+ aviao.getTipo());
                System.out.println("A hospedagem será em "+ hosp4.getDestino());
                System.out.println("Taxas adicionais: "+ taxa_add);
                System.out.println("Margem de lucro de "+ margem_lucro +"%");
                System.out.println("Então o valor final do pacote ficará em R$"+ pacoteViagem2.calculoTotalPacote(taxa_add, margem_lucro, dias));
                System.out.println("Em dólar o total ficou em $"+ venda.conversao(pacoteViagem2.calculoTotalPacote(taxa_add, margem_lucro, dias), dolar));
                
            break;
            case 3:
                venda.setPacote_viagem(3);
                
                System.out.println("\nPacote n° 3:");
                System.out.println("Nome do cliente: "+ nome);
                System.out.println("Meio de transporte: "+ navio.getTipo());
                System.out.println("A hospedagem será em "+ hosp3.getDestino());
                System.out.println("Taxas adicionais: "+ taxa_add);
                System.out.println("Margem de lucro de "+ margem_lucro +"%");
                System.out.println("Então o valor final do pacote ficará em R$"+ pacoteViagem3.calculoTotalPacote(taxa_add, margem_lucro, dias));
                System.out.println("Em dólar o total ficou em $"+ venda.conversao(pacoteViagem3.calculoTotalPacote(taxa_add, margem_lucro, dias), dolar));
                
            break;
            case 4:
                venda.setPacote_viagem(4);
                
                System.out.println("\nPacote n° 4:");
                System.out.println("Nome do cliente: "+ nome);
                System.out.println("Meio de transporte: "+ carro.getTipo());
                System.out.println("A hospedagem será em "+ hosp2.getDestino());
                System.out.println("Taxas adicionais: "+ taxa_add);
                System.out.println("Margem de lucro de "+ margem_lucro +"%");
                System.out.println("Então o valor final do pacote ficará em R$"+ pacoteViagem4.calculoTotalPacote(taxa_add, margem_lucro, dias));
                System.out.println("Em dólar o total ficou em $"+ venda.conversao(pacoteViagem4.calculoTotalPacote(taxa_add, margem_lucro, dias), dolar));
                
            break;
            case 5:
                venda.setPacote_viagem(5);
                
                System.out.println("\nPacote n° 5:");
                System.out.println("Nome do cliente: "+ nome);
                System.out.println("Meio de transporte: "+ onibus.getTipo());
                System.out.println("A hospedagem será em "+ hosp1.getDestino());
                System.out.println("Taxas adicionais: "+ taxa_add);
                System.out.println("Margem de lucro de "+ margem_lucro +"%");
                System.out.println("Então o valor final do pacote ficará em R$"+ pacoteViagem5.calculoTotalPacote(taxa_add, margem_lucro, dias));
                System.out.println("Em dólar o total ficou em $"+ venda.conversao(pacoteViagem5.calculoTotalPacote(taxa_add, margem_lucro, dias), dolar));
                
            break;
            default:
                System.out.println("Opção inválida.");
            break;
        }      
    }
}