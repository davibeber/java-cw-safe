package trabalho;

public class Euro extends Moeda{
	/* extends cria a relação entre Euro e Moeda,
	 * os atributos de Moeda são ligados ao Euro
	 */

    private static final double VALOR_EURO = 6.19; 

    public Euro(double valor){
        super(valor);
    }

    // O @Override garante que estamos realmente reescrevendo o método abstrato da mãe.
    
    @Override
    public void info(){
        System.out.println("Moeda: Euro - Valor: " + this.valor);
    }
    
    @Override
    public double converter(){
        return this.valor * VALOR_EURO;
    }
}