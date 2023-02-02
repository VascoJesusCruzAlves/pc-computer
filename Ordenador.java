public class Ordenador {

    private String marca;
    private long numeroDeSerie;
    private Procesador procesador;

    public Ordenador(String marca, long numeroDeSerie, Procesador procesador) {
        this.marca = marca;
        this.numeroDeSerie = numeroDeSerie;
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public long getNumeroDeSerie() {
        return numeroDeSerie;
    }
    
    public Procesador getProcesador() {
        return procesador;
    }
    
    public String setMarca(String marca) {
       this.marca = marca;
       return this.marca;
    }
    
    public long setNumeroDeSerie(long numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
        return this.numeroDeSerie;
    }
    
    public Procesador setProcesador(Procesador procesador) {
        this.procesador = procesador;
        return this.procesador;
    }
}

