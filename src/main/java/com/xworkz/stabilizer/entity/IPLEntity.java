package com.xworkz.stabilizer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class IPLEntity {

	@Id
	@Column(name = "IPL_ID")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int iplId;
	@Column(name = "TEAM_NAME")
	private String teamName;
	@Column(name = "OWNER")
	private String owner;
	@Column(name = "CAPTIAIN")
	private String teamCaptain;
	@Column(name = "PLACE")
	private String place;
	@Column(name = "ENTRY")
	private String entry;

	public IPLEntity() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	public int getIplId() {
		return iplId;
	}

	public void setIplId(int iplId) {
		this.iplId = iplId;
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

}
