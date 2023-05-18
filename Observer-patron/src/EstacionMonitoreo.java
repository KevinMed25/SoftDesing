
public class EstacionMonitoreo extends Observado {
    double temperatura;
    double presion;
    double humedad;

    public void actualizarMediciones(double temp, double presion, double humedad) {
        this.temperatura = temp;
        this.presion = presion;
        this.humedad = humedad;
        this.notificarObs();
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getPresion() {
        return presion;
    }

    public double getHumedad() {
        return humedad;
    }

}
