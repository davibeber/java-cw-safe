package trabalho;

public abstract class Moeda{
    
    protected double valor; 

    public Moeda(double valor){ 
        this.valor = valor;
    }
    
    public abstract void info(); 
    
    public abstract double converter();
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Moeda other = (Moeda) obj;
        return Double.compare(valor, other.valor) == 0;
    }
}