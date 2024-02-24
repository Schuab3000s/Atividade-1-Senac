# Atividade 1

 ## Contexto

A empresa retoma o projeto Hotéis, para o qual a equipe já fez um estudo de viabilidade e alguns algoritmos para funções específicas. Desta vez, a intenção é desenvolver protótipos em Java dessa funcionalidade. Assim, o seu trabalho será o de resgatar alguns desses algoritmos e agora desenvolvê-los usando Java.

## Atividade

Baixe a lista de situações de problema em Conteúdo > Material complementar. Para cada situação, crie um novo projeto NetBeans (Java Ant) e implemente em main(), na classe principal, o código com a solução proposta. Teste sua aplicação com diversas informações de entrada, conferindo as saídas. Os projetos são do tipo console e não precisam usar classes adicionais.



# Atividade 2

 ## Contexto

A empresa de desenvolvimento retorna ao projeto de desenvolvimento de sistema para uma agência de viagens. Esse sistema precisa registrar pacotes de viagens e dados de uma venda. Cada pacote de viagens é formado pelo meio de transporte e pela hospedagem – cada meio de transporte tem tipo e valor e cada hospedagem tem tipo e valor. Os valores de pacote de viagem são formados pelos valores do transporte e da hospedagem somados a uma margem de lucro e taxas adicionais.

A venda inclui dados do cliente, forma de pagamento, data e pacote sendo vendido e precisa ser capaz de converter o valor do pacote em reais para dólar e vice-versa.

Sua tarefa será aplicar orientação a objetos para desenvolver um módulo em Java desse sistema.

## Atividade

No NetBeans, crie um projeto Java (tipo console) com os seguintes itens:

- Classe para transporte, com o tipo (aéreo, rodoviário, marítimo etc.) e valor
- Classe para hospedagem, com descrição e valor de diária
- Classe para pacote de viagem, com transporte, hospedagem, destino (texto), quantidade de dias. Essa classe ainda deve ser capaz de:
   - calcular o total de hospedagem a partir do número de dias e o valor da diária.
   - calcular valor de lucro a partir de uma margem informada (porcentagem) e valor informado. O resultado retornado deve ser o valor + margem aplicada ao valor.
   - calcular e retornar o total do pacote, somando o transporte, o total da hospedagem e os valores adicionais informados – margem de lucro (porcentagem) e taxas adicionais (valor monetário).
     
Observação: os valores nesta classe serão considerados em dólar.

- Classe para venda, que contenha nome do cliente, forma de pagamento e pacote de viagem. A classe deve ser capaz de
   - converter um valor em reais a partir de um valor informado em dólar e da cotação da moeda, também informada.
   - mostrar na tela o total do pacote de viagem em dólar e em reais.

Na classe principal, elabore código para interação com o usuário em que seja possível “cadastrar” uma venda e

- obtenha todos os valores necessários para criar um pacote de viagem e crie esse objeto.
- mostre na tela as informações do pacote criado, incluindo o valor total. O usuário ainda precisará informar margem de lucro (uma porcentagem).
- obtenha do usuário também as informações para a criação de uma venda.
- mostre na tela todas as informações da venda, incluindo valor total em dólar e valor em reais (o usuário terá que informar a cotação do dólar no dia).
- Recomenda-se o uso de construtores nas classes.



# Atividade 3

## Contexto

Considere algumas classes de um sistema orientado a objetos que está sendo implementado com funcionalidades relacionadas ao setor de RH e à folha de pagamento. Há dois tipos de funcionários na empresa para a qual esse sistema está sendo desenvolvido: funcionários assalariados, que recebem por mês, e funcionários horistas, que recebem por horas trabalhadas.

Para todos os funcionários, são necessárias informações como nome, CPF, endereço, telefone e setor em que trabalham. Para os assalariados, é necessária ainda a informação do salário mensal do trabalhador (o total a receber será “salário”). Para os horistas, é necessária a informação de horas trabalhadas e valor da hora (o total a receber será “horas * valor da hora”).

Todo funcionário precisa ser capaz de mostrar em tela seus dados; tanto assalariados quanto horistas precisam ser capazes de calcular e fornecer o valor de seu pagamento, de acordo com suas características. Também é necessário que ambos sejam capazes de aplicar aumento (informado em %) em seus rendimentos.

Considerando isso, monte classe abstrata (com método abstrato para cálculo de salário) para funcionário e derivadas para as demais, aplicando polimorfismo em Java para este cenário.

## Atividade

Crie um projeto Java NetBeans com as classes/interfaces e implemente um código principal que

- permita que o usuário informe dados para até dez funcionários, questionando o tipo (assalariado/horista) e lendo os dados necessários. Mantenha-os em uma única lista independentemente se são assalariados ou horistas.
- mostre na tela os dados e o pagamento de cada um dos funcionários.
- aplique um aumento geral (informado pelo usuário) para todos os funcionários e mostre novamente os pagamentos de cada um deles.
Use encapsulamento nas classes.
