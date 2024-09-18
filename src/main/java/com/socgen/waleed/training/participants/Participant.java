package com.socgen.waleed.training.participants;

import com.socgen.waleed.training.places.Place;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table("particpantDetails")
public class Participant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	//	@Column("userName")
	String name;
	
	String skills;	
	
	
	public Participant() {
		// TODO Auto-generated constructor stub
	}

	
@Override
	public String toString() {
		return "Participant [id=" + id + ", name=" + name + ", skills=" + skills + "]";
	}


	public Participant(String name, String skills) {
		this.name = name;
		this.skills = skills;
	}
	
	public Participant(Integer id, String name, String skills) {
		this.name = name;
		this.skills = skills;
		this.id = id;
	}

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

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

}
