import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ted {
	
	public static void main(String[] args) throws IOException, InterruptedException{

		//object.. you can think of an object as a custom type
		//objects have their own independent information (states) and behavior
		//File: is the type of the object
		//tedsFile: name of the object
		//new: designates that memory must be allocated to create our object
		//File( .. ): constructor: some code snippet that is run when we first create that object

		File tedsFile = new File("story.txt");
		FileReader tedsFileReader = new FileReader(tedsFile);

		FileWriter tedsFileWriter = new FileWriter("fixedStory.txt", false);

		
		//primitive type: like char, int, boolean etc, which is the most basic unit of information we have

		boolean readingFile = true;
		int numCharacters = 0;

		while(readingFile){
			int readByte = tedsFileReader.read();
			if(readByte != -1) {
				//convert that number to a character (this is called casting)
				char readCharacter = (char) readByte;

				if(readCharacter == '_'){
					readCharacter = ' ';
				}

				numCharacters = numCharacters + 1;
				printCharacterToFile(tedsFileWriter, readCharacter, true);
			}else if(readByte == -1){
				readingFile = false;
			}
		}
		System.out.println("\nNumber of characters: " + numCharacters);
		tedsFileWriter.close();
		
	}

	public static void printCharacterToFile(FileWriter fileWriter, char charToBeWritten) throws IOException {
		fileWriter.append(charToBeWritten);
	}
	public static void printCharacterToFile(FileWriter fileWriter, char charToBeWritten, boolean toUpperCase) throws IOException {

		fileWriter.append(convertCharToUppercaseChar(charToBeWritten));
	}
	public static char convertCharToUppercaseChar(char charIn){
		if(charIn >= 'a' && charIn <= 'z'){
			return (char) (charIn + ('A' - 'a'));
		}
		return charIn;
	}

}

/*
Introduction to Java
First java program
JVM, JRE, JDK
methods and parameters
method overloading and overriding
File I/O
Exceptions
Control flow (while, if)
Primitive types / first objects
Intro to Git (clone, init, add, commit, push, pull)

Count the amount of words in a file..
Count the amount of sentences in a file..
Ceasar cipher - shift all letters n amount of letters forwards or backwards..
*/