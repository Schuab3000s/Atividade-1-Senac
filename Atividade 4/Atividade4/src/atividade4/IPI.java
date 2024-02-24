/*IPI (Imposto sobre Produtos Industrializados): necessita do valor da alíquota e 
valor do produto, frete, seguro, outras despesas. A soma desses quatro últimos 
valores formará a base de cálculo. O cálculo então será “IPI = base de cálculo * alíquota”. 
Exemplo: valor R$ 90, frete R$ 10, seguro R$ 5, outras despesas R$ 5; alíquota = 5%; IPI = (90 + 10 + 5 + 5) * 5% = R$ 5,5.*/

package atividade4;

public class IPI implements Imposto {
    
    private double valorProduto, frete, seguro, outrasDespesas, aliquota;

    public IPI(double valorProduto, double frete, double seguro, double outrasDespesas, double aliquota) {
        this.valorProduto = valorProduto;
        this.frete = frete;
        this.seguro = seguro;
        this.outrasDespesas = outrasDespesas;
        this.aliquota = aliquota;
    }
    
    @Override
    public double calcularImposto() {
        
        return (valorProduto + frete + seguro + outrasDespesas)*aliquota/100;
    }
    
    @Override
    public String tipoImposto(){
        return "IPI";
    }
}
