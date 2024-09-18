package com.socgen.waleed.training.participants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socgen.waleed.training.participants.Participant;

@Service //Instatiated by the Container
public class ParticipantService {
	
	@Autowired
	ParticipantRepository repository;
	
//	Integer getCountOfLearners() {
//		return repository.getCountOfLearners();
//	}

	
//	ArrayList<Participant> participants = new ArrayList<>(Arrays.asList(
//			new Participant(67, "Meghna", "CSE"),
//			new Participant(671, "Sunil", "CSE"),
//			new Participant(609, "Donny", "ECE"),
//			new Participant(3481, "Anand", "Civil")
//			));
	
	Iterable<com.socgen.waleed.training.participants.Participant> getAllParticipants() {
		return repository.findAll();
	}
	
	Optional<com.socgen.waleed.training.participants.Participant> getParticipantById(Integer id) {
		return repository.findById(id);
	}
	

	void addNewParticipant(Participant participant) {
		repository.save(participant);
	}
	

	void  updateParticipantById(Participant participant) {
		repository.save(participant);
	}
	
	void deleteParticipantById(Integer id) {
		repository.deleteById(id);
	}
	
	
	List<Participant> getParticipantByName(String name) {
		return repository.findByName(name);
	}
	
	
	
	
}
