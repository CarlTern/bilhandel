package hello;



import java.util.List;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarmodelController {
		
	

    @RequestMapping(value = "/carmodels", method = RequestMethod.GET)
    public List<Carmodel> carmodelGet() {
        return Carshop.carmodels;
    }
    
    @RequestMapping(value = "/carmodels", method = RequestMethod.POST)
    public Carmodel carmodelPost(
    		@RequestBody Carmodel car) {
    	
    	int id = getMax(Carshop.carmodels)+1;
    	car.id =id;
    	Carshop.carmodels.add(car);
        return car;
    }
    
    public int getMax(List<Carmodel> list){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getid() > max){
                max = list.get(i).getid();
            }
        }
        return max;
    }
}
