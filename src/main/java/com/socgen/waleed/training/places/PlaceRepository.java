package com.socgen.waleed.training.places;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends CrudRepository<Place, Integer> {

	List<Place> findByParticipantId(Integer id);
	
}
