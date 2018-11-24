import java.io.*;

public class WorkWithFiles{

public static void main(String[] args){

File file = new File("D:\\Kiselev\\Test.txt");

try{
file = new File(file.getParent()+"\\myfile.txt");

file.createNewFile();
for(int i=0;i<100000;i++){
	for(int j=0;j<1000000;j++){}}

file.renameTo(new File(file.getParent()+"\\newfile.txt"));

file = new File(file.getParent());
System.out.println(file);
file.renameTo(new File(file.getParent() + "\\Kiselev_EUgene");
//File.createTempFile("test",null,new File(file.getParent()));

}catch(IOException ioe){
System.out.println("Smth go wrong!");
}

}
}