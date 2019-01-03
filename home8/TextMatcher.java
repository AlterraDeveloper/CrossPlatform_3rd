import java.util.ArrayList;
import java.util.StringTokenizer;
import java.text.StringCharacterIterator;
import java.text.CharacterIterator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.*;

class TextMatcher{

    static ArrayList findWordsStartsWithVowelInFile(String filePath){

        ArrayList<String> words = new ArrayList<>();
        try{
        BufferedReader input = new BufferedReader(new FileReader(filePath));
        String s = new String("");
        for(;;){
            s = input.readLine();
            if(s == null) break;
            words.addAll(findWordsStartsWithVowel(s));
        }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        return words;
    }

    static ArrayList findWordsStartsWithVowel(String string){
        Pattern pattern = Pattern.compile("(^|[\\p{Space}])[AaEeIiOoUuYy][\\p{Alpha}]*");
        Matcher m = pattern.matcher(string);
        ArrayList<String> words = new ArrayList<>();
        while(m.find()){
            words.add(m.group().trim());
        }
        return words;
    }

    public static void main(String[] args) {
        System.out.println(findWordsStartsWithVowelInFile("Sample.txt"));
    }
}
