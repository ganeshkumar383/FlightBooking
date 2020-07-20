package com.flight.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flight.entity.Detail;
import com.flight.entity.Flights;


@Service
public interface FlightBookingService {
    List<Flights> findAllFlights();
    List<Flights> findSrcFlights(Detail detail);
}


