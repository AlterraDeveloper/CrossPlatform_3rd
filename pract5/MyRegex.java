import java.util.regex.*;


public class MyRegex{    


public static void main(String[] args){

show("first");
String str = "This is Jim and Timothy";
String pattern = "[TJ]im";
Pattern p = Pattern.compile(pattern);
Matcher m = p.matcher(str);
	if(m.find() == true){
System.out.println(m.group());
int start = m.start();
int end  = m.end();
System.out.println(start+" "+end);
if(m.find(end+1)){
  System.out.println(str.substring(m.start(),m.end()));
}
};
getch();

show("second");
str = "This is Jim and Tom";
Matcher m1 = p.matcher(str);
System.out.println(m1.replaceAll("John"));
getch();

show("third");
str = "My dad and My mom";
getch();
}

static void show(String s){
		System.out.println("---------------------------");
		System.out.println("task "+s);
		System.out.println("---------------------------");
	}

	static void getch(){
		try{
			System.in.read();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}