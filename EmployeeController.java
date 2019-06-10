package hello;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee> employee() {
        return Carshop.employees;
    }
}
