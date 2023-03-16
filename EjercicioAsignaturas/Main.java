
public class Main {
    public static void main(String[] args) {
        Profesor p1 = new Profesor();
        Profesor p2 = new Profesor();

        Estudiante e1 = new Estudiante();
        Estudiante e2 = new Estudiante();

        Asignatura a1 = new Asignatura();
        AsignaturaEspecial a2 = new AsignaturaEspecial();

        ImparticionAsignatura i1 = new ImparticionAsignatura();
        ImparticionAsignatura i2 = new ImparticionAsignatura();

        i1.addEstudiante(e1);
        i1.addEstudiante(e2);
        i1.addProfesor(p1);
        i1.addProfesor(p2);
        i1.setAsignatura(a1);

        i2.addEstudiante(e2);
        i2.addProfesor(p2);
        i2.setAsignatura(a2);

    }
}