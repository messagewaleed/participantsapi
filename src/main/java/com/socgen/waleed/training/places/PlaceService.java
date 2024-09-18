package com.socgen.waleed.training.places;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {
	
	@Autowired
	PlaceRepository repository;
	
	List<Place> getAllPlacesByParticipantId(Integer participantId) {
		return repository.findByParticipantId(participantId);
	}
	
	Optional<Place> getPlaceById(Integer id) {
		return repository.findById(id);
	}
	
	void addNewPlace(Place place) {
		repository.save(place);
	}
	
	void updatePlace(Place place) {
		repository.save(place);
	}
	
	void deletePlace(Integer id) {
		repository.deleteById(id);
	}
	
	
	
	
	
	

}
