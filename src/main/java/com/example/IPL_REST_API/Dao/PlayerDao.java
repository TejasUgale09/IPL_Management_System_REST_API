package com.example.IPL_REST_API.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.IPL_REST_API.Model.PlayerModel;

@Repository
public class PlayerDao {

	ArrayList<PlayerModel> playerList = new ArrayList<PlayerModel>();

	public String addAllPlayers(PlayerModel player) {
		playerList.add(player);
		return "Added Successfullly";

	}

	public List<PlayerModel> getAllPlayers() {
		return playerList;
	}

	public PlayerModel getPlayerById(int id) {

		for (PlayerModel playerModel : playerList) {
			if (playerModel.getPlayerId() == id) {
				return playerModel;
			}
		}
		return null;
	}

	public int deletePlayer(int id) {
//		for (PlayerModel playerModel : playerList) {
//			if(playerModel.getPlayerId()==id) {
//				playerList.remove(id);
//				msg="Player Deleted";
//				return msg ;
//			}
		for (int i = 0; i < playerList.size(); i++) {
			if (playerList.get(i).getPlayerId() == id) {
				playerList.remove(i);
				return 1;
			}
		}
		return 0;
	}

	public int updatePlayer(PlayerModel updatePalyer, int id) {
		for (int i = 0; i < playerList.size(); i++) {
			PlayerModel player = playerList.get(i);
			if (player.getPlayerId() == id) {
				playerList.set(i, updatePalyer);
				return 1;
			}
		}
		return 0;
	}

}
