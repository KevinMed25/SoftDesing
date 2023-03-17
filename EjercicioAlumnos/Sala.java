public class Sala{

    List<Reservacion> listReservaciones;
    
    public Sala(){
        listReservaciones = new ArrayList<Reservacion>();
    }

    public void addReservacion(Reservacion rev){
        listReservaciones.add(rev);
    }
}