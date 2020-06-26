package collections.pkg3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Collections3 {

    public static void main(String[] args) {
        System.out.print("please enter the round brackets: ");
        Scanner t = new Scanner(System.in);
        String brackets = t.nextLine();
        ArrayList<String> bracketsarr = new ArrayList(Arrays.asList(brackets.split("")));
        int size= bracketsarr.size();
        if (size % 2 == 1) {
            System.out.print(false);
        } else {
            for (int i = 0; bracketsarr.contains("("); i++) {
                bracketsarr.remove("(");
            }
            if (bracketsarr.size() == size/ 2) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        }
    }
}
