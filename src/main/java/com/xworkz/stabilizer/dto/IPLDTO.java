package com.xworkz.stabilizer.dto;

import java.io.Serializable;

public class IPLDTO implements Serializable {

	private String teamName;
	private String owner;
	private String teamCaptain;
	private String place;
	private String entry;

	public IPLDTO() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTeamCaptain() {
		return teamCaptain;
	}

	public void setTeamCaptain(String teamCaptain) {
		this.teamCaptain = teamCaptain;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	@Override
	public String toString() {
		return "IPLDTO [teamName=" + teamName + ", owner=" + owner + ", teamCaptain=" + teamCaptain + ", place=" + place
				+ ", entry=" + entry + "]";
	}

}
