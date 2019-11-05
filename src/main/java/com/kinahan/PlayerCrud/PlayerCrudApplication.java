package com.kinahan.PlayerCrud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class PlayerCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayerCrudApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(UserRepository userRepository) {
//		return args -> {
//			Stream.of("John","Jessie","Rupert","Denise","Mikey").forEach(name -> {
//				Player user = new Player(name, name.toLowerCase() + "@heebiegeebies.com");
//				userRepository.save(user);
//			});
//			userRepository.findAll().forEach(System.out::println);
//		};
//	}
	
//	@Bean
//	CommandLineRunner init(PlayerRepository playerRepository) {
//		return args -> {
//			Player a1 = new Player("Harry Kane","Striker",24,65);
//			playerRepository.save(a1);
//		};
//		
//	}

	
	
	@Bean
	CommandLineRunner init(PlayerRepository playerRepository) {
		return args -> {
			List<Player> playerList = new ArrayList<>();
			playerList.add(new Player("Lionel Messi","AttackingMid",30,112));
			playerList.add(new Player("Pavel Nedved","AttackingMid",36,17));
			playerList.add(new Player("Harry Kane","Striker",24,65));
			playerList.add(new Player("Antoine Griezman","Striker",26,97));
			playerList.add(new Player("Paul Pogba","Midfielder",24,86));
			playerList.add(new Player("David Forde","Goalie",27,20));
			playerList.add(new Player("Cris Ronaldo","AttackingMid",31,98));
			playerList.add(new Player("Troy Parrot","Striker",20,32));
			playerList.add(new Player("David Silva","Midfielder",28,82));
			playerList.add(new Player("Mo Salah","Striker",26,89));
			playerList.add(new Player("Roberto Firminho","Striker",27,88));
			playerList.add(new Player("James McClean","Winger",29,28));
			 
			playerRepository.saveAll(playerList);
		};
		
	}
	
	
}
