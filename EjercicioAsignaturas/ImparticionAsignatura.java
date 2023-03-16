import java.util.ArrayList;
import java.util.List;

public class ImparticionAsignatura {
    List<Estudiante> listEstudiantes = new ArrayList<Estudiante>();
    List<Profesor> listProfesors = new ArrayList<Profesor>();
    Asignatura asignatura;

    public void addEstudiante(Estudiante est) {
        this.listEstudiantes.add(est);
    }

    public void addProfesor(Profesor prof) {
        this.listProfesors.add(prof);
    }

    public void setAsignatura(Asignatura as) {
        this.asignatura = as;
    }
}
