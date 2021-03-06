package w1d2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StoryReader {
//    (the main method parameter is for an argument if we were running this java program from command line)
//    static means that a method or variable can be accessed without an instance of that object:
//    meaning, it belongs to the class and not to the object
//    you use static in these situations:
//      1- you only need a single instance of a variable (oftentimes this is something like a web/database connection)
//      2- a method doesn't need to modify any states of an object, it's just used to produce a result
//          for instance: the math libary
//          Math.max(), Math.min(), Math.pow(), etc do not require the existence of a Math object
    public static void main(String[] args) {
/*        this makes sense:
        Math.min(5,2);
        this does not:
        Word.contains();

        basically.. if you are using static everywhere.. you're probably something wrong
        ie, you're not relying on instantiating objects
 */
        try {
            File myFile = new File("fixedStory.txt");
            FileReader myFileReader = new FileReader(myFile);
            boolean readingFile = true;

            Word[] wordsArray = new Word[1000];
            char[] buffer = new char[100];
            int length = 0;
            int numWord = 0;

            do{

                int b = myFileReader.read();
                char c = (char) b;
//                if we have a space or newline, we create a new word, add it to our
//                array of words, and reset our buffer
                if(c == ' ' || c == '\n'){
                    Word newWord = new Word(buffer, length);
                    wordsArray[numWord] = newWord;
                    numWord++;
                    length = 0;

                }else {
//                    add a character to our buffer
                    buffer[length] = c;
                    length++;
                }

                if(b == -1){
                    readingFile = false;
                }

            }while(readingFile);

            for(int i = 0; i < numWord; i++){
                System.out.println(wordsArray[i]);
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
