public class Main{

    public Main(){
        Company c = new Company();
        Department d1 = new Department("Sales");
        Department d2 = new Department("R&H");
        Department d3 = new Department("US sales");
        c.addDepartement(d1);
        c.addDepartement(d2);
        d1.addDepartement(d3);
        c.addDepartement(d3);
        Person p = new Person();
        p.setName("Erin");
        p.setEmployeeID("4362");
        

    }
    public static void main(String[] args) {
        new Main();
    }
}