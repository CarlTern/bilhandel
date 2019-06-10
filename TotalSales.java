package hello;

public class TotalSales {
    private int id;
    private String name;
    private int total;
    
    public TotalSales(int id,String name, int total) {
        this.name = name;
        this.id = id;
        this.total = total;
    }

    public String getName() {
        return name;
    }
    public int getId() {
    	return id;
    }
    public int getTotal() {
    	return total;
    }
}
