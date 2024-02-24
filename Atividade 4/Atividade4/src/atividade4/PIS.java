/*PIS (Programa de Integração Social): necessita do valor total de débito e do valor 
  total de crédito da empresa. O cálculo do imposto é “debito - credito * 1,65%”. 
  Por exemplo: débito R$ 30000,00; crédito R$ 16000,00; (30000 - 16000) * 1,65% = 14000 * 1,65% = R$ 235.*/

package atividade4;

public class PIS implements Imposto {

    private double debito, credito;

    public PIS(double debito, double credito) {
        this.debito = debito;
        this.credito = credito;
    }
    
    @Override
    public double calcularImposto() {
        
        return (debito-credito)*(1.65/100);
    }
    
    @Override
    public String tipoImposto(){
        return "PIS";
    }
}
