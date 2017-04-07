package persistence;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import persistence.User;

/**
 * Entity implementation class for Entity: Citizen
 *
 */
@Entity

public class Citizen extends User implements Serializable {

	
	private String region;
	private static final long serialVersionUID = 1L;

	public Citizen() {
		super();
	}   
	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
   
}
