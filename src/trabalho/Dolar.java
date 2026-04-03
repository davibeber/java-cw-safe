package trabalho;

public class Dolar extends Moeda{
	/* extends cria a relação entre Dolar e Moeda,
	 * os atributos de Moeda são ligados ao Dolar
	 */

    private static final double VALOR_DOLAR = 5.44; 

    public Dolar(double valor) {
    	super(valor);
    }

    // O @Override garante que estamos realmente reescrevendo o método abstrato da mãe.

    @Override
    public void info(){
        System.out.println("Moeda: Dólar - Valor: " + this.valor);
    }

    @Override
    public double converter(){
        return this.valor * VALOR_DOLAR;
    }
}