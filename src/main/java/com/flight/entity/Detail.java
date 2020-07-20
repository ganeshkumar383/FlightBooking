package com.flight.entity;
import java.util.Date;

import javax.validation.constraints.NotNull;

public class Detail {
	@NotNull
	private String source;
	@NotNull
	private String dest;
	/*//@NotNull
	private Date t_date;
	private Date r_Date;*/
	
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
	/*public Date getT_date() {
		return t_date;
	}
	public void setT_date(Date t_date) {
		this.t_date = t_date;
	}
	public Date getR_Date() {
		return r_Date;
	}
	public void setR_Date(Date r_Date) {
		this.r_Date = r_Date;
	}*/
	@Override
	public String toString() {
		return "Source : "+this.source+" Dest : "+this.dest;
	}
}
