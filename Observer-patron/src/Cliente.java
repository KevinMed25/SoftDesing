
public class Cliente {

    public Cliente() {
        EstacionMonitoreo estacion = new EstacionMonitoreo();
        VisorTemperatura visorTemp = new VisorTemperatura(estacion);
        VisorPresion visorPresion = new VisorPresion();
        estacion.addObservador(visorTemp);
        estacion.addObservador(virsorPresion);
        estacion.actualizarMediciones(25.4, 5.8, 85);
    }

    public static void main(String[] args) {
        new Cliente();
    }
}
