//package home2;
import java.text.NumberFormat;
import java.io.*;

/**
Class contains methods for manipulating with countries.
@author Kiselev E.D.
@version 1.0
*/
public class Country implements Serializable{
	private String name;
	private String capital;
	private double square;
	transient long population;

	/**
	Constructor without params
	*/
	public Country(){
	}

	/**
	Constructor initialize object with particular values
	@param name Initializes name of the country
	@param capital Initializes name of the capital of the country
	@param square Initializes value of square of the country measured in square kilometers
	@param population Initializes value of population people of the country
	*/
	public Country(String name,String capital,double square,long population){

		if(name == null) throw new NullPointerException("Country's name must not be NULL !");
		this.name = name;

		if(name == null) throw new NullPointerException("Country's capital must not be NULL !");
		this.capital = capital;

		if(square <= 0) throw new IllegalArgumentException("Country's square must be greater than 0 ! ");
		this.square = square;

		if(population <= 0) throw new IllegalArgumentException("Country's population must be greater than 0 ! ");
		this.population = population;
	}


	/**
	Setter-method for property "Name"
	@param name Takes value representing name of the country
	*/
	public void setName(String name){
		if(name == null) throw new NullPointerException();
		this.name = name;
	}
	/**
	Setter-method for property "Capital"
	@param capital Takes value representing capital of the country
	*/
	public void setCapital(String capital){
		if(capital == null) throw new NullPointerException();
		this.capital = capital;
	}
	/**
	Setter-method for property "Square"
	@param value Takes value representing square of the country measured in square kilometers
	*/
	public void setSquare(double value){
		if(value <= 0) throw new IllegalArgumentException();
		square = value;
	}
	/**
	Setter-method for property "Population"
	@param value Takes value representing population of the country
	*/
	public void setPopulation(long value){
		if(value <= 0) throw new IllegalArgumentException();
		population = value;
	}
	/**
	Getter-method for property "Name"
	@return value representing name of the country
	*/
	public String getName(){
		return name;
	}
	/**
	Getter-method for property "Capital"
	@return value representing name of the capital of the country
	*/
	public String getCapital(){
		return capital;
	}
	/**
	Getter-method for property "Square"
	@return value representing square of the country measured in square kilometers
	*/
	public double getSquare(){
		return square;
	}
	/**
	Getter-method for property "Population"
	@return value representing population of the country
	*/
	public long getPopulation(){
		return population;
	}
	/**
	Method prints in console main information about country
	*/
	public void show(){
		System.out.println("Country name : " + name);
		System.out.println("Country capital : " + capital);
		System.out.println("Country square : " + NumberFormat.getNumberInstance().format(square) + " sq.km");
		System.out.println("Country population : " + NumberFormat.getNumberInstance().format(population) + " people");
	}

	@Override
	public String toString(){
		return name + " " + capital + " " +NumberFormat.getNumberInstance().format(square) + " sq.km " + NumberFormat.getNumberInstance().format(population) + " people";
	}

}
