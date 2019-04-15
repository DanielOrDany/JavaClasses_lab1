package ua.lviv.iot.manegers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.exception.ResourceNotFoundException;
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
	
	@RequestMapping(path = "/save/{name}/{wifi}", method = RequestMethod.GET)
	public PassengerAircraft createPassengerAircraft(@PathVariable String name, @PathVariable boolean wifi ) {
	    return repository.save(new PassengerAircraft(name, wifi));
	}
	
	@RequestMapping("/findall")
    public String findAll(){
        String result = "<html>";
          
        for(PassengerAircraft cust : repository.findAll()){
            result += "<div>" + cust.getId()+" -> "+ cust.getName() + "</div>";
        }
          
        return result + "</html>";
    }
	
	@GetMapping("get/{id}")
	public String getNoteById(@PathVariable(value = "id") Long passengerAircraftId) {
		String result = "<html>";
		PassengerAircraft cust = repository.findById(passengerAircraftId).orElseThrow(() -> new ResourceNotFoundException("PassengerAircraft", "id", passengerAircraftId));
        result += "<div>" + cust.getId()+" -> "+ cust.getName() + "</div>";
        
	    return result + "</html>";
	}
	
	@RequestMapping(path = "/update/{id}/{name}/{wifi}", method = RequestMethod.GET)
	public PassengerAircraft updateNote(@PathVariable(value = "id") Long passengerAircraftId, 
			@PathVariable String name, @PathVariable boolean wifi) {

		PassengerAircraft passengerAircraft = repository.findById(passengerAircraftId)
	            .orElseThrow(() -> new ResourceNotFoundException("PassengerAircraft", "id", passengerAircraftId));

		passengerAircraft.setName(name);
		passengerAircraft.setWifi(wifi);

	    PassengerAircraft updatedNote = repository.save(passengerAircraft);
	    return updatedNote;
	}
	
	@DeleteMapping("del/{id}")
	public ResponseEntity<?> deletePassengerAircraft(@PathVariable(value = "id") Long passengerAircraftId) {
		PassengerAircraft passengerAircraft = repository.findById(passengerAircraftId)
	            .orElseThrow(() -> new ResourceNotFoundException("PassengerAircraft", "id", passengerAircraftId));

	    repository.delete(passengerAircraft);

	    return ResponseEntity.ok().build();
	}
}
