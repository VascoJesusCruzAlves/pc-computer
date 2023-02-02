public class Procesador
{
    private double velocidad;
    private boolean graficosIntegrados;

    public Procesador()
    {
        velocidad = 0;
        graficosIntegrados = true;
    }
    
    public void setVelocidad(double velocidad) {
       this.velocidad = velocidad;
    }
    
    public void setGraficosIntegrados(boolean graficosIntegrados) {
        this.graficosIntegrados = graficosIntegrados;
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
