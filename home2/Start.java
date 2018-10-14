public class Start{
	public static void main(String[] args){

		
		Country[] world = new Country[5];
		world[0] = new Country("Russia","Moscow",1615156.5848,149587452);
		world[1] = new Country("Kyrgyzstan","Bishkek",12956.256,5421785);
		world[2] = new Country("China","Beijing",1125489.156,2023256123);
		world[3] = new Country("Brazil","Brazilia",8515767.345,210147125);
		world[4] = new Country("India","New Delhi",3287263.15615,1324171354);	
		
		System.out.println("Country which name equals \"brazil\" : ");
		for(Country c : world){
			if(c.getName().equalsIgnoreCase("brazil")){
				System.out.println("Object was found by name : " + c);			
			}		
		}
		System.out.println();
		
		System.out.println("Country which capital is \"bishkek\" : ");
		for(Country c : world){
			if(c.getCapital().equalsIgnoreCase("bishkek")){
				System.out.println("Object was found by capital : " + c);			
			}		
		}
		System.out.println();

		System.out.println("Countries which area more than 1,000,000.0 sq.km : ");
		for(Country c : world){
			if(c.getSquare() > 1000000.0){
				System.out.println("Object was found by square : " + c);			
			}		
		}
		System.out.println();

		System.out.println("Countries which population more or equals 200,000,000 people : ");
		for(Country c : world){
			if(c.getPopulation() >= 200000000){
				System.out.println("Object was found by population : " + c);			
			}		
		}
		System.out.println();
	}
}
