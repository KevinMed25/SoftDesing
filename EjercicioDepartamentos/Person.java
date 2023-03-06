import java.lang.reflect.Constructor;

class Person{

    private String name;
    private String employeeID;
    private String title;

    private ContactInformation contactInformation;

    public Person(String name, String employeedID, String title, ContactInformation contactInformation ){

        this.name = name;
        this.employeeID = employeedID;
        this.title = title;

        this.ContactInformation = contactInformation;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }

    public void tile(String title){
        this.title = title;
    }

    // agregar getters


}