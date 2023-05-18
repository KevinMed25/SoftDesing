
public class VisorPresion implements Observador {
    EstacionMonitoreo estacion;

    public void actualizar() {
        System.out.println(estacion.getPresion());
    }
}
