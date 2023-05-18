
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public abstract class Observado {

    List<Observador> listObservadores = new ArrayList<Observador>();

    public void addObservador(Observador obs) {
        this.listObservadores.add(obs);
    }

    public void notificarObs() {
        Iterator<Observador> it = this.listObservadores.iterator();
        while (it.hasNext()) {
            it.next().actualizar();
        }
    }
}