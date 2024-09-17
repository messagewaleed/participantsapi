package com.socgen.waleed.training.participants;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends CrudRepository<Participant, Integer> {
	
}

















//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	Integer getCountOfLearners() {
//		return jdbcTemplate.queryForObject("select count(*) from user", Integer.class);
//	}

//
//Spring Data JPA (DBC)
//	- JPA (Java Persistence API)
//	- ORM (Object Relational Mapping)
//	- Class <-----> Table
//		- Maps tables of db to java classes(Entity)
//	- We don't have to query for basic crud