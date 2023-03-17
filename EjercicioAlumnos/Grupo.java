public class Grupo{
    
    List<Alumno> listAlumnos;
    private Profesor prof;
    private Asignatura asig;

    public Grupo(Profesor _prof, Asignatura _asig){
        listAlumnos = new ArrayList<Alumno>();
        this.prof = _prof;
        this.asig = _asig;
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
}
    
}