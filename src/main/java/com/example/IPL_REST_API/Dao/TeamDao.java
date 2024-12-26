package com.example.IPL_REST_API.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.IPL_REST_API.Model.TeamModel;

@Repository
public class TeamDao {

	ArrayList<TeamModel> teamList = new ArrayList<TeamModel>();

	public String addTeam(TeamModel team) {
		teamList.add(team);
		return "Added Successfully";
	}

	public List<TeamModel> getAllTeams() {
		return teamList;
	}

	public TeamModel getTeamById(int id) {
		for (TeamModel teamModel : teamList) {
			if (teamModel.getTeamId() == id) {
				return teamModel;
			}
		}
		return null;
	}

	public int deleteTeam(int id) {
//		for (TeamModel teamModel : teamList) {
//			if (teamModel.getTeamId() == id) {
//				teamList.remove(id);
//				return 1;	
		for (int i = 0; i < teamList.size(); i++) {
			if (teamList.get(i).getTeamId() == id) {
				teamList.remove(i);
				return 1;
			}
		}
		return 0;
	}

	public int updateTeam(TeamModel updateTeam, int id) {
		for (int i = 0; i < teamList.size(); i++) {
			TeamModel team = teamList.get(i);
			if (team.getTeamId() == id) {
				teamList.set(i, updateTeam);
				return 1;
			}
		}
		return 0;
	}

}
