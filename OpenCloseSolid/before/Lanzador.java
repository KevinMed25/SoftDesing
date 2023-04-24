package OpenCloseSolid.before;

public class Lanzador {

    public void draw(Vehicle vehicle) {
        switch (vehicle.getType()) {
            case CAR:
                drawCar(vehicle);
                break;
            case MOTORBIKE:
                drawMotorBike(vehicle);
        }
    }

    private void drawCar(Vehicle vehicle) {
        System.out.println(vehicle);
    }

    private void drawMotorBike(Vehicle vehicle) {
        System.out.println(vehicle);
    }

    public static void main(String[] args) {
        Lanzador lanzador = new Lanzador();
        lanzador.draw(new Vehicle(VehicleType.CAR));

    }

}
