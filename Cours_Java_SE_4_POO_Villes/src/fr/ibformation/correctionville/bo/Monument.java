package fr.ibformation.correctionville.bo;

public class Monument {
	private String name;
	private int buildYear;
	
	public Monument(String name, int buildYear) {
		this.name = name;
		this.buildYear = buildYear;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getBuildYear() {
		return buildYear;
	}

	public void setBuildYear(int buildYear) {
		this.buildYear = buildYear;
	}

	@Override
	public String toString() {
		return "Monument [name=" + name + ", buildYear=" + buildYear + "]";
	}
	
}
