package hello;



import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hello.Carmodel;
import hello.Carshop;
import hello.Employee;
import hello.Sale;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Carshop.employees = new ArrayList<Employee>();
        Carshop.employees.add(new Employee(1, "Hjulia StyrÃ©n"));
        Carshop.employees.add(new Employee(2, "Antonia Cylinder"));
        Carshop.employees.add(new Employee(3, "Kalle BromslÃ¶f"));
        Carshop.employees.add(new Employee(4, "Johan Sportratt"));
        Carshop.carmodels = new ArrayList<Carmodel>();
        Carshop.carmodels.add(new Carmodel(1,"BMW","335i",200000));
        Carshop.carmodels.add(new Carmodel(2,"Aston Martin","Vanquish",233000));
        Carshop.carmodels.add(new Carmodel(3,"Toyota","Prius",150000));
        Carshop.carmodels.add(new Carmodel(4,"Volvo","240",100000));
        Carshop.sales = new ArrayList<Sale>();
        Carshop.sales.add(new Sale(1,2,3));
        Carshop.sales.add(new Sale(2,4,3));
        Carshop.sales.add(new Sale(3,4,4));
        Carshop.sales.add(new Sale(4,1,1));
        Carshop.sales.add(new Sale(5,3,1));
        Carshop.sales.add(new Sale(6,3,1));
        Carshop.sales.add(new Sale(7,2,2));
        Carshop.sales.add(new Sale(8,2,3));
    }
}
