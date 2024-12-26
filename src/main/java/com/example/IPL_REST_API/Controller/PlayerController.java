package com.example.IPL_REST_API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.IPL_REST_API.Model.PlayerModel;
import com.example.IPL_REST_API.Service.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	PlayerService ps;

	@PostMapping("/api/players")
	public String addAllPlayers(@RequestBody PlayerModel player) {
		String pla = ps.addAllPlayers(player);
		return pla;
	}

	@GetMapping("/api/players")
	public List<PlayerModel> getAllPlayers() {
		List<PlayerModel> getplayers = ps.getAllPlayers();
		return getplayers;
	}

	@GetMapping("/api/player")
	public Object getPlayerById(@RequestParam int id) {
		PlayerModel playerid = ps.getPlayerById(id);

		if (playerid != null) {
			return playerid;
		} else {
			return "Player not found";
		}
	}

	@DeleteMapping("/api/players/{id}")
	public String deletePlayer(@PathVariable int id) {
		String msg = ps.deletePlayer(id);

		return msg;
	}

	@PutMapping("/api/players/{id}")
	public String updatePlayer(@RequestBody PlayerModel updatePlayer, @PathVariable int id) {
		return ps.updatePlayer(updatePlayer, id);
	}
}
