package com.example.IPL_REST_API.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.IPL_REST_API.Model.MatchModel;

@Repository
public class MatchDao {

	ArrayList<MatchModel> matcheslist = new ArrayList<MatchModel>();

	public String addAllMatch(MatchModel matches) {
		matcheslist.add(matches);
		return "Added Successfully";
	}

	public List<MatchModel> getMatches() {
		return matcheslist;
	}

	public MatchModel getMatchesById(int id) {
		for (MatchModel matchModel : matcheslist) {
			if (matchModel.getMatchId() == id) {
				return matchModel;
			}
		}
		return null;
	}

	public int deleteMatch(int id) {
		for (int i = 0; i <= matcheslist.size(); i++) {
			if (matcheslist.get(i).getMatchId() == id) {
				matcheslist.remove(i);
				return 1;
			}
		}
		return 0;
	}

	public int updateMatch(MatchModel updateTeam, int id) {
		for (int i = 0; i < matcheslist.size(); i++) {
			MatchModel match = matcheslist.get(i);
			if (match.getMatchId() == id) {
				matcheslist.set(i, updateTeam);
				return 1;
			}
		}
		return 0;
	}
}
