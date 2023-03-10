import java.util.List;

public class Pais{

    private String nombre;
    List <Pais> frontera; //new ArrayList<Pais>();

    Public Pais(){
        frontera = new ArrayList <Pais>();
    }

    Public Pais(String _nombre){
        frontera = new ArrayList <Pais>();
        this.nombre = _nombre;
    }

    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void addFrontera(Pais _pais){
        frontera.add(_pais);
    }

    public Iterator<Pais> getFrontera(){
        return frontera.iterador();
    }
    
    public static void main(String[] args) {
        Pais p1 = new Pais("España");
        Pais p2 = new Pais("Francia");
        Pais p1 = new Pais("Italia");

        p1.addFrontera(p2);
        p2.addFrontera(p3);

        Iterator itPais = p2.getFrontera();

        while(itPais.hasNext()){
            Pais p = (Pais) itPais.next();
            System.out.println(p.getNombre());
        }
        
    }
}