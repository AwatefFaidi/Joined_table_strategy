package org.sid.joined.model;

import javax.persistence.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data @NoArgsConstructor 
public class Archer extends Infantry {
	private Integer range;
	
	 public Archer( Infantrytype type, Integer moveSpeed, Integer durability, Integer attack, Integer range) {
	        super(type, moveSpeed, durability, attack);
	        this.range = range;
	    }
	
}
