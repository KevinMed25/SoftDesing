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



}