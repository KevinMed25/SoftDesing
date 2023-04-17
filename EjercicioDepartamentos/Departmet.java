import java.util.ArrayList;
import java.util.List;

class Department{

    private String name;
    List<Department> listDepartments = new ArrayList<Department>();

    public Department(){

    }

    public Department(String name){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return  this.name;
    }

}