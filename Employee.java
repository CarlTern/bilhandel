package hello;

public class Employee {
 
    private int id;
    private String name;
    
    public Employee(int id,String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getId() {
    	return id;
    }
}
