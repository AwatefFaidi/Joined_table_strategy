package org.sid.joined.model;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data @NoArgsConstructor @AllArgsConstructor
public abstract class Infantry {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private Infantrytype type;
    private Integer moveSpeed;
    private Integer durability;
    private Integer attack;
    protected Infantry(Infantrytype type, Integer moveSpeed, Integer durability, Integer attack) {
        this.type = type;
        this.moveSpeed = moveSpeed;
        this.durability = durability;
        this.attack = attack;
    }

}
