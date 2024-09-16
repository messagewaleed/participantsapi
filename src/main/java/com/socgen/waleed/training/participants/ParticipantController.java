package com.socgen.waleed.training;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParticipantController {
	
	ArrayList<Participant> participants = new ArrayList<>(Arrays.asList(
			new Participant(67, "Meghna", "CSE"),
			new Participant(671, "Sunil", "CSE"),
			new Participant(609, "Donny", "ECE"),
			new Participant(3481, "Anand", "Civil")
			));
	
	@GetMapping("/participants")
	ArrayList<Participant> getAllParticipants() {
		return participants;
	}
	
	@GetMapping("/participants/{id}")
	Participant getParticipantById(@PathVariable Integer id) {
		return participants.stream().filter(ref -> ref.id().equals(id)).findFirst().get();
	}
	
	@PostMapping("/participants")
	void addNewParticipant(@RequestBody Participant participant) {
		participants.add(participant);
	}
	
	@PutMapping("/participants/{id}")
	void  updateParticipantById(@PathVariable Integer id, @RequestBody Participant participant) {
		participants.set(
				participants.indexOf(participants.stream().filter(ref -> ref.id().equals(id)).findFirst().get()), 
				participant);
	}
	
	@DeleteMapping("/participants/{id}")
	void deleteParticipantById(@PathVariable Integer id) {
		participants.remove(participants.stream().filter(ref -> ref.id().equals(id)).findFirst().get());
	}
	
	
	
	
	
	
	
	
	
	

}
