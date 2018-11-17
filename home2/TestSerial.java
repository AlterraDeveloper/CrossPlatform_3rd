import java.io.*;
import home2.Country;
import java.util.*;

public class TestSerial{

public static void main(String[] args){

Country country = new Country("Kg","Bishkek",156.15815,6648);
Country country2 = new Country("Ru","Moscow",17893.815,781234);
Country country3 = new Country("En","London",15486.5815,7848);

ArrayList list = new ArrayList();

list.add(country);
list.add(country2);
list.add(country3);

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