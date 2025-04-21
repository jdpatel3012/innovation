package com.divit.springboot.application.model;

import java.util.Set;

import lombok.Getter;
import lombok.Setter;

public class Candidate {
	private String name;
	private int experienceYears;
	private Set<String> skillsSet;

	public Candidate(String name, int experienceYears, Set<String> skillsSet) {
		this.name = name;
		this.experienceYears = experienceYears;
		this.skillsSet = skillsSet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperienceYears() {
		return experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	public Set<String> getSkillsSet() {
		return skillsSet;
	}

	public void setSkillsSet(Set<String> skillsSet) {
		this.skillsSet = skillsSet;
	}

}
