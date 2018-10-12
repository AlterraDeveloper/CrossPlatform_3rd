package home#2;

public class Country{
	private String name;
	private String capital;
	private double square;
	private long population;

	Country(){
	}

	Country(String name,String capital,double square,long population){
		this.name = name;
		this.capital = capital;
		this.square = square;
		this.population = population;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setCapital(String capital){
		this.capital = capital;
	}

	public void setSquare(double value){
		square = value;
	}

	public void setPopulation(long value){
		population = value;
	}

}
