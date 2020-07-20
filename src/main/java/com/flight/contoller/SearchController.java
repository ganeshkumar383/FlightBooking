package com.flight.contoller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.entity.Detail;
import com.flight.entity.Flights;
import com.flight.service.impl.FlightBookingServiceImpl;

@RestController
public class SearchController {
	
	@Autowired
	FlightBookingServiceImpl flightBookingServiceImpl;
	
	@GetMapping("/hello")
	public String getFlightDetail() {
		
		return "Hello Altimetrik";
	}
	
	@PostMapping("/searchFlight")
	public List<Flights> getFlightDetail(@RequestBody Detail detail) {
		
		return flightBookingServiceImpl.findSrcFlights(detail); 
	}
	@GetMapping("/searchFlights/{src}/{dest}")
	public List<Flights> getFlightDetails(@PathVariable("src") String src,@PathVariable("dest") String dest) {
		Detail detail = new Detail();
		detail.setSource(src);
		detail.setDest(dest);
		return flightBookingServiceImpl.findSrcFlights(detail); 
	}
	@GetMapping("/allFlight")
	public List<Flights> getAllFlightDetails() {
		
		return flightBookingServiceImpl.findAllFlights(); 
	}
	
	@PostMapping("/flights")  
	private String saveStudent(@RequestBody Flights flights)   
	{  
		flightBookingServiceImpl.saveOrUpdate(flights);  
		return "Flight added Success";  
	} 
}
