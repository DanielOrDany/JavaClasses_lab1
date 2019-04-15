package ua.lviv.iot.manegers;

import org.springframework.data.repository.CrudRepository;

import ua.lviv.iot.models.PassengerAircraft;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete

public interface AirplaneRepository extends CrudRepository<PassengerAircraft, Long> {

}
