
public class Alumno{

    List<Grupo> listGrupos;
    public Alumno(){
        listGrupos = new ArrayList<Grupo>();
    }

    public void addGrupo(Alumno _grupo){
        listGrupos.add(_grupo);
    }

}