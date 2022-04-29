package w1d3;

import w1d2.Word;
import w1d4.TedsListImproved;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        TedsListImproved<String> list2 = new TedsListImproved<>();
        list2.addToFront("example string");

        TedsList<String> list = new TedsList<String>();
        boolean running = true;
            while(running) {
            String input = in.nextLine();
                if(input.equals("add")) {
                    input = in.nextLine();
                    Word w = new Word(input.toCharArray());
                    list.addToFront(input);
                    System.out.println(list);
                }else if(input.equals("exit")){
                    running = false;
                }else if(input.equals("removefront")){
                    list.removeFromFront();
                    System.out.println(list);
                }else if(input.equals("get")){
                    input = in.nextLine();
                    System.out.println( list.getIndex(Integer.parseInt(input)) );
                }else if(input.equals("removeindex")){
                    input = in.nextLine();
                    list.removeIndex(Integer.parseInt(input));
                    System.out.println(list);
                }
        }
    }
}
