public class Procesador
{
    private double velocidad;
    private boolean graficosIntegrados;

    public Procesador()
    {
        velocidad = 0;
        graficosIntegrados = true;
    }
    
    public double setVelocidad(double velocidad) {
       this.velocidad = velocidad;
       return this.velocidad;
    }
    
    public boolean setGraficosIntegrados(boolean graficosIntegrados) {
        this.graficosIntegrados = graficosIntegrados;
        return this.graficosIntegrados;
    }
    
    public double getVelocidad() {
        return velocidad;
    }
    
    public boolean getTieneGraficosIntegrados() {
        return graficosIntegrados;
    }
    
    public void imprimirDetalles() {
        System.out.println("Esta es la velocidad del procesador: " + velocidad);
        System.out.println("Este ordenador tiene graficos integrados: " + graficosIntegrados);
    }
}
