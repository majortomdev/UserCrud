package com.kinahan.PlayerCrud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PlayerController {
	
	
	
	public PlayerController(PlayerRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	@Autowired
	private final PlayerRepository userRepository;
	
//	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/players")
	public List<Player> getUsers(){
		return (List<Player>) userRepository.findAll();
	}
	@PostMapping("/players")
	void addUser(@RequestBody Player player) {
		userRepository.save(player);
	}
	@GetMapping("players/{id}")
	public Optional<Player> getPlayerById(@PathVariable("id") long id) {
		return userRepository.findById(id);
	}
	

	
	
	

}
