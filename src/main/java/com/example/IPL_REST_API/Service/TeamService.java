package com.example.IPL_REST_API.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.IPL_REST_API.Dao.TeamDao;
import com.example.IPL_REST_API.Model.TeamModel;

@Service
public class TeamService {

	@Autowired
	private TeamDao td;

	public String addTeam(TeamModel team) {
		String msg = td.addTeam(team);
		return msg;
	}

	public List<TeamModel> getAllTeams() {
		List<TeamModel> allTeams = td.getAllTeams();
		return allTeams;
	}

	public TeamModel getTeamById(int id) {
		TeamModel team = td.getTeamById(id);
		return team;
	}

	public String deleteTeam(int id) {
		int status = td.deleteTeam(id);
		if (status == 0) {
			return " Team Not Found";
		} else {
			return "Team  Deleted";
		}
	}

	public String updateTeam(TeamModel updateTeam, int id) {
		int status = td.updateTeam(updateTeam, id);
		if (status == 1) {
			return "Update Successfully";
		} else {
			return "Team Not Found";
		}
	}

}
