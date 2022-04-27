public class Driver {
    public static void main(String[] args){
//        do something here..
        char[] myArray1 = new char[5];
        myArray1[0] = 't';
        myArray1[1] = 'r';
        myArray1[2] = 'u';
        myArray1[3] = 'c';
        myArray1[4] = 'k';

        char[] myArray2 = {'t', 'r', 'e', 'e'};

        String aString = "calendar";

        Word word1 = new Word();
        Word word2 = new Word(myArray1, 5);
        Word word3 = new Word(myArray2);
        Word word4 = new Word(aString.toCharArray());

        System.out.println(word2);
        boolean truckContainsR = word2.contains('r');
        System.out.println(truckContainsR);

    }
}
