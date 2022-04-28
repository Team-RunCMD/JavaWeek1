package w1d3;

import w1d2.Word;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        TedsList list = new TedsList();
        boolean running = true;
            while(running) {
            String input = in.nextLine();
                if(input.equals("add")) {
                    input = in.nextLine();
                    Word w = new Word(input.toCharArray());
                    list.addToFront(w);
                    System.out.println(list);
                }else if(input.equals("exit")){
                    running = false;
                }else if(input.equals("remove")){
                    list.removeFromFront();
                    System.out.println(list);
                }else if(input.equals("get")){
                    input = in.nextLine();
                    System.out.println( list.getIndex(Integer.parseInt(input)) );
                }
        }
    }
}
