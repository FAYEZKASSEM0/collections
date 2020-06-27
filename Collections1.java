package collections1;

import java.util.Scanner;
import java.util.TreeSet;

public class Collections1 {

    public static void main(String[] args) {
        int count[] = new int[9];
        TreeSet<Integer> set = new TreeSet<>();
        Scanner t = new Scanner(System.in);
        int num = 1;
        for (int i = 0; num != 0; i++) {
            System.out.print("enter a number or enter 0 to finish: ");
            num = t.nextInt();
            if (num != 0) {
                set.add(num);
                count[num - 1] = count[num - 1] + 1;
            } else {
                break;
            }
        }
        System.out.println(set);
        for (int i = 0; i < 9; i++) {
            System.out.println((i + 1) + " .... > " + count[i]);
        }
    }

}
