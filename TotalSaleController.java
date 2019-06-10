package hello;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TotalSaleController {

	

    @RequestMapping(value = "/sales", method = RequestMethod.GET)
    public List<TotalSales> totalsales() {
    	List<TotalSales> total = new ArrayList<TotalSales>();
    	for(Employee e : Carshop.employees){
    		
    		int totalCash = 0;
    		for (Sale s : Carshop.sales) {
    			if(s.getEmployeeId() == e.getId()) {
    				for (Carmodel c : Carshop.carmodels) {
    					if (c.getid() == s.getCarmodelId()) {
    						totalCash += c.price;
    					}
    					
    				}
    			}
    		}
    		TotalSales sales = new TotalSales(e.getId(),e.getName(),totalCash);
    		total.add(sales);
    	}
    	
        return total;
    }
}
