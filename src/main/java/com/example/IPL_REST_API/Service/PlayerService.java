package com.example.IPL_REST_API.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.IPL_REST_API.Dao.PlayerDao;
import com.example.IPL_REST_API.Model.PlayerModel;

@Service
public class PlayerService {

	@Autowired
	PlayerDao pd;

	public String addAllPlayers(PlayerModel player) {
		String players = pd.addAllPlayers(player);
		return players;
	}

	public List<PlayerModel> getAllPlayers() {
		List<PlayerModel> getplayers = pd.getAllPlayers();
		return getplayers;
	}

	public PlayerModel getPlayerById(int id) {
		PlayerModel playerid = pd.getPlayerById(id);
		return playerid;
	}

	public String deletePlayer(int id) {
		int status = pd.deletePlayer(id);
		if (status == 0) {
			return "Player Not found";
		} else {
			return "Player Deleted";
		}
	}

	public String updatePlayer(PlayerModel updatePlayer, int id) {
		int status = pd.updatePlayer(updatePlayer, id);
		if (status == 1) {
			return "Update Successfully";
		} else {
			return "Player not found";
		}
	}

}
