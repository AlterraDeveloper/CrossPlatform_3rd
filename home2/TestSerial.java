import java.io.*;
import java.util.*;

public class TestSerial{

public static void main(String[] args){

    Country country1 = new Country("Russia","Moscow",16151565,149587452L);
    Country country2 = new Country("Kyrgyzstan","Bishkek",12956256,5421785L);
    Country country3 = new Country("China","Beijing",1125489156,2023256123L);
    Country country4 = new Country("Brazil","Brazilia",8515767,210147125L);
    Country country5 = new Country("India","New Delhi",328726315,1324171354L);

ArrayList list = new ArrayList();

list.add(country1);
list.add(country2);
list.add(country3);
list.add(country4);
list.add(country5);

Object object = null;

try{

FileOutputStream fos = new FileOutputStream("Serialize.ser");

ObjectOutputStream oos = new ObjectOutputStream(fos);

oos.writeObject(list);
oos.flush();
oos.close();
fos.close();

}catch(IOException e){}

try{
FileInputStream fis = new FileInputStream("Serialize.ser");

ObjectInputStream ois = new ObjectInputStream(fis);

object = ois.readObject();


        	}
catch(IOException e){}
catch(ClassNotFoundException ex){}

if(object instanceof Country)
	((Country)object).show();
else if(object instanceof ArrayList){
 System.out.println(object);
}
else System.out.println("smth go wrong!");

	}


}
