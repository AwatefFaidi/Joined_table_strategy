package org.sid.joined;

import org.sid.joined.dao.*;
import org.sid.joined.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JoinedTableApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(JoinedTableApplication.class, args);
		InfantryRepository archerRepository =
				configurableApplicationContext.getBean(ArcherRepository.class);
		InfantryRepository knightRepository =
				configurableApplicationContext.getBean(KnightRepository.class);

		Infantry archer = new Archer(Infantrytype.LIGHT, 300, 500, 100, 1000);
		Infantry knight = new Knight(Infantrytype.HEAVY, 280, 1000, 300, true);

		archerRepository.save(archer);
		knightRepository.save(knight);

		knightRepository.delete(knight);
	}

}
