package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        System.out.print("please enter the round brackets: ");
        Scanner t = new Scanner(System.in);
        String bracket = t.nextLine();
        ArrayList<String> brackets = new ArrayList(Arrays.asList(bracket.split("")));
        int r = Collections.frequency(brackets, "("), l= Collections.frequency(brackets, ")");
        if (r==l)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
