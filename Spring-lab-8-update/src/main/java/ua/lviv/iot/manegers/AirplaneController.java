package ua.lviv.iot.manegers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.models.Airplane;
import ua.lviv.iot.models.PassengerAircraft;

@RestController
public class AirplaneController {
	@Autowired
    AirplaneRepository repository;
	
	@RequestMapping("/save")
	 public String process(){
        repository.save(new PassengerAircraft("G-564", true));
        repository.save(new PassengerAircraft("S-21", true));
        repository.save(new PassengerAircraft("DS-01", false));
        return "Done";
    }
	
	@RequestMapping("/findall")
    public String findAll(){
        String result = "<html>";
          
        for(PassengerAircraft cust : repository.findAll()){
            result += "<div>" + cust.getId()+" -> "+ cust.getName() + "</div>";
        }
          
        return result + "</html>";
    }
	   
}
