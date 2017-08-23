package com.ness.devtools.buildtool.api.model;

public enum ProjectType {

	MAVEN, ANT, GRADLE;

	@Override
	public String toString() {
		return this.name().toLowerCase();
	};

}