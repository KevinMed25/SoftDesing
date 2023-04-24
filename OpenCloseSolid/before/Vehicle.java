package OpenCloseSolid.before;

public class Vehicle {
    VehicleType type;

    public Vehicle(VehicleType _type) {
        this.type = _type;
    }

    VehicleType getType() {
        return this.type;
    }

    public String toString() {
        if (type == VehicleType.CAR) {
            return "Its a car";
        } else {
            return "Its a Motorbike";
        }
    }
}
