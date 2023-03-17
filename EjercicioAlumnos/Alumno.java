public class Alumno{

    List<Grupo> listGrupos;// = new ArrayList<Grupo>();

    public Alumno(){
        listGrupos = new ArrayList<Grupo>();
    }

    public void addGrupo(Alumno _grupo){
        listGrupos.add(_grupo);
    }

}