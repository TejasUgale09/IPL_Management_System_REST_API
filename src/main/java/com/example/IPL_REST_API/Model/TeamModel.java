package com.example.IPL_REST_API.Model;

public class TeamModel {
	private int teamId; // Unique identifier for each team
	private String name; // Name of the team
	private String city; // City the team belongs to
	private String coach; // Name of the team's coach

	// Default constructor
	public TeamModel() {
		// TODO Auto-generated constructor stub
	}
	// Parameterized constructor
	public TeamModel(int teamId, String name, String city, String coach) {
		this.teamId = teamId;
		this.name = name;
		this.city = city;
		this.coach = coach;
	}

	// Getter and Setter methods
	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	// toString method
	@Override
	public String toString() {
		return "Team{" + "teamId=" + teamId + ", name='" + name + '\'' + ", city='" + city + '\'' + ", coach='" + coach
				+ '\'' + '}';
	}
}
