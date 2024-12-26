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

import com.example.IPL_REST_API.Model.TeamModel;
import com.example.IPL_REST_API.Service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService ts;

	@PostMapping("/api/teams")
	public String addTeam(@RequestBody TeamModel team) {
		String msg = ts.addTeam(team);
		return msg;
	}

	@GetMapping("/api/teams")
	public List<TeamModel> getAllTeams() {
		List<TeamModel> allTeams = ts.getAllTeams();
		return allTeams;
	}

	@GetMapping("/api/team")
	public Object getTeamById(@RequestParam int id) {
		TeamModel team = ts.getTeamById(id);
		if (team != null) {
			return team;
		} else {
			return "Team Not Found";
		}

	}

	@DeleteMapping("/api/teams/{id}")
	public String deleteTeam(@PathVariable int id) {
		return ts.deleteTeam(id);
	}

	@PutMapping("/api/teams/{id}")
	public String updateTeam(@RequestBody TeamModel updateTeam, @PathVariable int id) {
		return ts.updateTeam(updateTeam, id);
	}

}
