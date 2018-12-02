import java.lang.reflect.*;
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;

public class MyReflection {

  public static void main(String[] args) {
    show("first");
    System.out.println
      ("receiving object Class of class \"String\" : " + new String().getClass());
    getch();

    show("second");
    System.out.println("Name of the class \"Date\" : " + new Date().getClass().getName());
    getch();

    show("third");
    System.out.print("Modifiers of class \"Calendar\" : ");
    if(Modifier.isAbstract(Calendar.getInstance().getClass().getModifiers()))
      System.out.print(" abstract ");
    if(Modifier.isPublic(Calendar.getInstance().getClass().getModifiers()))
      System.out.print(" public ");
    if(Modifier.isFinal(Calendar.class.getModifiers()))
      System.out.print(" final ");
      System.out.println();
    getch();

    show("fourth");
    System.out.println("Superclass name of class \"ArrayList\" : "
        + new ArrayList().getClass().getSuperclass().getName());
    getch();

    show("fifth");
    System.out.println("Interfaces implemented by class \"String\" : ");
    for(Class iface : new String().getClass().getInterfaces()){
      System.out.println(iface.getName()+ " ");
    }
    getch();

    show("sixth");
    System.out.println("Fields of class \"Calendar\" : ");
    for(Field field : Calendar.getInstance().getClass().getFields()){
      System.out.println(field.getName());
    }
    getch();

    show("seventh");
    System.out.println("Constructors of class \"String\" : ");
    for(Constructor c : String.class.getConstructors()){
      System.out.println(c);
    }
    getch();

    show("eighth");
    System.out.println("Methods of class \"Math\" : ");
    for(Method m : Math.class.getMethods()){
      System.out.println(m);
    }
    getch();

    show("ninth");
    try{
    Calendar calendar = Calendar.getInstance();
    int oldYear = 0;
    oldYear = calendar.getClass().getField("YEAR").getInt(null);
    calendar.getClass().getField("YEAR").setAccessible(true);
    calendar.getClass().getField("YEAR").set(null,1812);
    int newYear = 0;
    newYear = calendar.getClass().getField("YEAR").getInt(null);
    System.out.println("Modified year in calendar using reflection : from "
     + oldYear + " to " + newYear);
   }catch(NoSuchFieldException ex){
     ex.printStackTrace();
   }catch(IllegalAccessException ex){
     ex.printStackTrace();
   }
    getch();
  }

  static void show(String s) {
   System.out.println("---------------------------");
   System.out.println("task " + s);
   System.out.println("---------------------------");
  }

  static void getch() {
   try {
    System.in.read();
   } catch (Exception e) {
    e.printStackTrace();
   }
  }
}
