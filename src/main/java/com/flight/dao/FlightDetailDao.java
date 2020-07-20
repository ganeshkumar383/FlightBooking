package com.flight.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.flight.entity.Flights;

@Repository
public interface FlightDetailDao extends JpaRepository<Flights, Long>{
	
	@Query(value="SELECT * FROM FLIGHTS WHERE source=:source AND dest=:dest", nativeQuery = true)
	List<Flights> findBySourceDest(@Param("source") String source,@Param("dest") String dest);

}
