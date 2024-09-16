package com.socgen.waleed.training.participants;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socgen.waleed.training.Participant;

@Service //Instatiated by the Container
public class ParticipantService {
	
	@Autowired
	ParticipantRepository repository;
	
	Integer getCountOfLearners() {
		return repository.getCountOfLearners();
	}

	
	ArrayList<Participant> participants = new ArrayList<>(Arrays.asList(
			new Participant(67, "Meghna", "CSE"),
			new Participant(671, "Sunil", "CSE"),
			new Participant(609, "Donny", "ECE"),
			new Participant(3481, "Anand", "Civil")
			));
	
	ArrayList<Participant> getAllParticipants() {
		return participants;
	}
	
	Participant getParticipantById(Integer id) {
		return participants.stream().filter(ref -> ref.id().equals(id)).findFirst().get();
	}
	

	void addNewParticipant(Participant participant) {
		participants.add(participant);
	}
	

	void  updateParticipantById(Integer id,Participant participant) {
		participants.set(
				participants.indexOf(participants.stream().filter(ref -> ref.id().equals(id)).findFirst().get()), 
				participant);
	}
	
	void deleteParticipantById(Integer id) {
		participants.remove(participants.stream().filter(ref -> ref.id().equals(id)).findFirst().get());
	}
	
	
	
	
}
