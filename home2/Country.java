public class Country{
	private String name;
	private String capital;
	private double square;
	private long population;

	public Country(){
	}

	public Country(String name,String capital,double square,long population){
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

	public String getName(){
		return name;
	}

	public String getCapital(){
		return capital;
	}

	public double getSquare(){
		return square;
	}

	public long getPopulation(){
		return population;
	}

	public void show(){
		System.out.println("Country name : " + name);
		System.out.println("Country capital : " + capital);
		System.out.println("Country square : " + square + " sq.km");
		System.out.println("Country population : " + population + " people");
	}

	@Override
	public String toString(){
		return name + " " + capital + " " +square + "sq.km " + population + " people";	
	}

}
