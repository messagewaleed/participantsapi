package com.socgen.waleed.training.places;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socgen.waleed.training.participants.Participant;

@RestController
@RequestMapping("v1.0/")
public class PlaceController {
	
	@Autowired
	PlaceService service;
	
	@GetMapping("places/participants/{participantId}")
	List<Place> getAllPlacesByParticipantId(@PathVariable Integer participantId) {
		return service.getAllPlacesByParticipantId(participantId);
	}
	
	@GetMapping("places/{id}")
	Optional<Place> getPlaceById(@PathVariable Integer id) {
		return service.getPlaceById(id);
	}
	
	@PostMapping("places/{participantId}")
	void addNewPlace(@RequestBody Place place, @PathVariable Integer participantId) {
		place.setParticipant(new Participant(participantId, "", ""));
		service.addNewPlace(place);
	}
	
	@PutMapping("places/{participantId}")
	void updatePlace(@RequestBody Place place, @PathVariable Integer participantId) {
		place.setParticipant(new Participant(participantId, "", ""));
		service.updatePlace(place);
	}
	
	@DeleteMapping("places/{id}")
	void deletePlace(Integer id) {
		service.deletePlace(id);
	}

}
