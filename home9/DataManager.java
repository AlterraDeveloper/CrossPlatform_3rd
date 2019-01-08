import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DataManager{

private ArrayList<Country> data;

public DataManager(String filePath){
    Object object = new Object();
    try{
    FileInputStream fis = new FileInputStream(filePath);

    ObjectInputStream ois = new ObjectInputStream(fis);

    object = ois.readObject();

    }catch(IOException e){}
    catch(ClassNotFoundException ex){}

    if(object instanceof ArrayList)
        data = new ArrayList<>((ArrayList)object);
}

public ArrayList<Country> getData(){
    return data;
}

public boolean checkEntity(Country entity){
    return
        Pattern.matches("^[\\p{Alpha}]+$",entity.getName()) &&
        Pattern.matches("^[\\p{Alpha}]+$",entity.getCapital()) &&
        Pattern.matches("^[\\p{Digit}]+[.,][\\p{Digit}]+$",String.valueOf(entity.getSquare())) &&
        Pattern.matches("^[\\p{Digit}]+$",String.valueOf(entity.getPopulation())) ;

}

public void addEntity(Country entity){
    data.add(entity);
}

public void saveYourself(String filePath){
    try{

    FileOutputStream fos = new FileOutputStream("Serialize.ser");

    ObjectOutputStream oos = new ObjectOutputStream(fos);

    oos.writeObject(data);
    oos.flush();
    oos.close();
    fos.close();

    }catch(IOException e){}
}
}
