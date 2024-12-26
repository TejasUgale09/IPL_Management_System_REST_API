package com.example.IPL_REST_API.Model;

public class MatchModel {

	private int matchId; // Unique identifier for each match
	private int team1; // ID of the first team in the match
	private int team2; // ID of the second team in the match
	private String date; // Match date in yyyy-MM-dd format
	private String venue; // Venue of the match
	private String result; // Result of the match (e.g., 'Team1 won', 'Team2 won', 'Draw')

	// Default constructor
	public MatchModel() {
	}

	// Parameterized constructor
	public MatchModel(int matchId, int team1, int team2, String date, String venue, String result) {
		this.matchId = matchId;
		this.team1 = team1;
		this.team2 = team2;
		this.date = date;
		this.venue = venue;
		this.result = result;
	}

	// Getter and Setter methods
	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getTeam1() {
		return team1;
	}

	public void setTeam1(int team1) {
		this.team1 = team1;
	}

	public int getTeam2() {
		return team2;
	}

	public void setTeam2(int team2) {
		this.team2 = team2;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	// toString method
	@Override
	public String toString() {
		return "Match{" + "matchId=" + matchId + ", team1=" + team1 + ", team2=" + team2 + ", date='" + date + '\''
				+ ", venue='" + venue + '\'' + ", result='" + result + '\'' + '}';
	}

}
