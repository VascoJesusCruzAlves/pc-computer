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
}
