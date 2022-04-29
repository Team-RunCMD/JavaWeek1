package w1d4;

import w1d2.Word;

import java.util.Scanner;

public class CLIDriver {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        BinarySearchTree<Word> tedsTree = new BinarySearchTree<>();
        while(true){
            String in = userIn.nextLine();
            Word newWord = new Word( in.toCharArray() );
            try{
                tedsTree.add(newWord);
            }catch(AlreadyExistsInTreeException exception){
                exception.printStackTrace();
            }

        }
    }
}
