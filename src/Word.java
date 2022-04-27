public class Word {
//    think of objects as a custom type..
//    objects are an instance of a class..
//    they have independent states and behavior

    char[] charArray;
    int length;

    public Word(){
//        do something here.. (usually instantiate variables)
    }
    public Word(char[] charArray, int length){
        this.charArray = charArray;
        this.length = length;
    }
    public Word(char[] charArray){
        this.charArray = charArray;
    }

    public String toString(){

        String out = "";

        for(int i = 0; i < length; i++){
            out = out + charArray[i];
        }
/*
//        this is replacing:
        int i = 0;
        while(i < length){
//            doing something here
            i++;
        }

        */
        return out;
    }

//    a method that returns true or false depending on if it contains a certain character:
    public boolean contains(char a){
        for(int i = 0; i < length; i++){
            if(charArray[i] == a){
                return true;
            }
        }
        return false;
    }

//    a method that returns the first index of a certain character
//    a method that returns true if another word is equal to this word (word1.equals(word2))
//    a method that returns -1 if the word is before another lexigraphically (like in a dictionary), 0 if equal, 1 if after
//    lexigraphically
//    a method that concatenates (combines) two words together - eg cat.concat(dog) = catdog
//    a method that replaces a character with another at a given index - eg cat.replace(0, 'b') = bat
//    a method that replaces all of a particular character with another - eg racecar.replace('r', 'w') = wacecaw
//    a method that returns all of a word until a particular index (substring) - eg racecar.substring(3) = rac
//    a method that returns all of a word between two indexes (first inclusive - second exclusive) - eg
//    racecar.substring(2, 5) = cec

}
