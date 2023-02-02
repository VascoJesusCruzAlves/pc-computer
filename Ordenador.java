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
    
    public void setMarca(String marca) {
       this.marca = marca;
    }
    
    public void setNumeroDeSerie(long numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }
    
    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }
    
        public void imprimirDetalles() {
        System.out.println("Esta es la marca del ordenaor: " + marca);
        System.out.println("Este es el numero de serie de este ordenador: " + numeroDeSerie);
        System.out.println("El procesador de este ordenador tiene una velocidad de " + procesador.getVelocidad() + "Ghz");
        System.out.println("El procesador de este ordenador tiene graficos integrados: " + procesador.getTieneGraficosIntegrados());
    }
}

