package com.example.IPL_REST_API.Model;

public class PlayerModel {

	private int playerId; // Unique identifier for each player
	private String name; // Name of the player
	private int age; // Age of the player
	private int teamId; // ID of the team the player belongs to
	private String role; // Player's role (e.g., batsman, bowler, all-rounder)

public PlayerModel() {
	// TODO Auto-generated constructor stub
}

	// Parameterized constructor
	public PlayerModel(int playerId, String name, int age, int teamId, String role) {
		this.playerId = playerId;
		this.name = name;
		this.age = age;
		this.teamId = teamId;
		this.role = role;
	}

	// Getter and Setter methods
	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	// toString method
	@Override
	public String toString() {
		return "Player{" + "playerId=" + playerId + ", name='" + name + '\'' + ", age=" + age + ", teamId=" + teamId
				+ ", role='" + role + '\'' + '}';
	}

}
