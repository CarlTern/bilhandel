package hello;

public class Sale {
  
    private int id;
    private int employee_id;
    private int carmodel_id;
    

    public Sale(int id, int employee_id,int carmodel_id) {
        this.id = id;
        this.carmodel_id =carmodel_id;
        this.employee_id = employee_id;
    }

    public int getCarmodelId() {
        return carmodel_id;
    }
    public int getEmployeeId() {
        return employee_id;
    }
    
    public int getId() {
    	return id;
    }
}
