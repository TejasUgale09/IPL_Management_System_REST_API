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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.IPL_REST_API.Model.MatchModel;
import com.example.IPL_REST_API.Service.MatchService;

@RestController
public class MatchController {

	@Autowired
	private MatchService ms;

	@PostMapping("/api/matches")
	public String addAllMatches(@RequestBody MatchModel matches) {
		String addmatch = ms.addAllMatch(matches);
		return addmatch;
	}

	@GetMapping("/api/matches")
	public List<MatchModel> getMatches() {
		List<MatchModel> getMatch = ms.getMatches();
		return getMatch;
	}

	@GetMapping("/api/match")
	public Object getMatchesById(@RequestParam int id) {
		MatchModel matchid = ms.getMatchesById(id);
		if (matchid != null) {
			return matchid;
		} else {
			return "Match Not Found";
		}
	}

	@DeleteMapping("/api/match/{id}")
	public String deleteMatch(@PathVariable int id) {
		String status = ms.deleteMatch(id);
		return status;
	}

	@PutMapping("/api/match/{id}")
	public Object updateMatch(@RequestBody MatchModel updateMatch, @PathVariable int id) {
		return ms.updateMatch(updateMatch, id);
	}

}
