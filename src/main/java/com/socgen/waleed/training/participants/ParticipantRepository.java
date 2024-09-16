package com.socgen.waleed.training.participants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ParticipantRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	Integer getCountOfLearners() {
		return jdbcTemplate.queryForObject("select count(*) from user", Integer.class);
	}

}
