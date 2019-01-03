import java.util.ArrayList;
import java.util.StringTokenizer;
import java.text.StringCharacterIterator;
import java.text.CharacterIterator;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class TextMatcher{

    static final String VOWEL_LETTERS = "AaEeIiOoUuYy";

    static String loadTextFromFile(String filePath){

        StringBuilder resultString = new StringBuilder("");
        try{
        BufferedReader input = new BufferedReader(new FileReader(filePath));
        String s = new String("");
        for(;;){
            s = input.readLine();
            if(s == null) break;
            resultString.append(s);
            resultString.append(" ");
        }
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }

        return resultString.toString();

    }

    static ArrayList<String> getAllWordsInText(String text){
        ArrayList<String> allWords = new ArrayList<String>();
        StringTokenizer tokenizer = new StringTokenizer(text);
        while(tokenizer.hasMoreTokens()){
            allWords.add(tokenizer.nextToken());
        }
        return allWords;
    }

    static ArrayList<String> filterWords(ArrayList<String> words){

        ArrayList<Character> filterLetters = new ArrayList<Character>();

        StringCharacterIterator stringIter = new StringCharacterIterator(VOWEL_LETTERS);
        for(char c = stringIter.first(); c != CharacterIterator.DONE; c = stringIter.next()){
            filterLetters.add(c);
        }

        ArrayList<String> filterWords = new ArrayList<String>();

        for(String word : words){
            if(filterLetters.contains(word.charAt(0))){
                filterWords.add(word);
            }
        }

        return filterWords;
    }

    public static void main(String[] args) {

        System.out.println(filterWords(getAllWordsInText(loadTextFromFile("Sample.txt"))));
        
    }
}
