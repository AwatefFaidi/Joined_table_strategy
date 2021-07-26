package org.sid.joined.model;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Knight extends Infantry {
	private Boolean shield;

    public Knight() {
    }

    public Knight(Infantrytype type, Integer moveSpeed, Integer durability, Integer attack, Boolean shield) {
        super(type, moveSpeed, durability, attack);
        this.shield = shield;
    }

}
