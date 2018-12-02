import java.io.*;
import java.util.regex.*;
import java.lang.*;

public class JavaFileFilter implements FileFilter{

@Override
public boolean accept(File pathname){
  Pattern p = Pattern.compile("(\\w)*.java");
  Matcher m = p.matcher(pathname.getName());
  return m.find();
}
}
