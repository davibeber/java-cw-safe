package trabalho;

public class Real extends Moeda{
	/* extends cria a relação entre Real e Moeda,
	 * os atributos de Moeda são ligados ao Real
	 */
	
	public Real(double valor) {
    	super(valor);
    }

    // O @Override garante que estamos realmente reescrevendo o método abstrato da mãe.

    @Override
    public void info(){
        System.out.println("Moeda: Real - Valor: " + this.valor);
    }

    @Override
    public double converter(){
        return this.valor;
    }
}