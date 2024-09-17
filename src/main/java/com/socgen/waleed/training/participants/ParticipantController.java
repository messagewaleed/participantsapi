package com.socgen.waleed.training.participants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import com.socgen.waleed.training.participants.Participant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.socgen.waleed.training.Participant;

@RestController
public class ParticipantController {
	
	@Autowired //DI
	ParticipantService service;
	
//	@GetMapping("/count")
//	Integer getCountOfLearners() {
//		return service.getCountOfLearners();
//	}
	
	
	
	@GetMapping("/participants")
	Iterable<com.socgen.waleed.training.participants.Participant> getAllParticipants() {
		return service.getAllParticipants();
	}
	
	@GetMapping("/participants/{id}")
	Optional<com.socgen.waleed.training.participants.Participant> getParticipantById(@PathVariable Integer id) {
		return service.getParticipantById(id);
	}
	
	@PostMapping("/participants")
	void addNewParticipant(@RequestBody Participant participant) {
		service.addNewParticipant(participant);
	}
	
	@PutMapping("/participants/{id}")
	void  updateParticipantById(Integer id, @RequestBody Participant participant) {
		service.updateParticipantById(participant);
	}
	
	@DeleteMapping("/participants/{id}")
	void deleteParticipantById(@PathVariable Integer id) {
		service.deleteParticipantById(id);
	}
	}


























