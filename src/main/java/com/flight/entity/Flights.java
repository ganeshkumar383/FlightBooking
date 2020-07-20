package com.flight.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Flights")
public class Flights implements Serializable{
    
    @Id
    @Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long f_number;
    @Column(name="airline_name")
    private String airlineName;
    @Column(name="source")
    private String source;
    
	@Column(name="dest")
    private String dest;
    @Column(name="t_date")
    private String t_date;
    @Column(name = "departure_time")
    private String departureTime;
	@Column(name = "arrival_time")
    private String arrivalTime;
    @Column(name = "number_of_stops")
    private Integer numberOfStops;
    @Column(name = "duration")
    private String duration;
    @Column(name = "price")
    private String price;
    
    
    
    public Flights(){
        
    }

    public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getT_date() {
		return t_date;
	}

	public void setT_date(String t_date) {
		this.t_date = t_date;
	}

	
	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
    public String getArrivalTime() {
		return arrivalTime;
	}

    public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public Integer getNumberOfStops() {
		return numberOfStops;
	}

    public void setNumberOfStops(Integer numberOfStops) {
		this.numberOfStops = numberOfStops;
	}
    
    public long getF_number() {
		return f_number;
	}

	public void setF_number(long f_number) {
		this.f_number = f_number;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
