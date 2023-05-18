
public class VisorTemperatura implements Observador {

    EstacionMonitoreo estacion;

    public VisorTemperatura(EstacionMonitoreo estacion) {
        this.estacion = estacion;
    }

    @Override
    public void actualizar() {
        System.out.println("Temperatura actual = " + estacion.getTemperatura());
    }

}
