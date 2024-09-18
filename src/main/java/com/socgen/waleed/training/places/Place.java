package com.socgen.waleed.training.places;


import com.socgen.waleed.training.participants.Participant;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Place {
	
	@Id
	private Integer id;
	
	private String name;
	
	private String state;
	
	Place(){
		
	}
	
	@ManyToOne
	private Participant participant; //Primary to Foriegn key relationship

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public com.socgen.waleed.training.participants.Participant getParticipant() {
		return participant;
	}

	public void setParticipant(com.socgen.waleed.training.participants.Participant participant) {
		this.participant = participant;
	}

	public Place(Integer id, String name, String state, Integer participantId) {
		this.id = id;
		this.name = name;
		this.state = state;
		this.participant = new Participant(participantId, "", "");
	}
	
	

}
