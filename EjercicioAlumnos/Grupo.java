
public class Grupo{
    
    List<Alumno> listAlumnos;
    private Profesor prof;
    private Asignatura asig;
    private Reservacion rev;

    public Grupo(){
        listAlumnos = new ArrayList<Alumno>();
    }

    public void addAlumno(Alumno _alumno){
        listReservaciones.add(_alumno);
    }

    public void setProfesor(Profesor p){
        this.prof = p;
    }
    
    public void setAsignatura(Asignatura a){
        this.asig = a;
    }

    public void setReservacion(Reservacion r){
        this.rev = r;
    }
}
    
}