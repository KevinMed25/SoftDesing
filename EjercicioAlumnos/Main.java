

class Main{
    public static void main(String[] args) {
        
        Alumno a1 = new Alumno();
        Grupo g1 = new Grupo();
        Grupo g2 = new Grupo();
        Profesor p1 = new Profesor();
        Profesor p2 = new Profesor();
        Asignatura a1 = new Asignatura();
        Asignatura a2 = new Asignatura();
        Reservacion r1 = new Reservacion();
        Reservacion r2 = new Reservacion();

        a1.addGrupo(g2);
        g2.setProfesor(p2);
        g2.setAsignatura(a1);
        g2.setReservacion(r1);
        
        a1.addGrupo(g1);
        g1.setProfesor(p1);
        g1.setAsignatura(a2);
        g1.setReservacion(r2);

        Sala s1 = new Sala();
        s1.addReservacion(r1);
        s1.addReservacion(r2);
    }
}