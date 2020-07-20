package com.flight.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.FlightDetailDao;
import com.flight.entity.Detail;
import com.flight.entity.Flights;
import com.flight.service.FlightBookingService;

@Service
public class FlightBookingServiceImpl implements FlightBookingService {

	@Autowired
	private FlightDetailDao flightDetailDao;
    
    public List<Flights> findAllFlights(){
    	
    	 List<Flights> flightsList = new ArrayList<Flights>();
    	 
    	 //flightsList=flightDetailDao.findBySourceDest(detail.getSource(), detail.getDest());
    	 flightsList=flightDetailDao.findAll();
    	 return flightsList;
    }

    public List<Flights> findSrcFlights(Detail detail){
    	
   	 List<Flights> flightsList = new ArrayList<Flights>();
   	 if(detail.getSource().equals(detail.getDest())) {
   		 return flightsList;
   	 }
   	 flightsList=flightDetailDao.findBySourceDest(detail.getSource(), detail.getDest());
   	 //flightsList=flightDetailDao.findAll();
   	 return flightsList;
   }
    
    public void saveOrUpdate(Flights flights)   
    {  
    	flightDetailDao.save(flights);  
    } 
}
