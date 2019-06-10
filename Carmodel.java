package hello;

public class Carmodel {

	public int id;
    public String brand;
	public String model;
	public int price;


    public Carmodel(int id, String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.id = id;
    }
    
    public Carmodel() {
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getid() {
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
