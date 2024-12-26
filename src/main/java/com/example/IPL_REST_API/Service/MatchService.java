package com.example.IPL_REST_API.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.example.IPL_REST_API.Dao.MatchDao;
import com.example.IPL_REST_API.Model.MatchModel;

@Service
public class MatchService {

	@Autowired
	private MatchDao md;

	public String addAllMatch(MatchModel matches) {
		String addmatch = md.addAllMatch(matches);
		return addmatch;
	}

	public List<MatchModel> getMatches() {
		List<MatchModel> getMatch = md.getMatches();
		return getMatch;
	}

	public MatchModel getMatchesById(int id) {
		MatchModel matchid = md.getMatchesById(id);
		return matchid;
	}

	public String deleteMatch(int id) {
		int status = md.deleteMatch(id);
		if (status == 0) {
			return "Match not Found";
		} else {
			return "Match Deleted";
		}
	}
	
	public String updateMatch(MatchModel updateMatch,int id) {
		int status=md.updateMatch(updateMatch, id);
		if(status==1) {
			return"Update Successfully";
		}else {
			return "team not found";
		}
	}

}
