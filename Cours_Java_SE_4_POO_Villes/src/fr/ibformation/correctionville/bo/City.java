package fr.ibformation.correctionville.bo;

/**
 * Entity BO City
 *
 */
public class City {
	
	private String name;
	private String country;
	/**
	 * Count citizen for all the city and neighborhood
	 */
	private int countCitizen;
	private Monument monument;
	
	// Contants
	private static final int COUNT_CITIZEN_FIRST_LIMIT = 1000;
	private static final int COUNT_CITIZEN_SECOND_LIMIT = 10000;
	private static final int COUNT_CITIZEN_THIRD_LIMIT = 100000;
	
	/**
	 * Contructor for instanciate City Object
	 * @param name 
	 * @param country
	 * @param countCitizen 
	 */
	public City(String name, String country, int countCitizen, Monument monument) {
		this.name = name;
		this.country = country;
		this.countCitizen = countCitizen;
		if (monument != null) {
			this.monument = monument;
		}
	}
	
	// Méthodes de classes
	public String description() {
		String description = this.name + " " + this.country + " " +
							 this.countCitizen + " habitant categorie " +
							 this.getCategory() + " Monument :"; 
		if (this.monument != null) {
			description += this.monument.getName() + " " +
						  this.monument.getBuildYear();
		}
		return description;
		
	}
	
	/**
	 * 
	 * @param cityToCompare
	 * @return Expliquer le nombre du return :
	 * - 0 : 
	 * - -1 :
	 * - 1 : 
	 */
	public int compareTwoCityCountCitizen(City cityToCompare) {
		if(this.countCitizen == cityToCompare.getCountCitizen()){
			return 0;
		} else if(this.countCitizen < cityToCompare.getCountCitizen()){
			return -1;
		} else {
			return 1;
		}
	}
	
	public String compareTwoCityName(City cityToCompare) {
		if (this.name.equalsIgnoreCase(cityToCompare.getName())) {
			return "Les villes ont le même nom";
		} else {
			return "Les villes n'ont pas le même nom";
		}
	}
	
	@Override
	public String toString() {
		return "City [name=" + name + ", country=" +
				country + ", countCitizen=" + countCitizen +
				", monument="
				+ monument + "]";
	}

	// Getter / Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getCountCitizen() {
		return countCitizen;
	}
	public void setCountCitizen(int countCitizen) {
		this.countCitizen = countCitizen;
	}

	public String getCategory() {
		if(this.countCitizen < COUNT_CITIZEN_FIRST_LIMIT){
			return "A";
		} else if(this.countCitizen >= COUNT_CITIZEN_FIRST_LIMIT && this.countCitizen < COUNT_CITIZEN_SECOND_LIMIT) {
			return "B";
		} else if(this.countCitizen >= COUNT_CITIZEN_SECOND_LIMIT && this.countCitizen < COUNT_CITIZEN_THIRD_LIMIT) {
			return "C";
		} else {
			return "D";
		}
	}
	
}
